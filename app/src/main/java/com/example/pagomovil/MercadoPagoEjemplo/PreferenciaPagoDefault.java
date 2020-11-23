package com.example.pagomovil.MercadoPagoEjemplo;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

public class PreferenciaPagoDefault implements PreferenciaPago
{
    private final JSONObject json;

    public PreferenciaPagoDefault(JSONObject json) {
        this.json = json;
    }

    @Override
    public URL urlParaCliente() {
        try {
            return new URL(json.getJSONObject("response").getString("sandbox_init_point"));
        } catch (JSONException | MalformedURLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
