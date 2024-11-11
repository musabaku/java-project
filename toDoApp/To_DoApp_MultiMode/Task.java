package To_DoApp_MultiMode;

public class Task {
    private String description;
    private String dueDays;
//    private boolean status;

    public String getDescription(){
        return this.description;
    }
    public String getDueDays(){
        return this.dueDays;
    }
    public Task(String description,String dueDays){
        this.description = description;
        this.dueDays = dueDays;
    }

//    private boolean getStatus(){
//        return this.status;
//    }
}
