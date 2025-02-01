package com.seyma.java054_springbootdatajpa.controller;

import com.seyma.java054_springbootdatajpa.entity.UserProfile;
import com.seyma.java054_springbootdatajpa.servise.UserProfileServise;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user-profile")
public class UserProfileController {
    private final UserProfileServise userProfileServise;
    public UserProfileController(UserProfileServise userProfileServise) {
        this.userProfileServise = userProfileServise;
    }

    @GetMapping("/default-create-user")
    public void defaultUserCreat(){
        userProfileServise.save(UserProfile.builder()
                        .age(23)
                        .email("seyma@gmail.com")
                        .name("Seyma")
                        .userName("seymakrdr")
                        .phone("0654332")
                        .build());

        userProfileServise.save(UserProfile.builder()
                .age(54)
                .email("ayse@gmail.com")
                .name("Ayse")
                .userName("Aysebilen")
                .phone("4422344")
                .build());

        userProfileServise.save(UserProfile.builder()
                .age(43)
                .email("ahmet@gmail.com")
                .name("Ahmet")
                .userName("Ahmetdemir")
                .phone("0998433")
                .build());
    }

    @GetMapping("/get-all")
    public ResponseEntity <List<UserProfile>> getAll(){
        List<UserProfile> allProfiles = userProfileServise.getAll();
        return ResponseEntity.ok(allProfiles);

    }
}
