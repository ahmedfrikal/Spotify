package fr.codecake.spotify_clone.catalogcontext.repository;

import fr.codecake.spotify_clone.catalogcontext.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song,Long> {
}
