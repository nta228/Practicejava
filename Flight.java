public class Flight {
    int number;
    String destination;

    public Flight(){
        this.number=0;
        this.destination="";
    }

    public Flight(int number, String destination){
        this.number=number;
        this.destination=destination;
    }

    public String getDestination(){
        return destination;
    }

    public int getNumber(){
        return number;
    }

    void display(){
        if (number<0){
            System.out.println("Invalid Flight");
        }
        else {
            System.out.println("Flight Information: ");
            System.out.println("The flight number: "+ number);
            System.out.println("the destination: "+ destination);
        }
    }
}