/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.ui.internal;

import org.eclipse.swt.*;
import org.eclipse.swt.custom.*;
import org.eclipse.swt.graphics.*;

/**
 * Controls the drag and drop of the part
 * which is contained within the CTabFolder2
 * tab.
 */
public class CTabPartDragDrop extends PartDragDrop {
	private CTabItem2 tab;
public CTabPartDragDrop(LayoutPart dragPart, CTabFolder2 tabFolder, CTabItem2 tabItem) {
	super(dragPart, tabFolder);
	this.tab = tabItem;
}
protected CTabFolder2 getCTabFolder2() {
	return (CTabFolder2) getDragControl();
}
/**
 * Returns the source's bounds
 */
protected Rectangle getSourceBounds() {
	return PartTabFolder.calculatePageBounds(getCTabFolder2());
}
/**
 * Verifies that the tab under the mouse pointer is the same 
 * as for this drag operation
 * 
 * @see org.eclipse.ui.internal.PartDragDrop#isDragAllowed(Point)
 */
protected void isDragAllowed(Point position) {
	CTabFolder2 tabFolder = getCTabFolder2();
	CTabItem2 tabUnderPointer = tabFolder.getItem(position);
	if (tabUnderPointer != tab)
		return;
	if(tabUnderPointer == null) {
		//Avoid drag from the borders.
		Rectangle clientArea = tabFolder.getClientArea();
		if((tabFolder.getStyle() & SWT.TOP) != 0) {
			if(position.y > clientArea.y)
				return;
		} else {
			if(position.y < clientArea.y + clientArea.height)
				return;
		}
	}

	super.isDragAllowed(position);
}
public void setTab(CTabItem2 newTab) {
	tab = newTab;
}
}
