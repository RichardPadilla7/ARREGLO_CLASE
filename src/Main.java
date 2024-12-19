import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import FORMULARIO.FORM;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Principal registro = new Principal();

        JFrame frame = new JFrame("LOGIN");
        frame.setContentPane(new FORM().formularios);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setPreferredSize(new Dimension(400, 300));
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

        /*
        while(true) {
            System.out.println(" ---- MENU ----");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Mostrar Cliente");
            System.out.println("3. Salir");
            System.out.print("Escoge una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    for(int i = 0; i <3; i++){

                        System.out.print("Ingresa la cedula: ");
                        int cedula = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Ingresa el nombre: ");
                        String nombre = scanner.nextLine();

                        // llama a la funcion para agregar cliente
                        registro.agregarClientes(cedula, nombre);
                    }

                    break;
                case 2:
                    registro.mostrarInformacion();
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el sistema.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opcion invalida.");
            }
        }


         */
    }
}