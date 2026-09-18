import java.util.*;
public class Polymorphism {
   public static class Dog{
    void speak(){
        System.out.println("Bhau Bhau");
    }
   }
   public static class Cat {
    void speak(){
        System.out.println("meaw meaw");
    }

   }

   public static class Lion {
    void speak(){
        System.out.println("GRRRRRR");
    }

   }
    public static class Pikachu {
    void speak(){
        System.out.println("Pika pika");
    }

   }
    public static class Human {
    void speak(){
        System.out.println("Helloo");
    }

   }
   public static void main(String[] args){
    Dog d = new Dog();
    Cat c = new Cat();
    Human h = new Human();
    Pikachu p = new Pikachu();

    d.speak();
    c.speak();
    h.speak();
    p.speak();
   }
}
