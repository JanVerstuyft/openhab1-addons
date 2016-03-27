/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.davis.datatypes;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.openhab.core.library.types.DecimalType;
import org.openhab.core.types.State;

/**
 * Class to handle temperature values 
 * 2 byte, encoded in Fahrenheit , result in °C
 * 
 * @author Trathnigg Thomas
 * @since 1.6.0
 */

public class DataTypeTemperatureF implements DavisDataType {

	/**
	 * {@inheritDoc}
	 */
	public State convertToState(byte[] data, DavisValueType valueType) {
		short value = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN).getShort(valueType.getDataOffset());		
		return new DecimalType(((double)value - 32) * 5 / 9.0);
	}
	
}
