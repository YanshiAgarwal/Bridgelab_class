package Inheritance;

//Superclass
class Animal {
 String name;
 int age;

 // Constructor
 public Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to be overridden
 public void makeSound() {
     System.out.println("Some generic animal sound");
 }
}

//Subclass Dog
class Dog extends Animal {
 public Dog(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println(name + " the Dog says: Woof Woof!");
 }
}

//Subclass Cat
class Cat extends Animal {
 public Cat(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println(name + " the Cat says: Meow!");
 }
}

//Subclass Bird
class Bird extends Animal {
 public Bird(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println(name + " the Bird says: Tweet Tweet!");
 }
} 

public class Animal_Hierarchy {
 public static void main(String[] args) {
     Animal dog = new Dog("Buddy", 3);
     Animal cat = new Cat("Whiskers", 2);
     Animal bird = new Bird("Tweety", 1);

     dog.makeSound();
     cat.makeSound();
     bird.makeSound();
 }
}


