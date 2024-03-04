package org.example.chapter2;

import java.util.ArrayList;
import java.util.List;

public class IntentionRevealingNames {
    // Hard to tell what is the purpose of this code
    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }

    // Adding more meaning to the code with proper naming
    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<>();
        for (int[] cell : gameBoard)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }

    // Going further by writing a class instead of using the array of ints
    public List<Cell> getFlaggedCells2() {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoard)
            if (cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
