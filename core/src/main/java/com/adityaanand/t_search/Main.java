package com.adityaanand.t_search;

import com.adityaanand.t_search.model.ResultCallback;
import com.adityaanand.t_search.model.SearchResult;

public class Main {

    public static void main(String[] args) {
        new SearchEngine().search("harry potter", new ResultCallback() {
            @Override
            public void apply(SearchResult result) {
                System.out.println("got result");
                System.out.println(result);
            }
        });
    }
}
