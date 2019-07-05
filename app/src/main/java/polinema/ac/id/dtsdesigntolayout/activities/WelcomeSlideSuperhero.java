package polinema.ac.id.dtsdesigntolayout.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import polinema.ac.id.dtsdesigntolayout.R;

public class WelcomeSlideSuperhero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_superhero);
    }

    public void clickGetStarted(View view) {
        Intent i = new Intent(WelcomeSlideSuperhero.this, WelcomeSlideAssign.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(WelcomeSlideSuperhero.this, WelcomeBack.class);
        startActivity(i);
    }
}