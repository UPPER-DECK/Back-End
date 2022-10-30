package com.example.backend.resource;

import com.example.backend.model.Post;
import com.example.backend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {
    @Autowired
    private PostRepository repository;

    @PostMapping("/addPost")
    public String saveBook(@RequestBody Post post){
        repository.save(post);
        return "Added post with id: "+post.getId();

    }

    @GetMapping("/findAllPosts")
    public List<Post> getPosts(){
        return repository.findAll();
    }

    @GetMapping("/findAllPosts/{id}")
    public Optional<Post> getPost(@PathVariable int id){
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePost(@PathVariable int id){
        repository.deleteById(id);
        return "Post deleted with id: "+id;
    }
}
