/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.urtsi.internal;

/**
 * The InitializationException indicates that an error occured while initializing the device or while parsing the binding configuration.
 * @author Oliver Libutzki
 * @since 1.3.0
 *
 */
public class InitializationException extends Exception {

	private static final long serialVersionUID = -5106059856757667266L;

	public InitializationException(String msg) {
		super(msg);
	}

	public InitializationException(Throwable cause) {
		super(cause);
	}

	public InitializationException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
