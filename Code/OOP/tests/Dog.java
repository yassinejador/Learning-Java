public class Dog implements AnimalIF{
    private String breed;
    Dog(String breed) {
        this.breed=breed;
    }
    public void getNoise(){
        System.out.println("Wouf");
    };
    public void getFamily(){
        System.out.println("I'm a mammal");
    };
    public void getBreed(){
        System.out.println("I'm a race "+race);
    };
}