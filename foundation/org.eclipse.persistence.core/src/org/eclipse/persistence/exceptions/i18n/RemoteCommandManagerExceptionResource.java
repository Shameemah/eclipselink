/*******************************************************************************
 * Copyright (c) 1998, 2012 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0 
 * which accompanies this distribution. 
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
 *     cdelahun - Bug 214534: added message for JMSPublishingHelper error checking
 ******************************************************************************/  
package org.eclipse.persistence.exceptions.i18n;

import java.util.ListResourceBundle;

/**
 * INTERNAL:
 * English ResourceBundle for RemoteCommandManagerExceptionResource messages.
 *
 * @author Steven Vo
 */
public class RemoteCommandManagerExceptionResource extends ListResourceBundle {
    static final Object[][] contents = {
                                           { "22101", "Could not obtain JNDI context, check your properties are set correctly." },
                                           { "22102", "Could not post connection in local naming service under name {0}" },
                                           { "22103", "Could not look up remote connection under name {0} with URL {1}" },
                                           { "22104", "Could not look up hostname" },
                                           { "22105", "Could not propagate command to {0}" },
                                           { "22106", "Could not create external JMS connection with Topic {0} and Topic Factory {1}. Also, check your context properties are set correctly." },
                                           { "22107", "Could not remove local connection in local naming service under name {0}" },             
                                           { "22108", "Could not serialize or desiralize command" },
                                           { "22109", "Failed to receive JMS message from JMS provider" },
                                           { "22110", "Failed to discover local host IP address." },
                                           { "22111", "Failed to get ServerPlatform. The ServerPlatform must be set either on Session or RemoteCommandManager." },
                                           { "22112", "Could not create local JMS connection with Topic {0} and Topic Factory {1}. Also, check your context properties are set correctly." },
                                           { "22113", "Could not create Oc4jJGroupsRemoteConnection service ID {0}, topic {1}, using factory {2}. Also, check your context properties are set correctly." },
                                           { "22114", "{0}: failed to deserialize retrieved message {1}." },
                                           { "22115", "{0}: failed to process remote command retrieved from message {1}, from {2}, command type {3}" },
                                           { "22116", "Received JMS message is null. Treating it as a JMSException" },
                                           { "22117", "Session's RemoteCommandManager is closed or has not been initialized while processing incoming messages" }
    };

    /**
     * Return the lookup table.
     */
    protected Object[][] getContents() {
        return contents;
    }
}
