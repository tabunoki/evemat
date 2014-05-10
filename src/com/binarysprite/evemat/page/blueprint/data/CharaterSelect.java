package com.binarysprite.evemat.page.blueprint.data;

import java.io.Serializable;

/**
 * 
 * @author Tabunoki
 * 
 */
public class CharaterSelect implements Serializable {

	private final long id;

	private final String characterName;

	public CharaterSelect(long id, String name) {
		super();
		this.id = id;
		this.characterName = name;
	}

	public long getId() {
		return id;
	}

	public String getCharacterName() {
		return characterName;
	}
}