import org.junit.Test;

import static pl.pojo.tester.api.FieldPredicate.include;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;
import static pl.pojo.tester.api.assertion.Method.*;

public class AnimalTest {

    @Test
    public void testPojoLapin() {
        // Arrange
        final Class<?> classUnderTest = Chien.class;

        // Act

        // Assert
        assertPojoMethodsFor(classUnderTest) //
                .testing(GETTER) //
//                .testing(TO_STRING) //
//                .testing(EQUALS, HASH_CODE) //
               .testing(CONSTRUCTOR) //
                .areWellImplemented();

        // Assert
//        assertPojoMethodsFor(classUnderTest, include("name", "age")) //
//                .testing(EQUALS, HASH_CODE) //
//                .testing(CONSTRUCTOR) //
//                .areWellImplemented();
//
//        assertPojoMethodsFor(classUnderTest, include("poids", "moustache", "petits")) //
//                .testing(SETTER) //
//                .areWellImplemented();
//
//        assertPojoMethodsFor(classUnderTest) //
//                .testing(GETTER) //
//                .testing(TO_STRING) //
//                .areWellImplemented();
    }

}