package info.androidboss.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Droid on 22-Mar-17.
 */

public interface RetroFitApiInterface {
    @GET("movies.json")
    Call<List<Movie>> getMovie();
}
