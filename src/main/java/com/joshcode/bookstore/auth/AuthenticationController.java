package com.joshcode.bookstore.auth;


import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
//@RequiredArgsConstructor
@Tag(name = "Authentication")
public class AuthenticationController {

    @Autowired
    private AuthenticationService service;


    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Valid RegistrationRequest request) throws MessagingException {
        service.register(request);
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate (@RequestBody @Valid AuthenticationRequest request) {
        return ResponseEntity.ok(service.authenticate(request));

    }

    @GetMapping("/activate-account")
    public void confirm (@RequestParam String token) throws MessagingException {
        service.activateAccount(token);
    }

}
