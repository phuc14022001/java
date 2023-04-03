public class Cong_nhan extends Nguoi {
    public int bac;

    public Cong_nhan(String name, int age, String gender, String address,int bac) {
        super(name, age, gender, address);
        this.bac= bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "Cong_nhan{" +
                "bac='" + bac + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Gender='" + Gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
