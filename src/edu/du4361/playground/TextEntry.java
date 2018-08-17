//David Gray
//ICT4361
//TextEntry.java

package edu.du4361.playground;

import java.util.Properties;

public class TextEntry extends FormLetterEntry {

    private String text;

    public TextEntry(String text) {
        this.text = text;
    }

    @Override
    public String getTemplateString() {
        return text;
    }

    @Override
    public String getFormLetterString() {
        return text;
    }

    @Override
    public void doProcess(Properties data) {
        //method implemented without instruction
    }

}
