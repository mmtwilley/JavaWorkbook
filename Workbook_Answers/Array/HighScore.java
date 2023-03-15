public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        int seat = 0;
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).

        
        int[] score ={randomScore(),randomScore(),randomScore(),randomScore(),randomScore(),randomScore(),randomScore(),randomScore(),randomScore(),randomScore()};


        System.out.print(" Here are the scores :");
        for(int i = 0; i < score.length; i++){
            System.out.print(score[i] + " ");
            if(score[i] > highScore){
                highScore = score[i];
                seat = i;
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Impressive!");
        System.out.println("It's the gentleman in seat: " + seat + ". Give that man a cookie!");
        
    }   
    
    public static int randomScore(){
        double generator = Math.random() * 50000;
        return (int)generator + 1;
    }

}
