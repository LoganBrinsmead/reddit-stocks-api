package com.stocks.stockmentions.model;

public class PostInfo {

    private String postTitle;

    private String sentiment;
    private String postLink;

    @Override
    public String toString() {
        return "PostInfo{" +
                "postTitle='" + postTitle + '\'' +
                ", sentiment='" + sentiment + '\'' +
                ", postLink='" + postLink + '\'' +
                '}';
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public void setPostLink(String postLink) {
        this.postLink = postLink;
    }


    public String getPostTitle() {
        return postTitle;
    }

    public String getSentiment() {
        return sentiment;
    }

    public String getPostLink() {
        return postLink;
    }

    public PostInfo(String postTitle, String sentiment, String postLink) {
        this.postTitle = postTitle;
        this.sentiment = sentiment;
        this.postLink = postLink;
    }

}
