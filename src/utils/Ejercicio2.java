package clase4_vectores;

public class Ejercicio2 {

    /**
     * Informar la inflación anual Informar la inflación más baja, junto con el
     * número de mes. Por ejemplo: Mes 2 = 0.1 Informar la inflación más alta,
     * junto con el número de mes. Por ejemplo: Mes 12 = 0.9 Informar el
     * promedio de inflación (inflación total / 2)
     *
     * @param args
     *
     * Pseudocódigo DEFINIR
     * inflacion={0.8,0.1,0.3,0.4,0.3,0.6,0.5,0.3,0.7,0.3,0.2,0.9} DEFINIR
     * total,maximo=inflacion[0],minimo=inflacion[0]; DEFINIR n,int
     * mes_min=0,mes_max=0 PARA n DESDE 1 HASTA 12 CON n=n+1 HACER total = total
     * + inflacion[n] SI inflacion[n] > maximo ENTONCES maximo = inflacion[i]
     * mes_max = n+1 FIN SI SI inflacion[n] < minimo ENTONCES minimo =
     * inflacion[n] mes_min = n+1 FIN SI FIN PARA
     *
     * INFORMAR total INFORMAR promedio INFORMAR maximo y mes_max INFORMAR
     * maximo y mes_min
     */
    public static void main(String[] args) {
        double[] inflacion = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};

        double total = 0;

        double maximo = inflacion[0];
        double minimo = inflacion[0];
        int mes_max = 1;
        int mes_min = 1;

        for (int i = 0; i < inflacion.length; i++) {
            total += inflacion[i];

            if (inflacion[i] > maximo) {
                maximo = inflacion[i];
                mes_max = i + 1;

            } else if (inflacion[i] < minimo) {
                minimo = inflacion[i];
                mes_min = i + 1;
            }
        }

        System.out.println("inflacion anual " + total);
        System.out.println("inflacion promedio " + (total / inflacion.length));

        System.out.println("Minima inflacion " + minimo + " mes " + (mes_min));
        System.out.println("Maxima inflacion " + maximo + " mes " + (mes_max));
    }

}
