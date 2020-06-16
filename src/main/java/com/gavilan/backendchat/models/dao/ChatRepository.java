package com.gavilan.backendchat.models.dao;

import com.gavilan.backendchat.models.documents.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChatRepository extends MongoRepository<Mensaje, String> {
    public List<Mensaje> findFirst10ByOrderByFechaDesc();
}
