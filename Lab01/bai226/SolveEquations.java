import javax.swing.JOptionPane;

public class SolveEquations {
    public static void main(String[] args) {

        // ===== 1. PHƯƠNG TRÌNH BẬC NHẤT =====
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a (ax + b = 0):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));

        String result1;
        if (a == 0) {
            if (b == 0) result1 = "Infinite solutions";
            else result1 = "No solution";
        } else {
            double x = -b / a;
            result1 = "x = " + x;
        }

        JOptionPane.showMessageDialog(null, "Linear equation result:\n" + result1);


        // ===== 2. HỆ PHƯƠNG TRÌNH =====
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12:"));
        double b1  = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));

        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22:"));
        double b2  = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));

        double D  = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        String result2;
        if (D == 0) {
            if (D1 == 0 && D2 == 0)
                result2 = "Infinite solutions";
            else
                result2 = "No solution";
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            result2 = "x1 = " + x1 + ", x2 = " + x2;
        }

        JOptionPane.showMessageDialog(null, "Linear system result:\n" + result2);


        // ===== 3. PHƯƠNG TRÌNH BẬC HAI =====
        double a2 = Double.parseDouble(JOptionPane.showInputDialog("Enter a (ax^2 + bx + c = 0):"));
        double b2_q = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter c:"));

        String result3;

        if (a2 == 0) {
            // trở thành bậc nhất
            if (b2_q == 0) {
                if (c == 0) result3 = "Infinite solutions";
                else result3 = "No solution";
            } else {
                double x = -c / b2_q;
                result3 = "x = " + x;
            }
        } else {
            double delta = b2_q * b2_q - 4 * a2 * c;

            if (delta < 0) {
                result3 = "No real solution";
            } else if (delta == 0) {
                double x = -b2_q / (2 * a2);
                result3 = "Double root x = " + x;
            } else {
                double x1 = (-b2_q + Math.sqrt(delta)) / (2 * a2);
                double x2 = (-b2_q - Math.sqrt(delta)) / (2 * a2);
                result3 = "x1 = " + x1 + ", x2 = " + x2;
            }
        }

        JOptionPane.showMessageDialog(null, "Quadratic equation result:\n" + result3);

        System.exit(0);
    }
}