package com.emoyPro.User_Mangement_Service.Configs;


//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.HttpStatusEntryPoint;
//import org.springframework.http.HttpStatus;

//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//            .csrf(csrf -> csrf.disable())
//            .authorizeRequests(auth -> auth
//                .requestMatchers("/profiles/**").authenticated()
//                .anyRequest().permitAll()
//            )
//            .oauth2ResourceServer(oauth2 -> oauth2.jwt())
//            .exceptionHandling(exceptions -> exceptions
//                // Return 403 for unauthenticated users trying to access protected endpoints
//                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.FORBIDDEN))
//                .accessDeniedHandler((request, response, accessDeniedException) -> {
//                    response.setStatus(HttpStatus.FORBIDDEN.value());
//                    response.getWriter().write("Access Denied: Forbidden");
//                })
//            );
//        return http.build();
//    }
//}



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.http.HttpStatus;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeRequests(auth -> auth
//                .requestMatchers("/profiles/**").authenticated()
                .requestMatchers("/users/**").authenticated()
                .anyRequest().permitAll()
            )
            
            .oauth2ResourceServer(oauth2 -> oauth2.jwt())
            .exceptionHandling(exceptions -> exceptions
                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.FORBIDDEN))
//            		.authenticationEntryPoint((request, response, authException) -> {
//            		    String redirectUrl = "http://localhost:8080/realms/Emoy_Pro/protocol/openid-connect/auth";
//            		    response.sendRedirect(redirectUrl);
//            		})
                .accessDeniedHandler((request, response, accessDeniedException) -> {
                    response.setStatus(HttpStatus.FORBIDDEN.value());
                    response.getWriter().write("Access Denied: Forbidden");
                })
            );
    //       .addFilterAfter(new ApiGatewayValidationFilter(), org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter.class); // Custom filter
        return http.build();
    }
}
