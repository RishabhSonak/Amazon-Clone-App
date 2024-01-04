package com.amazonclone.user_service.controller;

import com.amazonclone.user_service.dto.UserDataDto;
import com.amazonclone.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userservice")
public class UserServiceController {
    @Autowired
    @Qualifier(value="amazonUserService")
    private UserService userService;
    @PostMapping("/save-user}")
    public ResponseEntity<UserDataDto> saveUser(@RequestBody UserDataDto userDataDto){
        UserDataDto responseDto=userService.createNewUser(userDataDto);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
    @GetMapping("/get-user/{username}")
    public ResponseEntity<UserDataDto> getUserByUsername(@PathVariable(name="username") String username) throws Exception {
        return new ResponseEntity<>(userService.getUserByUsername(username),HttpStatus.OK);
    }

}
