/*
 * Copyright (c) 2016 Couchbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.couchbase.client.core.config.loader;

import com.couchbase.client.core.config.BucketConfig;
import com.couchbase.client.core.config.LoaderType;
import com.couchbase.client.core.lang.Tuple2;
import com.couchbase.client.core.utils.NetworkAddress;
import rx.Observable;

public interface Loader {

     @Deprecated
     Observable<Tuple2<LoaderType, BucketConfig>> loadConfig(final NetworkAddress seedNode,
                                                             final String bucket, final String password);

     Observable<Tuple2<LoaderType, BucketConfig>> loadConfig(final NetworkAddress seedNode,
        final String bucket, final String username, final String password);
}
