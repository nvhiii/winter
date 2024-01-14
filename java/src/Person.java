public class Person {

    // class variables
    private String name;
    private int age;

    // constructor
    public Person(String name) {

        this.name = name;
        this.age = 0;

    }

    public void printPerson() {

        System.out.println(name + ", age " + age + " years");

    }

}
