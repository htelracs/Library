package DataAccess.DTO;

public class Users {
    private int id;
    private String name;
    private String lastNameP;
    private String lastNameM;
    private String domicilio;
    private String tel;
    private int sanctions;
    private int sancMoney;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastNameP() {
        return lastNameP;
    }
    public void setLastNameP(String lastNameP) {
        this.lastNameP = lastNameP;
    }
    public String getLastNameM() {
        return lastNameM;
    }
    public void setLastNameM(String lastNameM) {
        this.lastNameM = lastNameM;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public int getSanctions() {
        return sanctions;
    }
    public void setSanctions(int sanctions) {
        this.sanctions = sanctions;
    }
    public int getSancMoney() {
        return sancMoney;
    }
    public void setSancMoney(int sancMoney) {
        this.sancMoney = sancMoney;
    }

  
}
