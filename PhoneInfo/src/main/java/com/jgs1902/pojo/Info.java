package com.jgs1902.pojo;

import java.util.List;

public class Info {
    private int id;
    private String title;
    private String content;
    private int replyCount;
    private int viewCount;
    private String reportTime;
    private String lastPostTime;

    public Info() {
    }

    public Info(int id, String title, String content, int replyCount, int viewCount, String reportTime, String lastPostTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.replyCount = replyCount;
        this.viewCount = viewCount;
        this.reportTime = reportTime;
        this.lastPostTime = lastPostTime;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public String getLastPostTime() {
        return lastPostTime;
    }

    public void setLastPostTime(String lastPostTime) {
        this.lastPostTime = lastPostTime;
    }

}
