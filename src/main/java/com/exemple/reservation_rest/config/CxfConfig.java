package com.exemple.reservation_rest.config;

import com.exemple.reservation_rest.controllers.ReservationEndpoint;
import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class CxfConfig {
    private ReservationEndpoint reservationEndpoint;
    private Bus bus;

    @Bean
    public EndpointImpl endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus, reservationEndpoint);
        endpoint.publish("/ws");
        return endpoint;
    }
}
