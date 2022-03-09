import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestTemplate

internal class CalculadoraTest{

    @Test
    fun multiTeste(){
        kotlin.test.assertEquals(6, Calculadora.multi(3,2))
    }

    @Test
    fun diviTeste(){
        kotlin.test.assertEquals(6, Calculadora.divi(12,2))
    }
    @Test
    fun somaTeste(){
        kotlin.test.assertEquals(6, Calculadora.soma(3,3))
    }
    @Test
    fun subTeste(){
        kotlin.test.assertEquals(6, Calculadora.sub(8,2))
    }




}