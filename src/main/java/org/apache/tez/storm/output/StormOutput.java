/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tez.storm.output;

import org.apache.tez.runtime.api.AbstractLogicalOutput;
import org.apache.tez.runtime.api.Event;
import org.apache.tez.runtime.api.OutputContext;
import org.apache.tez.runtime.api.Writer;

import java.util.List;

/**
 * Created by pbrahmbhatt on 9/16/15.
 */
public class StormOutput extends AbstractLogicalOutput {

    public StormOutput(OutputContext outputContext, int numPhysicalOutputs) {
        super(outputContext, numPhysicalOutputs);
    }

    @Override
    public List<Event> initialize() throws Exception {
        return null;
    }

    @Override
    public void handleEvents(List<Event> list) {

    }

    @Override
    public List<Event> close() throws Exception {
        return null;
    }

    @Override
    public void start() throws Exception {

    }

    @Override
    public Writer getWriter() throws Exception {
        return null;
    }
}
