/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.guacamole.auth.ssl.conf;

import org.apache.guacamole.GuacamoleException;
import org.apache.guacamole.environment.DelegatingEnvironment;
import org.apache.guacamole.environment.LocalEnvironment;

/**
 * An environment for retrieving SSL-related properties from the Guacamole
 * configuration.
 */
public class SSLEnvironment extends DelegatingEnvironment {
    
    /**
     * Create a new instance of the configuration environment for the
     * SSL SSO module, pulling the default instance of the LocalEnvironment.
     */
    public SSLEnvironment() {
        super(LocalEnvironment.getInstance());
    }
    
}
