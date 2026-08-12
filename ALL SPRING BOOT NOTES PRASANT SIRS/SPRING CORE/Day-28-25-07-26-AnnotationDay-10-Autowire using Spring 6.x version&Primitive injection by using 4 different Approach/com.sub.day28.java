|- Autowire using Spring 6.x version 
|- Primitive injection by using 4 different Approach

---------------------------------------------------------------------------------------------
package com.sub.day28;

import org.springframework.beans.factory.annotation.Autowired;

public class Rocket {

	private Launcher launcher;
	private B b;

	public Rocket() {
		System.out.println("Rocket constructor");
	}

	@Autowired
	public void setLauncher(Launcher launcher) {
		this.launcher = launcher;
	}

	@Autowired
	public void setB(B b) {
		this.b = b;
	}

	public void ignite() {

		System.out.println("Rocket ignition started");

		launcher.powerSupplied();

		b.display();

		System.out.println("Rocket launched");
	}
}
---------------------------------------------------------------------------------------------
package com.sub.day28;
public class Launcher {

    public Launcher() {

        System.out.println("Launcher Constructor");
    }

    public void powerSupplied() {

        System.out.println(
                "Rocket fuel & all setup done!");
    }
}
---------------------------------------------------------------------------------------------
package com.sub.day28;
public class B {

    public B() {
        System.out.println("B Constructor");
    }

    public void display() {

        System.out.println("B class method");
    }
}
---------------------------------------------------------------------------------------------
package com.sub.day28;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AutowireConfig {

    @Bean
    public Rocket rocket() {

        return new Rocket();
    }

    @Bean
    @Primary
    public Launcher launcher1() {

        return new Launcher();
    }

    @Bean
    public Launcher launcher2() {

        return new Launcher();
    }

    @Bean
    @Primary
    public B b1() {

        return new B();
    }

    @Bean
    public B b2() {

        return new B();
    }
}
---------------------------------------------------------------------------------------------
package com.sub.day28;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaunchCenter {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AutowireConfig.class);

		Rocket rocket = context.getBean("rocket", Rocket.class);

		rocket.ignite();
	}
}
---------------------------------------------------------------------------------------------
OUTPUT
----------
Rocket constructor
Launcher Constructor
B Constructor
Launcher Constructor
B Constructor
Rocket ignition started
Rocket fuel & all setup done!
B class method
Rocket launched
