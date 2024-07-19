import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class product{
    int id;
    String name;
    double price;
    public product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class A{
    public static void main(String args[]){
        List<product> plist=new ArrayList<product>();
        plist.add(new product(1,"hp",25000));
        plist.add(new product(2,"lenevo",28000));
        plist.add(new product(3,"dell",23000));
        plist.add(new product(4,"assus",24000));
        plist.add(new product(5,"samsung",30000));
        
        plist.stream().filter(p->p.price>25000).forEach(p->System.out.println(p.price));
    }
}