package com.amazonclone.user_service.controller;

import com.amazonclone.user_service.dto.UserDataDto;
import com.amazonclone.user_service.service.UserService;
import com.amazonclone.user_service.utilities.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userservice")
public class UserServiceController {
    @Autowired
//    @Qualifier(value="")
    private UserService userService;

    @PostMapping("/save_user")
    public ResponseEntity<UserDataDto> saveUser(@RequestBody UserDataDto userDataDto){
        UserDataDto responseDto=userService.createNewUser(userDataDto);
        return new ResponseEntity<UserDataDto>(responseDto, HttpStatus.OK);
    }
    @GetMapping("/get_user/{username}")
    public ResponseEntity<UserDataDto> getUserByUsername(@PathVariable(name="username") String username) throws Exception {
        return new ResponseEntity<UserDataDto>(userService.getUserByUsername(username),HttpStatus.OK);
    }

}
