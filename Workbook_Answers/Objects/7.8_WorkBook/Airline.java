public class Airline {
    
    PersonNine[] people; //array that stores Person objects...


    public Airline(){
        this.people = new PersonNine[11];
    }

    public PersonNine getPerson(int index){
        return this.people[index];
    }

    public void setPerson(PersonNine i){
       int index = i.getSeatNumber() - 1;
       this.people[index] = i;
    }

    public void createReservation(PersonNine person){
        int index = person.getSeatNumber() - 1;
        

        while(people[index] != null){
            if(people[index] != null){
                System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber() + " is already taken. Please choose another seat.\n");
                person.chooseSeat(); 
            }
        }
        people[index] = new PersonNine(person);
        System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".\n");
    }

}
