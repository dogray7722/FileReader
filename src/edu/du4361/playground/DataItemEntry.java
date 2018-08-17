//David Gray
//ICT4361
//MyFormLetter.java
package edu.du4361.playground;

import java.util.Properties;

public class DataItemEntry extends FormLetterEntry {

    String fillName;
    String value;

    public DataItemEntry(String fillName){
        this.fillName = fillName;
    }


    @Override
    public String getTemplateString() {
        return "{" + fillName + "}";
    }

    @Override
    public String getFormLetterString() {
        return value;
    }

    @Override
    public void doProcess(Properties data) {
        this.value = data.getProperty(fillName);

    }


}
