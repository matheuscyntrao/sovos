package Interfaces;

public interface ITextField {

    void sendKeys(CharSequence keysToSend);

    String getText();

    boolean isDisplayed();

    boolean isReadOnly();

    String getAttribute(String propertyName);
}
