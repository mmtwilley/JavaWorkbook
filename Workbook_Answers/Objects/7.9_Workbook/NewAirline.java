public class NewAirline {
    
    PersonNine[] people; //array that stores Person objects...


    public NewAirline(){
        this.people = new PersonNine[11];
    }

    public PersonNine getPerson(int index){
        return this.people[index];
    }

    public void setPerson(PersonNine person){
       int index = person.getSeatNumber() - 1;
       this.people[index] = new PersonNine(person);
    }

    public void createReservation(PersonNine person){

    
        while(people[person.getSeatNumber() - 1] != null){
           
            System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber() + " is already taken. Please choose another seat.\n");
            person.chooseSeat();    
        }
        int index = person.getSeatNumber() -1;
        people[index] = new PersonNine(person);
        System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".\n");
    }

}
