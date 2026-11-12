import java.util.ArrayList;

public class Panaderia implements Observer{
    private ArrayList<Vecino> vecinosSuscritos = new ArrayList<Vecino>();

    public void sacarPan() {
        System.out.println(">> Salio el pan caliente");
        notificar("Hay pan fresco");

    }


    @Override
    public void suscribir(Vecino v){
        vecinosSuscritos.add(v);
    }

    @Override 
    public void desuscribir(Vecino v){
        vecinosSuscritos.removeIf(veci -> veci.getNombre().equals(v.getNombre()));
    }

    @Override 
    public void notificar(String mensaje){
        for(Vecino v : vecinosSuscritos){
            v.actualizar(mensaje);
        }
    }
}
