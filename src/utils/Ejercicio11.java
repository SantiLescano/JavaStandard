/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3_for;

/**
 *
 * @author Win
 */
public class Ejercicio11 {

    /**
     * Imprimir la siguiente figura:
     *
     * @@@@@
     * @@@
     * @
     * @@@
     * @@@@@
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantInicial = 5;
        int cantMedia = 1;
        int incremento = -2;
        int cantFinal = cantInicial - incremento;
        int cantArrobas = 0;
        int cantArrobasLinea = cantInicial;
        int contadorLineas = 0;

        while (cantArrobasLinea != cantFinal || contadorLineas == 0) {
            for (cantArrobas = 1; cantArrobas <= cantArrobasLinea; cantArrobas++) {
                System.out.print("@");
            }
            System.out.println();
            cantArrobasLinea += incremento;
            if (cantArrobasLinea == cantMedia) {
                incremento = -incremento;
            }
            contadorLineas++;
        }
    }

}
