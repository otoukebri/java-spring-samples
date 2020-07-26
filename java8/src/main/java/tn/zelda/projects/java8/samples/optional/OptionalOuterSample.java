package tn.zelda.projects.java8.samples.optional;

import java.util.Optional;

/**
 * Created by o.TOUKEBRI on 19/01/2017.
 */
public class OptionalOuterSample {

    public static void main(String[] args) {
        Outer outer = new Outer();
        if (outer != null && outer.nested != null && outer.nested.inner != null) {
            System.out.println(outer.nested.inner.foo);
        }
        Optional.of(new Outer())
                .map(Outer::getNested)
                .map(Nested::getInner)
                .map(Inner::getFoo)
                .ifPresent(System.out::println);
        System.out.println("empty response");
        Inner i =new Inner();
        i.setFoo("yoyo");
        Nested n = new Nested();
        n.setInner(i);
        outer.setNested(n);
        Optional.of(outer)
                .map(Outer::getNested)
                .map(Nested::getInner)
                .map(Inner::getFoo)
                .ifPresent(System.out::println);

        //an other way
        /*
        Outer obj = new Outer();
        resolve(() -> obj.getNested().getInner().getFoo());
        obj.ifPresent(System.out::println);
        */
    }
}
