package org.eclipse.jface.viewers;

/************************************************************************
Copyright (c) 2000, 2002 IBM Corporation and others.
All rights reserved.   This program and the accompanying materials
are made available under the terms of the Common Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/cpl-v10.html

Contributors:
	IBM - Initial implementation
************************************************************************/


/**
 * The <code>ILightweightLabelDecorator</code> is a decorator that decorates
 * using a prefix, suffix and overlay image rather than doing all 
 * of the image and text management itself like an <code>ILabelDecorator</code>.
 */
public interface ILightweightLabelDecorator extends IBaseLabelProvider {
	
	/**
	 * Calculates decorations based on element. 
	 * 
	 * @param element the element to decorate
	 * @param decoration the decoration to set
	 */
	public void decorate(Object element, IDecoration decoration);

}
