package practice.test;

import practice.list.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<Integer>();
        integerMyList.add(1);
        integerMyList.add(2);
        integerMyList.add(3);
        integerMyList.add(3);
        integerMyList.add(4);

        System.out.println("Element 4: " + integerMyList.get(4));
        System.out.println("Element 1: " + integerMyList.get(1));
        System.out.println("Element 2: " + integerMyList.get(2));
        System.out.println("Element 3: " + integerMyList.get(3));

        integerMyList.get(-1);
        System.out.println("Element 6: " + integerMyList.get(-1));
    }
}
