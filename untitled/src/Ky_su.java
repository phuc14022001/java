public class Ky_su extends  Nguoi{
    public String nganh;


    public Ky_su(String name, int age, String gender, String address,String nganh) {
        super(name, age, gender, address);
        this.nganh= nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "Ky_su{" +
                "nganh='" + nganh + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Gender='" + Gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
