public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).

        System.out.print("Here are the scores: <score elements>");

        int[] score ={14775, 48328, 7928, 27102, 21787, 21063, 38096, 42711, 32863, 23707};


        System.out.println(" Here are the scores:");
        for(int i = 0; i < score.length; i++){
            System.out.print(i + "");
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        
    }    

}
