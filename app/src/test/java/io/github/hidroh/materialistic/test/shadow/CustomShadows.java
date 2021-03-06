/*
 * Copyright (c) 2016 Ha Duy Trung
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

package io.github.hidroh.materialistic.test.shadow;

import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;

import org.robolectric.internal.ShadowExtractor;

public class CustomShadows {
    public static ShadowRecyclerViewAdapter customShadowOf(RecyclerView.Adapter adapter) {
        return (ShadowRecyclerViewAdapter) ShadowExtractor.extract(adapter);
    }

    public static ShadowRecyclerView customShadowOf(RecyclerView recyclerView) {
        return (ShadowRecyclerView) ShadowExtractor.extract(recyclerView);
    }

    public static ShadowNestedScrollView customShadowOf(NestedScrollView nestedScrollView) {
        return (ShadowNestedScrollView) ShadowExtractor.extract(nestedScrollView);
    }
}
