package designPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        //Builder builder = new Builder();
        Student.getBuilder()
        .setAge(21)
        .setName("Ashutosh")
        .setGradYear(2023).build();

        System.out.println("Student created successfully!!!");
    }
}
