
public class clase_02 {
    String nombre;

    public void imprimir(){
        System.out.println("Clase número dos");
        System.out.println("Mi nombre es:" + nombre);


    }
    int resultado(int edad){
        return edad+5;
    }
    public static void main( String[] arg){
        // Estamos instanciando nuestro programa
        int temp;
        clase_02 n1 = new clase_02();
        n1.nombre ="Oscar E. Valdés";
        n1.imprimir();
        temp =n1.resultado(10);
        System.out.println("el resultado es: "+temp);
    }
}
