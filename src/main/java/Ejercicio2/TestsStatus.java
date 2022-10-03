package Ejercicio2;
import java.util.HashMap;


public class TestsStatus
{
    public TestsStatus()
    {

    }

    //refactorizar para evitar excepciones
    public void getTestResultsStatus(HashMap<String, Boolean> testResults)
    {
        for (String key: testResults.keySet())
        {
            if (testResults.get(key))
            {
                System.out.println("Test OK, no problem. "+key);
            }else
            {
                System.out.println("Test fail! Name: "+key);
            }

        }
    }
}
