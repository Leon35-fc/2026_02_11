package fabiocarlino.u5l8.repositories;

import fabiocarlino.u5l8.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BlogsRepo extends JpaRepository<Blog, UUID> {
    Optional<Blog> findByBlog(Blog blog);

    Optional<Blog> existByTitle(Blog blog);
    
    boolean existsByBlog(Blog blog);
}
