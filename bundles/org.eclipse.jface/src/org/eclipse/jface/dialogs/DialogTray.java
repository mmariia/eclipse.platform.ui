/*******************************************************************************
 * Copyright (c) 2005, 2015 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jface.dialogs;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * <p>
 * This class is the abstract superclass of all dialog trays. A tray can be opened
 * in any <code>TrayDialog</code>.
 * </p>
 *
 * @see org.eclipse.jface.dialogs.TrayDialog
 * @since 3.2
 */
public abstract class DialogTray {

	/**
	 * Creates the contents (widgets) that will be contained in the tray.
	 * <p>
	 * Tray implementions must not set a layout on the parent composite, or assume
	 * a particular layout on the parent. The tray dialog will allocate space
	 * according to the natural size of the tray, and will fill the tray area with the
	 * tray's contents.
	 * </p>
	 *
	 * @param parent the composite that will contain the tray
	 * @return the contents of the tray, as a <code>Control</code>
	 */
	protected abstract Control createContents(Composite parent);
}
