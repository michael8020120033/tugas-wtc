package com.WTCshops.tugaswtc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void OpenGlobal(View v){
		Intent a = new Intent(getApplicationContext(),GlobalshopActivity.class);
		startActivity(a);
	}
    public void openerafone(View v){
		Intent b = new Intent(getApplicationContext(),ErafoneActivity.class);
		startActivity(b);
    }
    public void openoppo(View v){
		Intent c = new Intent(getApplicationContext(),OppoActivity.class);
		startActivity(c);
    }
}
