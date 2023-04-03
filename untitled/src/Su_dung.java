import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Su_dung {
    private List<Nguoi> nguoi;
    public Su_dung (){
        this.nguoi = new ArrayList<>();
    }
    public void add(Nguoi nguoi){
        this.nguoi.add(nguoi);
    }
    public List seach(String name){
        return this.nguoi.stream().filter(o->o.getName().contains(name)).collect(Collectors.toList());
    }
    public void show(){
        this.nguoi.forEach(o -> System.out.println(o.toString()));
    }
}
