package com.androidbook.droid1;
//svn test
import android.app.Activity;
import android.os.Bundle;

public class DroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}