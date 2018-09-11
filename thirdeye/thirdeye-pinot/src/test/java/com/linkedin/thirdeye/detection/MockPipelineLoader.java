/**
 * Copyright (C) 2014-2018 LinkedIn Corp. (pinot-core@linkedin.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.linkedin.thirdeye.detection;

import com.linkedin.thirdeye.datalayer.dto.DetectionConfigDTO;
import com.linkedin.thirdeye.datalayer.dto.MergedAnomalyResultDTO;
import java.util.Collections;
import java.util.List;


public class MockPipelineLoader extends DetectionPipelineLoader {
  private final List<MockPipeline> runs;
  private final List<MockPipelineOutput> outputs;
  private int offset = 0;

  public MockPipelineLoader(List<MockPipeline> runs, List<MockPipelineOutput> outputs) {
    this.outputs = outputs;
    this.runs = runs;
  }

  @Override
  public DetectionPipeline from(DataProvider provider, DetectionConfigDTO config, long start, long end) {
    MockPipelineOutput output = this.outputs.isEmpty() ?
        new MockPipelineOutput(Collections.<MergedAnomalyResultDTO>emptyList(), -1) :
        this.outputs.get(this.offset++);
    MockPipeline p = new MockPipeline(provider, config, start, end, output);
    this.runs.add(p);
    return p;
  }
}
