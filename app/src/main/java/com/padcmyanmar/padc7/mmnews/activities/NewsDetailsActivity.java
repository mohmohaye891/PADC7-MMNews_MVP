package com.padcmyanmar.padc7.mmnews.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.padcmyanmar.padc7.mmnews.R;
import com.padcmyanmar.padc7.mmnews.adapters.NewsDetailsImagesAdapter;

public class NewsDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);

        ViewPager vpNewsDetailsImages = findViewById(R.id.vp_news_details_images);

        NewsDetailsImagesAdapter newsDetailsImagesAdapter = new NewsDetailsImagesAdapter();
        vpNewsDetailsImages.setAdapter(newsDetailsImagesAdapter);
    }
}
