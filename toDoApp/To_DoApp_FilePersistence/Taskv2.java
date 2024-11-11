package To_DoApp_FilePersistence;

public class Taskv2 {
    private String description;
    private String dueDays;
//    private boolean status;

    public String getDescription(){
        return this.description;
    }
    public String getDueDays(){
        return this.dueDays;
    }
    public Taskv2(String description, String dueDays){
        this.description = description;
        this.dueDays = dueDays;
    }
    @Override
    public String toString(){
        return this.description+","+this.dueDays;
    }

//    private boolean getStatus(){
//        return this.status;
//    }
}
