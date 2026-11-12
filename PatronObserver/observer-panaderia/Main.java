public class Main {
    public static void main(String[] args) {

        System.out.println("================================================");
        System.out.println("          Creamos panaderia y vecinos           ");
        System.out.println("================================================");
        Panaderia panaderia = new Panaderia();

        Vecino ana = new Vecino("Ana");
        Vecino luis = new Vecino("Luis");
        Vecino marta = new Vecino("Marta");

        System.out.println("================================================");
        System.out.println("          Creamos panaderia y vecinos           ");
        System.out.println("================================================");

        panaderia.suscribir(ana);
        panaderia.suscribir(luis);
        panaderia.suscribir(marta);

        for (int hora = 5; hora <= 7; hora++) {
            System.out.println("-- " + hora + ":00 --");
            if (hora == 7) {
                panaderia.sacarPan();
            }
            // Cada hora, todos van a preguntar
            // ana.preguntar(panaderia);
            // luis.preguntar(panaderia);
            // marta.preguntar(panaderia);
        }
    }
}
