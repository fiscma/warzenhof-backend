package net.fiscma.wazenhof.warzenhofbackend.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
public class BlogEntryDTO {
    private Long id;
    private String content;
    private Date created;
    private Date updated;
}
