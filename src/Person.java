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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }
}
