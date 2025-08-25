public class Main {
    public static void main(String[] args) {

        //Reference type - classes
        System.out.println("-------Reference type - classes-------");

        Person p1 = new Person();
        p1.id = 1;
        p1.name = "Bob";
        p1.age = 22;

        System.out.println(p1.id);
        System.out.println(p1.name);
        System.out.println(p1.age);

        System.out.println("-------");

        Person p2 = p1;
        p2.id = 2;
        p2.name = "Alice";
        p2.age = 44;

        System.out.println(p2.id);
        System.out.println(p2.name);
        System.out.println(p2.age);

        System.out.println("p1 name: " + p1.name);
        System.out.println("p2 'name: " + p2.name);
        //Both p1 and p2 point to the same object.

        //reference type = array
        System.out.println("-------Reference type - array-------");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;  // arr2 points to same array

        arr2[0] = 99;

        System.out.println(arr1[0]); // 99
        System.out.println(arr2[0]); // 99
        //Arrays are objects, so references point to them.

        //Reference type = interface
        System.out.println("-------Reference type - interface-------");
        Animal cat = new Cat();
        cat.sound();
        //cat is a reference of type Animal (interface), but it points to a Cat object.

        //Reference type - Enum
        System.out.println("-------Reference type - Enums-------");
        Day today = Day.Monday; // reference to enum constant
        System.out.println(today);
        //Enums are special classes that hold fixed constants.

        //Strings (Special Class → Reference Type)
        String s1 = "Hello";       // String literal (in String pool)
        String s2 = new String("Hello"); // new object in heap

        System.out.println(s1); // Hello
        System.out.println(s2); // Hello

        // Check reference equality
        System.out.println(s1 == s2);     // false (different references)
        System.out.println(s1.equals(s2)); // true (same content)
        //Strings are objects, but Java treats them specially with a String pool.
    }
}