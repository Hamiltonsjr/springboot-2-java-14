package com.example.projectwebservicie.resources;

/* Classe vai disponibilizar um recurso web
* correspondendo a entidade USER */

import com.example.projectwebservicie.entities.User;
import com.example.projectwebservicie.services.UserService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    // 1º endpoint

    @GetMapping // responde ao tipo Get do HTTP
    public ResponseEntity<List<User>> findAll(){

        //mocagem
        //User user = new User(1l,"Maria","maria@gmail.com","999999999","123456");
        //return ResponseEntity.ok().body(user);

        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    //2º endpoint
    // procurando usuário por ID
    @GetMapping(value = "/{id}") //URL com parâmentro
    public ResponseEntity<User> findById(@PathVariable Long id){ //Para o Spring reconhecer o long Id precisa passar o annotation
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
