package me.silfen.deansilfen.qswipe;


import java.util.List;

import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.Call;

/**
 * Created by deansilfen on 12/10/15.
 */
public interface ClueInterface {

    @GET("random")
    Call <List<Clue>> getClues (@Query("count") Integer count);
}
