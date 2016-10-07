package com.example.android.newsapp;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by steva on 9/10/2016.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news stories.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        // Find the news story at the given position in the list of news stories
        News currentNews = getItem(position);

        // Find the TextView with view ID news_category
        TextView newsCategory = (TextView) listItemView.findViewById(R.id.news_category);
        newsCategory.setText(currentNews.getNewsCategory());

        //Find the TextView with the article title
        TextView newsTitle = (TextView) listItemView.findViewById(R.id.article_title);
        newsTitle.setText(currentNews.getNewsTitle());

        //Find the TextView with the article contributor
        TextView contributorTextView = (TextView) listItemView.findViewById(R.id.contributor);
        contributorTextView.setText(currentNews.getContributorName());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}