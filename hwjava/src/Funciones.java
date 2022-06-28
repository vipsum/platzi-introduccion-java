public class Funciones {
    //las funciones deben vivir al nivel de la clase
    public static void main(String[] args) {
        double y = 3;
        //area d eun circulo
        // pi* r2
        circleArea(y);
        //area de una esfera
        //4*PI*r2
        sphereArea(y);
        //volumen de una esfera
        // (4/3)*pi * r3
        sphereVolume(y);
        double moneyAmount;
        String currency;
        System.out.println("pesos a dolares: " + convertToDolar(200, "MXN"));

    }
    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }
    public static double sphereArea (double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolume(double r) {
        return (4/3)* Math.PI*Math.pow(r, 3);
    }/**
     * Descripción general de nuestra función.
     *
     * @param moneyAmount Descripción del parámetro quanity.
     * @param currency Descripción del parámetro currency (MXN o COP).
     * @return Descripción del valor que devolvemos en esta función.
     * */
    public static double convertToDolar(double moneyAmount, String currency){
        switch (currency) {
            case "MXN":
                moneyAmount = moneyAmount * 0.052;
                break;
            case "COP":
                moneyAmount = moneyAmount * 0.00031;
                break;
        }
        return moneyAmount;
    }
}
