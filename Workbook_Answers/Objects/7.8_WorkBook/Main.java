public class Main {
  
    public static void main(String[] args) {

        PersonEight[] people = new PersonEight[] { 
            new PersonEight("Cleopatra", "Egypt", "69 BC", 1),
            new PersonEight("Alexander the Great", "Macedon", "356 BC", 2),
            new PersonEight("Julius Caesar", "Rome", "100 BC", 3),
            new PersonEight("Hannibal", "Carthage", "247 BC", 4),
            new PersonEight("Confucius", "China", "551 BC", 5),
            new PersonEight("Pericles", "Greece", "429 BC", 6),
            new PersonEight("Spartacus", "Thrace", "111 BC", 7),
            new PersonEight("Marcus Aurelius", "Rome", "121 AD", 8),
            new PersonEight("Leonidas", "Greece", "540 BC", 9),
            new PersonEight("Sun Tzu", "China", "544 BC", 10),
            new PersonEight("Hammurabi", "Babylon", "1750 BC", 11),
        };

        Airline airline = new Airline();

        for (int i = 0; i < people.length; i++) {
            airline.getPerson(i);
        }

        System.out.println(airline.getPerson(1));
        System.out.println(airline.getPerson(5));
        System.out.println(airline.getPerson(10));


     }
    
  
}
