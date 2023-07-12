package net.fiscma.wazenhof.warzenhofbackend.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@Component
@Getter
@Setter
@RequiredArgsConstructor
public class DtoMapper<T extends DTO> extends ObjectMapper {
    @PostConstruct
    private void init() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm a z");
        setDateFormat(df);
    }

    public String serialize(T dto) throws JsonProcessingException {
        return writeValueAsString(dto);
    }

}
