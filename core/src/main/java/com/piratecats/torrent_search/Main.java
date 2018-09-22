package com.piratecats.torrent_search;

import com.piratecats.torrent_search.model.ResultCallback;
import com.piratecats.torrent_search.model.SearchResult;

public class Main {

    public static void main(String[] args) {
        new SearchEngine().search("porn", new ResultCallback() {
            @Override
            public void apply(SearchResult result) {
                System.out.println(result);
            }
        });
    }
}
