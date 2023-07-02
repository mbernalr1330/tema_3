public class Main {
    public static void main(String[] args) {

        //Primera parte
        Integer resultadoSuma = suma(4 , 10, 20);
        System.out.println("Suma: "+resultadoSuma);

        //Segunda parte
        Coche coche =  new Coche();
        coche.aumentarNumeroPuerta();
        coche.aumentarNumeroPuerta();
    }

    public static Integer suma ( Integer n1, Integer n2, Integer n3 ){
        Integer sumatoria = 0;
        sumatoria = n1 + n2 + n3;
        return sumatoria;
    }

}

class Coche {
    public Integer numeroPuertas = 0;

    public void aumentarNumeroPuerta(){
        numeroPuertas ++;
        System.out.println("Número de puertas: "+numeroPuertas);
    }
}