package com.example.bbim1041.mvvm_recyclerver

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.bbim1041.mvvm_recyclerver.Adapter.CustomAdapter
import com.example.bbim1041.mvvm_recyclerver.model.News
import com.example.bbim1041.mvvm_recyclerver.viewmodel.NewsModel
import android.support.v7.widget.DividerItemDecoration
import com.example.bbim1041.mvvm_recyclerver.databinding.ActivityMainBinding


/**
 * Main Activity Class for settings the recyclerview and showing it.
 */
class MainActivity : AppCompatActivity() {
    
    var modelsList: ArrayList<NewsModel> = ArrayList()
    
  

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        
        
        
        var newsModel: NewsModel = NewsModel(News("Ankit","News"))
        var newsModel1: NewsModel = NewsModel(News("Ankit","News"))
        var newsModel2: NewsModel = NewsModel(News("Ankit","News"))
        var newsModel3: NewsModel = NewsModel(News("Ankit","News"))
        var newsModel4: NewsModel = NewsModel(News("Ankit","News"))
        
        modelsList.add(newsModel)
        modelsList.add(newsModel1)
        modelsList.add(newsModel2)
        modelsList.add(newsModel3)
        modelsList.add(newsModel4)
        

        var customAdapter = CustomAdapter(modelsList)
        
        
       var recyclerView: RecyclerView = findViewById(R.id.listView)
        
        var layoutManager
        = LinearLayoutManager(this)
        
        recyclerView.layoutManager = layoutManager
        
        recyclerView.adapter = customAdapter
        val dividerItemDecoration = DividerItemDecoration(recyclerView.context,
                layoutManager.getOrientation())
        recyclerView.addItemDecoration(dividerItemDecoration)
        
        
    }
    
   
}
