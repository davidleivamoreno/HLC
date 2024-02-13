package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        assertEquals(5, Calculadora.sumar(2, 3));
        assertEquals(-1, Calculadora.sumar(-2, 1));
        assertEquals(0, Calculadora.sumar(0, 0));
    }
    /* Realiza a continuación el resto de tests para el resto de funciones */
     
        @Test
        public void testMultiplicar() {
            // Caso 1: Números positivos
            assertEquals(8, Calculadora.multiplicar(2, 4));
    
            // Caso 2: Números negativos
            assertEquals(-15, Calculadora.multiplicar(-5, 3));
    
            // Caso 3: Límite superior
            assertEquals(Integer.MAX_VALUE * 2, Calculadora.multiplicar(Integer.MAX_VALUE, 2));
    
            // Caso 4: Límite inferior
            assertEquals(Integer.MIN_VALUE * 2, Calculadora.multiplicar(Integer.MIN_VALUE, 2));
    
            // Caso 5: Multiplicación por cero
            assertEquals(0, Calculadora.multiplicar(0, 100));
        }
    
        @Test
        public void testDividir() {
            // Caso 1: División exacta
            assertEquals(5.0, Calculadora.dividir(10, 2), 0);
    
            // Caso 2: División con resultado decimal
            assertEquals(3.3333333333333335, Calculadora.dividir(10, 3), 0.0000000001);
    
            // Caso 3: División por cero
            // Aquí esperamos que lance una excepción ArithmeticException
            try {
                Calculadora.dividir(10, 0);
                // Si no se lanza ninguna excepción, la prueba falla
                // Indicamos explícitamente que la prueba debería lanzar una excepción
                fail("Se esperaba que lanzara una excepción ArithmeticException");
            } catch (ArithmeticException e) {
                // La excepción esperada fue lanzada, la prueba pasa
            }
        }
        @Test
        public void testRestar() {
            // Caso 1: Números positivos
            assertEquals(3, Calculadora.restar(5, 2));
    
            // Caso 2: Números negativos
            assertEquals(-7, Calculadora.restar(-5, 2));
    
            // Caso 3: Límite superior
            assertEquals(Integer.MAX_VALUE - 1, Calculadora.restar(Integer.MAX_VALUE, 1));
    
            // Caso 4: Límite inferior
            assertEquals(Integer.MIN_VALUE + 1, Calculadora.restar(Integer.MIN_VALUE, 1));
    
            // Caso 5: Resta de cero
            assertEquals(-5, Calculadora.restar(0, 5));
        }
}