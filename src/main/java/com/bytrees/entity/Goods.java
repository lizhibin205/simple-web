package com.bytrees.entity;

import java.sql.Timestamp;

public class Goods {
    private Long id;
    private String name;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Byte isDeleted;

    public Long getId() {
    	return id;
    }
    public void setId(Long id) {
    	this.id = id;
    }

    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }

    public Timestamp getCreateTime() {
    	return createTime;
    }
    public void setCreateTime(Timestamp createTime) {
    	this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
    	return updateTime;
    }
    public void setUpdateTime(Timestamp updateTime) {
    	this.updateTime = updateTime;
    }

    public Byte getIsDeleted() {
    	return isDeleted;
    }
    public void setIsDeleted(Byte isDeleted) {
    	this.isDeleted = isDeleted;
    }
}
