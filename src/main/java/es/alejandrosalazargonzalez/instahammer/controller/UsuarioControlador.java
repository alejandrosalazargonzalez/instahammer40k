package es.alejandrosalazargonzalez.instahammer.controller;

import es.alejandrosalazargonzalez.instahammer.model.file.UsuarioFile;
import es.alejandrosalazargonzalez.instahammer.model.UsuarioModel;
import es.alejandrosalazargonzalez.instahammer.view.UsuarioView;

public class UsuarioControlador {
    UsuarioFile usuarioFile;

    public UsuarioControlador() {
        usuarioFile = new UsuarioFile();
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

    public UsuarioView getById(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            return null;
        }
        UsuarioModel usuarioABuscar = new UsuarioModel(codigo);
        usuarioABuscar = usuarioFile.getUsuario(usuarioABuscar);
        UsuarioView usuarioView = new UsuarioView(usuarioABuscar.getCodigo(), usuarioABuscar.getNombre());
        return usuarioView;
    }
}