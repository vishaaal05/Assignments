public class Pwskills {
    public static void main(String[] args) {
        int n = 7;

        // CODE FOR PATTERN "P"  *****************************************
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) / 2
                        || i == (n - 1) / 4 && j == (n - 2) / 2 + 2 || i == (n - 1) / 4 + 1 && j == (n - 2) / 2 + 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // CODE FOR PATTERN "W"  *****************************************
             System.out.print(" ");

            for (int j = 0; j < n; j++) {
                if (j==0 || i+j==(n-1)&& i>=(n-1)/2 || i-j==0 && i>=(n-1)/2 || j==(n-1) ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
// CODE FOR PATTERN "S"  *****************************************
            System.out.print("      ");
            for (int j = 0; j < n; j++) {
                if (i==0 && j<=(n-1)/2 && j>0 || j==0 && i==(n-1)/4  || j==0 && i==(n-1)/4 +1 || i==(n-1)/2 && j>0 && j<=(n-1)/2 || i==(n-1) && j>=0 && j<=(n-1)/2 || j==(n-1)/2 +1 && i>(n-1)/2 && i<(n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
// CODE FOR PATTERN "K"  *****************************************
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j==0 || i+j==(n-1)/2 || i-j==(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
// CODE FOR PATTERN "I"  *****************************************
            System.out.print("");
            for (int j = 0; j < n; j++) {
                if (j==(n-1)/2 || i==0 || i==(n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
// CODE FOR PATTERN "L"  *****************************************
            System.out.print("   ");
            for (int j = 0; j < n; j++) {
                if (j==0 || i==(n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
// CODE FOR PATTERN "L"  *****************************************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j==0 || i==(n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
// CODE FOR PATTERN "S"  *****************************************
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i==0 && j<=(n-1)/2 && j>0 || j==0 && i==(n-1)/4  || j==0 && i==(n-1)/4 +1 || i==(n-1)/2 && j>0 && j<=(n-1)/2 || i==(n-1) && j>=0 && j<=(n-1)/2 || j==(n-1)/2 +1 && i>(n-1)/2 && i<(n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}