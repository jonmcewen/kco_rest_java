/*
 * Copyright 2014 Klarna AB
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

package com.klarna.rest.api;

/**
 * API protocol exception to indicate when the response is not according
 * to specification.
 */
public class ProtocolException extends RuntimeException {

    /**
     * Constructs a ProtocolException instance.
     *
     * @param message Error message
     */
    /* package */ ProtocolException(final String message) {
        super(message);
    }

    /**
     * Creates a protocol exception using the unexpected status message.
     *
     * @param status Unexpected HTTP status code
     * @return Exception instance
     */
    /* package */ static ProtocolException unexpectedStatus(final int status) {
        return new ProtocolException(
                String.format("Unexpected response status code: %d", status));
    }
}
