//package com.emoyPro.User_Mangement_Service.Configs;
//
//
//import java.io.IOException;
//
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//public class ApiGatewayValidationFilter extends OncePerRequestFilter {
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//            throws ServletException, IOException {
//
//       
//        String forwardedBy = request.getHeader("X-Forwarded-By");
//
//        if (forwardedBy == null || !forwardedBy.equals("API-Gateway")) {
//            
//            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
//            response.getWriter().write("Access Denied: Request must be routed through APIscad Gateway.");
//            return;
//        }
//
//     
//        filterChain.doFilter(request, response);
//    }
//}
//
