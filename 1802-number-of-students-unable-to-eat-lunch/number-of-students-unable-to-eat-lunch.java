import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circle = 0, square= 0;
        for (int student : students) {
            if (student == 1)
                square++;
            else
                circle++;
        }
        for (int sandwich : sandwiches) {
            if (sandwich == 1) {
                if (square > 0)
                    square--;
                else
                    break;
            }
            if (sandwich == 0) {
                if (circle > 0)
                    circle--;
                else
                    break;
            }
        }
        return square + circle;
    }
}
