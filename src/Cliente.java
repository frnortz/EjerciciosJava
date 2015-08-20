package calculo;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Calculos superObjetoMaximo = new Calculos();
        
        Scanner superTeclado = new Scanner(System.in);
        int ch;

        System.out.println("1. El Mayor N\u00famero.");              System.out.println("2. El Menor N\u00famero.");
        System.out.println("3. La Cantidad De N\u00fameros Pares."); System.out.println("4. Sumatoria.");
        System.out.println("5. N\u00fameros Impares.");              System.out.println("6. Conversor.");
        System.out.print("Ingrese N\u00famero de la accion que quiera realizar: ");

        ch = superTeclado.nextInt();

        switch (ch){
            case 1:
                int uno, dos;
                
                System.out.println("Ingrese primer N\u00famero:");
                uno = superTeclado.nextInt();
                System.out.println("Ingrese segundo N\u00famero: ");
                dos = superTeclado.nextInt();
                if (uno == dos){
                    System.out.println("Los N\u00fameros son iguales");
                }else{
                    System.out.println("El mayor N\u00famero es: " + superObjetoMaximo.elMayor(uno, dos));
                }
                    break;
            case 2:
                int menorUno, menorDos, menorTres;

                System.out.println("Ingrese primer N\u00famero: ");menorUno=superTeclado.nextInt();
                System.out.println("Ingrese segundo N\u00famero: ");menorDos=superTeclado.nextInt();
                System.out.println("Ingrese tercer N\u00famero: ");menorTres=superTeclado.nextInt();
                System.out.println("El Menor N\u00famero es: " + superObjetoMaximo.elMenor(menorUno, menorDos, menorTres));

                break;
            case 3:
                int parUno=0;
                System.out.println("Ingrese primer N\u00famero: ");parUno=superTeclado.nextInt();
                System.out.println("Los N\u00fameros pares es: " + superObjetoMaximo.cantidadPares(parUno));

                break;
            case 4:
                int sumUno;
                System.out.println("Ingrese primer N\u00famero: ");sumUno=superTeclado.nextInt();
                System.out.println("La Suma de los N\u00fameros es: " +superObjetoMaximo.sumatoria(sumUno));

                break;
            case 5:
                int impUno, impDos;
                System.out.println("Ingrese primer N\u00famero: ");impUno=superTeclado.nextInt();
                System.out.println("Ingrese segundo N\u00famero: ");impDos=superTeclado.nextInt();
                System.out.println("Los N\u00fameros impares son: ");superObjetoMaximo.impares(impUno,impDos);

                break;
            case 6:
                int convUno=0, convDos=0;
                System.out.println("Ingrese valor del d\u00f3lar: ");impUno=superTeclado.nextInt();
                System.out.println("Ingrese cantidad de d\u00f3lares ");impDos=superTeclado.nextInt();
                System.out.println("Su monto en pesos es de: ");superObjetoMaximo.conversor(convUno,convDos);

                break;
        }
    }
}
