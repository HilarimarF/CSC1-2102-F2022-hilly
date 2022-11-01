
public class Example2 {
    // java operators 
// + - * / % ++ -- += -= *= /= %=
// == != > < >= <=
// && || !
// & | ^ ~ << >> >>>
// = - assignment operator
// == - equality operator
// != - not equal operator
// > - greater than operator
// < - less than operator
// >= - greater than or equal to operator
// <= - less than or equal to operator
// && - logical and operator
// || - logical or operator
// ! - logical not operator

// Java types - 8 primitive types
// int - integer - whole numbers 3, 4, 5, 6, 7, 8, 9, 10
// double - floating point numbers - 3.14, 4.5, 6.7, 8.9, 10.11
// char - character - 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
// boolean - true or false
// String - a sequence of characters - "hello", "world", "java", "programming", "language"
// long - long integer - whole numbers 3, 4, 5, 6, 7, 8, 9, 10
// float - floating point numbers - 3.14, 4.5, 6.7, 8.9, 10.11
// short - short integer - whole numbers 3, 4, 5, 6, 7, 8, 9, 10

// scope types
// local - variables declared inside a method
// instance - variables declared inside a class but outside a method
// class - variables declared inside a class and outside a method

// public - access modifier - allows access to the class from anywhere
// private - access modifier - allows access to the class from inside the class only
// protected - access modifier - allows access to the class from inside the class and subclasses
// default - access modifier - allows access to the class from inside the package only
    public static void main(String[] args) {
        // string concatenation
        System.out.println("Hello" + " " + "World");
        System.out.println("Hello" + " " + 3);
        System.out.println("Hello" + " " + 3.0);
        System.out.println("Hello" + " " + true);
        System.out.println("Hello" + " " + false);
        System.out.println("Hello" + " " + 3 + 3);
        System.out.println("Hello" + " " + (3 + 3));
        System.out.println("Hello" + " " + 3 + 3 + 3);
        System.out.println("Hello" + " " + (3 + 3 + 3));
        // string concatenation with variables
        // string concatenation - String + String = String
        String name = "Hilarimar";
        System.out.println("Hello" + " " + name);
        System.out.println("Hello" + " " + name + " " + name);
        String greeting = "Hello";
        System.out.println(greeting + " " + name);
        int number = 9;
        System.out.println(greeting + " " + name + " " + number);
        System.out.println(greeting + ", my name is " + name + " my favorite number is " + number);
    }
}
