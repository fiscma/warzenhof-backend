package net.fiscma.wazenhof.warzenhofbackend.rest.controller.impl;

import net.fiscma.wazenhof.warzenhofbackend.model.BlogEntry;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:4000", maxAge = 3600)
@RequestMapping("blog")
public class BlogRestController extends BaseRestControllerImpl<BlogEntry>{


}
