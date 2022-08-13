import java.io.IOException;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        Scanner s = new Scanner(System.in);

        String[] dia1 = s.nextLine().split(" ");
        String[] horario1 = s.nextLine().split(" : ");
        String[] dia2 = s.nextLine().split(" ");
        String[] horario2 = s.nextLine().split(" : ");

        int diaInicial = Integer.parseInt(dia1[1]);
        int diaFinal = Integer.parseInt(dia2[1]);
        int horaInicial = Integer.parseInt(horario1[0]);
        int horaFinal = Integer.parseInt(horario2[0]);
        int minutoInicial = Integer.parseInt(horario1[1]);
        int minutoFinal = Integer.parseInt(horario2[1]);
        int segundoInicial = Integer.parseInt(horario1[2]);
        int segundoFinal = Integer.parseInt(horario2[2]);

        int difDia, difHora, difMin, difSeg;

        difDia = diaFinal - diaInicial;

        if(horaFinal < horaInicial){
            horaFinal += 24 ;
            difDia --;
        }

        difHora = horaFinal - horaInicial;

        if(minutoFinal < minutoInicial){
            minutoFinal += 60;
            if(difHora == 0){
                difHora = 24;
                difDia --;
            }
            difHora --;
        }
        
        difMin = minutoFinal - minutoInicial;

        if(segundoFinal < segundoInicial){
            segundoFinal += 60;
            difMin --;
        }
        difSeg = segundoFinal - segundoInicial;

        System.out.println(difDia +" dia(s)");
        System.out.println(difHora +" hora(s)");
        System.out.println(difMin +" minuto(s)");
        System.out.println(difSeg +" segundo(s)");
    }
}
