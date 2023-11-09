import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("身長(m)、体重(㎏)を表記してください。");
        Scanner sc = new Scanner(System.in);
        double height = Double.parseDouble(sc.nextLine());
        double weight = Double.parseDouble(sc.nextLine());

        double BMI = weight / (height * height);
        String sv = String.format("%.2f", BMI);

        System.out.println("あなたのBMIは" + sv + "です。");
    }
}