package Ejercicio2;

import java.util.HashMap;

public class TestCaseJira extends TestCase
{
    @Override
    public void pushTest(HashMap<String, Boolean> testResult, String NombreTest)
    {
        System.out.println("This test case will be pushed to Jira: "+ NombreTest+ " With status: "+ testResult.get(NombreTest));
    }

}
