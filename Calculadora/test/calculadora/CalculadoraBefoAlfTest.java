package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class CalculadoraBefoAlfTest {
    static CalculadoraBefoAlf calc;
    
    @BeforeClass
    public static void beforeClass(){ //Prueba que slo se ejecuta una vez en toda la clase
        System.out.println("BeforeClass");
        calc = new CalculadoraBefoAlf();
    }
    
    @Before//Sirve para ejecutar código antes de que se ejecute la prueba
    public void before(){
        System.out.println("Before()");
        //calc = new CalculadoraBefoAlf();
        calc.clear(); //Solo llamaremos al metodo Clear
    }
    
    @Test
    public void testSuma(){
        //CalculadoraBefoAlf calc = new CalculadoraBefoAlf();
        System.out.println("testSuma()");
        int resul = calc.add(3,2);
        int esper = 5;
        assertEquals(esper,resul);
    }

    @Test
    public void testAnsSum(){
        //CalculadoraBefoAlf calc= new CalculadoraBefoAlf();
        System.out.println("AnsSum()");
        calc.add(3,2);
        int resul = calc.ans();
        int esper = 5;
        assertEquals(esper,resul);
    }
    
    @Test
    public void div(){ //Aqui se realiza una prueba correcta
        System.out.println("Div()");
        calc.div(5, 2);
    }
    
    @Test(expected = ArithmeticException.class)//Esta prueba funcionara porque espera una división por cero
    //y espera a que salte un error
    public void testDivPorCero(){
        System.out.println("DivExcepted()");
        calc.div(5, 0);
    }
    
    /*@Test(timeout = 100)//No debe tardar mas de 100 milisegundos y si tarda mas saldra un error
    public void testAlgoritmoOptimo(){
        calc.operacionOptima(); //Llama la operacion optima
    }*/
    
    @AfterClass
    public static void afterClass(){
        System.out.println("AfterClass");
    }
    
    @After
    public void after(){
        System.out.println("After()");
        calc.clear();
    }
    
}