package NewBranch;

public class branching {
    String name,id;
    float cgpa;
    String number;

    public branching(String name, String id, float cgpa, String number) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
