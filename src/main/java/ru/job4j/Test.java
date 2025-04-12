package ru.job4j;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;

public class Test extends ArrayList<Float> {

    public static void main(String[] args) {
        ArrayList<Float> listOfNumbers = new Test();

        Class actual = listOfNumbers.getClass();
        ParameterizedType type = (ParameterizedType) actual.getGenericSuperclass();
        System.out.println(type);
        Class parameter = (Class) type.getActualTypeArguments()[0];
        System.out.println(parameter);

        int i = -5;
        System.out.println(Integer.toBinaryString(i));

        System.out.println(2 * 2);
        System.out.println(8 / 2);

        int num = 4;
        num /= 2;
        System.out.println(num);
    }
}