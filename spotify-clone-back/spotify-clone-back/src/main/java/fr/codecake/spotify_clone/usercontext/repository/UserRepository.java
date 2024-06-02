package fr.codecake.spotify_clone.usercontext.repository;

import fr.codecake.spotify_clone.usercontext.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
