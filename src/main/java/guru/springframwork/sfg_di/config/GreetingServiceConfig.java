package guru.springframwork.sfg_di.config;

import guru.springframwork.sfg_di.services.ConstructurGreetingService;
import guru.springframwork.sfg_di.services.PropertyInjectedGreetingService;
import guru.springframwork.sfg_di.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructurGreetingService constructurGreetingService(){
        return new ConstructurGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
