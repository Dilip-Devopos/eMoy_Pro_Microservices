//package com.emoyPro.API_Gateway.Filters;
//
//
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.client.WebClient;
//import org.springframework.web.reactive.function.server.ServerRequest;
//import org.springframework.web.reactive.function.server.ServerResponse;
//
//import reactor.core.publisher.Mono;
//
//@Component
//public class ApiGatewayHandler {
//
//    @Autowired
//    private WebClient.Builder webClientBuilder;
//
//    // Extract user details and forward the request to downstream service
//    public Mono<ServerResponse> proxyRequest(ServerRequest request) {
//        return extractUserDetails(request)
//                .flatMap(userDetails -> {
//                    // Send user details to the User Management Service via WebClient
//                    return webClientBuilder.baseUrl("http://localhost:8000") // User Management Service
//                            .build()
//                            .post()
//                            .uri("/api/user-management/profiles")
//                            .header("User-Id", userDetails.get("userId"))
//                            .header("Username", userDetails.get("username"))
//                            .header("Email", userDetails.get("email"))
//                            .header("Role", userDetails.get("role"))
//                            .retrieve()
//                            .bodyToMono(String.class)
//                            .flatMap(response -> ServerResponse.ok().bodyValue(response))
//                            .onErrorResume(e -> ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
//                });
//    }
//
//    // Method to extract user details from the request (assuming user details are already in the exchange)
//    private Mono<Map<String, String>> extractUserDetails(ServerRequest request) {
//        return Mono.just(Map.of(
//                "userId", request.headers().header("User-Id").get(0),  // Example: Extract user ID from headers or exchange
//                "username", request.headers().header("Username").get(0),
//                "email", request.headers().header("Email").get(0),
//                "role", request.headers().header("Role").get(0)
//        ));
//    }
//}
//
