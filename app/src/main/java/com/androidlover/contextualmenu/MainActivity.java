package com.androidlover.contextualmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=(TextView) findViewById(R.id.text1);
        textView2=(TextView) findViewById(R.id.text2);

        registerForContextMenu(textView1);
        registerForContextMenu(textView2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        switch (v.getId())
        {
            case R.id.text1:
                getMenuInflater().inflate(R.menu.contextualmenu1,menu);
                break;
            case R.id.text2:
                getMenuInflater().inflate(R.menu.contextualmenu2,menu);
                break;
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.number1:
                Toast.makeText(MainActivity.this,"One",Toast.LENGTH_SHORT).show();
                break;

            case R.id.number2:
                Toast.makeText(MainActivity.this,"Two",Toast.LENGTH_SHORT).show();
                break;

            case R.id.firstname:
                Toast.makeText(MainActivity.this,"First Name",Toast.LENGTH_SHORT).show();
                break;

            case R.id.lastname:
                Toast.makeText(MainActivity.this,"Last Name",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}