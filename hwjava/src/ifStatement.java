public class ifStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSent = 3;
        if (isBluetoothEnabled){
            //send file
            fileSent++;
            System.out.println("Archivo Enviado");
        } else {
            System.out.println("Por favor enciende tu bluetooth");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSent);
    }
}
