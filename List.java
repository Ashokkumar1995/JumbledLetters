import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String []args){
        ArrayList<String> s1= new ArrayList<String>();

        s1.add("A");
        s1.add("B");
        s1.add("C");

        System.out.println(s1);

        System.out.println("New element C added!");
        if(s1.contains("C")){
            s1.remove("C");
            s1.add(0,"C");
        }
        System.out.println(s1);
        // Collections.reverse(s1);
        for(int i=s1.size()-1;i>=0;i--){
            System.out.print(s1.get(i));
        }
        // System.out.println(s1);
    }
}
