//package com.emoyPro.API_Gateway.Filters;
//
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.core.annotation.Order;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//@Component
//@Order(0) 
//public class TokenPropagationFilter implements GlobalFilter {
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        String authorizationHeader = exchange.getRequest().getHeaders().getFirst(HttpHeaders.AUTHORIZATION);
//        System.out.println("authorizationheader : "+authorizationHeader);
//
//        if (authorizationHeader != null) {
//            ServerHttpRequest mutatedRequest = exchange.getRequest().mutate()
//                    .header(HttpHeaders.AUTHORIZATION, authorizationHeader)
//                    .build();
//
//   
//            ServerWebExchange mutatedExchange = exchange.mutate().request(mutatedRequest).build();
//            
//            System.out.println("mutatedExchange : "+mutatedExchange);
//
//           
//            return chain.filter(mutatedExchange);
//        }
//        
//        System.out.println("exchange : "+exchange);
//       
//        return chain.filter(exchange);
//    }
//}
//
