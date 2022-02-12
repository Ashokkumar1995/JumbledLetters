import java.util.HashMap;
import java.util.Map;
public class JumbledStrings {
    
    public static void main(String[] args){
        String input="owoztneoer";
        // String input="ototworwezisxxsieightourf";
        String numberOne="";
        String numberTwo="";
        String numberThree="";
        String numberFour="";
        String numberFive="";
        String numberSix="";
        String numberSeven="";
        String numberEight="";
        String numberNine="";
        String numberZero="";
        Map<Character, Integer> hm= new HashMap<Character, Integer>();

        for(int i=0;i<input.length();i++){
            if(hm.get(input.charAt(i))== null){
                hm.put(input.charAt(i), 1);
            }else{
                hm.put(input.charAt(i), hm.get(input.charAt(i))+1);
            }
        }

        System.out.println(hm);

        if(hm.get('z')!= null && hm.get('z')>0){
            for(int i=0;i<hm.get('z');i++){
                numberZero= numberZero + Integer.toString(0);
            }

            hm.put('e', hm.get('e') - hm.get('z'));
            hm.put('r', hm.get('r') - hm.get('z'));
            hm.put('o', hm.get('o') - hm.get('z'));
        }

        if(hm.get('w')!= null && hm.get('w')>0){
            for(int i=0;i<hm.get('w');i++){
                numberTwo= numberTwo + Integer.toString(2);
            }

            hm.put('t', hm.get('t') - hm.get('w'));
            hm.put('o', hm.get('o') - hm.get('w'));            
        }

        if(hm.get('x')!= null && hm.get('x')>0){
            for(int i=0;i<hm.get('x');i++){
                numberSix= numberSix + Integer.toString(6);
            }

            hm.put('s', hm.get('s') - hm.get('x'));
            hm.put('i', hm.get('i') - hm.get('x'));            
        }

        if(hm.get('g')!= null && hm.get('g')>0){
            for(int i=0;i<hm.get('g');i++){
                numberEight= numberEight + Integer.toString(8);
            }

            hm.put('e', hm.get('e') - hm.get('g'));
            hm.put('i', hm.get('i') - hm.get('g'));            
            hm.put('h', hm.get('h') - hm.get('g'));
            hm.put('t', hm.get('t') - hm.get('g'));
        }

        if(hm.get('u')!= null && hm.get('u')>0){
            for(int i=0;i<hm.get('u');i++){
                numberFour= numberFour + Integer.toString(4);
            }

            hm.put('f', hm.get('f') - hm.get('u'));
            hm.put('o', hm.get('o') - hm.get('u'));            
            hm.put('r', hm.get('r') - hm.get('u'));
            
        }

        if(hm.get('o')!= null && hm.get('o')>0){
            for(int i=0;i<hm.get('o');i++){
                numberOne= numberOne + Integer.toString(1);
            }
        }

        if(hm.get('t')!= null && hm.get('t')>0){
            for(int i=0;i<hm.get('t');i++){
                numberThree= numberThree + Integer.toString(3);
            }
        }

        if(hm.get('f')!= null && hm.get('f')>0){
            for(int i=0;i<hm.get('f');i++){
                numberFive= numberFive + Integer.toString(5);
            }
        }

        if(hm.get('s')!= null && hm.get('s')>0){
            for(int i=0;i<hm.get('s');i++){
                numberFive= numberFive + Integer.toString(7);
            }
        }

        if(hm.get('i')!= null && hm.get('i')>0){
            for(int i=0;i<hm.get('i');i++){
                numberNine= numberNine + Integer.toString(9);
            }
        }

        // ZERO--
        // ONE**
        // TWO--
        // THREE**
        // FOUR--
        // FIVE**
        // SIX--
        // SEVEN**
        // EIGHT--
        // NINE**



        System.out.println(hm);
        System.out.println(numberZero+ numberOne+ numberTwo + numberThree + numberFour+ numberFive + numberSix+ numberSeven + numberEight + numberNine);

    }
}
