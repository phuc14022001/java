public class Nhan_Vien extends Nguoi{
    public String Cong_viec;

    public Nhan_Vien(String name, int age, String gender, String address,String congviec) {
        super(name, age, gender, address);
        this.Cong_viec=congviec;
    }

    public String getCong_viec() {
        return Cong_viec;
    }

    public void setCong_viec(String cong_viec) {
        Cong_viec = cong_viec;
    }

    @Override
    public String toString() {
        return "Nhan_Vien{" +
                "Cong_viec='" + Cong_viec + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Gender='" + Gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
