public class PairOfDice1 {
    private int nbFaces;
    private Die die1, die2;

    public PairOfDice1(int faces) {
        nbFaces = faces;
        die1 = new Die(faces);
        die2 = new Die(faces);
    } 

    public void printFace() {
        System.out.println(die1.getFace() + "," + die1.getFace());
    }
}
