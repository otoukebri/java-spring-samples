import reactor.core.publisher.Flux;

public class Sample1 {
    public static void main(String[] args) {
        Flux flow = Flux.just("Hello", 2020);
        flow.subscribe(System.out::println);
    //.doOnSubscribe( x -> System.out.println(x));
    }
}
