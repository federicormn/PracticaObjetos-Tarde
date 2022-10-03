package Ejercicio2;
import java.util.*;
import java.util.HashMap;

public abstract class TestCase
{


    public abstract void pushTest(HashMap<String, Boolean> testResult, String NombreTest);

    public boolean getTestStatus(HashMap<String, Boolean> testResult, String NombreTest)
    {
        return testResult.get(NombreTest);
    }

}
