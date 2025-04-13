package ru.job4j;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;

public class Test extends ArrayList<Float> {

    public static void main(String[] args) {
        ArrayList<Float> listOfNumbers = new Test();

        listOfNumbers.add(1.0f);
        listOfNumbers.add(2.5f);
        listOfNumbers.add(3.14f);

        for (Float number : listOfNumbers) {
            System.out.println(number);
        }

        var actual = listOfNumbers.getClass();
        ParameterizedType type = (ParameterizedType) actual.getGenericSuperclass();
        System.out.println(type);
        var parameter = (Class<?>) type.getActualTypeArguments()[0];
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