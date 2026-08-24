package com.telusko.JobApp.controller;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping({"/","/jobPost","/jobPosts"})
@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public List<JobPost> getAllJobs(@PathVariable("postId") int postId) {
        return service.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addPost(@RequestBody JobPost jb) {
       return service.addJob(jb);
       //*
        // Or Can Do
        // return  service.getJob(jb.getPostId());
        //*/

    }
}
