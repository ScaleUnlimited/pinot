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
package com.linkedin.thirdeye.hadoop.derivedcolumn.transformation;

/**
 * This class contains the properties to be set for topk column transformation phase
 */
public enum DerivedColumnTransformationPhaseConstants {
  DERIVED_COLUMN_TRANSFORMATION_PHASE_INPUT_PATH("derived.column.transformation.phase.input.path"),
  DERIVED_COLUMN_TRANSFORMATION_PHASE_TOPK_PATH("derived.column.transformation.phase.topk.path"),
  DERIVED_COLUMN_TRANSFORMATION_PHASE_OUTPUT_PATH("derived.column.transformation.phase.output.path"),
  DERIVED_COLUMN_TRANSFORMATION_PHASE_OUTPUT_SCHEMA("derived.column.transformation.phase.output.schema"),
  DERIVED_COLUMN_TRANSFORMATION_PHASE_THIRDEYE_CONFIG("derived.column.transformation.phase.thirdeye.config");

  String name;

  DerivedColumnTransformationPhaseConstants(String name) {
    this.name = name;
  }

  public String toString() {
    return name;
  }

}
