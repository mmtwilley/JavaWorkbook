public class Testing {
    public static void main(String[] args){
        System.out.println(computerChoice());
        System.out.println(computerChoice());
        System.out.println(computerChoice());

    }
    public static String computerChoice(){
        double randomChoice = Math.random() * 3;
        randomChoice +=1;
        String result = "";
        switch((int)randomChoice){
            case 1:
                result = "rock";
                break;
            case 2:
                result =  "paper";
                break;
            case 3:
                 result = "scissor";
                 break;
        }
        return result;
    } 

}
