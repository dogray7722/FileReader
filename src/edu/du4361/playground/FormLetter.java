//David Gray
//ICT4361
//MyFormLetter.java
package edu.du4361.playground;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class FormLetter extends FormLetterTemplate {


        List<FormLetterEntry> entries = new ArrayList<FormLetterEntry>();


        public FormLetter(String title) {
            super(title);
        }

        // Of course, the abstract functions from FormLetterTemplate should
        // be implemented if you want this class to be concrete.

        /**
         *
         * Create a TextEntry with the given text,
         * and add it to the sanitytemplate.txt (collection)
         * @param text The value of the text to have the TextEntry return
         **/

        @Override
        public void addTextEntry(String text) {
            TextEntry t = new TextEntry(text);
            entries.add(t);
        }

        /**
         *
         * Create a DataItemEntry with the given "fill-in-the-blank" name
         * and add it to the sanitytemplate.txt (collection)
         * @param fillName The symbolic name of the "slot" and the Properties key to look up.
         **/

        @Override
        public void addDataItemEntry(String fillName) {
            DataItemEntry d = new DataItemEntry(fillName);
            entries.add(d);
        }

        @Override
        public void printFormLetterTemplate(PrintStream out) {

            Iterator<FormLetterEntry> it = entries.iterator();
            while (it.hasNext())
                out.printf("%s", it.next().getTemplateString() + "\n");
        }

        @Override
        public void doFormLetter(Properties data, PrintStream out) {

            Iterator<FormLetterEntry> it = entries.iterator();
            while (it.hasNext()) {
                FormLetterEntry f = it.next();
                f.doProcess(data);
                out.print(f.getFormLetterString());
            }
        }

}
