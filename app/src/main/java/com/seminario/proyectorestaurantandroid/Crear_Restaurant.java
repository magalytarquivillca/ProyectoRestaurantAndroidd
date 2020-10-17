package com.seminario.proyectorestaurantandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.seminario.proyectorestaurantandroid.utils.EndPoints;
import com.seminario.proyectorestaurantandroid.utils.UserDataServer;

public class Crear_Restaurant extends AppCompatActivity {

    Button crearRestaurant;
    private Activity  Root = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear__restaurant);
        LoadComponents();
    }

    private void LoadComponents() {
        crearRestaurant=Root.findViewById(R.id.button);
        crearRestaurant.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AsyncHttpClient client = new AsyncHttpClient();
                EditText nombre=Root.findViewById(R.id.textNomb);
                EditText Nit = Root.findViewById(R.id.TextNit);
                EditText Propietario = Root.findViewById(R.id.TextProp);
                EditText Calle = Root.findViewById(R.id.TextCall);
                EditText telefono = Root.findViewById(R.id.Textelef);
                String ubicacion[] = new String [];
                //EditText Lugarmapslat = Root.findViewById(R.id.CRmaps);	//verificar el dato de maps
                //EditText Lugarmapslong = Root.findViewById(R.id.CRmaps);


                RequestParams params = new RequestParams();
                params.add("nombreRestaurante", Nombre.getText().toString());
                params.add("nit", Nit.getText().toString());
                params.add("propietario", Propietario.getText().toString());
                params.add("calle", Calle.getText().toString());
                params.add("longitud", Lugarmapslong.getText().toString());
                params.add("latitud", Lugarmapslat.getText().toString());
                params.add("telefono",0);
                params.add("logo",[pathfilel:"no data",relativepathl:"no data",]);
                params.add("fotolugar",[pathfile:"no data",relativepath:"no data",]);

                client.addHeader ("authorization", UserDataServer.TOKEN);
                client.post(EndPoints.CREAR_RESTAURANT_SERVICE, params, new JsonHttpResponseHandler(){
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                        try {
                            if (response.has("msn")) {
                                UserDataServer.MSN = response.getString("msn");
                            }
                            if (UserDataServer.TOKEN.length() > 150) {
                                Intent intent = new Intent(root, MainActivityRestaurante.class);
                                root.startActivity(intent);
                            } else {
                                Toast.makeText(root, response.getString("msn"), Toast.LENGTH_LONG).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
            }
        }));

    }
        }));
    }
}