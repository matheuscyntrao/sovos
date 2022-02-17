package Interfaces;

import org.openqa.selenium.StaleElementReferenceException;

public interface IButton {

    /**
     * Click this element. If this causes a new page to load, you should discard all references to this element and any further operations performed on this element will throw a StaleElementReferenceException.
     * Note that if click() is done by sending a native event (which is the default on most browsers/platforms) then the method will _not_ wait for the next page to load and the caller should verify that themselves.
     * There are some preconditions for an element to be clicked. The element must be visible and it must have a height and width greater then 0.
     *
     * @throws StaleElementReferenceException - If the element no longer exists as initially defined
     */
    void click();

    /**
     * Is this element displayed or not? This method avoids the problem of having to parse an element's "style" attribute.
     *
     * @return Whether or not the element is displayed
     */
    boolean isDisplayed();
}
