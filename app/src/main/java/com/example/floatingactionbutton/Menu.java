package com.example.floatingactionbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void boton1(View view) {

        Intent b = new Intent(this, MainActivity.class);
        startActivity(b);

    }

    public void boton2(View view) {
        Intent b2 = new Intent(this, boton2.class);
        startActivity(b2);
    }

    public void boton3(View view) {
        Intent b3 = new Intent(this, boton3.class);
        startActivity(b3);
    }

    public void boton4(View view) {
        Intent b4 = new Intent(this, boton4.class);
        startActivity(b4);
    }

    public void boton5(View view) {
        Intent b5 = new Intent(this, boton5.class);
        startActivity(b5);
    }

    public void boton6(View view) {
        Intent b6 = new Intent( this, desplegable.class);
        startActivity(b6);
    }
}
