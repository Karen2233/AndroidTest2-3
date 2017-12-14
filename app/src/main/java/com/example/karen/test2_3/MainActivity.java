package com.example.karen.test2_3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.layout, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView test;
        switch(item.getItemId()) {
            case R.id.big:
                test=(TextView)findViewById(R.id.test);
                test.setTextSize(20);
                break;
            case R.id.centre:
                test=(TextView)findViewById(R.id.test);
                test.setTextSize(16);
                break;
            case R.id.small:
                test=(TextView)findViewById(R.id.test);
                test.setTextSize(10);
                break;
            case R.id.common:
                Toast.makeText(MainActivity.this,"你点击了普通菜单项",Toast.LENGTH_SHORT).show();
                break;
            case R.id.red:
                test=(TextView)findViewById(R.id.test);
                test.setTextColor(Color.parseColor("#FF0000"));
                break;
            case R.id.black:
                test=(TextView)findViewById(R.id.test);
                test.setTextColor(Color.parseColor("#292929"));
                break;
        }
        return true;
    }
}
