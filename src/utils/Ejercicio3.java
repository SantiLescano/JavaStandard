package clase4_vectores;

public class Ejercicio3 {

    /**
     * Informar la inflacion mas baja y mas alta con el nombre de mes
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] inflacion = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        double maximo = inflacion[0];
        double minimo = inflacion[0];

        String mes_max=mes[0];
        String mes_min=mes[0];  
        
        for (int i = 0; i < inflacion.length; i++) {
            if (inflacion[i] > maximo) {
                maximo = inflacion[i];
                mes_max = mes[i];
            }
            if (inflacion[i] < minimo) {
                minimo = inflacion[i];
                mes_min = mes[i];
            }
        }

        System.out.println("Minima inflacion " + minimo + " mes " + mes_min);
        System.out.println("Maxima inflacion " + maximo + " mes " + mes_max);
    }

}
