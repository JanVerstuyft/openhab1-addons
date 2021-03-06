/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.rwesmarthome.internal.communicator.exceptions;

/**
 * Exception if session has expired.
 *
 * @author ollie-dev
 */
public class RWESmarthomeSessionExpiredException extends SHFunctionalException {

    /**
     * 
     */
    private static final long serialVersionUID = -2799402410863391169L;

    /**
     * Constructor
     */
    public RWESmarthomeSessionExpiredException() {
        super();
    }

    /**
     * Constructor with message and throwable.
     * 
     * @param detailMessage
     * @param throwable
     */
    public RWESmarthomeSessionExpiredException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    /**
     * Constructor with message.
     * 
     * @param detailMessage
     */
    public RWESmarthomeSessionExpiredException(String detailMessage) {
        super(detailMessage);
    }

    /**
     * Constructor with throwable.
     * 
     * @param throwable
     */
    public RWESmarthomeSessionExpiredException(Throwable throwable) {
        super(throwable);
    }
}
