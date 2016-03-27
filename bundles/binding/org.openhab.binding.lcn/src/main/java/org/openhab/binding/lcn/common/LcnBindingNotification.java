/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.lcn.common;

/**
 * Interface for all calls to be run / invoked on the refresh thread.
 * 
 * @author Tobias J�ttner
 */
public interface LcnBindingNotification {

	/** Code to execute. */
	void execute();
	
}
