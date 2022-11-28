public class Person {
    private String name;
    private int age;

    private Gender gender;

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return "*" + name +"*";
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
