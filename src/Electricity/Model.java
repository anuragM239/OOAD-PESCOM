package Electricity;

public class Model {
    private int meter_no;
    private String name;
    private String email;

    public Model(int meter_no, String name, String email) {
        this.meter_no = meter_no;
        this.name = name;
        this.email = email;
    }

    public int getMeterNo() {
        return meter_no;
    }

    public void setMeterNo(int meter_no) {
        this.meter_no = meter_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}