import java.util.Scanner;

public class Ex2_estrutura_for {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dentro = 0;
        int x = 0;
        int fora = 0;

        for (int i = 0; i < n; i ++ ){
            x = sc.nextInt();
            if (x >= 10 && x <= 20){
                dentro +=  1;
            }
            else{
                fora += 1;
            }
        }

        System.out.printf("%d in\n", dentro);
        System.out.printf("%d out\n", fora);

        sc.close();

    }
}