package com.example.pagomovil.MercadoPagoEjemplo;

public class MercadoPago
{
    /*
    private final MP mp;

    public MercadoPago(Credenciales credenciales) {
        this(credenciales, false);
    }

    public MercadoPago(Credenciales credenciales, boolean sandbox) {
        this.mp = new MP(credenciales.id(), credenciales.secret());
        if (sandbox) {
            mp.sandboxMode(true);
        }
        try {
            String access = mp.getAccessToken();
            System.out.println(access);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public PreferenciaPago crearPreferenciaPago(Collection<ItemPago> items) {
        try {
            final RespuestaPreferencia respuesta = new RespuestaPreferencia(
                    mp.createPreference(nuevaPreferenciaPago(items))
            );
            if (respuesta.tieneError()) {
                throw new RuntimeException(respuesta.error());
            }
            return respuesta.preferencia();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private JSONObject nuevaPreferenciaPago(Collection<ItemPago> items) {
        try {
            final JSONArray itemsJSON = new JSONArray();
            items.stream().map(ItemPago::aJSON).forEach((i) -> itemsJSON.put(i));
            return new JSONObject().put("items", itemsJSON);
        } catch (JSONException ex) {
            throw new RuntimeException(ex);
        }
    }


     */
}
