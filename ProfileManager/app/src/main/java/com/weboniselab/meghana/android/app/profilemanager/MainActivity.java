package com.weboniselab.meghana.android.app.profilemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RelativeLayout tvMovementOfUser,tvTimer,tvBatteryOfPhone,tvLocationOfUser;
    Intent timerActivityIntent,movementActivityIntent,batteryActivityIntent;
    private android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        initialise();
    }
    public void initialise(){
        tvLocationOfUser=(RelativeLayout) findViewById(R.id.location);
        tvLocationOfUser.setOnClickListener(this);
        tvMovementOfUser=(RelativeLayout) findViewById(R.id.movement);
        tvMovementOfUser.setOnClickListener(this);
        tvTimer=(RelativeLayout) findViewById(R.id.timer);
        tvTimer.setOnClickListener(this);
        tvBatteryOfPhone=(RelativeLayout) findViewById(R.id.battery);
        tvBatteryOfPhone.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.timer:
                timerActivityIntent=new Intent(this,TimerActivity.class);
                this.startActivity(timerActivityIntent);
                break;
            case R.id.movement:
                movementActivityIntent=new Intent(this,MovementActivity.class);
                this.startActivity(movementActivityIntent);
                break;
            case R.id.battery:
                batteryActivityIntent=new Intent(this,BatteryActivity.class);
                this.startActivity(batteryActivityIntent);
                break;
        }

    }
}
