/*
 * Copyright 2018 Dmitrii Napolov
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

package com.adityaanand.t_search.adapters.yts;

import com.adityaanand.t_search.model.category.Category;

final class CategoryMapper {
    private CategoryMapper() {
    }

    static Category getByName(String category) {
        switch (category) {
            case "720p":
                return Category.VIDEO_MOVIES;
            case "1080p":
                return Category.VIDEO_MOVIES_HD;
            case "3D":
                return Category.VIDEO_MOVIES_3D;
            default:
                return Category.ALL;
        }
    }
}