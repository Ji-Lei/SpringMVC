package com.jgs1902.pojo;

public class Replies {
    private int id;
    private String content;
    private String replyTime;
    private int infoId;

    public Replies() {
    }

    public Replies(int id, String content, String replyTime, int infoId) {
        this.id = id;
        this.content = content;
        this.replyTime = replyTime;
        this.infoId = infoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }

    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }
}
