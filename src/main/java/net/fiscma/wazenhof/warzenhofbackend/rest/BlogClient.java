package net.fiscma.wazenhof.warzenhofbackend.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.PostConstruct;
import net.fiscma.wazenhof.warzenhofbackend.dto.BlogDTO;
import net.fiscma.wazenhof.warzenhofbackend.dto.BlogEntryDTO;
import net.fiscma.wazenhof.warzenhofbackend.dto.DtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class BlogClient {


    @Autowired
    private DtoMapper<BlogDTO> blogMapper;
    @Autowired
    private DtoMapper<BlogEntryDTO> blogEntryMapper;

    BlogDTO blogDTO;

    @PostConstruct
    private void init() {
        blogDTO = new BlogDTO();
        createDummyData();
    }

    public String getBlog() {
        try {
            return blogMapper.serialize(blogDTO);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public String getBlogEntry(String id) {
        try {
            return blogEntryMapper
                    .serialize(blogDTO.getBlogEntryDTOList()
                            .get(Math.toIntExact(Long.valueOf(id))));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private void createDummyData() {
        List<BlogEntryDTO> entries = new ArrayList<>();

        BlogEntryDTO entry = new BlogEntryDTO();
        entry.setId(1L);
        entry.setContent("OH nohs!");
        entry.setCreated(new Date());
        entry.setUpdated(new Date());
        entries.add(entry);

        entry = new BlogEntryDTO();
        entry.setId(2L);
        entry.setContent("Fark!");
        entry.setCreated(new Date());
        entry.setUpdated(new Date());
        entries.add(entry);

        entry = new BlogEntryDTO();
        entry.setId(3L);
        entry.setContent("I breakz together!");
        entry.setCreated(new Date());
        entry.setUpdated(new Date());
        entries.add(entry);

        entry = new BlogEntryDTO();
        entry.setId(4L);
        entry.setContent("Kill mich!");
        entry.setCreated(new Date());
        entry.setUpdated(new Date());
        entries.add(entry);

        blogDTO.setBlogEntryDTOList(entries);
    }


}
