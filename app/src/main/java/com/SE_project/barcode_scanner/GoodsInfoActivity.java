package com.SE_project.barcode_scanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class GoodsInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodsinfo);
        setTitle("상품 정보");

        Intent intent = getIntent();

        Button btnWrong = findViewById(R.id.btnWrong);
        Button btnPurchase = findViewById(R.id.btnPurchase);
        Button btnNo = findViewById(R.id.btnNo);

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View dialogView = View.inflate(GoodsInfoActivity.this, R.layout.dialog_doadditionalscan, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(GoodsInfoActivity.this);

                dlg.setTitle("추가검색");
                dlg.setView(dialogView);
                dlg.setNeutralButton("취소", null);
                dlg.setNegativeButton("아니오", null);
                dlg.setPositiveButton("예", null);
                dlg.show();
            }
        });

    }
}
