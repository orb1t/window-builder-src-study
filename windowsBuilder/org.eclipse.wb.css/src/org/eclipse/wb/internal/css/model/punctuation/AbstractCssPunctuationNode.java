/*******************************************************************************
 * Copyright (c) 2011 Google, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Google, Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.wb.internal.css.model.punctuation;

import org.eclipse.wb.internal.css.model.CssNode;

/**
 * Node for any punctuation symbol - ':', ';', '{', '}', etc.
 * 
 * @author scheglov_ke
 * @coverage CSS.model
 */
public abstract class AbstractCssPunctuationNode extends CssNode {
  ////////////////////////////////////////////////////////////////////////////
  //
  // Constructor
  //
  ////////////////////////////////////////////////////////////////////////////
  public AbstractCssPunctuationNode() {
    setLength(1);
  }
}
