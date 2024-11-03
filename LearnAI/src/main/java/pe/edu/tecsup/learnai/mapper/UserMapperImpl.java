package pe.edu.tecsup.learnai.mapper;

import org.springframework.stereotype.Service;
import pe.edu.tecsup.learnai.entity.User;
import pe.edu.tecsup.learnai.rest.dto.UserDto;

@Service
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toUserDto(User user) {
        if (user == null) {
            return null;
        }
        return new UserDto(user.getId(), user.getUsername(), user.getName(), user.getLast_name(),user.getEmail());
    }
}
