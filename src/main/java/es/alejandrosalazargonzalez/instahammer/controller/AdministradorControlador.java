package es.alejandrosalazargonzalez.instahammer.controller;

import es.alejandrosalazargonzalez.instahammer.model.file.AdministradorFile;
import es.alejandrosalazargonzalez.instahammer.model.AdministradorModel;
import es.alejandrosalazargonzalez.instahammer.view.AdministradorView;

public class AdministradorControlador {
    AdministradorFile usuarioFile;

    public AdministradorControlador() {
        usuarioFile = new AdministradorFile();
    }


    public boolean add(String nombre, String contrasenia, String email, String codigo) {
        if (nombre == null || nombre.isEmpty()) {
            return false;
            //TODO:hacerlo con todos
        }
        if (contrasenia == null || contrasenia.isEmpty()) {
            return false;
        }
        if (email == null || email.isEmpty()) {
            return false;
        }
        if (codigo == null || codigo.isEmpty()) {
            return false;
        }
        return false;
    }

    public AdministradorView getById(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            return null;
        }
        AdministradorModel usuarioABuscar = new AdministradorModel(codigo);
        usuarioABuscar = usuarioFile.getAdministrador(usuarioABuscar);
        AdministradorView usuarioView = new AdministradorView(usuarioABuscar.getCodigo(), usuarioABuscar.getNombre());
        return usuarioView;
    }
}