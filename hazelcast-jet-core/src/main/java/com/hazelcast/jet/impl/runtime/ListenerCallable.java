/*
 * Copyright (c) 2008-2016, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.jet.impl.runtime;

import com.hazelcast.jet.runtime.VertexRunnerListener;

/**
 * Callable for the vertex runner listeners;
 */
public interface ListenerCallable {
    /**
     * Performs vertex runner's listener invocation;
     *
     * @param listener - vertex runner listener;
     * @param payload  - arguments of errors;
     * @param <T>      - type of corresponding exception;
     */
    <T extends Throwable> void call(VertexRunnerListener listener, T... payload);
}