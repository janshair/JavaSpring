package com.tapdevs.backend.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Tapdevs on 16/02/2017.
 */


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.tapdevs.backend")
public class APIConfiguration {


}