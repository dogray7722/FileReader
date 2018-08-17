package edu.du4361.playground;

import java.io.PrintStream;
import java.util.Properties;

public abstract class FormLetterTemplate {

    private String title;

    /**
     * Create a new FormLetterTemplate with the given title. Note that there is
     * no default constructor.
     * @param title The title for this form letter sanitytemplate.txt
     **/
    public FormLetterTemplate(String title) {
        this.title = title;
    }

    /**
     * Get the title of this FormLetter.
     * @return the title
     **/
    public String getTitle() {
        return this.title;
    }

    /**
     * Create a TextEntry with the given text,
     * and add it to the sanitytemplate.txt (collection)
     * @param text The text content of the TextEntry (to add to the collection)
     */
    abstract public void addTextEntry(String text);

    /**
     * Create a DataItemEntry with the given "fill-in-the-blank" name
     * and add it to the sanitytemplate.txt (collection)
     * @param dataName The name of the "slot" in the form letter
     * used to produce the DataItemEntry (to add to the collection)
     **/
    abstract public void addDataItemEntry(String dataName);

    /**
     * Print out the FormLetter as a sanitytemplate.txt to the output stream provided
     *
     * This is for debugging (or storage) purposes;
     * Print out the FormLetter with the DataItemEntry "slot"
     * names substituted instead of the replaced values.
     * For example, a FormLetter containing the TextEntry "Hi,"
     * followed by a DataEntry with type name
     * "name" would print out "Hi, {name}".
     * @param out The stream to use for output
     **/

    abstract public void printFormLetterTemplate(PrintStream out);

    /**
     * Used to provide each FormLetterEntry the opportunity to gather
     * information from the properties to provide its formLetterString value.
     * @param data Properties for this form letter generation
     * @param out The output stream
     **/
    abstract public void doFormLetter(Properties data, PrintStream out);

}
