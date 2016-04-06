package com.eduardo.android.vitamines;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends AppCompatActivity {

    private static int TIME_SCREEN = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        hideNavigationBar();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, TIME_SCREEN);
    }

    // Ocultar as views de decoração para a activity ficar em tela cheio
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)  // Método funciona da versão JellyBean ou superior
    private void hideNavigationBar() {
        View decorView = getWindow().getDecorView();  // Capturo as views de decoração da Activity (barra de navegação e status)
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN; // Constantes para ocultar as views
        decorView.setSystemUiVisibility(uiOptions); // Faço as views ficarem ocultas
    }
}
