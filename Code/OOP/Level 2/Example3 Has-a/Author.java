public class Author {
    public int authorId;
    public String authorName;
    Author(int authorId,String authorName) {
        this.authorId=authorId;
        this.authorName=authorName;
    }
    public String toString() {
        return "author id : "+authorId+"author name : "+authorName;
    }
}
