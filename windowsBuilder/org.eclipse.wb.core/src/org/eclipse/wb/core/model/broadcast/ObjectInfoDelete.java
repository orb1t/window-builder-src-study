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
package org.eclipse.wb.core.model.broadcast;

import org.eclipse.wb.core.model.ObjectInfo;

/**
 * Listener for {@link ObjectInfo} delete events.
 * 
 * @author mitin_aa
 * @coverage core.model
 */
public abstract class ObjectInfoDelete {
  /**
   * Before {@link ObjectInfo} deleted from its parent.
   */
  public void before(ObjectInfo parent, ObjectInfo child) throws Exception {
  }

  /**
   * After {@link ObjectInfo} deleted from its parent.
   */
  public void after(ObjectInfo parent, ObjectInfo child) throws Exception {
  }
}
