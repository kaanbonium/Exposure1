package Lab03;

public class Lab03 {
    public static void main(String[] args) {
        System.out.println("Lab03, 100 Point Version\n");

        int milliseconds = 10000123;
        int hours = milliseconds / 3600000;
        int remainder = milliseconds % 3600000;
        int minutes = remainder / 60000;
        int seconds = (remainder % 60000) / 1000;
        int miliseconds = milliseconds % 1000;

        System.out.println("Starting milli-seconds: \t" + milliseconds);
        System.out.println("Hours: \t\t\t\t\t\t" + hours);
        System.out.println("Minutes: \t\t\t\t\t" + minutes);
        System.out.println("Seconds: \t\t\t\t\t" + seconds);
        System.out.println("Milli Seconds: \t\t\t\t" + miliseconds);



    }

}