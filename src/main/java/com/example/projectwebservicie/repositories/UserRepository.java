package com.example.projectwebservicie.repositories;
import com.example.projectwebservicie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// estância um objeto Repository com varias operações para trabalhar com User
// Nesse caso não precisa criar a implementação da interface

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


}
