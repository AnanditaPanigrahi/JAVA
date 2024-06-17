public class stringconcat {
    public static void main(String[] args) {
        String s1 =new String("Hello");
        //s1=s1.concat(" anandita");
        String s2=s1.concat("anandita");
        String s3=new String("anandita");
        s3=s3.concat("Hello");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
