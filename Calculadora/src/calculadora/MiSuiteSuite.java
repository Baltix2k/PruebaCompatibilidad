package calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class);
@Suite.SuiteClasses({
    //Aqui le pasamos un array con todas las pruebas que quramos que se ejecuten
    CalculadoraBefoAlfTest.class,
    CalculadoraParametroTest.class,
    CalculadoraTest.class
})

public class MiSuiteSuite {
}