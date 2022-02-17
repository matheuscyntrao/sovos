package Interfaces;

public interface ISelect {

    void sendKeys(CharSequence keysToSend);

    void click();

    boolean isDisplayed();

    boolean selectOption(String option) throws InterruptedException;

}
