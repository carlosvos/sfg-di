package guru.springframwork.sfg_di.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructurGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
