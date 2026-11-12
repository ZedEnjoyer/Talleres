public class Vecino implements Observable{
    private String nombre;


    public Vecino(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String notificacion){
        System.out.println("Hola "+nombre+" ya hay pan");
    }

    public String getNombre(){
        return nombre;
    }
}