package com.alimuzaffar.powernap.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import com.alimuzaffar.powernap.R;

public class PowerSleeperActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_sleeper);
        if(getIntent()!=null) 
        	Toast.makeText(this, "Button "+getIntent().getAction(), Toast.LENGTH_SHORT).show();
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_power_sleeper, menu);
        return true;
    }
}
