package net.fiscma.wazenhof.warzenhofbackend.rest.controller;

import net.fiscma.wazenhof.warzenhofbackend.rest.BlogClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("blog")
public class BlogController {
    @Autowired
    BlogClient blogClient;

    @GetMapping(produces="application/json")
    public String getBlog() {
        return blogClient.getBlog();
    }

    @GetMapping(path = "/entry/{id}", produces="application/json")
    public String getEntry(@PathVariable String id) {
        return blogClient.getBlogEntry(id);
    }

}
