import java.util.ArrayList;


public class SubCompare{

    public static void main(String[] args){

        getSmallestAndLargest("welcometojava",3);
    }

    public static void getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> subS = new Arrays.asList();        
        
        for(int i = 0;i <= s.length() - k; i++){
            subS.add(s.substring(i, i + k));
        }

        subS.sort((String a, String b) ->
            a.compareTo(b);
        );
        
        smallest = subS.get(0);
        largest = subS.get(s.length() - 1);


      
        
    }
}