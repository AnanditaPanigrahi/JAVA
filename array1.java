class Calc{
    public int add(int n1,int n2){
        int result=n1+n2;
        return result;
    }
}


public class array1 {
    public static void main(String[] args) {
        Calc obj=new Calc();
        int result=obj.add(4,3);
        System.out.println("The result is "+result);
    }
}
