package Ejercicio2;
import java.util.*;
import java.util.HashMap;

public class MainClass
{
    public static void main(String[] args)
    {
        //HashMap<String, Boolean> testResults = new HashMap<String, Boolean>();
        Map <String, Boolean> testResults = new HashMap<>();

        testResults.put("TC1", true);
        testResults.put("TC2", true);
        testResults.put("TC3", true);
        testResults.put("TC4", false);
        testResults.put("TC5", true);
        testResults.put("TC6", true);
        testResults.put("TC7", false);
        testResults.put("TC8", true);
        testResults.put("TC9", false);
        testResults.put("TC10", true);
        testResults.put("TC11", false);
        testResults.put("TC12", true);

        TestsStatus testsSet = new TestsStatus();

        //Punto 1
        System.out.println("------------------------------------------------------------------");
        testsSet.getTestResultsStatus((HashMap<String, Boolean>) testResults);

        TestCaseJira newTestCase = new TestCaseJira();
        System.out.println("------------------------------------------------------------------");
        newTestCase.pushTest((HashMap<String, Boolean>) testResults,"TC5" );

        TestCaseGetStatus newStatus = new TestCaseGetStatus();
        System.out.println("------------------------------------------------------------------");
        newStatus.getTestStatus((HashMap<String, Boolean>) testResults, "TC3");


    }


}
