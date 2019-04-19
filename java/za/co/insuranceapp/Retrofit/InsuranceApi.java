package ke.co.insuranceapp.Retrofit;

import java.util.List;
import java.util.Map;

import ke.co.insuranceapp.Models.Customer;
import ke.co.insuranceapp.Models.Data;
import ke.co.insuranceapp.Models.Policy;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface InsuranceApi {

//    @FormUrlEncoded
//    @POST("add_log")
//    Call<Policy> save_log(@Field("data")String data,
//                          @Field("effectiveDate")String effectiveDate,
//                          @Field("expiryDate")String expiryDate,
//                          @Field("client")String client,
//                          @Field("insuredObject")String insuredObject,
//                          @Field("insuredCompany")String insuredCompany,
//                          @Field("risk")String risk,
//                          @Field("premium")String premium,
//                          @Field("commission")String commission,
//                          @Field("adminFee")String adminFee
//
//                          );
//    @FormUrlEncoded
//    @POST("log")
//    Call<Void>save_log(@Field("data") String data);

    @FormUrlEncoded
    @POST("log")
    Call<Void>save_log(@FieldMap Map<String, Object> data);


//    @POST("save_log")
//    Call<Policy> save_log(@Query("effectiveDate")String data,
//                           @Query("expiryDate")String expiryDate,
//                           @Query("client")String client,
//                           @Query("insuredObject")String insuredObject,
//                           @Query("insuredCompany")String insuredCompany,
//                           @Query("risk")String risk,
//                           @Query("premium")String premium,
//                           @Query("value")String value,
//                           @Query("commission")String commission,
//                           @Query("adminFee")String adminFee
//                           );

    @FormUrlEncoded
    @POST("addclient.php")
    Call<Customer>addcustomer(@Query("name")String name,
                              @Query("phone")String phone,
                              @Query("email")String email,
                              @Query("covers")String covers);

    @GET("policy.php")
    Call<List<Policy>> getpolicies();

    @GET("client.php")
    Call<List<Customer>>getcustomers();


}
