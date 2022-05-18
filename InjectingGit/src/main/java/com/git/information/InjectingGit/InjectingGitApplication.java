package com.git.information.InjectingGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication(scanBasePackages = { "com.git.information" })
public class InjectingGitApplication {

    public static void main(String[] args) {
	SpringApplication.run(InjectingGitApplication.class, args);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
	PropertySourcesPlaceholderConfigurer propsConfig = new PropertySourcesPlaceholderConfigurer();
	propsConfig.setLocation(new ClassPathResource("git.properties"));
	propsConfig.setIgnoreResourceNotFound(true);
	propsConfig.setIgnoreUnresolvablePlaceholders(true);
	return propsConfig;
    }

}
