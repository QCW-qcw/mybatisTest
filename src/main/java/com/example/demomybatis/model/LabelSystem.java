package com.example.demomybatis.model;

import java.util.Date;

public class LabelSystem {
    private Integer labelSystemId;

    private String labelSystemName;

    private Date createTime;

    private String person;

    public Integer getLabelSystemId() {
        return labelSystemId;
    }

    public void setLabelSystemId(Integer labelSystemId) {
        this.labelSystemId = labelSystemId;
    }

    public String getLabelSystemName() {
        return labelSystemName;
    }

    public void setLabelSystemName(String labelSystemName) {
        this.labelSystemName = labelSystemName == null ? null : labelSystemName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }
}