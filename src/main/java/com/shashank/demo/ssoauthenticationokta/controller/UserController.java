package com.shashank.demo.ssoauthenticationokta.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

      @GetMapping("/okta")
      public ResponseEntity<String> welcome(@AuthenticationPrincipal OidcUser user){
          return ResponseEntity.ok("Authenticated for "+ user.getEmail());
      }

    @GetMapping("/nonsecured")
    public ResponseEntity<String> nonsecured(){
        return ResponseEntity.ok("nonsecured endpoint");
    }

}
