package org.brit.lesson16;

import org.apache.commons.io.FileUtils;
import org.brit.calk.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CalculatorTests  {
    Calculator calculator = new Calculator();

    @BeforeMethod
    public void  clearCalk(){
        calculator.clear();
    }
    @Test(dataProvider = "forDiv")
    public void  divisionTest(Double oper1,Double oper2, Double expectedresult){
    Double result = calculator
          .firstOperand(oper1)
          .div()
          .secondOperand(oper2)
          .equal()
          .getResult();
    Assert.assertEquals(result, expectedresult);
        }

    @DataProvider
    public Object[][] forDiv() throws IOException {
        return new Object[][]{
                {0.0, 4.0, 0.0},
                {4.0, 0.0, null},
                {4.0, 2.0, 2.0}
        };
    }
    @DataProvider
            public Object[][] forDiv1(){
        try {
            List<String> list = FileUtils.readLines(new File("forDiv.txt"));
            Object[][] data = new Object[list.size()][3];

            for (int i = 0; i < list.size(); i++) {
                String line = list.get(i);
                String[] split = line.split(",");
                for (int j =0; j< 3; j++) {
                    data[i][j] = split[j].equals("null")?null:Double.parseDouble(split[j]);
                }
            }
            return data;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}




