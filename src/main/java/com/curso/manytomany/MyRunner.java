package com.curso.manytomany;

import com.curso.manytomany.entity.Canal;
import com.curso.manytomany.entity.Usuario;
import com.curso.manytomany.repository.CanalRepository;
import com.curso.manytomany.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class MyRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        /*Usuario usuario = new Usuario();
        Canal canal = new Canal();
        Set<Canal> canales = new HashSet<>();
        canales.add(canal);
        usuario.setCanales(canales);
        usuarioRepository.save(usuario);*/
//        usuarioRepository.deleteById(1);
        //System.out.println("Cantidad de canales " + usuarioRepository.findByIdFetchCanales(1).get().getCanales().size());
    }
}
