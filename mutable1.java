public class mutable1 {
    public static void main(String[] args) {
        // StringBuilder sb=new StringBuilder();
        // System.out.println(sb.capacity());
        // sb.append("qwertyuioplkjghf");
        // System.err.println(sb.capacity());
        // sb.append("s");
        // System.out.println(sb.capacity());//(16+1)*2=34
        // System.out.println(sb.length());

        //  StringBuffer sb1=new StringBuffer("anandita");
        //  System.out.println(sb1);
        //  System.out.println(sb1.capacity());
        //  System.out.println(sb1.charAt(1));
        // sb1.setCharAt(1, 'A');
        // System.out.println(sb1);

        StringBuffer sb=new StringBuffer(150);
        System.out.println(sb.capacity());
        sb.append("java");
        System.out.println(sb.reverse());
        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}
