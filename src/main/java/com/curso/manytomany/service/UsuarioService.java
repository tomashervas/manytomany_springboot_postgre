package com.curso.manytomany.service;

import com.curso.manytomany.entity.Canal;
import com.curso.manytomany.entity.Usuario;
import com.curso.manytomany.repository.CanalRepository;
import com.curso.manytomany.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    CanalRepository canalRepository;

    public void subscribe(int idUser, int idCanal){
        Usuario usuario = usuarioRepository.findById(idUser).get();
        Canal canal = canalRepository.findById(idCanal).get();
        usuario.subscribe(canal);
        usuarioRepository.save(usuario);

    }

    public void unsubscribe(int idUser, int idCanal){
        Usuario usuario = usuarioRepository.findById(idUser).get();
        Canal canal = canalRepository.findById(idCanal).get();
        usuario.unsubscribe(canal);
        usuarioRepository.save(usuario);

    }

    public void deleteCanal(int id){
        Canal canal = canalRepository.findById(id).get();
        canal.delete();
        canalRepository.delete(canal);
    }
}
