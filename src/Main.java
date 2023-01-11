public class Main {
    public static void main(String[] args) {
        Cliente Cliente1 = new Cliente(24, "Manuel", 837453, 15099);

        System.out.println(Cliente1.edad);
        System.out.println(Cliente1.nombre);
        System.out.println(Cliente1.telefono);
        System.out.println(Cliente1.credito);

        Trabajador Trabajador1 = new Trabajador(54, "Jose", 478324, 1200);

        System.out.println(Trabajador1.edad);
        System.out.println(Trabajador1.nombre);
        System.out.println(Trabajador1.telefono);
        System.out.println(Trabajador1.salario);



    }
}
class Persona{
    public int edad;
    public String nombre;
    public int telefono;

}
class Cliente extends Persona{
    public int credito;
    public Cliente(int edad, String nombre, int telefono, int credito){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.credito = credito;

    }
}
class Trabajador extends Persona{
    public int salario;

    public Trabajador(int edad, String nombre, int telefono, int salario){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = salario;

    }

}