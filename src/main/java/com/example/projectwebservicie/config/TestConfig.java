package com.example.projectwebservicie.config;

import com.example.projectwebservicie.entities.User;
import com.example.projectwebservicie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration // passando para o spring que a classe é expecifica de configuração.
@Profile("test") // só roda aplicação quando estiver no perfil de teste o nome esta dentro do application.properties
public class TestConfig implements CommandLineRunner {

    //Classe auxiliar para configurar o perfil de test.

    // Popular o banco de dados com objetos.
    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        // tudo que for colocado detro desse método quando a aplicação
        // for rodada.

        // Nulo no Id pq vai ser gerado pelo Banco de dados
        User user =  new User(null,"Maria","maria@gmail.com","999999999","123456");
        User user1 = new User(null,"Alex","alex@hmail.com","8888888888","654321");

        // Salvando no banco de dado como uma lista passando os objetos.
        userRepository.saveAll(Arrays.asList(user, user1));

    }
}
