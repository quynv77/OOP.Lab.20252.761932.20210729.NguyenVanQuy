package HW64;

import java.util.*;

public class baitap64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = -1;
        int year = -1;

        // 🔁 Nhập tháng (validate)
        while (month == -1) {
            System.out.print("Enter month: ");
            String input = sc.nextLine().toLowerCase().replace(".", "").trim();

            month = parseMonth(input);
            if (month == -1) {
                System.out.println("❌ Invalid month, please enter again!");
            }
        }

        // 🔁 Nhập năm (validate)
        while (true) {
            System.out.print("Enter year: ");
            try {
                year = Integer.parseInt(sc.nextLine());
                if (year >= 0) break;
            } catch (Exception e) {}

            System.out.println("❌ Invalid year, please enter again!");
        }

        // 📆 Tính số ngày
        int days = getDays(month, year);

        System.out.println("👉 Month " + month + " in year " + year + " has " + days + " days.");
    }

    // 🧩 Convert input → tháng
    public static int parseMonth(String m) {
        switch (m) {
            case "1": case "jan": case "january": return 1;
            case "2": case "feb": case "february": return 2;
            case "3": case "mar": case "march": return 3;
            case "4": case "apr": case "april": return 4;
            case "5": case "may": return 5;
            case "6": case "jun": case "june": return 6;
            case "7": case "jul": case "july": return 7;
            case "8": case "aug": case "august": return 8;
            case "9": case "sep": case "sept": case "september": return 9;
            case "10": case "oct": case "october": return 10;
            case "11": case "nov": case "november": return 11;
            case "12": case "dec": case "december": return 12;
            default: return -1;
        }
    }

    // 📊 Lấy số ngày trong tháng
    public static int getDays(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    // 🌟 Kiểm tra năm nhuận (leap year)
    public static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}