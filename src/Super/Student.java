package Super;

public abstract class Student {
    private String regid;
    public String name;
    private double cgpa;
    public int age;

    public Student(String name, int age,String regid,double cgpa){
        this.name = name;
        this.age = age;
        this.regid = regid;
        this.cgpa = cgpa;
    }
    public void test(){
        System.out.println("This is a test method");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("regid='").append(regid).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", cgpa=").append(cgpa);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

}
