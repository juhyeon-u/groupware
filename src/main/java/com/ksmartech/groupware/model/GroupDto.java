package com.ksmartech.groupware.model;

public class GroupDto {
    private String groupId;
    private String groupName;
    private String groupParentId;
    private String groupDescription;

    @Override
    public String toString() {
        return "GroupDto{" +
                "groupId='" + groupId + '\'' +
                ", groupName='" + groupName + '\'' +
                ", groupParentId='" + groupParentId + '\'' +
                ", groupDescription='" + groupDescription + '\'' +
                '}';
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupParentId() {
        return groupParentId;
    }

    public void setGroupParentId(String groupParentId) {
        this.groupParentId = groupParentId;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }
}
