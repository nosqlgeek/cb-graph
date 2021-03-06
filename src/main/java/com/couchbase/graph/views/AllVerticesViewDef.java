/*
 * Copyright 2014 Couchbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.couchbase.graph.views;

import com.couchbase.graph.cfg.ConfigManager;

/**
 * The view definition which is used to index all vertices
 * 
 * @author David Maier <david.maier at couchbase.com>
 */
public class AllVerticesViewDef extends ViewDef {
    
    public static final String MAP_FUNC_FILE_NAME = "func_map_all_vertices.js";
    public static final String VIEW_ALL_VERTICES = ConfigManager.getCbConfig().getAllVerticesView();
    
    public AllVerticesViewDef() {
        super(VIEW_ALL_VERTICES, MAP_FUNC_FILE_NAME);
    }
}
