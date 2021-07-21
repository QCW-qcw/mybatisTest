package com.example.demomybatis.model;

public class Labels {
    private Integer labelId;

    private Integer labelSystemId;

    private String labelName;

    private Integer parentId;

    private String parentLabels;

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public Integer getLabelSystemId() {
        return labelSystemId;
    }

    public void setLabelSystemId(Integer labelSystemId) {
        this.labelSystemId = labelSystemId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getParentLabels() {
        return parentLabels;
    }

    public void setParentLabels(String parentLabels) {
        this.parentLabels = parentLabels == null ? null : parentLabels.trim();
    }
}