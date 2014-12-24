package cloudyun.com.testapp.parse;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by 2013_13_mbp on 12/24/14.
 */
public class ParseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "YCW9X8e4LwJRVEDfshVGnFMl3E2ejPLrprpYRmdM", "ExDVX28xf6FraZnEQRbd0CVfLcmxrLBryafBClLs");
        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();
        ParseACL.setDefaultACL(defaultACL, true);
    }
}
