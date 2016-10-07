package com.example.android.newsapp;

public class News {

    //Will hold the category of news ie us news
    private String mNewsCategory;

    //Will hold the title of the news story
    private String mNewsTitle;

    //Will hold the URL of the news query
    private String mUrl;

    //Will hold the name of the author
    private String mContributorName;

    public News(String newsCategory, String newsTitle, String url, String contributorName) {
        mNewsCategory = newsCategory;
        mNewsTitle = newsTitle;
        mUrl = url;
        mContributorName = contributorName;
    }

    /**
     * Get the category of the news article
     *
     * @return mNewsCategory
     */
    public String getNewsCategory() {
        return mNewsCategory;
    }

    /**
     * Get the title of the news article
     *
     * @return mNewsTitle
     */
    public String getNewsTitle() {
        return mNewsTitle;
    }


    /**
     * Get the URL of each news story
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * Get the contributor names of each news story
     */
    public String getContributorName() {
        return mContributorName;
    }
}