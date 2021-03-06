package io.akoserwa.SecureKeycloakApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@RestController
public class TokenController {


    @RequestMapping("/token")
    public String getToken(){
        return JWTUtil.getJWTToken();
    }
    
    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
      request.logout();
      return " Logout Done";
   }

}
