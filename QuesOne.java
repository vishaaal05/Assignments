public class QuesOne {
    public static void main(String[] args) {
        // CODE FOR PATTERN "A"******************************************:
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < n - 1 || j == 0 && i > 0 || i == (n - 1) / 2 || j == n - 1 && i > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            // CODE FOR PATTERN "B"******************************************:
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) / 2 || j == (n - 1) / 2 && i > 0 && i < (n - 1) / 2
                        || i == (n - 1) / 2 && j < (n - 1) / 2 || i == (n - 1) && j < (n - 1) / 2
                        || j == (n - 1) / 2 && i > (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("");

            // CODE FOR PATTERN "C"******************************************:
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            // CODE FOR PATTERN "D"******************************************:

            for (int j = 0; j < n; j++) {
                if (i == 0 && j < n - 1 || j == 0 || i == n - 1 && j < n - 1 || j == n - 1 && i > 0 && i < n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            // CODE FOR PATTERN "E"******************************************:

            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == (n - 1) / 2 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            // CODE FOR PATTERN "E"******************************************:

            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            // CODE FOR PATTERN "G"******************************************:
            for (int j = 0; j < n; j++) {
                if (i == 0 && j >= (n - 1) / 2 || i + j == (n - 1) / 3 || j == 0 && i == (n - 1) / 2
                        || i - j == (n - 1) - 3 || i == (n - 1) && j == (n - 1) / 2 && j >= (n - 1) / 2 - 1
                        || j == (n - 1) / 2 && i >= (n - 1) / 2 || i == (n - 1) / 2 && j > (n - 1) / 2
                        || j == (n - 1) && i >= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            // CODE FOR PATTERN "H"******************************************:

            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            // CODE FOR PATTERN "I"******************************************:

            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) || j == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}