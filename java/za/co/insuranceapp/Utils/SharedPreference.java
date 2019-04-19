package ke.co.insuranceapp.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import ke.co.insuranceapp.Models.User;


public class SharedPreference {
//
//    public static final String MyPREFERENCES = "MyAppPrefs";
//
//    public static final String firstName = "firstName";
//    public static final String otherNames = "otherName";
//    public static final String id_passport = "id/passport";
//    public static final String email = "email";
//    public static final String phoneNumber = "phoneNumber";
//    public static final String password = "password";
//
//
//    public static final String firstTimeAccess = "firstTimeAccess";
//    private Context context;
//
//    public static String isLoggedIn = "ISLOGGEDIN_2";
//
//    public SharedPreference(Context context) {
//        super();
//        this.context = context;
//    }
//
//    public void saveUser(User user){
//
////        if (user!=null){
////            SharedPreferences settings;
////            Editor editor;
////            settings = context.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
////            editor = settings.edit();
////
////            editor.putString(firstName, user.getFname());
////            editor.putString(otherNames, user.getLname());
////            editor.putString(id_passport, user.getId_passport());
////            editor.putString(email, user.getEmail());
////            editor.putString(phoneNumber, user.getPhone());
////            editor.putString(password, user.getPassword());
////            editor.commit();
////        }
//
//    }
//
////    public User getUser(){
////        User user = null;
////        SharedPreferences settings = context.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
////
////        user = new User();
////        user.setFname(settings.getString(firstName, ""));
////        user.setLname(settings.getString(otherNames, ""));
////        user.setId_passport(settings.getString(id_passport, ""));
////        user.setEmail(settings.getString(email, ""));
////        user.setPhone(settings.getString(phoneNumber, ""));
////        user.setPassword(settings.getString(password, ""));
////
////        return user;
////    }
//
//
//    public void saveValue(String KEY, String data) {
//        SharedPreferences settings;
//        Editor editor;
//
//        if (context != null) {
//            settings = context.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
//            editor = settings.edit();
//            editor.putString(KEY, data);
//            editor.commit();
//        }
//    }
//
//
//    public String getValue(String KEY) {
//        SharedPreferences settings = context.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
//        return settings.getString(KEY, "");
//    }
//
//    public void removeValue(Context context, String KEY) {
//        SharedPreferences settings;
//        Editor editor;
//        settings = context.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
//        editor = settings.edit();
//        editor.remove(KEY);
//        editor.commit();
//    }
//
//    public void clearData() {
//        String firstTime = getValue(firstTimeAccess);
//        SharedPreferences settings;
//        Editor editor;
//        settings = context.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
//        editor = settings.edit();
//        editor.clear();
//        editor.apply();
//
//        if (!firstTime.isEmpty()) {
//            saveValue(firstTimeAccess, "1");
//        }
//    }

}