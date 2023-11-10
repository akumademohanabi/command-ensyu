import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.println("Aさんの身長(m)、体重(kg)を記入してください。");
        double height1 = Double.parseDouble(sc.nextLine());
        double weight1 = Double.parseDouble(sc.nextLine());

	System.out.println("Bさんの身長(m)、体重(kg)を記入してください。");
	double height2 = Double.parseDouble(sc.nextLine());
	double weight2 = Double.parseDouble(sc.nextLine());


        double BMI = weight1 / (height1 * height1);
        String sv = String.format("%.2f", BMI);

	double BMI2 = weight2 / (height2 * height2);
	String sv2 = String.format("%.2f", BMI2);

        System.out.println("AさんのBMIは" + sv + "です。");
	System.out.println("BさんのBMIは" + sv2 + "です。");
    }
}
