package tn.zelda.projects.java8.samples.functionsasparameters;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by zelda on 09/07/17.
 */
public class UserFormatTest {
    private static List<User> users = Arrays.asList(
            new User(1, "Steve", "Vai", 40),
            new User(4, "Joe", "Smith", 32),
            new User(3, "Steve", "Johnson", 57),
            new User(9, "Mike", "Stevens", 18),
            new User(10, "George", "Armstrong", 24),
            new User(2, "Jim", "Smith", 40),
            new User(8, "Chuck", "Schneider", 34),
            new User(5, "Jorje", "Gonzales", 22),
            new User(6, "Jane", "Michaels", 47),
            new User(7, "Kim", "Berlie", 60)
    );

    private static void printUserFormat1(User u) {
        System.out.println("\tUser: " + u.id + " Name: " + u.firstName + " " + u.lastName + " Age: " + u.age);
    }

    private static void printUserFormat2(User u) {
        System.out.println("\tUser: " + u.id + " First Name: " + u.firstName + " Last Name: " + u.lastName + " Age: " + u.age);
    }

    private static void printUserFormat3(User u) {
        System.out.println("\tUser: " + u.lastName + ", " + u.firstName + " Age: " + u.age);
    }

    private static void oldWayPrintUsersFormat1() {
        for (User u : users) {
            printUserFormat1(u);
        }
    }

    private static void oldWayPrintUsersFormat2() {
        for (User u : users) {
            printUserFormat2(u);
        }
    }

    private static void oldWayPrintUsersFormat3() {
        for (User u : users) {
            printUserFormat3(u);
        }
    }
    private static void oldJavaWay() {
        System.out.println("OLDWAY Format 1:");
        oldWayPrintUsersFormat1();

        System.out.println("OLDWAY Format 2:");
        oldWayPrintUsersFormat2();

        System.out.println("OLDWAY Format 3:");
        oldWayPrintUsersFormat3();
    }

    private static void printUsersNewWay(Consumer<User> consumer){
        users.forEach(u -> consumer.accept(u));
    }

    private static void newJavaWay() {
        System.out.println("NEWWAY Format 1:");
        printUsersNewWay(UserFormatTest::printUserFormat1);
        System.out.println("NEWWAY Format 2:");
        printUsersNewWay(UserFormatTest::printUserFormat2);
        System.out.println("NEWWAY Format 3:");
        printUsersNewWay(UserFormatTest::printUserFormat3);
    }

    public static void main(String[] args) {
        //oldJavaWay();
        newJavaWay();
    }
}
