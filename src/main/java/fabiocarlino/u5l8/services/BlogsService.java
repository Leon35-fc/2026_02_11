package fabiocarlino.u5l8.services;

import fabiocarlino.u5l8.entities.Blog;
import fabiocarlino.u5l8.payload.BlogPayload;
import fabiocarlino.u5l8.repositories.BlogsRepo;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BlogsService {
    private final BlogsRepo blogRepo;

    public BlogsService(BlogsRepo blogsRepo) {
        this.blogRepo = blogsRepo;
    }

    public Blog save(BlogPayload payload) {
        if (this.blogRepo.existByTitle(payload.getTitolo())) {
            throw new RuntimeException("Blog con il titolo " + payload.getTitolo() + " è già presente.");
        }
        Blog newBlog = new Blog(payload.getTitolo(), payload.getCategoria(), payload.getContenuto(), payload.getMinutiTempoLettura());
        newBlog.setCover("https://picsum.photos/200/300?random");
        Blog savedBlog = this.blogRepo.save(newBlog);
        return savedBlog;
    }

    public Blog findById(UUID id) {
        return this.blogRepo.findById(id).orElseThrow(() -> new RuntimeException("Blog con ID " + id + " non trovato."));
    }
}
