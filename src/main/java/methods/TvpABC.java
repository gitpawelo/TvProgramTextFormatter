package methods;

import java.io.*;

public class TvpABC {

    public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {

        String sciezka = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\input\\TVP ABC.txt";
        String sciezkaOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP ABC.txt";
        String sciezkaOut2 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP ABC2.txt";
        String sciezkaOut3 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP ABC3.txt";
        String sciezkaOut4 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\output\\finalTVP ABC.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;


        try {
            reader = new BufferedReader(new FileReader(sciezka));
            writer = new BufferedWriter(new FileWriter(sciezkaOut));


            int indexOfDash;

            String line;

            while (((line = reader.readLine()) != null)) {

                indexOfDash = line.indexOf("-");

                if (indexOfDash != -1 && (!(line.contains("Wieczorynka")))) {
                    writer.write(line = line.substring(0, indexOfDash));
                } else {
                    writer.write(line);
                }
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }

        try {
            reader = new BufferedReader(new FileReader(sciezkaOut));
            writer = new BufferedWriter(new FileWriter(sciezkaOut2));

            int indexOfSemicolon;

            String line3;

            while ((line3 = reader.readLine()) != null) {

                indexOfSemicolon = line3.indexOf(";");

                if (indexOfSemicolon != -1) {
                    writer.write(line3 = line3.substring(0, indexOfSemicolon));

                } else {
                    writer.write(line3);
                }
                writer.append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }

        try {
            reader = new BufferedReader(new FileReader(sciezkaOut2));
            writer = new BufferedWriter(new FileWriter(sciezkaOut3));

            int indexOfComma;

            String line2;

            while ((line2 = reader.readLine()) != null) {

                indexOfComma = line2.indexOf(",");

                if (indexOfComma != -1) {
                    writer.write(line2 = line2.substring(0, indexOfComma));

                } else {
                    writer.write(line2);
                }
                writer.append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }

        try {
            reader = new BufferedReader(new FileReader(sciezkaOut3));
            writer = new BufferedWriter(new FileWriter(sciezkaOut4));

            String line4;

            while ((line4 = reader.readLine()) != null) {
                writer.write(line4
                        .replace("0 ", "0   ")
                        .replace("5 ", "5   "));

                writer.append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }

    }
}
