package com.asplendid.monitory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * 10118030
 * Ari Sulistio
 * IF-1
 */

public class BiodataActivity extends AppCompatActivity {

    private EditText nama, umur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        nama = (EditText) findViewById(R.id.nama);
        umur = (EditText) findViewById(R.id.umur);
    }

    public void goToMain(View view) {
        Intent i = new Intent(BiodataActivity.this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        i.putExtra("nickname", nama.getText().toString().trim());
        i.putExtra("age", umur.getText().toString().trim());
        startActivity(i);
    }
}
