package com.jeep.bai_tap_tich_hop_restful_blog.controller;

import com.jeep.bai_tap_tich_hop_restful_blog.model.Blog;
import com.jeep.bai_tap_tich_hop_restful_blog.service.IBlogService;
import com.jeep.bai_tap_tich_hop_restful_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public ResponseEntity<Page<Blog>> displayList(@PageableDefault(size = 3, page = 0) Pageable pageable) {
        //blog?page=0&size=5  //blog?page=1&size=5
        Page<Blog> blogList = this.blogService.findAllBlog(pageable);
        if (!blogList.hasContent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> createBlog(@RequestBody Blog blog) {
        this.blogService.save(blog);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/list-by-category/{categoryId}")
    public ResponseEntity<Page<Blog>> listBlogByCategory(@PageableDefault(value = 3) Pageable pageable, @PathVariable("categoryId") int categoryId){
        Page<Blog> blogListByCategory = this.blogService.findAllBlogByCategory(categoryId, pageable);
        if(!blogListByCategory.hasContent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogListByCategory,HttpStatus.OK);
    }

    @GetMapping("/detail/{blogId}")
    public ResponseEntity<Blog> displayBlogDetail(@PathVariable("blogId") int id){
        Blog blog = this.blogService.findBlogById(id);
        if(blog == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }

}

