package com.binarysprite.evemat.update;

import java.util.ArrayList;
import java.util.List;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.beimin.eveapi.core.ApiAuthorization;
import com.beimin.eveapi.core.ApiException;
import com.binarysprite.evemat.Constants;
import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.AccountCharacter;
import com.binarysprite.evemat.entity.AccountCharacterDao;
import com.binarysprite.evemat.entity.AccountCharacterDaoImpl;



/**
 * 同期処理のファサードを提供するクラスです。
 * @author Tabunoki
 *
 */
public class UpdateFacade {

	public void updateAll(UpdateListener listener) throws ApiException {
		
		Constants.LOGGER.info("同期処理を開始しました");
		listener.updateWillStart(new UpdateEvent(this, "同期処理を開始しました"));
		
		
		final List<ApiAuthorization> authorizations = createAuthorizations();
		final List<Updater> updaters = new ArrayList<Updater>();
		
		for (ApiAuthorization authorization : authorizations) {
			
			updaters.add(new CharacterJournalUpdate());
			updaters.add(new CharacterTransactionUpdate(authorization));
			updaters.add(new CorporationJournalUpdate());
			updaters.add(new CorporationTransactionUpdate(authorization));
			
		}
		updaters.add(new TypePriceUpdate());
		
		for (Updater updater : updaters) {
			
				updater.update();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Constants.LOGGER.info("同期処理を完了しました");
		listener.updatePerformed(new UpdateEvent(this, "同期処理を完了しました"));
	}
	
	/**
	 * 同期処理で利用する認証クラスのリストを作成します。
	 * @return
	 */
	public List<ApiAuthorization> createAuthorizations() {
		
		List<ApiAuthorization> authorizations = new ArrayList<ApiAuthorization>();
		
		AccountCharacterDao dao = new AccountCharacterDaoImpl();
		
		List<AccountCharacter> accountCharacters;
		
		LocalTransaction transaction = DB.getLocalTransaction();
		try {
			transaction.begin();
			accountCharacters = dao.selectAll();
			
		} finally {
			transaction.rollback();
		}
		
		for (AccountCharacter accountCharacter : accountCharacters) {
			authorizations.add(new ApiAuthorization(
					accountCharacter.getApiId(),
					accountCharacter.getCharacterId(),
					accountCharacter.getApiVerificationCode()));
		}

		return authorizations;
	}
}
