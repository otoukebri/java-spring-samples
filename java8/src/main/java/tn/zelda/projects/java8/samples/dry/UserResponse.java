package tn.zelda.projects.java8.samples.dry;

import java.util.List;

public class UserResponse {
  List<User> users;
  boolean success = true;

  public UserResponse() {

  }

  public UserResponse(List<User> users) {
    this.users = users;
  }
}