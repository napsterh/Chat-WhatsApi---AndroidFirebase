package com.example.os.firebasechat;

import java.util.Map;

public class MensajeEnviar extends Mensaje{
    private Map hora;

    public MensajeEnviar() {
    }

    public MensajeEnviar(Map hora) {
        this.hora = hora;
    }

    public MensajeEnviar(String mensaje, String nombre, String fotoPerfil, String tipoMensaje, Map hora) {
        super(mensaje, nombre, fotoPerfil, tipoMensaje);
        this.hora = hora;
    }

    public MensajeEnviar(String mensaje, String urlFoto, String nombre, String fotoPerfil, String tipoMensaje, Map hora) {
        super(mensaje, urlFoto, nombre, fotoPerfil, tipoMensaje);
        this.hora = hora;
    }

    public Map getHora() {
        return hora;
    }

    public void setHora(Map hora) {
        this.hora = hora;
    }
}
