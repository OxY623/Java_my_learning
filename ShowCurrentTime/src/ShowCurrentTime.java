/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 37533
 */
public class ShowCurrentTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long totalMiliseconds = System.currentTimeMillis();
        long totalSeconds = totalMiliseconds / 1000;
        long curentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long curentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long curentHours = totalHours % 24;
        
        System.out.println("Curent time is "+
                curentHours +" : "+ curentMinutes +
                " : "+ curentSecond+ " GMT");
    }
    
}
