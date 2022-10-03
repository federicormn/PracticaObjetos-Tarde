package Ejercicio2;

import java.util.HashMap;

public class TestCaseGetStatus extends TestCase
{

    @Override
    public void pushTest(HashMap<String, Boolean> testResult, String NombreTest) {

    }

    @Override
    public boolean getTestStatus(HashMap<String, Boolean> testResult, String NombreTest)
    {
        if(testResult.get(NombreTest))
        {
            System.out.println( "This test status is: OK");
        }else
        {
            System.out.println( "This test status is: NOT OK");
        }

        return testResult.get(NombreTest);
    }
}
