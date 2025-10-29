

public class oops {

    //In Java, every class you create automatically becomes a new data type that you can use to create objects.

    public static class students{
        // That static keyword means this class is nested inside another class (like oops in our example)

        // Class

        String name;
        int roll;
        double percentage;

    }

    public static void main(String[] args) {

       students s1 = new students();  // Data type (like int or String, but user-defined)
       
    //    int a = 10;                      int is data type
    //    students s1 = new students();    students is also a data type (created by you)


       // Objects --> s1 , s2 of class " Students"

        s1.name="Banty";
        s1.roll=81;
        s1.percentage=98.8;

        System.out.println(s1.name);

        // object s2
        students s2 = new students();

        s2.name="Priyanshu";
        s2.roll=810;
        s2.percentage=88.8;

        System.out.println(s2.name);

    }
    
}
