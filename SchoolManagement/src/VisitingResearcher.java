public class VisitingResearcher extends Instructor {
    private float hSalary;

    public VisitingResearcher(String name, String address, long phoneNum, float hSalary) {
        super(name, address, phoneNum);
        this.hSalary = hSalary;
    }

    public VisitingResearcher(float hSalary) {
        this.hSalary = hSalary;
    }

    public float gethSalary() {
        return hSalary;
    }

    public void sethSalary(float hSalary) {
        this.hSalary = hSalary;
    }

    @Override
    public String toString() {
        return "VisitingResearcher{" +
                "hSalary=" + hSalary +
                "} " + super.toString();
    }
}
