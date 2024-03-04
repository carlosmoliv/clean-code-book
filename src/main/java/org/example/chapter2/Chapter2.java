package org.example.chapter2;

import java.util.List;

public class Chapter2 {
    public static void main(String[] args) {
        demonstrateBetterNaming();
        demonstrateIntentionRevealingNames();
        demonstratePronounceableNames();
        demonstrateSearchableNames();
        demonstrateInterfacesName();
        demonstrateAvoidMentalMapping();
        demonstrateClassAndMethodNames();
        demonstratePickOneWordPerConcept();
        demonstrateDontPun();
        demonstrateUseSolutionDomainNames();
        demonstrateUseProblemDomainNames();
        demonstrateAddMeaningfulContext();
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
        new IntentionRevealingNames();
    }

    private static void demonstratePronounceableNames() {
        // Compare:
        DtaRcrd102 dataRecord = new DtaRcrd102();

        // To:
        Customer customerRecord = new Customer();
    }

    private static void demonstrateSearchableNames() {
        // Compare:
        for (int j=0; j<34; j++) {
            s += (t[j]*4)/5;
        }

        // To:
        int realDaysPerIdealDay = 4;
        final int WORK_DAYS_PER_WEEK = 5;
        int sum = 0;
        for (int j=0; j < NUMBER_OF_TASKS; j++) {
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }
    }

    private static void demonstrateInterfacesName() {
        // Don't use "I" as prefix
        // Instead of "IShapeFactory" just simple "ShapeFactory"
    }

    private static void demonstrateAvoidMentalMapping() {
        // Bad
        int x, y;

        //Good
        int width, height;

        // Bad
        int a;

        // Good
        int numberOfStudent;
    }

    private static void demonstrateClassAndMethodNames() {
        // Verb for methods and nouns for classes
        // Class names should be a noun, example:
        Customer customer = new Customer();

        // Methods should be a verb, example:

        // Use static factory methods with names that describe the arguments
        // Instead of using the constructor directly:
        Complex fulcrumPoint = new Complex(23.0);

        // Use the static factory method:
        Complex fulcrumPoint2 = Complex.fromRealNumber(23.0);
        Complex polarPoint = Complex.fromPolarCoordinates(5.0, Math.PI / 4);
    }

    private static void demonstratePickOneWordPerConcept() {
        // Confusing to use difference names for the same concept
        // getCustomer
        // retrieveProduct
        // fetchOrders

        // Instead just pick one
        // getCustomer
        // getProduct
        // getOrders

        // You can apply the same thinking for other things also like, controllers for example
        // No need to have a DeviceManager, ProtocolController or a Driver
        // In the controllers and managers are the same for example. So, pick one name per concept.
    }

    private static void demonstrateDontPun() {
//        public class Concatenator {
//            public String add(String str1, String str2) {
//                return str1 + str2;
//            }
//        }
//
//        public class ListAppender {
//            // This method adds an element to a collection, but its semantics are different.
//            // Using the name 'add' might be misleading in this context.
//            public void add(Object element) {
//                // Add the element to the collection.
//            }
//        }
    }

    private static void demonstrateUseSolutionDomainNames() {
        // For example:
        // AccountVisitor
        // RabbitMqAdapter
        //
    }

    private static void demonstrateUseProblemDomainNames() {
//        Employee johnDoe = new Employee("John Doe", "Software Engineer", 25.0);
//
//        PayrollCalculator payrollCalculator = new PayrollCalculator(johnDoe);
//
//        double monthlySalary = payrollCalculator.calculateMonthlySalary();
//        double overtimePay = payrollCalculator.calculateOvertimePay(10);
//
//        System.out.println(johnDoe.getName() + "'s Monthly Salary: $" + monthlySalary);
//        System.out.println(johnDoe.getName() + "'s Overtime Pay: $" + overtimePay);
    }

    private static void demonstrateAddMeaningfulContext() {
        // Variables with unclear context: ------------------------
        // Example 1: No occurrences of 'A'
        printGuessStatistics('A', 0);

        // Example 2: One occurrence of 'B'
        printGuessStatistics('B', 1);

        // Example 3: Multiple occurrences (let's say 3) of 'C'
        printGuessStatistics('C', 3);

        // Variables have a context: ------------------------------
        GuessStatisticsMessage message = new GuessStatisticsMessage();
        System.out.println(message.make('A', 0));
        System.out.println(message.make('B', 1));
        System.out.println(message.make('C', 2));
    }

    private static void printGuessStatistics(char candidate, int count) {
        String number;
        String verb;
        String pluralModifier;
        if (count == 0) {
            number = "no";
            verb = "are";
            pluralModifier = "s";
        } else if (count == 1) {
            number = "1";
            verb = "is";
            pluralModifier = "";
        } else {
            number = Integer.toString(count);
            verb = "are";
            pluralModifier = "s";
        }
        String guessMessage = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
        System.out.println(guessMessage);
    }
}