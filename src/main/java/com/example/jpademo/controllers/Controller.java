package com.example.jpademo.controllers;
import com.example.jpademo.clases.Usuario;
import com.example.jpademo.clases.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @GetMapping
    public List<Usuario> getAll()
    {
        return usuarioRepositorio.findAll();
    }
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario u)
    {
        System.out.println("En el controlador del post.");
        usuarioRepositorio.save(u);
        return u;
    }

    @GetMapping("{id}")
    public Usuario getById(@PathVariable String id) throws Exception{
        return usuarioRepositorio.findById(id).orElseThrow(() -> new Exception("No encontrado."));
    }
}
