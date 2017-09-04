package it.flaviodepedis.myromatourguide;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by flavio.depedis on 04/09/2017.
 */

public class SplashActivity extends AppCompatActivity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {

            /** Display splash screen with a timer */
            @Override
            public void run() {
                // This method executes once the timer is over
                startActivity(new Intent(SplashActivity.this, MainActivity.class));

                // Close splash activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
