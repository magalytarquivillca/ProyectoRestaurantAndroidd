package com.seminario.proyectorestaurantandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LOGIN extends AppCompatActivity {
Button btn ;
private Activity Root = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_o_g_i_n);
        btn.findViewById(R.id.btn_acceder);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Root,create_restaurant_form.class);
                this.startActivity(intent);
            }

            private void startActivity(Intent intent) {
            }
        });
        
    }
}