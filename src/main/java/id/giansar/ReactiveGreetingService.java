package id.giansar;

import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReactiveGreetingService {

    public Uni<String> greeting(String name) {
        return Uni.createFrom().item(name).onItem().transform(s -> String.format("%s, kabarmu piye ?", s));
    }
}
