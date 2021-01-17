package com.moringaschool.mylib;

import android.app.DownloadManager;
import android.net.Uri;

import java.io.BufferedReader;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLClassLoader;

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
//        return bookJSONString;

        try{

            //Limiting results to 10 items and printed books
            Uri builtUri = Uri.parse(BOOK_BASE_URL).buildUpon()
                    .appendQueryParameter(QUERY_PARAM, queryString)
                    .appendQueryParameter(MAX_RESULTS, "10")
                    .appendQueryParameter(PRINT_TYPE, "books")
                    .build();

            URL requestURL = new URL(builtUri.toString());

            urlConnection = (HttpURLConnection) requestURL.openConnection();

            urlConnection.setRequestMethod("Get");

            urlConnection.connect();

            //Read the response using an inputStream  and stringBuffer, then convert it to string

            InputStream inputStream = urlConnection.getInputStream();

        }catch (Exception ex) {

        }finally {
            return bookJSONString;
        }
    }
}
