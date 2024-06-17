public class string1 {
    public static void main(String[] args) {
       
        String letter="Dear <|name|> Thanks a lot";
        //String c="I     am        a  good girl";
        //System.out.println(c.trim());
        System.out.println(letter.replace("<|name|>", "Anandita"));
        //System.out.println(letter.replace(letter, "ANU"));
    }
}
