package com.sub.day15;

public class Day15Demo {

    public static void main(String[] args) {

        //=========================================
        // 1. HashCode Example
        //=========================================

        System.out.println("========== HashCode Example ==========");

        A a1 = new A();
        A a2 = new A();

        System.out.println("HashCode of a1 : " + a1.hashCode());
        System.out.println("HashCode of a2 : " + a2.hashCode());
        System.out.println("Same Object : " + (a1 == a2));

        //=========================================
        // 2. Singleton Example
        //=========================================

        System.out.println("\n========== Singleton Example ==========");

        SingletonApplication obj1 = SingletonApplication.getObject();
        SingletonApplication obj2 = SingletonApplication.getObject();

        System.out.println("HashCode of obj1 : " + obj1.hashCode());
        System.out.println("HashCode of obj2 : " + obj2.hashCode());
        System.out.println("Same Object : " + (obj1 == obj2));

        //=========================================
        // 3. Singleton Proof Using Two Classes
        //=========================================

        System.out.println("\n========== Singleton Proof ==========");

        Application1 app1 = new Application1();
        Application2 app2 = new Application2();

        app1.fetchObject();
        app2.fetchObject();

        //=========================================
        // 4. Rectangle with Instance Variables
        //=========================================

        System.out.println("\n========== Rectangle (Normal Class) ==========");

        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(30, 40);

        r1.getArea();
        r2.getArea();

        //=========================================
        // 5. Static Rectangle Example
        //=========================================

        System.out.println("\n========== Static Rectangle ==========");

        RectangleUtility.getArea(10, 20);
        RectangleUtility.getArea(30, 40);

        //=========================================
        // 6. Database Connection Example
        //=========================================

        System.out.println("\n========== Database Connection ==========");

        ConnectionProvider c1 = ConnectionProvider.getConnection();
        ConnectionProvider c2 = ConnectionProvider.getConnection();

        System.out.println("Connection 1 HashCode : " + c1.hashCode());
        System.out.println("Connection 2 HashCode : " + c2.hashCode());
        System.out.println("Same Connection : " + (c1 == c2));
    }
}

//=========================================
// Simple Class
//=========================================

class A {

}

//=========================================
// Singleton Class
//=========================================

class SingletonApplication {

    private static SingletonApplication ref = null;

    private SingletonApplication() {

    }

    public static SingletonApplication getObject() {

        if (ref == null) {
            ref = new SingletonApplication();
        }

        return ref;
    }
}

//=========================================
// First Application
//=========================================

class Application1 {

    public void fetchObject() {

        SingletonApplication obj =
                SingletonApplication.getObject();

        System.out.println("Application1 : " + obj.hashCode());
    }
}

//=========================================
// Second Application
//=========================================

class Application2 {

    public void fetchObject() {

        SingletonApplication obj =
                SingletonApplication.getObject();

        System.out.println("Application2 : " + obj.hashCode());
    }
}

//=========================================
// Rectangle (Normal Class)
//=========================================

class Rectangle {

    int length;
    int width;

    Rectangle(int length, int width) {

        this.length = length;
        this.width = width;
    }

    public void getArea() {

        System.out.println("Area = " + (length * width));
    }
}

//=========================================
// Rectangle Utility (Static Methods)
//=========================================

class RectangleUtility {

    private RectangleUtility() {

    }

    public static void getArea(int length, int width) {

        System.out.println("Area = " + (length * width));
    }
}

//=========================================
// Database Connection Singleton
//=========================================

class ConnectionProvider {

    private static ConnectionProvider connection = null;

    private ConnectionProvider() {

        System.out.println("Database Connection Created...");
    }

    public static ConnectionProvider getConnection() {

        if (connection == null) {
            connection = new ConnectionProvider();
        }

        return connection;
    }
}

