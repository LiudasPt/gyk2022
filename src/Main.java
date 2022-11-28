import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name = "Aloyzas";
        int day = 11;

        AccessModifier example = new AccessModifier();
        example.age = 34;

        String[] cars = new String[4];

        cars[0] = "Audi";
        cars[1] = "null";
        cars[2] = "Volvo";

        for(String car: cars){
            System.out.println(car);
        }

        Employee employee = new Employee("vardas", 32, 1234);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());


        System.out.println("Hello world!" + name);
        System.out.println(Arrays.toString(cars));

        Person karolis = new Person("Mantvydas", 28);
        karolis.setGender(Gender.MALE);
        System.out.println(karolis.getName());

        /*
        public static void classExample() {
            AccessModifier modifier = new AccessModifier();
            System.out.println(modifier);
            Person mantvydas = new Person("Mantvydas", 28);
            System.out.println(mantvydas.getName());
        }
         */


    }
}