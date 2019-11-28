package com.example.recyclerviewandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView rvCountryList;
    private List<Country> countryList;
    private RecyclerViewDemoAdapter demoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
    }
    private void initviews()
    {
        populateData();
        rvCountryList=findViewById(R.id.recycler_view);
        demoAdapter=new RecyclerViewDemoAdapter(countryList);
        //Linear Layout
        //RecyclerView.LayoutManager mLayout=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        //rvCountryList.setLayoutManager(mLayout);
        //Grid Layout
        //GridLayoutManager mGridLayout=new GridLayoutManager(this,2);
        //rvCountryList.setLayoutManager(mGridLayout);
        //Stacked Layout
        StaggeredGridLayoutManager mstaggeredGridLayoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        rvCountryList.setLayoutManager(mstaggeredGridLayoutManager);
        rvCountryList.setAdapter(demoAdapter);


    }
    private void populateData()
    {
        countryList=new ArrayList<>();
        countryList.add(new Country("India",R.drawable.in));
        countryList.add(new Country("United States of America",R.drawable.us));
        countryList.add(new Country("Canada",R.drawable.ca));
        countryList.add(new Country("Austrailia",R.drawable.au));
        countryList.add(new Country("Pakistan",R.drawable.pk));
        countryList.add(new Country("Russia",R.drawable.ru));
        countryList.add(new Country("Japan",R.drawable.jp));

        countryList.add(new Country("India",R.drawable.in));
        countryList.add(new Country("United States of America",R.drawable.us));
        countryList.add(new Country("Canada",R.drawable.ca));
        countryList.add(new Country("Austrailia",R.drawable.au));
        countryList.add(new Country("Pakistan",R.drawable.pk));
        countryList.add(new Country("Russia",R.drawable.ru));
        countryList.add(new Country("Japan",R.drawable.jp));

        countryList.add(new Country("India",R.drawable.in));
        countryList.add(new Country("United States of America",R.drawable.us));
        countryList.add(new Country("Canada",R.drawable.ca));
        countryList.add(new Country("Austrailia",R.drawable.au));
        countryList.add(new Country("Pakistan",R.drawable.pk));
        countryList.add(new Country("Russia",R.drawable.ru));
        countryList.add(new Country("Japan",R.drawable.jp));


    }
}
