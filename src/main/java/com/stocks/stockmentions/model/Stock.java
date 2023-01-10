package com.stocks.stockmentions.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "Tickers")
public class Stock {
    private String name;
    private int mentions;

    private ArrayList<PostInfo> postInfo;

    public ArrayList<PostInfo> getPostInfo() {
        return postInfo;
    }

    public void setPostInfo(ArrayList<PostInfo> postInfo) {
        this.postInfo = postInfo;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", mentions=" + mentions +
                ", postInfo=" + postInfo +
                '}';
    }


    public Stock(String name, int mentions, ArrayList<PostInfo> postInfo) {
        this.name = name;
        this.mentions = mentions;
        this.postInfo = postInfo;
    }

    public String getName() {
        return name;
    }

    public int getMentions() {
        return mentions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMentions(int mentions) {
        this.mentions = mentions;
    }
}
