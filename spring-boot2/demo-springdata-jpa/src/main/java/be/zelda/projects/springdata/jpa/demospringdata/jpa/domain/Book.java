package be.zelda.projects.springdata.jpa.demospringdata.jpa.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String isbn;
    private BigDecimal price;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private List<Author> authors =  new ArrayList<>();
}
