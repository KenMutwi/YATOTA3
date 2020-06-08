package com.ken.yatota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView liveshops,manager,products,analysis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liveshops=(TextView) findViewById(R.id.itemTitle1);
        manager = (TextView) findViewById(R.id.itemTitle2);
        products=(TextView) findViewById(R.id.itemTitle3);
        analysis=(TextView) findViewById(R.id.itemTitle4);

        liveshops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Livestatus.class);
                startActivity(intent);
            }
        });
        manager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,ManagerPortal.class);
                startActivity(intent);
            }
        });
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Products.class);
                startActivity(intent);
            }
        });
        analysis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Analysis.class);
                startActivity(intent);
            }
        });
    }
}
