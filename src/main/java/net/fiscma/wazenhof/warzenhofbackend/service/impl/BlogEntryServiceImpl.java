package net.fiscma.wazenhof.warzenhofbackend.service.impl;

import jakarta.transaction.Transactional;
import net.fiscma.wazenhof.warzenhofbackend.model.BlogEntry;
import net.fiscma.wazenhof.warzenhofbackend.repository.BlogEntryRepository;
import net.fiscma.wazenhof.warzenhofbackend.service.BlogEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BlogEntryServiceImpl implements BlogEntryService {
    @Autowired
    BlogEntryRepository blogEntryRepository;

    @Override
    public void create(BlogEntry blogEntry) {
        blogEntryRepository.save(blogEntry);
    }
}
