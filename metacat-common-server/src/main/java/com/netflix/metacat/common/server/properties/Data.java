/*
 *
 *  Copyright 2017 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.metacat.common.server.properties;

import lombok.NonNull;

/**
 * Data related properties.
 *
 * @author tgianos
 * @since 1.1.0
 */
@lombok.Data
public class Data {

    @NonNull
    private Metadata metadata = new Metadata();

    /**
     * Metadata related properties.
     *
     * @author tgianos
     * @since 1.1.0
     */
    @lombok.Data
    public static class Metadata {

        @NonNull
        private Delete delete = new Delete();

        /**
         * Delete related properties.
         *
         * @author tgianos
         * @since 1.1.0
         */
        @lombok.Data
        public static class Delete {

            private boolean enable;
            @NonNull
            private Marker marker = new Marker();

            /**
             * Marker related properties.
             *
             * @author tgianos
             * @since 1.1.0
             */
            @lombok.Data
            public static class Marker {

                @NonNull
                private Lifetime lifetime = new Lifetime();

                /**
                 * Lifetime related properties.
                 *
                 * @author tgianos
                 * @since 1.1.0
                 */
                @lombok.Data
                public static class Lifetime {
                    private int days = 15;
                }
            }
        }
    }
}
