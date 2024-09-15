package Super;

public class Job extends Student{
    public String Companyname;
    private double salary;
    private boolean health_status;
    public Job(String Companyname, double salary ,boolean health_status){
        super("Aditya",20,"22BCT0043",8.96);
        this.Companyname = Companyname;
        this.salary = salary;
        this.health_status = health_status;
    }
    public void getJob(){
        System.out.println("Company Name: " + Companyname + " Salary: "+salary + " Health Status: "+health_status);
    }
    public boolean health(boolean health_status){
        this.health_status = health_status;
        return health_status;
    }
    public void setCompanyname(String Companyname){
        this.Companyname = Companyname;
    }
    public String getCompanyname(){
        return Companyname;
    }
}
