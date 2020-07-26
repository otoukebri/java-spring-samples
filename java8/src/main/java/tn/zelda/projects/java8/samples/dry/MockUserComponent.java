package tn.zelda.projects.java8.samples.dry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zelda on 09/07/17.
 */
public class MockUserComponent {
    List<User> users = new ArrayList<User>();

    UserResponse fetchAllUsers(UserRequest request){
        return new UserResponse(users);
    }

    UserResponse fethUser() {
        return null;
    }

}
