package Method;

public class Person {

    private String middleName = "Francisco";

    void sayHello()
    {
        int num1 = 90;
        int num2 = 10;
        System.out.println( num1+num2);
        System.out.println("Hello");
    }

    public char getMiddeleName ()
    {
    return  middleName.charAt(0);
    }

    public void saySomeThing (String message)
    {
        System.out.println(message);
    }

    public int add (int x, int y)
    {
        return x + y;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();
        p1.saySomeThing("This is a message");
        System.out.println(p1.getMiddeleName());
        System.out.println(p1.add(549, 6));
    }
}
