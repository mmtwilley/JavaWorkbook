public class Grocer {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.3).
        String[] aisle = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        int lookedaisle = 0;
        System.out.println("\nDo you sell coffee?");
        for(int i = 0; i < aisle.length; i++){
            if(aisle[i].equals("coffeee")){
                lookedaisle = i;
                break;
            }
        }
        System.out.println("\nWe have that in aisle: " + lookedaisle);
    
    }
}
