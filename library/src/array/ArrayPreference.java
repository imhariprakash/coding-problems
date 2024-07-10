package array;

public class ArrayPreference
{
    private static final int DEFAULT_INDENTATION_LEVEL = 4;
    private static final String DEFAULT_SUB_ARRAY_SEPARATOR = ", ";
    private static final String DEFAULT_ELEMENT_SEPARATOR = ", ";
    private static final String DEFAULT_ARRAY_OPENING_BRACE_STYLE = "[";
    private static final String DEFAULT_ARRAY_CLOSING_BRACE_STYLE = "]";
    private int indentationLevel;
    private String subArraySeparator;
    private String elementSeparator;
    private String arrayOpeningBraceStyle;
    private String arrayClosingBraceStyle;

    public ArrayPreference(int indentationLevel, String subArraySeparator, String elementSeparator, String arrayOpeningBraceStyle, String arrayClosingBraceStyle)
    {
        this.indentationLevel = indentationLevel;
        this.subArraySeparator = subArraySeparator;
        this.elementSeparator = elementSeparator;
        this.arrayOpeningBraceStyle = arrayOpeningBraceStyle;
        this.arrayClosingBraceStyle = arrayClosingBraceStyle;
    }

    public ArrayPreference()
    {
        this.indentationLevel = DEFAULT_INDENTATION_LEVEL;
        this.subArraySeparator = DEFAULT_SUB_ARRAY_SEPARATOR;
        this.elementSeparator = DEFAULT_ELEMENT_SEPARATOR;
        this.arrayOpeningBraceStyle = DEFAULT_ARRAY_OPENING_BRACE_STYLE;
        this.arrayClosingBraceStyle = DEFAULT_ARRAY_CLOSING_BRACE_STYLE;
    }

    public int getIndentationLevel()
    {
        return indentationLevel;
    }

    public ArrayPreference setIndentationLevel(int indentationLevel)
    {
        this.indentationLevel = indentationLevel;
        return this;
    }

    public String getSubArraySeparator()
    {
        return subArraySeparator;
    }

    public ArrayPreference setSubArraySeparator(String subArraySeparator)
    {
        this.subArraySeparator = subArraySeparator;
        return this;
    }

    public String getElementSeparator()
    {
        return elementSeparator;
    }

    public ArrayPreference setElementSeparator(String elementSeparator)
    {
        this.elementSeparator = elementSeparator;
        return this;
    }

    public String getArrayOpeningBraceStyle()
    {
        return arrayOpeningBraceStyle;
    }

    public ArrayPreference setArrayOpeningBraceStyle(String arrayOpeningBraceStyle)
    {
        this.arrayOpeningBraceStyle = arrayOpeningBraceStyle;
        return this;
    }

    public String getArrayClosingBraceStyle()
    {
        return arrayClosingBraceStyle;
    }

    public ArrayPreference setArrayClosingBraceStyle(String arrayClosingBraceStyle)
    {
        this.arrayClosingBraceStyle = arrayClosingBraceStyle;
        return this;
    }
}
