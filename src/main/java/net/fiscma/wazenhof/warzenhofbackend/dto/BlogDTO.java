package net.fiscma.wazenhof.warzenhofbackend.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class BlogDTO extends DTO{
    private List<BlogEntryDTO> blogEntryDTOList;
}
