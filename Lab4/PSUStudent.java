public abstract class PSUStudent {
    protected int age;
    protected double gpa;

    public PSUStudent(int age, double gpa) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0: " + gpa);
        }
        this.age = age;
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public abstract double revealGrade();

    public void setCurrentYear(int currentYear) {
    }

    public void setPassThesis(boolean passThesis) {
    }
}
