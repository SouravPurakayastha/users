package com.lifeevo.users.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UsersRegistrationController {

    @GetMapping("/register")
    fun registerUser(): String {
        return "Hello!!!!"
    }
}