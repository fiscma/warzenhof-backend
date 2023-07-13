package net.fiscma.wazenhof.warzenhofbackend.service;

import net.fiscma.wazenhof.warzenhofbackend.model.BlogEntry;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BlogEntryService {

    public void create(BlogEntry blogEntry);

    public List<BlogEntry> findAll();

}
