package com.asplendid.monitory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * 10118030
 * Ari Sulistio
 * IF-1
 */

public class MainActivity extends AppCompatActivity {

    private TextView halo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle b = getIntent().getExtras();
        if (b != null && b.containsKey("nickname")) {
            halo = (TextView) findViewById(R.id.halo);
            halo.setText("Beres! Sekarang " + b.getString("nickname") + " udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");
        } else
            finish();
    }

    public void exit(View view) {
        finish();
    }
}
