package fabiocarlino.u5l8.repositories;

import fabiocarlino.u5l8.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BlogsRepo extends JpaRepository<Blog, UUID> {
    List<Blog> findByBlog(Blog blog);

    boolean existByTitle(String titolo);

    boolean existsByBlog(Blog blog);
}
