package Interfaces;

public interface ITextField {

    /**
     * Use this method to simulate typing into an element, which may set its value.
     *
     * @param keysToSend character sequence to send to the element
     * @throws IllegalArgumentException - if keysToSend is null
     */
    void sendKeys(CharSequence keysToSend);

    /**
     * Get the visible (i.e. not hidden by CSS) text of this element, including sub-elements.
     *
     * @return The visible text of this element.
     */
    String getText();

    /**
     * Is this element displayed or not? This method avoids the problem of having to parse an element's "style" attribute.
     *
     * @return Whether or not the element is displayed
     */
    boolean isDisplayed();

    boolean isReadOnly();

    /**
     * Get the value of a given CSS property. Color values should be returned as rgba strings, so, for example if the "background-color" property is set as "green" in the HTML source, the returned value will be "rgba(0, 255, 0, 1)".
     * Note that shorthand CSS properties
     * (e.g. background, font, border, border-top, margin, margin-top, padding, padding-top, list-style, outline, pause, cue) are not returned, in accordance with the DOM CSS2 specification - you should directly access the longhand properties (e.g. background-color) to access the desired values.
     *
     * @param propertyName the css property name of the element
     * @return The current, computed value of the property.
     */
    String getAttribute(String propertyName);
}
