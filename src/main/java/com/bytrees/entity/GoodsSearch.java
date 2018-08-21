package com.bytrees.entity;

import java.util.List;

public class GoodsSearch {
    private List<String> searchNameList;
    private int limit = 50;
    private int lastId = 0;

    public void addName(String name) {
        if (!searchNameList.contains(name)) {
            searchNameList.add(name);
        }
    }
    public void setSearchNameList(List<String> searchNameList) {
        this.searchNameList = searchNameList;
    }
    public List<String> getSearchNameList() {
        return searchNameList;
    }

    public void setLitmit(int limit) {
        this.limit = limit;
    }
    public int getLimit() {
        return limit;
    }

    public void setLastId(int lastId) {
        this.lastId = lastId;
    }
    public int getLastId() {
        return lastId;
    }
}
