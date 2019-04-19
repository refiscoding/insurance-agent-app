package ke.co.insuranceapp.Common;


import ke.co.insuranceapp.Models.User;
import ke.co.insuranceapp.Retrofit.InsuranceApi;
import ke.co.insuranceapp.Retrofit.RetrofitClient;

public class Common {
    public static final String baseUrl ="http://35.234.134.240/ci/shimin/index.php/log/";

    public  static User currentUser;


    public static InsuranceApi getApi(){
        return RetrofitClient.getClient(baseUrl).create(InsuranceApi.class);
    }

}
