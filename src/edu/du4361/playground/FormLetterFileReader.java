//David Gray
//ICT4361
//FormLetterFileReader.java

package edu.du4361.playground;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;


public class FormLetterFileReader {

    private File inputFile;

    private String line;

    private BufferedReader input;

    private List<String> tokens;

    public FormLetterFileReader() {

    }

    public FormLetterFileReader(File inputFile) {
        inputFile = this.inputFile;
    }

    public void setFile(String fileName) throws FileNotFoundException {
            File fl = new File(fileName);
            input = new BufferedReader(new FileReader(fl));
        }

        public String[] getTokens(String s) {
            List<String> result = new LinkedList<String>();
            StringTokenizer st = new StringTokenizer(s, " \n\r[],");
            while (st.hasMoreTokens()) {
                String tok = st.nextToken();
                result.add(tok);
            }
            return result.toArray(new String[0]);
        }

    public String readLine() throws IOException {
            return line = input.readLine();
    }
}
