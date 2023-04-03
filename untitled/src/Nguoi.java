public class Nguoi {
    public String name;
    public int age;
    public String Gender;
    public String address;

    public String getName() {
        return name;
    }

    public Nguoi(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        Gender = gender;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }
}
