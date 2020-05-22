package calculadora;

public class Calculadora {
    public static int suma(int a, int b){ //Se crea una funcion llamada suma que recibe enteros
        return a + b; //Devuelve la suma
    }
    
    public static int resta(int a, int b){ //Se crea una funcion llamada resta que recibe enteros
        return a - b; //Devuelve la resta
    }
    
    public static void main(String[] args){
        int a = 3 , b = 2; //Se declaran las variables y se les da un valor
        int res = suma (a,b); //Se declara la variable res que es igual a la sum de a + b
        int esperado = 5;
        if (res == esperado){
            System.out.println("Resultado de la suma es Correcto");
        }else{
            System.out.println("Resultado de la suma es incorrecto");
        }
        //System.out.println("3 + 2 = " + res); //Imprime el resultado que esta en res
    }
}