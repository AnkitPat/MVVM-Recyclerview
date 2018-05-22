package com.example.bbim1041.mvvm_recyclerver.viewmodel;

import com.example.bbim1041.mvvm_recyclerver.model.News;

/**
 * Created by Ankit Patidar on 21/05/18.
 * 
 * View Model Class for fetching news nodes and rendering it to view
 */

public class NewsModel {
    
    public String title;
    public String desc;
    
    public NewsModel(News news) {
        this.title = news.title;
        this.desc = news.desc;
    }
}
