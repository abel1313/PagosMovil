package com.example.pagomovil.MercadoPagoEjemplo;

public class CredencialesDefault implements Credenciales
{
    private final String id;
    private final String secret;

    public CredencialesDefault(String id, String secret) {
        this.id = id;
        this.secret = secret;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String secret() {
        return secret;
    }
}
