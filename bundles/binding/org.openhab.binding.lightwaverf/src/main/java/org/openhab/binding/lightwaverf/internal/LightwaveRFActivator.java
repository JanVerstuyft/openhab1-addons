/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.lightwaverf.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Extension of the default OSGi bundle activator Not sure what this class does
 * but I don't think we need to change anything here.
 * 
 * @author Neil Renaud
 * @since 1.7.0
 */
public final class LightwaveRFActivator implements BundleActivator {

	private static Logger logger = LoggerFactory
			.getLogger(LightwaveRFActivator.class);

	private static BundleContext context;

	/**
	 * Called whenever the OSGi framework starts our bundle
	 */
	@Override
	public void start(BundleContext bc) throws Exception {
		context = bc;
		logger.info("LightwaveRF binding has been started.");
	}

	/**
	 * Called whenever the OSGi framework stops our bundle
	 */
	@Override
	public void stop(BundleContext bc) throws Exception {
		context = null;
		logger.info("LightwaveRF binding has been stopped.");
	}

	/**
	 * Returns the bundle context of this bundle
	 * 
	 * @return the bundle context
	 */
	public static BundleContext getContext() {
		return context;
	}
}
