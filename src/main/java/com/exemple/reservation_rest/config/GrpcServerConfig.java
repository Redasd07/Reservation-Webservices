package com.exemple.reservation_rest.config;

import com.exemple.reservation_rest.controllers.ReservationGrpcService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcServerConfig {

    @Bean
    public ReservationGrpcService reservationGrpcService() {
        return new ReservationGrpcService();
    }
}