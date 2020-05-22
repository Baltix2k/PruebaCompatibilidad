package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class) //Es el constructor que se ocupahacer las pruebas parametrizadas

public class CalculadoraParametroTest {
    @Parameters //Prueba tipo parametros
    public static Iterable<Object[]> getData(){
        return Arrays.asList(new Object[][]{
            {1, 1, 2}, {2, 3, 4}, {4, 5, 9}
        });
        /*List<Object[]> obj = new ArrayList(); //Una lista de objetos
        //posibles valores que queremos que llame mi prueba dentro de los corchetes
        obj.add(new Object[]{3, 1, 4}); //3 + 1 y el valor esperado es 4
        obj.add(new Object[]{5, 3, 8});
        obj.add(new Object[]{2, 2, 4});
        return obj; //Regresaremos la lista de objetos*/
    }
    
    //Se guarda en variables
    private int a, b, exp;
    
    //Creamos un constructor para mi prueba y le pasamos 3 parametros
    public CalculadoraParametroTest (int a, int b, int exp){
        this.a = a;
        this.b = b;
        this.exp = exp;
    }
    
    @Test //Creamos una prueba
    public void testAdd(){
        CalculadoraBefoAlf calc = new CalculadoraBefoAlf();
        //Llamamos al metodo add con las variables que agregamos y se guarda en una nueva variable result
        int result = calc.add (a, b);
        assertEquals(exp, result); //Verificamos que sea igual result que el exp
    }
    
}
