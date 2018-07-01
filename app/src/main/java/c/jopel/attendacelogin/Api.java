package c.jopel.attendacelogin;


    import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


    public interface Api {

        String BASE_URL = "plzz enter url ";

        @GET("center")
        Call<List<Center>> getCenter();
    }

