package com.example.android.news2;

/**
 * An {@link News} object contains information related to a single article.
 */
public class News {

    /**
     * Title of the article
     */
    private String mTitle;

    /**
     * Author of the article
     */
    private String mAuthor;

    /**
     * Section of the article
     */
    private String mSection;

    /**
     * Date of the article
     */
    private String mDate;

    /**
     * Website URL of the article
     */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param title   is the title of the article
     * @param author   is the author of the article
     * @param section is the section where the article belongs
     * @param date    is the date where the article was published
     * @param url     is the website URL to find more details about the article
     */
    public News(String title, String author, String section, String date, String url) {
        mTitle = title;
        mAuthor = author;
        mSection = section;
        mDate = date;
        mUrl = url;
    }

    /**
     * Returns the title of the article.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the author of the article.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the section of the article.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the date the article was published.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the website URL to find more information about the article.
     */
    public String getUrl() {
        return mUrl;
    }
}