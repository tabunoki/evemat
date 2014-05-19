/**
 * 
 */
package com.binarysprite.evemat.page.blueprint;

import java.util.ArrayList;
import java.util.List;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.AccountCharacterDao;
import com.binarysprite.evemat.entity.AccountCharacterDaoImpl;
import com.binarysprite.evemat.entity.ProductBlueprint;
import com.binarysprite.evemat.entity.ProductBlueprintDao;
import com.binarysprite.evemat.entity.ProductBlueprintDaoImpl;
import com.binarysprite.evemat.entity.ProductGroup;
import com.binarysprite.evemat.entity.ProductGroupDao;
import com.binarysprite.evemat.entity.ProductGroupDaoImpl;
import com.binarysprite.evemat.entity.TypeDao;
import com.binarysprite.evemat.entity.TypeDaoImpl;
import com.binarysprite.evemat.page.blueprint.data.Blueprint;
import com.binarysprite.evemat.page.blueprint.data.CharaterSelect;
import com.binarysprite.evemat.page.blueprint.data.Group;
import com.binarysprite.evemat.page.blueprint.data.GroupSelect;

/**
 * @author Tabunoki
 * 
 */
public class BluePrintPageService {

	/**
	 * 
	 * @return
	 */
	public List<Group> getGroups() {

		List<Group> groups = new ArrayList<Group>();

		ProductGroupDao productGroupDao = new ProductGroupDaoImpl();
		AccountCharacterDao accountCharacterDao = new AccountCharacterDaoImpl();

		LocalTransaction transaction = DB.getLocalTransaction();
		try {
			transaction.begin();

			List<ProductGroup> productGroups = productGroupDao.selectAll();

			for (ProductGroup productGroup : productGroups) {

				String characterName;

				characterName = accountCharacterDao.selectById(productGroup.getCharacterId()).getCharacterName();

				groups.add(new Group(
						productGroup.getId(),
						productGroup.getGroupName(),
						productGroup.getProductionTime(),
						new CharaterSelect(productGroup.getCharacterId(), characterName)));

			}

		} finally {
			transaction.rollback();
		}

		return groups;
	}

	/**
	 * 
	 * @param groupID
	 * @return
	 */
	public List<Blueprint> getBlueprints(int groupID) {

		List<Blueprint> blueprints = new ArrayList<Blueprint>();

		ProductBlueprintDao productBlueprintDao = new ProductBlueprintDaoImpl();
		TypeDao typeDao = new TypeDaoImpl();
		ProductGroupDao productGroupDao = new ProductGroupDaoImpl();

		List<ProductBlueprint> productBlueprints;

		LocalTransaction transaction = DB.getLocalTransaction();
		try {
			transaction.begin();

			productBlueprints = productBlueprintDao.selectByGroupId(groupID);

			for (ProductBlueprint productBlueprint : productBlueprints) {

				String characterName;

				characterName = typeDao.selectById(productBlueprint.getBlueprintTypeId()).getTypeName();

				blueprints.add(new Blueprint(
						productBlueprint.getId(),
						productBlueprint.getBlueprintTypeId(),
						characterName, productBlueprint.getMe(),
						productBlueprint.getPe(),
						new GroupSelect(
								productBlueprint.getProductGroup(),
								productGroupDao.selectById(productBlueprint.getProductGroup()).getGroupName())));

			}

		} finally {
			transaction.rollback();
		}

		return blueprints;
	}
}
