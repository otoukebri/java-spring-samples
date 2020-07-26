package tn.zelda.projects.java8.samples.dry;

public class User {
  Integer id;
  String firstName;
  String lastName;
  Integer age;

  User() {}
  User(int id, String first, String last, int age) {
    this.id = id;
    this.firstName = first;
    this.lastName = last;
    this.age = age;
  }

  public String toString() {
    return "" + id + ", " + firstName + ", " + lastName + ", " + age;
  }
}