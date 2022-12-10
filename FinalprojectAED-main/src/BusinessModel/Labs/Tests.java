/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Labs;

/**
 *
 * @author mayurchaudhari
 */
public class Tests {
    
    private String testName;
    private int testPrice;
    private String testUsage;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getTestPrice() {
        return testPrice;
    }

    public void setTestPrice(int testPrice) {
        this.testPrice = testPrice;
    }

    public String getTestUsage() {
        return testUsage;
    }

    public void setTestUsage(String testUsage) {
        this.testUsage = testUsage;
    }
        @Override
    public String toString() {
        return testName;
    }
    
}
