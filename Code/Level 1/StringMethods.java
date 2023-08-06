public class StringMethods {
    public static void main(String[] args) {
        String name="Yassine";
        int res;
        Boolean response;

        response=name.equals("yassine");
        response=name.equalsIgnoreCase("yassine");
        res=name.indexOf("Y");
        res=name.charAt(1);
        System.out.println(response);
    }
}
