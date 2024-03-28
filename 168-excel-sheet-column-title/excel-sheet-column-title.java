public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char c = (char) ('A' + columnNumber % 26);
            result.insert(0, c);
            columnNumber /= 26;
        }
        return result.toString();
    }
    //  StringBuilder columnName = new StringBuilder();
        
    //     while (columnNumber > 0) {
    //         int rem = columnNumber % 26;

    //         if (rem == 0) {
    //             columnName.append("Z");
    //             columnNumber = (columnNumber / 26) - 1;
    //         } else {
    //             columnName.append((char)((rem - 1) + 'A'));
    //             columnNumber = columnNumber / 26;
    //         }
    //     }

    //     return columnName.reverse().toString();
    // }
}