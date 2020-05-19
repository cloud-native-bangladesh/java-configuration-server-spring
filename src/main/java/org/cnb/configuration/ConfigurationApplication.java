package org.cnb.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Responsibility:
 *
 * @author Rezaul Hasan
 * @since 08-Aug-2019
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigurationApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConfigurationApplication.class, args);
  }
}
