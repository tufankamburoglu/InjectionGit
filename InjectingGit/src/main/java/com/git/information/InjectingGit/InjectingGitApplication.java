package com.git.information.InjectingGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication(scanBasePackages = { "com.git.information.InjectingGit" })
public class InjectingGitApplication {
    public static void main(String[] args) {
	SpringApplication.run(InjectingGitApplication.class, args);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
	PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
	c.setLocation(new ClassPathResource("git.properties"));
	c.setIgnoreResourceNotFound(true);
	c.setIgnoreUnresolvablePlaceholders(true);
	return c;
    }
}
