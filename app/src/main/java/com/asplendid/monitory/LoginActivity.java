package com.asplendid.monitory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 10118030
 * Ari Sulistio
 * IF-1
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goToBiodata(View view) {
        Intent i = new Intent(LoginActivity.this, BiodataActivity.class);
        startActivity(i);
    }
}
