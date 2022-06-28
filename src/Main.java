public class Main {
    public static void main(String[] args) {
        int r = suma(1, 2, 3);
        Coche miCoche = new Coche();
        miCoche.agregar_puerta();
        System.out.println(r);
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c)
    {
        return a + b + c;
    }
    public static class Coche
    {
        int puertas = 0;
        public void agregar_puerta()
        {
            ++puertas;
        }
    }
}