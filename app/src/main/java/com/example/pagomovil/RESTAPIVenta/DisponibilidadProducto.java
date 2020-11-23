package com.example.pagomovil.RESTAPIVenta;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.movilventa.Modelo.MySingleton;
import com.example.movilventa.Modelo.Producto;
import com.example.movilventa.SocketIO.Constants;

import org.json.JSONException;
import org.json.JSONObject;


public class DisponibilidadProducto {



    public Producto mensaje(Context contex)
    {
        Producto p = new Producto();
        p.setNombreProducto("Gola");
        p.setExistencia_Producto(2);

        return p;
    }
    public Producto DisponibilidadProductoVenta(Context context) {

Producto p = new Producto();
    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
            (Request.Method.GET, Constants.CHAT_SERVER_URL+"venta", null,
                    new Response.Listener<JSONObject>() {

                        @Override
                        public void onResponse(JSONObject response) {
                            try {

                                if(response.getInt("id_Producto") != 0 )
                                {



                                    p.setNombreProducto(response.getString("nombre_Producto"));
                                    p.setExistencia_Producto(response.getDouble("existencias_Producto"));
                                   //Toast.makeText(context,"Error "+ p.getNombreProducto(),Toast.LENGTH_SHORT).show();


                                }else
                                {

                                }

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {


                }
            });



        MySingleton.getInstance(context).addToRequestQueue(jsonObjectRequest);

        return p;
}

    }

