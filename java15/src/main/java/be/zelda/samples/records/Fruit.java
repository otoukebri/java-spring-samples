package be.zelda.samples.records;

public sealed interface Fruit permits Apple, Orange {}

record Apple() implements Fruit{}
record Orange() implements Fruit{}