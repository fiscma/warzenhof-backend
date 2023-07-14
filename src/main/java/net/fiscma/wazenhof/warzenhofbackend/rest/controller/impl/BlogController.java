package net.fiscma.wazenhof.warzenhofbackend.rest.controller.impl;

import net.fiscma.wazenhof.warzenhofbackend.dto.DtoMapper;
import net.fiscma.wazenhof.warzenhofbackend.model.BlogEntry;
import net.fiscma.wazenhof.warzenhofbackend.rest.BlogClient;
import net.fiscma.wazenhof.warzenhofbackend.service.BlogEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:4000", maxAge = 3600)
@RequestMapping("blog")
public class BlogController {
    @Autowired
    BlogClient blogClient;

    @Autowired
    DtoMapper<BlogEntry> mapper;

    @Autowired
    BlogEntryService blogEntryService;

    @GetMapping(produces="application/json")
    public List<BlogEntry> findAll() {
        return blogEntryService.findAll();
    }

    @GetMapping(path = "/entry/{id}", produces="application/json")
    public String getEntry(@PathVariable String id) {
        return String.valueOf(blogEntryService.findById(Long.valueOf(id)));
    }

    @PostMapping(path = "/entry/create/")
    public void create(@RequestBody BlogEntry request) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setContent(request.getContent());
        blogEntry.setCreated(new Date());
        blogEntry.setUpdated(new Date());
        blogEntryService.save(request);
    }

}
