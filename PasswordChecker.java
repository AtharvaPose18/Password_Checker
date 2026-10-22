import java.util.Scanner;
public class PasswordChecker{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your password:");
        String password=sc.nextLine();
        boolean hasDigit= false;
        boolean hasLetter=false;
        boolean hasSpecial=false;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(Character.isDigit(ch)){
                hasDigit=true;
                }
            else if(Character.isLetter(ch)){
                hasLetter=true;
                }
            else{
                hasSpecial=true;
                }
            }
        if(password.length()<6){
            System.out.println("Password Strength:Weak!");
        }
        else if(password.length()>=8 && hasDigit && hasLetter && hasSpecial){
            System.out.println("Password Strength:Strong");
        }
        else{
            System.out.println("Password Strength:Medium");
        }
        sc.close();

    }
    
}
