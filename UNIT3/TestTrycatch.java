public class TestTrycatch{
  public static void main(String[]args){

  String studentName="java";
    System.out.println(studentName+"started math calculation.......");
    try{

    int totalmarks=100;
      int subjects=5;
      int result=totalmarks/subjects;
      System.out.println("result: "+result);
    }catch(ArithmeticException e){

      System.out.println("Exception caught:division by zero is not allowed for"+studentName+"!");
      System.out.println("System error details:"+e.getMessage());
    }
    System.out.println("Student "+studentName+"'s program continues execution smoothly");
  }
}
