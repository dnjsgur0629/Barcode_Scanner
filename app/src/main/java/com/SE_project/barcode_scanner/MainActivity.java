package com.SE_project.barcode_scanner;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNo = findViewById(R.id.btnNo);
        ImageView ivCamera = findViewById(R.id.ivCamera);
        ivCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View dialogView = View.inflate(MainActivity.this, R.layout.dialog_doadditionalscan, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);

                dlg.setTitle("additional scan");
                dlg.setView(dialogView);
                dlg.setNeutralButton("취소", null);
                dlg.setNegativeButton("아니오", null);
                dlg.setPositiveButton("예", null);
                dlg.show();
            }
        });
        /*
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View dialogView = View.inflate(MainActivity.this, R.layout.dialog_doadditionalscan, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);

                dlg.setTitle("추가검색");
                dlg.setView(dialogView);
                dlg.setNeutralButton("취소", null);
                dlg.setNegativeButton("아니오", null);
                dlg.setPositiveButton("예", null);
                dlg.show();
            }
        });
        */
    }
}