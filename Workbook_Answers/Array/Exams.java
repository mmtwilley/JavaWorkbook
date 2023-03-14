public class Exams {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (Workbook 6.1).

        System.out.println("It's time to take your 5th year exams. Please, take your seats.\n");
        
        String[] seats = { "Harry", "Neville", "Ron", "Hermione", "Seamus"};


        for(int i = 0; i < seats.length; i++){
            System.out.println(seats[i] + ", you will take seat " + i);
        }

        // Compare your result to what's on Learn the Part.

    }
}
