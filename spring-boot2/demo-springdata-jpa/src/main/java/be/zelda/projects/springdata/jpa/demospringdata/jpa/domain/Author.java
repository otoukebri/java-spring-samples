package be.zelda.projects.springdata.jpa.demospringdata.jpa.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// @NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
public class Author {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
