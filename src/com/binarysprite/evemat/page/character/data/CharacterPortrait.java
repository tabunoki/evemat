package com.binarysprite.evemat.page.character.data;

/**
 * 
 * @author Tabunoki
 * 
 */
public class CharacterPortrait {

	public final String picture;

	public final String name;

	public final String corporation;

	public final String location;

	public final String activeShip;

	public final String skills;

	public final String wealth;

	public final String securityStatus;

	public CharacterPortrait(String picture, String name, String corporation, String location, String activeShip,
			String skills, String wealth, String securityStatus) {
		super();
		this.picture = picture;
		this.name = name;
		this.corporation = corporation;
		this.location = location;
		this.activeShip = activeShip;
		this.skills = skills;
		this.wealth = wealth;
		this.securityStatus = securityStatus;
	}

}