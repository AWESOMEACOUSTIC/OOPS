package Super;

public class Subject extends Student{
    private int noofsem;
    private String status;
    public String University;

    Subject(){
        super("Aditya",20,"22BCT0043",8.96);

    }
    private String Detials(String University, String status){
        super.test();
        this.University = University;
        this.status = status;
        return University + ": " +status;

    }

    public void setNoofsem(int noofsem) {
        this.noofsem = noofsem;
    }

    public int getNoofsem() {
        return noofsem;
    }
}
