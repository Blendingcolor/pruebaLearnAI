package pe.edu.tecsup.learnai.mapper;

import pe.edu.tecsup.learnai.entity.User;
import pe.edu.tecsup.learnai.rest.dto.UserDto;

public interface UserMapper {

    UserDto toUserDto(User user);
}
