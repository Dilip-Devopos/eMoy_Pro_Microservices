//package com.emoyPro.API_Gateway.Filters;
//
//import java.util.Map;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.oauth2.jwt.Jwt;
//import org.springframework.web.server.ServerWebExchange;
//
//import reactor.core.publisher.Mono;
//
//public class TokenService {
//
//    // Method to extract user details from JWT token
//    public Mono<Map<String, Object>> extractUserDetails(ServerWebExchange exchange) {
//        return exchange.getPrincipal()
//                .cast(Authentication.class)
//                .flatMap(auth -> {
//                    Jwt jwt = (Jwt) auth.getPrincipal();  // Extract Jwt token
//                    return Mono.just(jwt.getClaims());   // Return the claims as a Map
//                });
//    }
//}
//
