import java.util.Scanner;

public class NumberBaseConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMainMenu();
            int mainChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (mainChoice) {
                case 1:
                    binaryConversions(scanner);
                    break;
                case 2:
                    decimalConversions(scanner);
                    break;
                case 3:
                    hexadecimalConversions(scanner);
                    break;
                case 4:
                    octalConversions(scanner);
                    break;
                case 5:
                    displayProgramUsage();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }

    public static void displayMainMenu() {
        System.out.println("\nComputer Science Converter");
        System.out.println("1. Binary Conversions");
        System.out.println("2. Decimal Conversions");
        System.out.println("3. Hexadecimal Conversions");
        System.out.println("4. Octal Conversions");
        System.out.println("5. Program Usage");
        System.out.println("6. Exit");
    }

    public static void displayBinaryMenu() {
        System.out.println("\nBinary Conversions");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Binary to Hexadecimal");
        System.out.println("3. Binary to Octal");
        System.out.println("4. Back to Main Menu");
    }

    public static void displayDecimalMenu() {
        System.out.println("\nDecimal Conversions");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Decimal to Hexadecimal");
        System.out.println("3. Decimal to Octal");
        System.out.println("4. Back to Main Menu");
    }

    public static void displayHexadecimalMenu() {
        System.out.println("\nHexadecimal Conversions");
        System.out.println("1. Hexadecimal to Decimal");
        System.out.println("2. Hexadecimal to Binary");
        System.out.println("3. Hexadecimal to Octal");
        System.out.println("4. Back to Main Menu");
    }

    public static void displayOctalMenu() {
        System.out.println("\nOctal Conversions");
        System.out.println("1. Octal to Decimal");
        System.out.println("2. Octal to Binary");
        System.out.println("3. Octal to Hexadecimal");
        System.out.println("4. Back to Main Menu");
    }

    public static void displayProgramUsage() {
        System.out.println("\nProgram Usage:");
        System.out.println("This program allows you to convert numbers between different bases commonly used in computer science:");
        System.out.println("1. Binary: Base 2");
        System.out.println("2. Decimal: Base 10");
        System.out.println("3. Hexadecimal: Base 16");
        System.out.println("4. Octal: Base 8");
        System.out.println("\nYou can choose from the main menu to convert numbers between these bases.");
        System.out.println("Each sub-menu provides options for specific conversions within that number system.");
        System.out.println("Simply follow the prompts to input your number and get the converted result.");
        System.out.println("Error handling is included to guide you if you enter an invalid number.");
        System.out.println("\nSelect 'Back to Main Menu' from any sub-menu to return to the main menu.");
        System.out.println("Select 'Exit' from the main menu to close the program.");
    }

    public static void binaryConversions(Scanner scanner) {
        while (true) {
            displayBinaryMenu();
            int binaryChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (binaryChoice) {
                case 1:
                    System.out.print("Enter a binary number: ");
                    String binaryStr = scanner.nextLine();
                    try {
                        int decimalNum = Integer.parseInt(binaryStr, 2);
                        System.out.println("Binary " + binaryStr + " in Decimal is " + decimalNum);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid binary number");
                    }
                    break;
                case 2:
                    System.out.print("Enter a binary number: ");
                    binaryStr = scanner.nextLine();
                    try {
                        int decimalNum = Integer.parseInt(binaryStr, 2);
                        String hexStr = Integer.toHexString(decimalNum).toUpperCase();
                        System.out.println("Binary " + binaryStr + " in Hexadecimal is " + hexStr);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid binary number");
                    }
                    break;
                case 3:
                    System.out.print("Enter a binary number: ");
                    binaryStr = scanner.nextLine();
                    try {
                        int decimalNum = Integer.parseInt(binaryStr, 2);
                        String octalStr = Integer.toOctalString(decimalNum);
                        System.out.println("Binary " + binaryStr + " in Octal is " + octalStr);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid binary number");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    public static void decimalConversions(Scanner scanner) {
        while (true) {
            displayDecimalMenu();
            int decimalChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (decimalChoice) {
                case 1:
                    System.out.print("Enter a decimal number: ");
                    String decimalStr = scanner.nextLine();
                    try {
                        int decimalNum = Integer.parseInt(decimalStr);
                        String binaryStr = Integer.toBinaryString(decimalNum);
                        System.out.println("Decimal " + decimalStr + " in Binary is " + binaryStr);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid decimal number");
                    }
                    break;
                case 2:
                    System.out.print("Enter a decimal number: ");
                    decimalStr = scanner.nextLine();
                    try {
                        int decimalNum = Integer.parseInt(decimalStr);
                        String hexStr = Integer.toHexString(decimalNum).toUpperCase();
                        System.out.println("Decimal " + decimalStr + " in Hexadecimal is " + hexStr);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid decimal number");
                    }
                    break;
                case 3:
                    System.out.print("Enter a decimal number: ");
                    decimalStr = scanner.nextLine();
                    try {
                        int decimalNum = Integer.parseInt(decimalStr);
                        String octalStr = Integer.toOctalString(decimalNum);
                        System.out.println("Decimal " + decimalStr + " in Octal is " + octalStr);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid decimal number");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    public static void hexadecimalConversions(Scanner scanner) {
        while (true) {
            displayHexadecimalMenu();
            int hexChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (hexChoice) {
                case 1:
                    System.out.print("Enter a hexadecimal number: ");
                    String hexStr = scanner.nextLine();
                    try {
                        int decimalNum = Integer.parseInt(hexStr, 16);
                        System.out.println("Hexadecimal " + hexStr + " in Decimal is " + decimalNum);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid hexadecimal number");
                    }
                    break;
                case 2:
                    System.out.print("Enter a hexadecimal number: ");
                    hexStr = scanner.nextLine();
                    try {
                        int decimalNum = Integer.parseInt(hexStr, 16);
                        String binaryStr = Integer.toBinaryString(decimalNum);
                        System.out.println("Hexadecimal " + hexStr + " in Binary is " + binaryStr);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid hexadecimal number");
                    }
                    break;
                case 3:
                    System.out.print("Enter a hexadecimal number: ");
                    hexStr = scanner.nextLine();
                    try {
                        int decimalNum = Integer.parseInt(hexStr, 16);
                        String octalStr = Integer.toOctalString(decimalNum);
                        System.out.println("Hexadecimal " + hexStr + " in Octal is " + octalStr);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid hexadecimal number");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    public static void octalConversions(Scanner scanner) {
        while (true) {
            displayOctalMenu();
            int octalChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (octalChoice) {
                case 1:
                    System.out.print("Enter an octal number: ");
                    String octalStr = scanner.nextLine();
                    try {
                        int decimalNum = Integer.parseInt(octalStr, 8);
                        System.out.println("Octal " + octalStr + " in Decimal is " + decimalNum);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid octal number");
                    }
                    break;
                case 2:
                    System.out.print("Enter an octal number: ");
                    octalStr = scanner.nextLine();
                    try {
                        int decimalNum = Integer.parseInt(octalStr, 8);
                        String binaryStr = Integer.toBinaryString(decimalNum);
                        System.out.println("Octal " + octalStr + " in Binary is " + binaryStr);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid octal number");
                    }
                    break;
                case 3:
                    System.out.print("Enter an octal number: ");
                    octalStr = scanner.nextLine();
                    try {
                        int decimalNum = Integer.parseInt(octalStr, 8);
                        String hexStr = Integer.toHexString(decimalNum).toUpperCase();
                        System.out.println("Octal " + octalStr + " in Hexadecimal is " + hexStr);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid octal number");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}

