package com.amazonclone.user_service.utilities;

import com.amazonclone.user_service.dto.UserDataDto;
import com.amazonclone.user_service.entity.UserData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Util {

    @Autowired
    private ModelMapper modelMapper;

    public  UserData dtoToEntity(UserDataDto userDataDto) {
        return modelMapper.map(userDataDto, UserData.class);
    }

    public  UserDataDto entityToDto(UserData userData) {
        return modelMapper.map(userData, UserDataDto.class);
    }
}
