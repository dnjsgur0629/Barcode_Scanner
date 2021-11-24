package com.SE_project.barcode_scanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ScanActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        setTitle("스캔");

        Intent intent = getIntent();

        Button SuccessScan = findViewById(R.id.btnSuccess);
        Button FailScan = findViewById(R.id.btnFail);

        SuccessScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), GoodsInfoActivity.class);
                startActivity(i);
            }
        });

        FailScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "인식 실패", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
