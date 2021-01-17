package com.moringaschool.mylib;

import android.app.DownloadManager;

import java.io.BufferedReader;
import java.net.HttpURLConnection;

public class NetworkUtils {
    private static final String LOG_TAG = NetworkUtils.class.getSimpleName();

    //Base URI for the Books API
    private static final String BOOK_BASE_URL = "https://www.googleapis.com/books/v1/volumes?";

    //Parameter for the search string
    private static final String QUERY_PARAM = "q";

    //Parameter that limits search results
    private static final String MAX_RESULTS = "maxResults";

    //Parameter to filter by print type
    private static final String PRINT_TYPE = "printType";

    static String getBookInfo(String queryString){
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        String bookJSONString = null;
        return bookJSONString;
    }
}
