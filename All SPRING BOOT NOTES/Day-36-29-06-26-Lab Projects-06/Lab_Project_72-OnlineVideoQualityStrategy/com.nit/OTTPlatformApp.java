package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OTTPlatformApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		StreamingStrategy strategy = (StreamingStrategy) context.getBean("hdStream");

		VideoPlayer player = new VideoPlayer();

		player.setUserName("Subham");

		player.setStrategy(strategy);

		player.playVideo("Avengers");

		player.displayStreamingInfo();

		((ClassPathXmlApplicationContext) context).close();

	}

}
