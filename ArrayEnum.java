import java.util.Scanner;

enum Command {ADD, LIST, AVG, SUM, STD, QUIT, INVALID};

public class ArrayEnum {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        int[] values = new int[100];
        int index = 0;

        while(true){
            final Command command = getCommand(scanner);
            if(command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch(command){
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values, index);
                    break;
                case AVG:
                    System.out.printf("%.2f%n", getAvg(values, index));
                    break;
                case SUM:
                    System.out.printf("%d%n", getSum(values, index));
                    break;
                case STD:
                    System.out.printf("%.2f%n", getStd(values, index));
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
            }
        }
        scanner.close();
    }
    private static Command getCommand(Scanner scanner) {
        final String commandName = scanner.next();
        Command command;
        final String CommandName = commandName.toUpperCase();
        if(!CommandName.equals("ADD") && !CommandName.equals("LIST") && !CommandName.equals("AVG") && !CommandName.equals("SUM") && !CommandName.equals("STD") && !CommandName.equals("QUIT")) {
            command = Command.INVALID;
        }
        else {
            command = Command.valueOf(commandName.toUpperCase());
        }
        return command;
    }

    private static int getValue(Scanner scanner) {
        final int value = scanner.nextInt();
        return value;
    }

    private static void printList(int[] values, int index) {
        for(int i=0; i<=index-1; i++) {
            System.out.printf("%d ", values[i]);
        }
    }

    private static float getAvg(int values[], int index) {
        float sum = 0;

        for(int i=0; i<=index; i++) {
            sum = sum + values[i];
        }

        float avg = sum/index;

        return avg;
    }

    private static int getSum(int values[],int index) {
        int sum = 0;

        for(int i=0; i<=index; i++) {
            sum = sum + values[i];
        }

        return sum;
    }

    private static double getStd(int values[], int index) {
        double sum = 0;

        for(int i=0; i<=index; i++) {
            sum = sum + values[i];
        }

        double avg = sum/index;

        double stdsum = 0;
        for(int j=0; j<=index-1; j++) {
            stdsum = stdsum + Math.pow((values[j]-avg), 2);
        }

        double std = Math.sqrt(stdsum/index);

        return std;
    }
}
