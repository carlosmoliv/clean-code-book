package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

class DtaRcrd102 {
    private Date generationTimestamp;
    private Date modificationTimestamp;
    private final String recordId = "102";
    /* ... */
}

class Customer {
    private Date generationTimestamp;
    private Date modificationTimestamp;
    private final String recordId = "102";
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        demonstrateBetterNaming();
        demonstrateIntentionRevealingNames();
        demonstratePronounceableNames();
        demonstrateSearchableNames();
    }

    private static void demonstrateBetterNaming() {
        // Does not reveal the intent of the variable
        int d;

        // Better naming examples
        int elapsedTimeInDays;
        int daysSinceCreation;
        int daysSinceModification;
        int fileAgeInDays;
    }

    private static void demonstrateIntentionRevealingNames() {
        //    // Hard to tell what is the purpose of this code
//    public List<int[]> getThem() {
//        List<int[]> list1 = new ArrayList<int[]>();
//        for (int[] x : theList)
//            if (x[0] == 4)
//                list1.add(x);
//        return list1;
//    }
//
//    // Adding more meaning to the code with proper naming
//    public List<int[]> getFlaggedCells() {
//        List<int[]> flaggedCells = new ArrayList<int[]>();
//        for (int[] cell : gameBoard)
//            if (cell[STATUS_VALUE] == FLAGGED)
//                flaggedCells.add(cell);
//        return flaggedCells;
//    }
//
//    // Going further by writing a class instead of using the array of ints
//    public List<Cell> getFlaggedCells() {
//        List<Cell> flaggedCells = new ArrayList<Cell>();
//        for (Cell cell : gameBoard)
//            if (cell.isFlagged())
//                flaggedCells.add(cell);
//        return flaggedCells;
//    }
    }

    private static void demonstratePronounceableNames() {
        /*
         * Check the code inside the classes**
        */

        // Instead of
        DtaRcrd102 dataRecord = new DtaRcrd102();

        // Do this
        Customer customerRecord = new Customer();
    }

    private static void demonstrateSearchableNames() {
        // Compare:
//        for (int j=0; j<34; j++) {
//            s += (t[j]*4)/5;
//        }

        // To:
//        int realDaysPerIdealDay = 4;
//        final int WORK_DAYS_PER_WEEK = 5;
//        int sum = 0;
//        for (int j=0; j < NUMBER_OF_TASKS; j++) {
//            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
//            int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
//            sum += realTaskWeeks;
//        }
    }

}