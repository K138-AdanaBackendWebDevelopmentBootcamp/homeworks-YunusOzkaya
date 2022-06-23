public class PermanentInstructor extends Instructor{
    private long fSalary;

    public PermanentInstructor(String name, String address, long phoneNum, long fSalary) {
        super(name, address, phoneNum);
        this.fSalary = fSalary;
    }

    public PermanentInstructor(long fSalary) {
        this.fSalary = fSalary;
    }

    public long getfSalary() {
        return fSalary;
    }

    public void setfSalary(long fSalary) {
        this.fSalary = fSalary;
    }

    @Override
    public String toString() {
        return "PermanentInstructor{" +
                "fSalary=" + fSalary +
                "} " + super.toString();
    }
}
