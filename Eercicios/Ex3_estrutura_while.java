import java.util.Scanner;

public class Ex3_estrutura_while{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x  = sc.nextInt();
        int contGasolina = 0;
        int contAlcool = 0;
        int contDisel = 0;

        while (x != 4){
            if (x == 1){
                contAlcool ++;
            }
            else if (x == 2){
                contGasolina ++;
            }
            else if (x == 3){
                contDisel ++;
            }
            x = sc.nextInt();
            
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + contAlcool);
        System.out.println("Gasolina: " + contGasolina);
        System.out.println("Disel: " + contDisel);


        sc.close();
    }

}