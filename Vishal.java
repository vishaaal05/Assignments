public class Vishal {
    public static void main(String[] args) {
        int n = 13;
        // CODE FOR PATTERN "V" **************************************
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i - j == 0 && i <= (n - 1) / 2 || i + j == (n - 1) && i <= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("");

            // CODE FOR PATTERN "I" **************************************

            for (int j = 0; j < n; j++) {
                if (j == (n - 1) / 2 && i <= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print(" ");
            // CODE FOR PATTERN "S" **************************************
            for (int j = 0; j < n; j++) {
                if (i == 0 && j <= (n - 1) / 4 && j > 0 || j == 0 && i == (n - 1) / 8 || j == 0 && i == (n - 1) / 8 + 1
                        || i == (n - 1) / 4 && j > 0 && j <= (n - 1) / 4
                        || i == (n - 1) / 2 && j >= 0 && j <= (n - 1) / 4
                        || j == (n - 1) / 4 + 1 && i > (n - 1) / 4 && i < (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("");
            // CODE FOR PATTERN "H" **************************************
            for (int j = 0; j < n; j++) {
                if (j == 0 && i <= (n - 1) / 2 || j == (n - 1) && i <= (n - 1) / 2 || i == (n - 1) / 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");
            // CODE FOR PATTERN "A" **************************************
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) / 4 - 1 || j == 0 && i <= (n - 1) / 2 || j == (n - 1) && i <= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.print("   ");
            // CODE FOR PATTERN "L" **************************************
            for (int j = 0; j < n; j++) {
                if (j == 0 && i <= (n - 1) / 2 || i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
