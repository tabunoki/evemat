package com.binarysprite.evemat.page.character;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

import com.beimin.eveapi.core.ApiAuthorization;
import com.beimin.eveapi.core.ApiException;
import com.beimin.eveapi.eve.character.CharacterInfoParser;
import com.beimin.eveapi.eve.character.CharacterInfoResponse;
import com.binarysprite.evemat.Constants;
import com.binarysprite.evemat.common.ExternalImage;
import com.binarysprite.evemat.entity.AccountCharacter;
import com.binarysprite.evemat.page.FramePage;
import com.binarysprite.evemat.page.character.data.CharacterPortrait;
import com.binarysprite.evemat.service.EveImageService;
import com.binarysprite.evemat.service.character.CharacterGetService;
import com.google.inject.Inject;

@SuppressWarnings("serial")
public class CharacterPage extends FramePage {

	/**
	 * ポートレイトリストのモデルです。
	 */
	private final IModel<List<CharacterPortrait>> portraitModel = new LoadableDetachableModel<List<CharacterPortrait>>() {
		
		/**
		 * {@inheritDoc}
		 */
		@Override
		protected List<CharacterPortrait> load() {

			final List<AccountCharacter> accountCharacters = characterGetService.get();
			final List<CharacterPortrait> characterPortraits = new ArrayList<CharacterPortrait>();

			for (AccountCharacter accountCharacter : accountCharacters) {

				ApiAuthorization apiAuthorization = new ApiAuthorization(accountCharacter.getApiId(),
						accountCharacter.getCharacterId(), accountCharacter.getApiVerificationCode());

				try {
					CharacterInfoResponse characterInfoResponse = CharacterInfoParser.getInstance().getResponse(
							apiAuthorization);

					characterPortraits.add(new CharacterPortrait(EveImageService.getCharacterPortrait(
							accountCharacter.getCharacterId(), EveImageService.CharacterPortraitSize.PIXEL_256),
							characterInfoResponse.getCharacterName(), characterInfoResponse.getCorporation(),
							characterInfoResponse.getLastKnownLocation(), characterInfoResponse.getShipTypeName(),
							Constants.QUANTITY_FORMAT.format(characterInfoResponse.getSkillPoints().longValue()),
							Constants.PRICE_FORMAT.format(characterInfoResponse.getAccountBalance()),
							Constants.SECURITY_FORMAT.format(characterInfoResponse.getSecurityStatus())));

				} catch (ApiException e) {
					e.printStackTrace();
				}

			}

			return characterPortraits;
		}
	};

	/**
	 * ポートレイトリストです。
	 */
	private final ListView<CharacterPortrait> listView = new ListView<CharacterPortrait>("portraits", portraitModel) {
		protected void populateItem(ListItem<CharacterPortrait> item) {

			final CharacterPortrait portrait = (CharacterPortrait) item.getModelObject();

			item.add(new ExternalImage("picture", portrait.picture));
			item.add(new Label("name", portrait.name));
			item.add(new Label("corporation", portrait.corporation));
			item.add(new Label("location", portrait.location));
			item.add(new Label("activeShip", portrait.activeShip));
			item.add(new Label("skills", portrait.skills));
			item.add(new Label("wealth", portrait.wealth));
			item.add(new Label("securityStatus", portrait.securityStatus));
		}
	};

	/**
	 * 
	 */
	@Inject
	private CharacterGetService characterGetService;

	/**
	 * キャラクターページのコンストラクタです。
	 */
	public CharacterPage() {
		super();

		/*
		 * コンポーネントの生成
		 */
		final Label title = new Label(WICKET_ID_PAGE_TITLE_LABEL, "Character");

		/*
		 * コンポーネントの追加
		 */
		this.add(title);
		this.add(listView);
	}
}
