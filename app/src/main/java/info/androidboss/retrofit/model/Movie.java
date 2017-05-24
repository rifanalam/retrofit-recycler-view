package info.androidboss.retrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Droid on 22-Mar-17.
 */

public class Movie {


    /**
     * title : Dawn of the Planet of the Apes
     * image : http://api.androidhive.info/json/movies/1.jpg
     * rating : 8.3
     * releaseYear : 2014
     * genre : ["Action","Drama","Sci-Fi"]
     */

    @SerializedName("title")
    private String title;
    @SerializedName("image")
    private String image;
    @SerializedName("rating")
    private String rating;
    @SerializedName("releaseYear")
    private String releaseYear;
    @SerializedName("genre")
    private List<String> genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", rating='" + rating + '\'' +
                ", releaseYear=" + releaseYear +
                ", genre=" + genre +
                '}';
    }
}
