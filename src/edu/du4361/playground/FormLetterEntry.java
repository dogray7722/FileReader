package edu.du4361.playground;

import java.util.Properties;

public abstract class FormLetterEntry {

    /**
     * Retrieve the sanitytemplate.txt string for this entry
     * @return the value of this entry in a sanitytemplate.txt (not replaced)
     **/
    abstract public String getTemplateString();
    /**
     * Retrieve the entry with any substitutions
     * @return the value of the entry as a FormLetter (replaced)
     **/
    abstract public String getFormLetterString();
    /**
     * Extract any data for this entry
     * @param data The properties for the FormLetterEntry to consult for getFormLetterString
     **/
    abstract public void doProcess(Properties data);

}
