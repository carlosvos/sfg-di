package guru.springframwork.sfg_di.services;

public class ConstructurGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
