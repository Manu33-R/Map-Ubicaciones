import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class MainUbicacionArrayList {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Ubicacion> ubis = new ArrayList<Ubicacion>();

    public static void main(String[] args) {
        Ubicacion clase = new Ubicacion(0, "Estás sentado en clase de programación");
        Ubicacion mountain = new Ubicacion(1, "Estás en la cima de una montaña");
        Ubicacion playa = new Ubicacion(2, "Estás bañándote en la playa");
        Ubicacion edifico = new Ubicacion(3, "Estás dentro de un edificio muy alto");
        Ubicacion puente = new Ubicacion(4, "Estás de pie en un puente");
        Ubicacion bosque = new Ubicacion(5, "Estás en un bosque");

        ubis.add(clase);
        ubis.add(mountain);
        ubis.add(playa);
        ubis.add(edifico);
        ubis.add(puente);
        ubis.add(bosque);

        //Direcciones de Montaña
        ubis.get(1).addExit("Q", 0);
        ubis.get(1).addExit("N", 5);
        ubis.get(1).addExit("S", 4);
        ubis.get(1).addExit("E", 3);
        ubis.get(1).addExit("O", 2);

        //Direcciones de Playa
        ubis.get(2).addExit("Q", 0);
        ubis.get(2).addExit("N", 5);

        //Direcciones de Edificio
        ubis.get(3).addExit("Q", 0);
        ubis.get(3).addExit("O", 1);

        //Direcciones de Puente
        ubis.get(4).addExit("Q", 0);
        ubis.get(4).addExit("N", 1);
        ubis.get(4).addExit("O", 2);

        //Direcciones de Bosque
        ubis.get(5).addExit("Q", 0);
        ubis.get(5).addExit("S", 1);
        ubis.get(5).addExit("O", 2);

        int opcion = 1;
        while (opcion != 0) {
            mapa(opcion);
            System.out.println(ubis.get(opcion).getDescripcion());
            System.out.print("Tus salidas válidas son ");
            int i = 0;
            for (Map.Entry<String, Integer> ubiMapa: ubis.get(opcion).getLugares().entrySet()) {
                i++;
                if (ubis.size()-1==i){
                    System.out.println(ubiMapa.getKey());
                }else
                    System.out.print(ubiMapa.getKey() + ", ");
            }
            opcion = direccionEle(opcion);
        }
        System.out.println(ubis.get(opcion).getDescripcion() + "\nSaliendo de la aventura.");
    }

    public static int direccionEle(int opc) {
        System.out.println("En que dirección quieres ir: ");
        String direccion = sc.next().toUpperCase();
        if (ubis.get(opc).getLugares().containsKey(direccion))
            return ubis.get(opc).getLugares().get(direccion);
        else{
            System.out.println("--No puedes ir en esa dirección--");
            return opc;
        }
    }

    public static void mapa(int opc) {
        if (opc==1){
            System.out.println("    -----------> Bosque         ^");
            System.out.println("   |               ^            | Norte");
            System.out.println("   |               |            |");
            System.out.println("   |               v");
            System.out.println("   v               🚩");
            System.out.println("Playa <-------- Montaña <--------> Edificio");
            System.out.println("   ^               ^");
            System.out.println("   |               |");
            System.out.println("   |               |");
            System.out.println("   |               v");
            System.out.println("    ------------ Puente");
        }else if (opc==2){
            System.out.println("     -----------> Bosque         ^");
            System.out.println("    |               ^            | Norte");
            System.out.println("    |               |            |");
            System.out.println("    |               |");
            System.out.println("    v               v");
            System.out.println("🚩Playa <-------- Montaña <--------> Edificio");
            System.out.println("    ^               ^");
            System.out.println("    |               |");
            System.out.println("    |               |");
            System.out.println("    |               v");
            System.out.println("     ------------ Puente");
        } else if (opc==3){
            System.out.println("    -----------> Bosque         ^");
            System.out.println("   |               ^            | Norte");
            System.out.println("   |               |            |");
            System.out.println("   |               |");
            System.out.println("   v               v");
            System.out.println("Playa <-------- Montaña <--------> Edificio🚩");
            System.out.println("   ^               ^");
            System.out.println("   |               |");
            System.out.println("   |               |");
            System.out.println("   |               v");
            System.out.println("    ------------ Puente");
            System.out.println("");
        }else if (opc==4){
            System.out.println("    -----------> Bosque         ^");
            System.out.println("   |               ^            | Norte");
            System.out.println("   |               |            |");
            System.out.println("   |               |");
            System.out.println("   v               v");
            System.out.println("Playa <-------- Montaña <--------> Edificio");
            System.out.println("   ^               ^");
            System.out.println("   |               |");
            System.out.println("   |               |");
            System.out.println("   |               v");
            System.out.println("    ------------ Puente");
            System.out.println("                   🚩");
        }else if (opc==5){
            System.out.println("                   🚩");
            System.out.println("    -----------> Bosque         ^");
            System.out.println("   |               ^            | Norte");
            System.out.println("   |               |            |");
            System.out.println("   |               |");
            System.out.println("   v               v");
            System.out.println("Playa <-------- Montaña <--------> Edificio");
            System.out.println("   ^               ^");
            System.out.println("   |               |");
            System.out.println("   |               |");
            System.out.println("   |               v");
            System.out.println("    ------------ Puente");
        }

    }
}
