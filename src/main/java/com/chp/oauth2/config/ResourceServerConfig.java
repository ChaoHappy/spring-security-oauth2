package com.chp.oauth2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@Order(1001)
@Configuration
@EnableResourceServer
public class ResourceServerConfig  {

}