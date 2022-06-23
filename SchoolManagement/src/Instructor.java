// Instructors who have a name, an address and a phone number could instruct at least one or more courses
public class Instructor {
    private String name;
    private String address;
    private long phoneNum;

    public Instructor(String name, String address, long phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum=" + phoneNum +
                '}';
    }
}
