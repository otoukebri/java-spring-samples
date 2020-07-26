package be.zelda.projects.springdata.jpa.demospringdata.jpa.domain;

import org.junit.jupiter.api.Test;

import static pl.pojo.tester.api.FieldPredicate.include;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;
import static pl.pojo.tester.api.assertion.Method.*;

public class PojoTest {
    @Test
    public void testPojoBookFailed() {
        // Arrange
        final Class<?> classBookUnderTest = Book.class;

        // Act

        // Assert
        assertPojoMethodsFor(classBookUnderTest, include("id", "title", "isbn", "price", "authors")) //
                .testing(GETTER) //
                .testing(SETTER)
                .testing(TO_STRING) //
                .testing(EQUALS, HASH_CODE) //
                .testing(CONSTRUCTOR) //
                .areWellImplemented();

    }

    @Test
    public void testPojoChatFailed() {
        // Arrange
        final Class<?> classAuthorUnderTest = Author.class;

        // Act

        // Assert
        assertPojoMethodsFor(classAuthorUnderTest) //
                .testing(GETTER) //
                .testing(TO_STRING) //
                .testing(EQUALS, HASH_CODE) //
                .testing(CONSTRUCTOR) //
                .areWellImplemented();

    }
}
