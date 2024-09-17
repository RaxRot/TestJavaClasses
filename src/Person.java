public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(){
        this.name = "Unknown";
        this.age = 0;
    }

    public void showPersonInfo(){
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}
