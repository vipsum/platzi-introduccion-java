public class MathOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.ceil(x)); // devuelve un entero hacia arriba
        System.out.println(Math.floor(x)); // devuelve un entero hacia abajo
        //devuelve un numero elevado a otro ( 2.1 **3)
        System.out.println(Math.pow(x, y));
        //returns biggest number
        System.out.println(Math.max(x, y));

        //returns square root
        System.out.println(Math.sqrt(y));

        //area de un circulo
        //pi * r2
        System.out.println(Math.PI * Math.pow(y, 2));

        // Área de una esfera (4 * PI * r^2):
        //4 * Math.PI * Math.pow(r, 2)

        // Volumen de una esfera ( (4/3) * PI * r^3):
        //(4/3) * Math.PI * Math.pow(r, 3)
    }
}
