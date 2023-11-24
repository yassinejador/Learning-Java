public class Die {
    private int nbFaces;
    private int visibleFaces;

    public Die(int faces) {
        nbFaces = faces;
        visibleFaces = (int) (Math.random() * nbFaces) + 1;
    }

    public int printNbFace() {
        return this.nbFaces;
    }
    public void printFace() {
        System.out.print(visibleFaces);
    }

    public int getFace() {
        return visibleFaces;
    }

    public boolean testFace(int visibleFaces) {
        return !(visibleFaces==0 || visibleFaces > 6);
    }
    //
}
