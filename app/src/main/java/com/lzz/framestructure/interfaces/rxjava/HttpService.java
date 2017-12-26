package com.lzz.framestructure.interfaces.rxjava;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lzz on 2017/12/8.
 */

public interface HttpService {

    @GET("videowall/new" )
    Observable<ResponseBody> getNew(@Query("data") String data);
    @GET("videowall/hot" )
    Observable<ResponseBody> getHot(@Query("data") String data);
    @GET("videowall/allcategory" )
    Observable<ResponseBody> getAllCategory(@Query("data") String data);
    @GET("videowall/categorydetail" )
    Observable<ResponseBody> getCategoryDetail(@Query("data") String data);
    @GET("videowall/push" )
    Observable<ResponseBody> getPush(@Query("data") String data);
    @GET("wallpaper/checkUpdate_video" )
    Observable<ResponseBody> checkUpdate(@Query("appvsn") String appvsn);
}
