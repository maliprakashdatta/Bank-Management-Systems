package BMSServices;

public class RegisterCustomer {
    int id;
    private String firstname;
    private String lastname;
    private String gender;
    private long DOB;
    private String address;
    String emaild;
    int idcard;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setDOB(long DOB) {
        this.DOB = DOB;
    }

    public long getDOB() {
        return DOB;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmaild(String emaild) {
        this.emaild = emaild;
    }

    public String getEmaild() {
        return emaild;
    }

    public void setIdcard(int idcard) {
        this.idcard = idcard;
    }

    public int getIdcard() {
        return idcard;
    }
}
