/*
 * Copyright (c) 2014 Pantheon Technologies s.r.o. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.openflowjava.protocol.api.keys.experimenter;

import org.junit.Assert;
import org.junit.Test;
import org.opendaylight.openflowjava.protocol.api.keys.ExperimenterActionDeserializerKey;
import org.opendaylight.openflowjava.protocol.api.util.EncodeConstants;

/**
 * @author michal.polkorab
 *
 */
public class ExperimenterActionDeserializerKeyTest {

    /**
     * Test ExperimenterActionDeserializerKey equals and hashCode
     */
    @Test
    public void test() {
        ExperimenterActionDeserializerKey key1 =
                new ExperimenterActionDeserializerKey(EncodeConstants.OF10_VERSION_ID, 42L);
        ExperimenterActionDeserializerKey key2 =
                new ExperimenterActionDeserializerKey(EncodeConstants.OF10_VERSION_ID, 42L);
        Assert.assertTrue("Wrong equals", key1.equals(key2));
        Assert.assertTrue("Wrong hashcode", key1.hashCode() == key2.hashCode());
        key2 = new ExperimenterActionDeserializerKey(EncodeConstants.OF13_VERSION_ID, 42L);
        Assert.assertFalse("Wrong equals", key1.equals(key2));
        Assert.assertFalse("Wrong hashcode", key1.hashCode() == key2.hashCode());
        key2 = new ExperimenterActionDeserializerKey(EncodeConstants.OF10_VERSION_ID, null);
        Assert.assertFalse("Wrong equals", key1.equals(key2));
        Assert.assertFalse("Wrong hashcode", key1.hashCode() == key2.hashCode());
        key2 = new ExperimenterActionDeserializerKey(EncodeConstants.OF10_VERSION_ID, 55L);
        Assert.assertFalse("Wrong equals", key1.equals(key2));
        Assert.assertFalse("Wrong hashcode", key1.hashCode() == key2.hashCode());
    }
}