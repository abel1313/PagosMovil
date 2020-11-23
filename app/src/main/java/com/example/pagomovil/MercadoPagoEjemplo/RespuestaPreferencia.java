package com.example.pagomovil.MercadoPagoEjemplo;

import org.json.JSONException;
import org.json.JSONObject;

public class RespuestaPreferencia
{
    private final JSONObject respuesta;

    public RespuestaPreferencia(JSONObject respuesta) {
        this.respuesta = respuesta;
    }

    public boolean tieneError() {
        try {
            int status = respuesta.getInt("status");
            return status != 200 && status != 201;
        } catch (JSONException ex) {
            throw new RuntimeException(ex);
        }
    }

    public String error() {
        return "Error creando preferencia de pago: " + respuesta.toString();
    }

    public PreferenciaPago preferencia() {
        return new PreferenciaPagoDefault(respuesta);
    }
}
