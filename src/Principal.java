public class Principal {
    int[] cedula = new int[3];
    String[] nombre = new String[3];
    int totalIngresos = 0;

    public void agregarClientes(int cedula,String nombre){

        if(totalIngresos < 3){

            this.cedula[totalIngresos] = cedula;
            this.nombre[totalIngresos] = nombre;
            totalIngresos++;
            System.out.println("CLIENTE AGREGADO!");
        } else {
            System.out.println("NO SE PUEDE AGREGAR MAS CLIENTES!");
        }
    }


    public void mostrarInformacion(){

        if(totalIngresos == 0){
            System.out.println("NO HAY CLIENTES INGRESADOS!");
        } else {
            System.out.println("Informacion de clientes:");
            for(int i=0; i<totalIngresos; i++){
                System.out.println("Cedula: " + cedula[i]);
                System.out.println("Nombre: " + nombre[i]);
            }
        }
    }
}
