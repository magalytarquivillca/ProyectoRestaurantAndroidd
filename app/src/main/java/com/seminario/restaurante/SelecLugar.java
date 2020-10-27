
package com.seminario.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SelecLugar extends AppCompatActivity {

    ImageView lugar;
    private Activity root = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selec_lugar);
        loadComponents();
    }

    private void loadComponents() {
        lugar = this.findViewById(R.id.mana);
        lugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(root, hacer_Pedidos.class);
                root.startActivity(intent);
            }
        });
    }

}