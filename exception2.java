public class exception2 {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = -3;
        try {
            if(num2<0){
                throw new Exception();
            }
            else{
                int result = num1 / num2;
                System.out.println(result);
            }
            
        } catch (Exception e) {
            System.out.println("Error: Division by zero is not allowed" + e);
        }
    }
    
}
