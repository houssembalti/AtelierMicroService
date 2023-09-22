package com.esprit.microservices.candidate;

import com.esprit.microservices.candidate.Entities.Candidat;
import com.esprit.microservices.candidate.Repositories.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CandidateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandidateApplication.class, args);
    }
    @Autowired
    private CandidatRepository candidatRepository;
    @Bean
    ApplicationRunner init(){
        return (args )->{
            candidatRepository.save(new Candidat("Mariem","ch","ma@esprit.tn"));
            candidatRepository.save(new Candidat("Sarra","ab","sa@esprit.tn"));

            candidatRepository.save(new Candidat("Mohamed","ba","mo@esprit.tn"));
            candidatRepository.findAll().forEach(System.out::println);

        };
    }

}
