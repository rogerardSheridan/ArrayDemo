package arraysdemo;

public class Student {
    private String sId;
    private String sName;
    private String address;
    
    //Some comment
    
    //Comment for pull

    public Student(String sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }
    
    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
  
}
