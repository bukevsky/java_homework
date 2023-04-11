public class Seconds_Converter {
    public static void main(String[] args) {
        int seconds = 1000000;
        int days = seconds / 86400;
        int hours = (seconds - (days * 86400)) / 3600;
        int minute = (seconds - (days * 86400) - (hours * 3600)) / 60;
        int seconds_last = seconds - (days * 86400) - (hours * 3600) - (minute * 60);
        System.out.println("Всего секунд: " + seconds);
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minute);
        System.out.println("Секунд: " + seconds_last);

    }
}
