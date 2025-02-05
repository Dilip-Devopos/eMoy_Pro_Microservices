//package com.emoyPro.API_Gateway.Configs;
//
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.emoyPro.API_Gateway.Filters.TokenRelayFilter;
//
//
//
//
//@Configuration
//public class GatewayConfig {
//
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//            .route("user-management-service", r -> r
//                .path("/api/user-management/users/**")
//                .filters(f -> f.stripPrefix(2) // Optional: Adjust the path prefix
//                            .filter(new TokenRelayFilter())) // Custom filter for token relay
//                .uri("http://localhost:8000"))
//            .route("user-management-service-profiles", r -> r
//                .path("/api/user-management/profiles/**")
//                .filters(f -> f.stripPrefix(2)
//                            .filter(new TokenRelayFilter())) // Custom filter for token relay
//                .uri("http://localhost:8000"))
//            .route("referral-management-service", r -> r
//                .path("/api/referral-management/referrals/**")
//                .filters(f -> f.stripPrefix(2)
//                            .filter(new TokenRelayFilter())) // Custom filter for token relay
//                .uri("http://localhost:8100"))
//            .build();
//    }
//}
//
