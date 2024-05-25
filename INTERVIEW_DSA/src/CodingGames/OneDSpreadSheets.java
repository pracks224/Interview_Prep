package CodingGames;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OneDSpreadSheets {

    private static Map<Integer, Integer> cellMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] inputs = new String[N];
        for (int i = 0; i < N; i++) {
            String operation = in.next();
            String arg1 = in.next();
            String arg2 = in.next();
            inputs[i] = operation + " " + arg1 + " " + arg2;
        }
        for (int i = 0; i < N; i++) {
            int cellValue = findCellValue(inputs, i);
            System.out.println(cellValue);
        }
    }

    private static int findCellValue(String[] input, int cellIndex) {
        if (cellMap.containsKey(cellIndex)) {
            return cellMap.get(cellIndex);
        }
        String[] cellData = input[cellIndex].split(" ");
        String operation = cellData[0];
        if (operation.equals("VALUE")) {
            int arg1 = Integer.parseInt(cellData[1]);
            cellMap.put(cellIndex, arg1);
            return arg1;
        } else if (operation.equals("ADD")) {
            int arg1 = scanExpression(cellData[1]);
            int arg2 = scanExpression(cellData[2]);
            cellMap.put(cellIndex, arg1 + arg2);
            return arg1 + arg2;
        }
        return 0;
    }

    private static int scanExpression(String expression) {
        if (expression.startsWith("$")) {
            int key = Integer.parseInt(expression.substring(1));
            return cellMap.get(key);
        } else {
            return Integer.parseInt(expression);
        }
    }
}
