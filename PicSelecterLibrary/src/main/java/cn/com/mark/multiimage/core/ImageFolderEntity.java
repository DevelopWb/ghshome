/*
 * Copyright (C) 2015 zhenjin ma
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

package cn.com.mark.multiimage.core;

import java.util.ArrayList;
import java.util.List;

public class ImageFolderEntity implements Comparable<ImageFolderEntity> {
    private static String sDefaultName;
    private String name;
    private String path;
    private List<ImageEntity> list;

    public ImageFolderEntity() {
        list = new ArrayList<>();
    }

    public ImageFolderEntity(String defaultString) {
        list = new ArrayList<>();
        sDefaultName = defaultString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getCount() {
        return list.size();
    }

    public ImageEntity getFirst() {
        return list.get(0);
    }

    public List<ImageEntity> getList() {
        return list;
    }

    public void addFile(ImageEntity file) {
        list.add(file);
    }

    @Override
    public int compareTo(ImageFolderEntity another) {

        if (name.equals(sDefaultName)|| another.getName().equals(sDefaultName)) {
            if (name.equals(sDefaultName) && another.getName().equals(sDefaultName)) {
                return 0;
            }

            if (name.equals(sDefaultName) && !another.getName().equals(sDefaultName)) {
                return -1;
            }

            if (!name.equals(sDefaultName) && another.getName().equals(sDefaultName)) {
                return 1;
            }
        }
        int value = name.compareToIgnoreCase(another.getName());
        if (value > 0) {
            return 1;
        } else if (value < 0) {
            return -1;
        } else {
            return 0;
        }
    }

}
