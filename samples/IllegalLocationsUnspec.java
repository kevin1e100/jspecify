/*
 * Copyright 2020 The jspecify Authors.
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

import org.jspecify.annotations.DefaultNonNull;
import org.jspecify.annotations.NullnessUnspecified;

@DefaultNonNull
// PARADOX
class IllegalLocationsUnspec<@NullnessUnspecified E> {
  interface Lib<T extends @NullnessUnspecified Object> {}

  // PARADOX
  Lib<@NullnessUnspecified ?> x1;

  // PARADOX
  Lib<@NullnessUnspecified ? extends Object> x2;

  // PARADOX
  Lib<@NullnessUnspecified ? super Object> x3;

  class Nested {}

  @NullnessUnspecified Nested x4;

  // PARADOX
  @NullnessUnspecified IllegalLocationsUnspec<?>.Nested x5;

  IllegalLocationsUnspec<?>.@NullnessUnspecified Nested x6;
}