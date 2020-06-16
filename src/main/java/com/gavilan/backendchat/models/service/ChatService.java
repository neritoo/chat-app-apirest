package com.gavilan.backendchat.models.service;

import com.gavilan.backendchat.models.documents.Mensaje;

import java.util.List;

public interface ChatService {
    public List<Mensaje> obtenerUltimos10Mensajes();
    public Mensaje guardar(Mensaje mensaje);
}
