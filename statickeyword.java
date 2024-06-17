// class Student{
//     int age=5;//instance variable, non-static variable
//     static String school;//non-instance variable, static variable, to call a non-static method we need obj, you can't call obj without main and can't call main without obj
//     static{
//         school="ABC School";
//     }

//     public void show(){
//         System.out.println("Student show method"+age+" "+school);
//     }
//     public static void study(){
//         System.out.println("Student study method");
//     }
//     public void sleep() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'sleep'");
//     }
//     public void disp() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'disp'");
//     }
// }
// public class statickeyword {
//     public static void main(String[] args) {
//         Student obj=new Student();
//         Student.study();

//     obj.age=19;
//         obj.school="ABC";
        
//     //System.out.println("Hello World");
//     Student obj1=new Student();
//  obj1.school="ABCDEF";
//     obj.show();
//  obj1.show();
//     }
// }
