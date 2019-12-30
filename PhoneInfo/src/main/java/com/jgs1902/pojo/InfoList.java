package com.jgs1902.pojo;

import java.util.List;

public class InfoList {
    private List<Info> infoList;
    private List<Replies> repliesList;

    public InfoList(List<Info> infoList, List<Replies> repliesList) {
        this.infoList = infoList;
        this.repliesList = repliesList;
    }

    public List<Info> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<Info> infoList) {
        this.infoList = infoList;
    }

    public List<Replies> getRepliesList() {
        return repliesList;
    }

    public void setRepliesList(List<Replies> repliesList) {
        this.repliesList = repliesList;
    }
}
