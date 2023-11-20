import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int count = 0;
        while (true) {
            System.out.println("Введите путь к файлу: ");
            String path = new Scanner(System.in).nextLine(); // ввод пути к файлу
            File file = new File(path);
            if (path.equals("0")){ // выход из цикла
                break;
            }
            boolean fileExists = file.exists(); // указан ли путь к файлу (true если да, false, если нет) isFile(проверяет именно файл)
            boolean isDirectory = file.isDirectory(); //является ли путь к папке
            if (fileExists && !isDirectory) {
                count++;
                System.out.println("Путь к файлу указан верно ");
                System.out.println("Это файл "+path+" № " + count);
            } else {
                System.out.println("Путь указан неверно или файл не существует " + path);
            }
        }
    }
}
