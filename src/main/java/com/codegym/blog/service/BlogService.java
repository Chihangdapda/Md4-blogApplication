package com.codegym.blog.service;
import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {

    Page<Blog> findAllByNameContaining(String name, Pageable pageable);

    Page<Blog> findAll(Pageable pageable);
    Iterable<Blog> findAllByCategory(Category category);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
