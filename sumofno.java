public class sumofno {
    public static void main(String[] args) {
        int n=100;
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%8==0){
            sum+=i;
            }
        }
        System.out.println(sum);
    }
}
