
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SchoolService schoolService= new SchoolServiceHandler();
        boolean running = true;
        while (running) {
            System.out.println("Məktəb sistemi:");
            System.out.println("1. Yeni sinif əlavə et");
            System.out.println("2. Sinfə tələbə əlavə et");
            System.out.println("3. Sinifin telebelerini göstər");
            System.out.println("4. Çıxış");
            System.out.print("Seçiminizi daxil edin (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Sinif adını daxil edin: ");
                    String className = scanner.next();
                    schoolService.addClass(new Classroom(className));
                    break;

                case 2:
                    System.out.print("Sinif adını daxil edin: ");
                    String className2 = scanner.next();
                    System.out.println("Telebenin ID daxil et");
                    Integer id = scanner.nextInt();
                    System.out.print("Tələbənin adını daxil edin: ");
                    String studentName = scanner.next();
                    schoolService.addStudent(className2, id, studentName);
                    break;

                case 3:
                    System.out.print("Sinif adını daxil edin: ");
                    String className3 = scanner.next();
                    System.out.println(schoolService.getClassStudents(className3));


                    break;

                case 4:
                    running = false;
                    System.out.println("Çıxış edilir...");
                    break;

                default:
                    System.out.println("Yanlış seçim! Yenidən cəhd edin.");
                    break;
            }
        }


    }
}
