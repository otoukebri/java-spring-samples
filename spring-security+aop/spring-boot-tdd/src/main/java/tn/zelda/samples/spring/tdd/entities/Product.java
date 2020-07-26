package tn.zelda.samples.spring.tdd.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {
    private long id;
    private String name;
}
