package com.amazonclone.user_service.utilities;

import com.amazonclone.user_service.dto.UserDataDto;
import com.amazonclone.user_service.entity.UserData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class Util {

    @Autowired
    private static ObjectMapper objectMapper;

    public static UserData dtoToEntity(UserDataDto userDataDto) {
        return objectMapper.convertValue(userDataDto, UserData.class);
    }

    public static UserDataDto entityToDto(UserData userData) {
        return objectMapper.convertValue(userData, UserDataDto.class);
    }
}
