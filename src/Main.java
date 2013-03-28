import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Bведите x1: ");
        Double x1 = Double.parseDouble(br.readLine());
        System.out.print("Bведите x2: ");
        Double x2 = Double.parseDouble(br.readLine());
        System.out.print("Введите y1: ");
        Double y1 = Double.parseDouble(br.readLine());
        System.out.print("Введите y2: ");
        Double y2 = Double.parseDouble(br.readLine());
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.printf("Координаты: (%f, %f, %f, %f)", p1.getX(), p1.getY(), p2.getX(), p2.getY());

        System.out.printf("Сторона d : (%f, )", p1.getDistanceTo(p2));

    }
}
