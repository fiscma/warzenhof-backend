package net.fiscma.wazenhof.warzenhofbackend.rest.controller;

import net.fiscma.wazenhof.warzenhofbackend.model.BlogEntry;
import net.fiscma.wazenhof.warzenhofbackend.rest.BlogClient;
import net.fiscma.wazenhof.warzenhofbackend.service.BlogEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:4000", maxAge = 3600)
@RequestMapping("blog")
public class BlogController {
    @Autowired
    BlogClient blogClient;

    @Autowired
    BlogEntryService blogEntryService;

    @GetMapping(produces="application/json")
    public String getBlog() {
        return blogEntryService.
    }

    @GetMapping(path = "/entry/{id}", produces="application/json")
    public String getEntry(@PathVariable String id) {
        return blogClient.getBlogEntry(id);
    }

    @PostMapping(path = "/entry/create/{content}")
    public void create(@PathVariable String content) {
        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setContent(content);
        blogEntry.setCreated(new Date());
        blogEntry.setUpdated(new Date());
        blogEntryService.create(blogEntry);
    }

}
