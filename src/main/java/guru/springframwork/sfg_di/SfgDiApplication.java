package guru.springframwork.sfg_di;

import guru.springframwork.sfg_di.controllers.ConstructorInjectedController;
import guru.springframwork.sfg_di.controllers.MyController;
import guru.springframwork.sfg_di.controllers.PropertyInjectedController;
import guru.springframwork.sfg_di.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greetings = myController.hello();

		System.out.println(greetings);

		System.out.println("------- Property");

		PropertyInjectedController injectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(injectedController.getGreeting());

		System.out.println("------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------- Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
