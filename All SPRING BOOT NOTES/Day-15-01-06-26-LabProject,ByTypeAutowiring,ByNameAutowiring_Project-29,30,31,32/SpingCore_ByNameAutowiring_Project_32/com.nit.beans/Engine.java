package com.nit.beans;
//We Can not use @Component annotation on the top of Interface
//With the help of @Qualifier Spring container will implement the implementing class
public interface Engine {
       public void start();
}
