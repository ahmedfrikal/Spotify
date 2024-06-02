package fr.codecake.spotify_clone.usercontext.mapper;

import fr.codecake.spotify_clone.usercontext.domain.User;
import fr.codecake.spotify_clone.usercontext.mapper.DTO.ReadUserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User entity);
}
