package com.mutwakilmo.android.mynews.Utils;

import com.mutwakilmo.android.mynews.New_York_Times_Most_Popular.NYMostPopularResponse;
import com.mutwakilmo.android.mynews.New_York_Times_Top_Stories.TopStoriesResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Mutwakil Mo on 22/02/2020
 */
public interface NewYorkTimesService {
    // -------------------------------------------------------------------------------------
    // Explanations: This variable returns a Retrofit object that will then be used to run a network query.
    //.baseUrl("https://api.nytimes.com/svc/")  : Used to define a root URL for Retrofi, used afterward as a
    // base URL by our endpoints.
    //.addConverterFactory(GsonConverterFactory.create()): Used to define the serializer/deserializer
    // used by default by Retrofit, here GSON.
    // -------------------------------------------------------------------------------------

    //Base URL from the NewYorkTimes APIs
    String NEW_YORK_TIMES_URL = "https://api.nytimes.com/svc/";

    //Retrofit Instance
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(NEW_YORK_TIMES_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    /*--------------------
    |NY Times MostPopular API
    |
    |---------------------*/

    @GET("mostpopular/v2/viewed/{period}.json")
    Call<NYMostPopularResponse> getNYMostPopular(
            @Path("period") int PERIOD,
            @Query("api-key") String API_KEY
    );

    /*--------------------
    |NY Times Top Stories API
    |
    |---------------------*/

    @GET("topstories/v2/{section}.json")
    Call<TopStoriesResponse> getNYTopStories(
            @Path("section") String SECTION,
            @Query("api-key") String API_KEY
    );


}
