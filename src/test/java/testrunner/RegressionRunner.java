package testrunner;

import org.testng.annotations.Test;

public class RegressionRunner {

    @Test(groups = "regression")
    public void Regressiontask1(){
        System.out.println("Regression test perform 1");
    }
    @Test(groups = "regression")
    public void Regression2(){
        System.out.println("Regression test perform");
    }
}
