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


}
