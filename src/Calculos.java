package calculo;

public class Calculos {
    public int elMayor(int num1, int num2){
        if (num1<num2){
            return num2;
        }else{
            return num1;
        }
    }

    public int elMenor(int num1, int num2, int num3){
        if (num1<num2 && num1<num3){
            return num1;
        }else if (num2<num1 && num2<num3){
            return num2;
        }else {
            return num3;
        }
    }

    public int cantidadPares(int num){
        int cont=0;
        for (int i=1; i<=num; i++){
            if(i%2 == 0){
                cont++;
            }
        }return cont;
    }
    public int sumatoria(int num){
        int sum=0;
        for(int i=0; i<=num; i++){
            sum+=i;
        }return sum;
    }

    public int impares(int num1, int num2){
        int imp=0;
        for(int i=num1; i<=num2; i++){
            if(i%2!=0){
                imp++;
            }
        }return imp;
    }
    public int conversor(float valD, int cantD){
        int pesos=(int)valD*cantD;
        return pesos;
    }
}