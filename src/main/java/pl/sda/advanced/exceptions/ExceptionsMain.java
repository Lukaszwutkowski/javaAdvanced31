package pl.sda.advanced.exceptions;

public class ExceptionsMain {

    public static void main(String[] args) {

        System.out.println(method1("Ania"));
        System.out.println(method1("5"));
        try {
            System.out.println(method3("abc"));
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(method5("cba"));
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println("Jeszcze jedna linijka");

    }

    public static Integer method1(String text) {
        return method2(text);
    }

    public static Integer method2(String text) {
        try {
            return Integer.parseInt(text); // W tym miejscu zostanie rzucony wyjatek
        } catch (NumberFormatException exception) {
            System.out.println("Wystapil blad " + exception.getMessage());
            return null;
        } finally {               // uruchamia sie zawsze na koncu
           // return 7;
            System.out.println("Blok finally"); // To miejsce potrzebne jest aby posprzatac np po polaczeniach do bazy danych
        }
    }
 // 1 wersja delegowanie oblsugi wyzej
    public static Integer method3(String text) throws MyException{
        if (text.contains("a")) {
            throw new MyException("Slowo zawiera litere a");
        }
        return Integer.parseInt(text);
    }
// 2 wersja obsluga od razu
    public static Integer method4(String text) {
        try {
            if (text.contains("a")) {
                throw new MyException("Slowo zawiera litere a");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
        return Integer.parseInt(text);
    }

    public static Integer method5(String text) throws MyException{
        if (text.contains("a")) {
            throw new MyException("Slowo zawiera litere a");
        }
        return Integer.parseInt(text);
    }


}
