package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    //Aqui se ralizan todos los métodos
    @Test //Lo que hace es marcar como una prueba 
    public void testSuma(){ //Creamos el metodo testSuma
        //Haremos una llamada a la funcion que debe ser cortay qu solo realice esa funcion
        int resultado = Calculadora.suma(2,3); //Esta funcion va a devolver un resultado de los parámetros (2,3)
        int esperado = 5; //2 + 3 = 5
        //Probaremos que Resultado y esperado es el mismo
        //JUnit ofrece una serie de funciones que empiezan por assert para todo tipo
        assertEquals(resultado, esperado);
    }
    
    @Test //Para que Unit pueda reconocerlo como pruebas agregamos @Test
    public void testResta(){ //Creamos el método testResta
        int resultado  = Calculadora.resta(3,2);
        int esperado = 1; //3 - 2 = 1
        assertEquals(resultado, esperado);
    }
    
}