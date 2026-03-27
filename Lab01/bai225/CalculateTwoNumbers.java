import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;

        // Nhập số thứ nhất
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number:", "Input",
                JOptionPane.INFORMATION_MESSAGE);

        // Nhập số thứ hai
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number:", "Input",
                JOptionPane.INFORMATION_MESSAGE);

        // Chuyển sang double
        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);

        // Tính toán
        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;

        String result = "Sum: " + sum +
                        "\nDifference: " + diff +
                        "\nProduct: " + prod;

        // Kiểm tra chia cho 0
        if (num2 != 0) {
            double quotient = num1 / num2;
            result += "\nQuotient: " + quotient;
        } else {
            result += "\nQuotient: Cannot divide by 0";
        }

        // Hiển thị kết quả
        JOptionPane.showMessageDialog(null, result,
                "Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}