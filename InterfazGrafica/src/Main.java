import javax.swing.*;
    public static void main(String[] args, JOptionPane JOptionaPane) {
        String primerNumero = JOptionaPane.showInputDialog("Introduzca el primer entero");
        String segundoNumero = JOptionPane.showInputDialog("Introduzca el segundo entero");

        //convierte un strings en valores int para calculo
        int numero1 = Integer.parseInt ( primerNumero );
        int numero2 = Integer.parseInt ( segundoNumero );
        int suma = numero1 + numero2;

        //muestra los resultados
        JOptionPane.showMessageDialog (null, "la suma es" + suma,
                "Suma de dos enteros, JOptionPane.PLAIN_MESSAGE);
    }
}