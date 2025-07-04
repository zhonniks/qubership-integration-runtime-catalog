/*
 * Copyright 2024-2025 NetCracker Technology Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.qubership.integration.platform.runtime.catalog.builder.templates.helpers;

import org.qubership.integration.platform.runtime.catalog.builder.templates.TemplatesHelper;
import org.qubership.integration.platform.runtime.catalog.exception.exceptions.SnapshotCreationException;
import org.qubership.integration.platform.runtime.catalog.util.SimpleHttpUriUtils;

@TemplatesHelper
public class UriHelper extends BaseHelper {

    /**
     * Extract path and query from provided URI
     */
    public CharSequence extractPathAndQuery(Object uri) {
        if (!SimpleHttpUriUtils.isValidProtocolAndDomainWithPort(uri.toString())) {
            throw new SnapshotCreationException("Invalid URI format.");
        }
        return SimpleHttpUriUtils.extractPathAndQueryFromUri(uri.toString());
    }
}
