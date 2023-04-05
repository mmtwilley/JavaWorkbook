public class Airline {
    
    PersonEight[] people; //array that stores Person objects...


    public Airline(){
        this.people = new PersonEight[11];
    }

    public PersonEight getPerson(int index){
        return this.people[index];
    }

    public void setPerson(PersonEight person){
       int index = person.getSeatNumber() - 1;
       people[index] = person;
    }

}
