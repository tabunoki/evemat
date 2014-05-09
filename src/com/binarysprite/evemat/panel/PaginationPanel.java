/**
 * 
 */
package com.binarysprite.evemat.panel;

import org.apache.wicket.markup.html.navigation.paging.IPageable;
import org.apache.wicket.markup.html.navigation.paging.PagingNavigator;

/**
 * @author Tabunoki
 *
 */
public class PaginationPanel extends PagingNavigator {

	/**
	 * 
	 * @param id
	 * @param pageable
	 */
	public PaginationPanel(String id, IPageable pageable) {
		super(id, pageable);
	}

}
