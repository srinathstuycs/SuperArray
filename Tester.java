import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    SuperArray first_dynamic = new SuperArray();
    //Testing size()
    System.out.println(first_dynamic.size());
    //Testing add()
    first_dynamic.add("Hello");
    first_dynamic.add("Hello again!");
    System.out.println(first_dynamic.size());
    //Testing get()
    System.out.println(first_dynamic.get(0));
    System.out.println(first_dynamic.get(1));
    System.out.println(first_dynamic.get(2));
    //Testing set()
    System.out.println(first_dynamic.set(0,"Bye!"));
    System.out.println(first_dynamic.set(0,"Hello"));
    //Testing resize() and revised add()
    first_dynamic.add("alphabet");
    System.out.println(first_dynamic.size());
    first_dynamic.add("albatross");
    System.out.println(first_dynamic.size());
    first_dynamic.add("hyena");
    System.out.println(first_dynamic.size());
    first_dynamic.add("crocodile");
    System.out.println(first_dynamic.size());
    first_dynamic.add("zebra");
    System.out.println(first_dynamic.size());
    first_dynamic.add("lion");
    System.out.println(first_dynamic.size());
    first_dynamic.add("gorilla");
    System.out.println(first_dynamic.size());
    first_dynamic.add("giraffe");
    System.out.println(first_dynamic.size());
    first_dynamic.add("horse");
    System.out.println(first_dynamic.size());
    first_dynamic.add("anteater");
    //Should print 12 entries
    System.out.println(first_dynamic.size());
    for (int i = 0; i < first_dynamic.size(); i++) {
      System.out.println(first_dynamic.get(i));
    }
    //Test clear()
    first_dynamic.clear();
    System.out.println(first_dynamic.size());
    //Test isEmpty()
    System.out.println(first_dynamic.isEmpty());
    first_dynamic.add("apple");
    System.out.println(first_dynamic.isEmpty());
    //Test toString()
    System.out.println(first_dynamic);
    first_dynamic.add("banana");
    first_dynamic.add("watermelon");
    first_dynamic.add("kiwi");
    System.out.println(first_dynamic);
    first_dynamic.clear();
    System.out.println(first_dynamic);
    //Test contains()
    System.out.println(first_dynamic.contains("banana"));
    first_dynamic.add("apple");
    first_dynamic.add("banana");
    first_dynamic.add("watermelon");
    first_dynamic.add("kiwi");
    System.out.println(first_dynamic.contains("banana"));
    System.out.println(first_dynamic.contains("orange"));
    //Test add() at index
    first_dynamic.add(3, "orange");
    System.out.println(first_dynamic);
    //Test remove() at index
    System.out.println(first_dynamic.remove(2));
    System.out.println(first_dynamic);
    first_dynamic.remove(1); System.out.println(first_dynamic);
    //Test indexOf()
    System.out.println(first_dynamic.indexOf("apple"));
    System.out.println(first_dynamic.indexOf("orange"));
    System.out.println(first_dynamic.indexOf("kiwi"));
    //Test toArray()
    System.out.println(Arrays.toString(first_dynamic.toArray()));
    //Test lastIndexOf()
    first_dynamic.add("apple");
    first_dynamic.add("orange");
    first_dynamic.add("banana");
    first_dynamic.add("watermelon");
    first_dynamic.add("kiwi");
    System.out.println(first_dynamic);
    System.out.println(first_dynamic.indexOf("banana"));
    System.out.println(first_dynamic.lastIndexOf("banana"));
    System.out.println(first_dynamic.indexOf("kiwi"));
    System.out.println(first_dynamic.lastIndexOf("kiwi"));
    System.out.println(first_dynamic.indexOf("apple"));
    System.out.println(first_dynamic.lastIndexOf("apple"));
    System.out.println(first_dynamic.indexOf("orange"));
    System.out.println(first_dynamic.lastIndexOf("orange"));
    //Test equals()
    SuperArray fruits2 = new SuperArray(8);
    fruits2.add("apple");
    fruits2.add("orange");
    fruits2.add("kiwi");
    fruits2.add("apple");
    fruits2.add("orange");
    fruits2.add("banana");
    fruits2.add("watermelon");
    fruits2.add("kiwi");
    System.out.println(fruits2.equals(first_dynamic));
    fruits2 = new SuperArray(10);
    fruits2.add("apple");
    fruits2.add("orange");
    fruits2.add("kiwi");
    fruits2.add("apple");
    fruits2.add("orange");
    fruits2.add("banana");
    fruits2.add("watermelon");
    fruits2.add("kiwi");
    System.out.println(fruits2.equals(first_dynamic));
    SuperArray next_test = new SuperArray();
    System.out.println(next_test.equals(first_dynamic));
    next_test.add("kiwi");
    next_test.add("apple");
    next_test.add("orange");
    next_test.add("banana");
    System.out.println(next_test.equals(first_dynamic));
  }
}
