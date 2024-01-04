package com.amazonclone.user_service.service;

import com.amazonclone.user_service.dto.UserDataDto;
import com.amazonclone.user_service.entity.UserData;
import com.amazonclone.user_service.repo.UsersDataRepo;
import com.amazonclone.user_service.utilities.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UsersDataRepo amazonUsersRepo;

    public UserDataDto createNewUser(UserDataDto userDataDto) {
        return Util.entityToDto(amazonUsersRepo.save(Util.dtoToEntity(userDataDto)));
    }

    public UserDataDto getUserByUsername(String username) throws Exception {
        Optional<UserData> userDataOptional= amazonUsersRepo.findUserDataByUsername(username);
        if(userDataOptional.isPresent()){
            return Util.entityToDto(amazonUsersRepo.findUserDataByUsername(username).get());
        }
        else throw new Exception("user not found");
    }
}
