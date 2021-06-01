package com.example.projectwebservicie.resources;

/* Classe vai disponibilizar um recurso web
* correspondendo a entidade USER */

import com.example.projectwebservicie.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    //endpoints
    @GetMapping // responde ao tipo Get do HTTP
    public ResponseEntity<User> findAll(){
        User user = new User(1l,"Maria","maria@gmail.com","999999999","123456");
        return ResponseEntity.ok().body(user);
    }

}
