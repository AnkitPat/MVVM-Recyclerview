package com.example.bbim1041.mvvm_recyclerver.Adapter;

import android.content.Context;
import android.renderscript.ScriptGroup;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.bbim1041.mvvm_recyclerver.R;
import com.example.bbim1041.mvvm_recyclerver.databinding.NewsBinding;
import com.example.bbim1041.mvvm_recyclerver.viewmodel.NewsModel;

import java.util.ArrayList;

/**
 * Created by Ankit Patidar on 21/05/18.
 * Adapter class where we are binding the single items view with data
 * We are showing the recycler adapter
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.RecyclerViewHolder> {
    
    
    ArrayList<NewsModel> newsModels;
    
    public CustomAdapter(ArrayList<NewsModel> models) {
        this.newsModels = models;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        NewsBinding newsBinding = NewsBinding.inflate(layoutInflater,parent,false);
        
        return new RecyclerViewHolder(newsBinding);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        NewsModel model = newsModels.get(position);
        holder.bind(model);
        
    }

    @Override
    public int getItemCount() {
        return newsModels.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder {
        
        
        private NewsBinding newsBinding;
        
        public RecyclerViewHolder(NewsBinding newsBinding) {
            super(newsBinding.getRoot());
            
            this.newsBinding = newsBinding;
            
        }
        
        public void bind(NewsModel newsModel)
        {
            this.newsBinding.setNewsView(newsModel);
        }
        
        public NewsBinding getNewsBinding() {
            return newsBinding;
        }
    }
    
}
