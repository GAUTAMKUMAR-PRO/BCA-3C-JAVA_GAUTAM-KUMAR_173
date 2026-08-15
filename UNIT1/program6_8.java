import java.util.Scanner;
public class pro68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter teh name:");
        String name=sc.nextLine();

        System.out.println("enter the number:");
        int n=sc.nextInt();

        int i=0;
        while(i<=n){
            System.out.println("name is : " + name);
            i++;
        }
        
    }
    
}
