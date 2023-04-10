package designPatterns.Builder;

public class Student {
    String name;
    int age;
    double psp;
    String batch;
    long id;
    String univName;
    int gradYear;
    String phone_number;
    String email;

    public static Builder getBuilder(){
        return new Builder();
    }
    private Student(Builder builder){
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
        this.name = builder.getName();

    }
    public static class Builder {
        private String name;
        private int age;
        private double psp;
        private String batch;
        private long id;
        private String univName;
        private int gradYear;
        private String phone_number;
        private String email;

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhone_number() {
            return phone_number;
        }

        public Builder setPhone_number(String phone_number) {
            this.phone_number = phone_number;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }


        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Student build(){
            if(getGradYear() > 2022){
                throw new IllegalArgumentException("Grad year can't be greater than 2022");
            }
            return new Student(this);
        }
    }
}
