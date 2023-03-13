
package boletin22;
import com.sandra.datos.PedirDatos;

public class Liga {
    
    private Equipos equipos[] = new Equipos[20];
    
    public void setEquipos(Equipos equipos[]){
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Liga{" + "equipos=" + equipos + '}';
    }
    
    public void mostrarTabla(){
       System.out.print("Equipo/jornada		");
        for (int i = 0; i < equipos[0].getGoles().length; i++) {
            System.out.print("X" + (i + 1) + "	");

        }
        System.out.print("Total Goles");
        System.out.println();
        for (int i = 0; i < equipos.length; i++) {
            System.out.print(equipos[i].getNombre());
            System.out.print("			");
            //System.out.println(Arrays.toString(equipos[i].getGoles()));
            for (int j = 0; j < equipos[i].getGoles().length; j++) {
                System.out.print(equipos[i].getGoles()[j]);
                System.out.print("	");
            }
            System.out.print(equipos[i].getTotalGoles());
            System.out.println();
        }
    }
    
    public void listarOrdenAscendente(){
        System.out.println("Lista: ");
        for (int i = 0; i < equipos.length - 1; i++) {
            for (int j = 0; j < equipos.length; j++) {
                if(equipos[i].getTotalGoles() > equipos[j].getTotalGoles()){
                    Equipos aux = equipos[i];
                    equipos[i] = equipos[j];
                    equipos[j] = aux;
                }
            }
        }
        for (int i = 0; i < equipos.length; i++) {
            System.out.println(equipos[i].getNombre() + "		" + equipos[i].getTotalGoles());
        }
    }
    
    public void equipoMasGolesJornada(){
        int numJornadas = equipos[0].getGoles().length;
        for (int i = 0; i < numJornadas; i++) {
            String equipoGoleador = null;
            int golMasAlto = -1;
            for (int j = 0; j < equipos.length; j++) {
                int golesEquipo[] = equipos[j].getGoles();
                int golesEquipoJornada = golesEquipo[i];
                if(golesEquipoJornada > golMasAlto){
                    golMasAlto = golesEquipoJornada;
                    equipoGoleador = equipos[j].getNombre();
                }
            }
            System.out.println(equipoGoleador + "marco mas goles en la jornada " + i+1 + "con " + golMasAlto + "goles");
        }
        
    }
    
    public void masGoles(){
        int numJornadas = equipos[0].getGoles().length;
        String equipoGoleador = null;
        int golMasAlto = -1;
        int jornadaMasAlta = -1;
        for (int i = 0; i < numJornadas; i++) {
            for (int j = 0; j < equipos.length; j++) {
                int golesEquipo[] = equipos[j].getGoles();
                int golesEquipoJornada = golesEquipo[i];
                if(golesEquipoJornada > golMasAlto){
                    golMasAlto = golesEquipoJornada;
                    equipoGoleador = equipos[j].getNombre();
                    jornadaMasAlta= i+1;
                }
            }
        }
        System.out.println(equipoGoleador + "marco mas goles con " + golMasAlto + "en la jornada " + jornadaMasAlta);
    }
    
    public void consultaEquipoJornada(){
        String nombreEquipo = PedirDatos.pedirString("Nombre equipo: ");
        int jornada = PedirDatos.pedirInt("Numero jornada: ");
        for (int i = 0; i < equipos.length; i++) {
            if(equipos[i].getNombre().equalsIgnoreCase(nombreEquipo)){
                int jornadas[] = equipos[i].getGoles();
                System.out.println("Los goles de " + nombreEquipo + "en la jornada " + jornada + "fueron " + jornadas[jornada-1]);
            }
        }
    }
}

