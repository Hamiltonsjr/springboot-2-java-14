package com.example.projectwebservicie.services;

import com.example.projectwebservicie.entities.User;
import com.example.projectwebservicie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service//resgistra a classe como um componete do spring
public class UserService {

    @Autowired
    private UserRepository repository;

    // 1º end point
    public List<User> findAll(){
        return repository.findAll();
    }

    // Procurando o usuário pelo ID
    // 2 end point
    public User findById(Long id){
         Optional<User> obj = repository.findById(id);
         // O get do Optional vai retornar o objeto to tipo user que estiver dentro do Optional
         return obj.get();

    }
}
