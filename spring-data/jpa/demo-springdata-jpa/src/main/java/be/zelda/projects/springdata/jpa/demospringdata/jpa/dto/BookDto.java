package be.zelda.projects.springdata.jpa.demospringdata.jpa.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Data
public class BookDto {

    private Long id;
    private String title;
    private String isbn;
    private BigDecimal price;
    private List<AuthorDto> authors =  new ArrayList<>();
}
