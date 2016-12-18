package ru.sbt.reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Person John = new Person("Jhon", "Smith", 35, true);
        Person person = new Person();
        BeanUtils.assign(person, John);
        Child child = new Child("Alice", "Smith", 5);
        Person person1 = new Person();
        BeanUtils.assign(person1, child);
        System.out.println(person1.getAge());
    }
}
