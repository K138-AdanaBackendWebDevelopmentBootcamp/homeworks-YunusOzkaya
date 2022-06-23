//A Student who has a name, a birth date, an address, and gender could take zero or more courses

public class Student {
    private String name;
    private String address;
    private String birthDay;
    private String gender;

    public Student(String name, String address, String birthDay, String gender) {
        this.name = name;
        this.address = address;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
