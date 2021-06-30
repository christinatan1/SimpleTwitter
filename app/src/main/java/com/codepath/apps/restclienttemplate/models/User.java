package com.codepath.apps.restclienttemplate.models;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;


@Parcel
public class User {
    public String name;
    public String screenName;
    public String profileImageUrl;
    public String tweetImageUrl = null;
    public static final String TAG = "User";

    // empty constructor needed by Parceler library
    public User() {}

    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getString("name");
        user.screenName = "@" + jsonObject.getString("screen_name");
        user.profileImageUrl = jsonObject.getString("profile_image_url_https");

//        if(!jsonObject.isNull("media_url_https")) {
////            Log.e(TAG, jsonObject.getString("media_url_https"));
//            user.tweetImageUrl = jsonObject.getString("media_url_https");
//        }

        return user;
    }
}
