package methods;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TVPInfo {

    public static void main(String[] args) throws Exception{

        String path = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\input\\TVP Info.txt";
        String pathOut1 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP Info1.txt";
        String pathOut2 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP Info2.txt";
        String finalOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\output\\finalTVP Info.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(path));
            writer = new BufferedWriter(new FileWriter(pathOut1));


            String line1;

            while ((line1 = reader.readLine()) != null) {

                writer.write(line1
                        .replace("; STEREO", "")
                        .replace(", 16:9", "")
                        .replace(", Na żywo", "")
                        .replace(" -  txt. str. 777", "")
                        .replace("; magazyn", " - magazyn")
                        .replace("; reportaż", " - reportaż")
                        .replace("; program publicystyczny", " - program publicystyczny")
                        .replace("; film dokumentalny", " - film dokumentalny")
                        .replace("; cykl dokumentalny", " - cykl dokumentalny")
                        .replace(", Bez ograniczeń wiekowych", "")
                        .replace(" -  JM", "")
                        .replace("; Dla małoletnich od lat 12", "")

                );

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
            reader = new BufferedReader(new FileReader(pathOut1));
            writer = new BufferedWriter(new FileWriter(pathOut2));

            String line2;

            while ((line2 = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile("([0-9]{1,2}:[0-9]{1,2}) ");
                Matcher matcher = pattern.matcher(line2);

                if (matcher.find()) {
                    writer.write(line2
                            .replace(matcher.group(), matcher.group().substring(0,matcher.group().length()-1)+"\t")
                    );
                }
                else {
                    writer.write(line2
                            .replace("", "")
                    );
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
            reader = new BufferedReader(new FileReader(pathOut2));
            writer = new BufferedWriter(new FileWriter(finalOut));

            String line3;

            while ((line3 = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile("odc. ([0-9]{1,3}) ");
                Matcher matcher = pattern.matcher(line3);

                if (matcher.find()) {
                    writer.write(line3
                            .replace(matcher.group(), "")
                    );
                }
                else {
                    writer.write(line3
                            .replace("", "")
                    );
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

    }

}
