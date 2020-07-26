package tn.zelda.projects.java8.samples.optional;

class Outer {
    Nested nested;
    Nested getNested() {
        return nested;
    }

    public void setNested(Nested nested) {
        this.nested = nested;
    }
}
class Nested {
    Inner inner;
    Inner getInner() {
        return inner;
    }

    public void setInner(Inner inner) {
        this.inner = inner;
    }
}
class Inner {
    String foo;
    String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}