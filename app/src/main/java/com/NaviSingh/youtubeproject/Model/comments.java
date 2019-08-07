package com.NaviSingh.youtubeproject.Model;

public class comments {

    private String mName;
    private String mComment;
    private String circleText;

    public comments(){

    }

    public comments(String mName, String mComment, String circleText) {
        this.mName = mName;
        this.mComment = mComment;
        this.circleText = circleText;
    }

    public String getmName() {
        return mName;
    }

    public String getmComment() {
        return mComment;
    }

    public String getCircleText() {
        return circleText;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmComment(String mComment) {
        this.mComment = mComment;
    }

    public void setCircleText(String circleText) {
        this.circleText = circleText;
    }
}
