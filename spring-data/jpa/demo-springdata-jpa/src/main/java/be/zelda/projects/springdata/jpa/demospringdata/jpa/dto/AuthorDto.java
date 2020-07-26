package be.zelda.projects.springdata.jpa.demospringdata.jpa.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Data
public class AuthorDto {
    private Long id;
    private String name;
}
