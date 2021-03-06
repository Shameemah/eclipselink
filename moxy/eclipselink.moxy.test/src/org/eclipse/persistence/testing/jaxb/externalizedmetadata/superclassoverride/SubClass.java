/*******************************************************************************
 * Copyright (c) 2011, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Matt MacIvor - 2.4 - initial implementation
 ******************************************************************************/
package org.eclipse.persistence.testing.jaxb.externalizedmetadata.superclassoverride;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SubClass extends SpecialMap<String, String> {

    @XmlElement(name="myProperty")
    public String getMyProperty() {
        return super.get("myProperty");
    }

    public void setMyProperty(String value) {
        super.put("myProperty", value);
    }

    public boolean equals(Object subClass) {
        return getMyProperty().equals(((SubClass)subClass).getMyProperty());
    }
}
