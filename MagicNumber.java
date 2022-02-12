import java.util.*;

public class MagicNumber{

    public static void main(String[] args){
        // System.out.println("HELLO");
        String input="201";
       // boolean isValid=true;
        int count=0;
        
        Map<Character,Integer> countMap= new HashMap<Character,Integer>();
        int inputLength=input.length();


        for(int i=0;i<inputLength;i++){
            countMap.put(Character.forDigit(i, 10),0);
        }
        // System.out.println(countMap);
        for(int i=0;i< inputLength;i++){
            char ch=input.charAt(i);
            if(countMap.get(ch) == null){
                countMap.put(ch, 1);
            }
            else{
                countMap.put(ch, countMap.get(ch)+1);
            }
        }



        System.out.println(countMap);

        for(int i=0;i<inputLength;i++){
            if(Character.getNumericValue(input.charAt(i)) == countMap.get(Character.forDigit( i, 10))){
                // System.out.println(i);
                count++;
            }
        }

        // for(int i=0;i<input.length();i++){
        //     if(countMap.get(i)== null && input.charAt(i)!='0'){
        //         System.out.println("Not a Magic Number");
        //         break;
        //     }
        // }


        // for(int i=0;i<input.length();i++){

        //     char c=Character.forDigit(i, 10);
            // System.out.println(c);
            
        //     if((countMap.get(c)==null && Character.getNumericValue(input.charAt(i))==0)|| Character.getNumericValue(input.charAt(i)) ==  Integer.valueOf(countMap.get(c))){
        //         count++;
        //     }
        //    else{
        //         System.out.println("Not a Magic Number");
        //         break;
        //     }

            // if(countMap.get(c)==null && Character.getNumericValue(input.charAt(i))==0){

            // }

            // Iterator<Map.Entry<Character,Integer>> itr= countMap.entrySet().iterator();
                



        // }

        if(count == input.length()){
            System.out.println("Magic Number");
        }
        else{
            System.out.println("Not a Magic Number");
        }


    }
}