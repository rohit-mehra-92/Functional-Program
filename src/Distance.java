public class Distance {

    public static void main(String[] args) {

        float x = Integer.parseInt(args[0]);
        float y = Integer.parseInt(args[1]);

        double distance = Math.sqrt(x * x + y * y);
        System.out.println("Distance between the line is: " + distance);

    }
}


