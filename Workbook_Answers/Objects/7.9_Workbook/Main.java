public class Main {
  
    public static void main(String[] args) {

        PersonNine[] people = new PersonNine[] { 
            new PersonNine("Cleopatra", "Egypt", "69 BC", 1),
            new PersonNine("Alexander the Great", "Macedon", "356 BC", 2),
            new PersonNine("Julius Caesar", "Rome", "100 BC", 3),
            new PersonNine("Hannibal", "Carthage", "247 BC", 4),
            new PersonNine("Confucius", "China", "551 BC", 5),
            new PersonNine("Pericles", "Greece", "429 BC", 6),
            new PersonNine("Spartacus", "Thrace", "111 BC", 7),
            new PersonNine("Marcus Aurelius", "Rome", "121 AD", 8),
            new PersonNine("Leonidas", "Greece", "540 BC", 9),
            new PersonNine("Sun Tzu", "China", "544 BC", 10),
            new PersonNine("Hammurabi", "Babylon", "1750 BC", 10),
        };

        NewAirline airline = new NewAirline();

        for (int i = 0; i < people.length; i++) {
            airline.createReservation(people[i]);
            airline.setPerson(people[i]);
        }

        


     }
    
  
}
