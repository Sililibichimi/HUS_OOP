package oop_hus.lab3;

import java.util.Scanner;

public class NestedLoopsExercise {

    public static void main(String[] args) {


//        testSquarePattern();
//        testCheckeredPattern();
//        testTimeTable();
//        testTriangularPattern();
//        testBoxPattern();
//        testHillPattern();
    }

    static void testSquarePattern() {
        System.out.print("Enter the size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        squarePattern(size);
    }

    static void squarePattern(int size) {
        for (int row = 0; row < size; ++row) {
            for (int col = 0; col < size; ++col) {
                System.out.print("# ");
            }
            System.out.println();
        }
        // using while-do loops
        /*int row = 0,col;
        while(row < size){
            col = 0;
            while(col < size){
                System.out.print("# ");
                ++col;
            }
            System.out.println();
            ++row;
        }*/
    }

    static void testCheckeredPattern() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        checkeredPattern(size);
    }

    static void checkeredPattern() {
    }

    static void checkeredPattern(int size) {
        for (int row = 0; row < size; ++row) {
            for (int col = 0; col < size; ++col) {
                if ((row) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }

    static void testTimeTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        timeTable(n);
    }

    static void timeTable() {
    }

    static void timeTable(int n) {
        System.out.printf("%4c | ", '*');
        for (int col = 1; col <= n; ++col) {
            System.out.printf("%4d ", col);
        }

        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4s__", "");
        }
        System.out.println();

        for (int row = 1; row <= n; ++row) {
            System.out.printf("%4d | ", row);
            for (int col = 1; col <= n; ++col) {
                System.out.printf("%4d ", row * col);
            }
            System.out.println();
        }
    }

    static void testTriangularPattern() {
        System.out.print("Enter the size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        triangularPatternA(size);
        triangularPatternB(size);
        triangularPatternC(size);
        triangularPatternD(size);
    }

    static void triangularPattern() {
    }

    static void triangularPatternA(int size) {
        for (int row = 0; row < size; ++row) {
            for (int col = 0; col < size; ++col) {
                if (col <= row) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    static void triangularPatternB(int size) {
        for (int row = 0; row < size; ++row) {
            for (int col = 0; col < size; ++col) {
                if (col <= size - 1 - row) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    static void triangularPatternC(int size) {
        for (int row = 0; row < size; ++row) {
            for (int col = 0; col < size; ++col) {
                if (col >= row) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void triangularPatternD(int size) {
        for (int row = 0; row < size; ++row) {
            for (int col = 0; col < size; ++col) {
                if (col >= size - 1 - row) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void testBoxPattern() {
        System.out.print("Enter the size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boxPatternA(size);
        boxPatternB(size);
        boxPatternC(size);
        boxPatternD(size);
    }

    static void boxPattern() {
    }

    static void boxPatternA(int size) {
        //     A
        for (int row = 0; row < size; ++row) {
            for (int col = 0; col < size; ++col) {
                if (row == 0 || row == size - 1 || col == 0 || col == size - 1) {
                    System.out.print("#  ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void boxPatternB(int size) {
        for (int row = 0; row < size; ++row) {
            for (int col = 0; col < size; ++col) {
                if (row == 0 || row == size - 1 || row == col) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    static void boxPatternC(int size) {
        for (int row = 0; row < size; ++row) {
            for (int col = 0; col < size; ++col) {
                if (row == 0 || row == size - 1 || col == 0 || col == size - 1) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    static void boxPatternD(int size) {
        for (int row = 0; row < size; ++row) {
            for (int col = 0; col < size; ++col) {
                if (row == 0 || row == size - 1 || col == size - 1 - row) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }


    static void testHillPattern() {
        System.out.print("Enter the row : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        hillPatternA(size);
        hillPatternB(size);
        hillPatternC(size);
        hillPatternD(size);
    }

    static void hillPattern() {
    }

    static void hillPatternA(int numberOfRows) {
        for (int row = 0; row < numberOfRows; ++row) {
            for (int col = 0; col < numberOfRows * 2 - 1; ++col) {
                if (col >= numberOfRows - 1 - row && col <= numberOfRows - 1 + row) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    static void hillPatternB(int numberOfRows) {
        for (int row = 0; row < numberOfRows; ++row) {
            for (int col = 0; col < numberOfRows * 2 - 1; ++col) {
                if (col >= row && col <= numberOfRows * 2 - 2 - row) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    static void hillPatternC(int numberOfRows) {
        hillPatternA(numberOfRows);
        hillPatternB(numberOfRows);
    }

    static void hillPatternD(int numberOfRows) {
        for (int row = 0; row < numberOfRows * 2 - 1; ++row) {
            for (int col = 0; col < numberOfRows * 2 - 1; ++col) {
                if (row < numberOfRows) {
                    if (col >= numberOfRows + 1 - row - 1 && col <= numberOfRows - 1 + row - 1) {
                        System.out.print("   ");
                    } else {
                        System.out.print("#  ");
                    }
                } else {
                    if (col >= row - numberOfRows + 2 && col <= numberOfRows * 3 - 4 - row) {
                        System.out.print("   ");
                    } else {
                        System.out.print("#  ");
                    }
                }
            }
            System.out.println();
        }
    }

}
