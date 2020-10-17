package com.seminario.proyectorestaurantandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.os.Build.HOST;

public class MenuP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_p);
    }


    private String CREAR_MENU_SERVICE = HOST + "menu";

    Button crearMenu;
    Button imagen;
    ImageView img;
    Boolean confirmationcamera=false;
    private Activity Root = this;
    static final int PERMISION_CODE = 10;
    static final int code_camera = 999;


    imagen = this.findViewById(R.id.tomarimagenmenu);
                imagen.setOnclickListener((this));
    crearMenu = Root.findViewById(R.id.crearMenu);
                crearMenu.setOnClickListener((new View.OnClickListener() {

    }

}