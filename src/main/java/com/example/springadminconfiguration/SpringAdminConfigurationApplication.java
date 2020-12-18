package com.example.springadminconfiguration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SpringAdminConfigurationApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringAdminConfigurationApplication.class, args);
  }
}
