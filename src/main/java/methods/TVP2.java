package methods;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TVP2 {

    public static void main(String[] args) throws Exception {

        String path = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\input\\TVP2.txt";
        String pathOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP2_1.txt";
        String pathOut2 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP2_2.txt";
        String pathOut3 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP2_3.txt";
        String pathOut4 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP2_4.txt";
        String pathOut5 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP2_5.txt";
        String pathOut6 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP2_6.txt";
        String pathOut7 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP2_7.txt";
        String finalOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\output\\finalTVP2.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(path));
            writer = new BufferedWriter(new FileWriter(pathOut));

            String line1;

            while ((line1 = reader.readLine()) != null) {
                writer.write(line1
                        .replace("; Bez ograniczeń wiekowych", "")
                        .replace(", Bez ograniczeń wiekowych", "")
                        .replace("; Dla małoletnich od lat 12", "")
                        .replace("; Dla małoletnich od lat 16", "")
                        .replace("; Dla małoletnich od lat 7", "")
                        .replace(", Dla małoletnich od lat 12", "")
                        .replace(", 16:9", "")
                        .replace(", Na żywo", "")
                        .replace("; STEREO", "")
                        .replace(" -  txt. str. 777", "")
                        .replace("; ", " - ")
                        .replace(" kraj prod.", ", prod. ")
                        .replace(" - reż.:", ", reż. ")
                        .replace(" - wyk.:", ", wyk. ")
                        .replace(", Dla małoletnich od lat 12", "")
                        .replace(" - Dozwolone od lat 18", "")
                        .replace(" AD", "")
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
            reader = new BufferedReader(new FileReader(pathOut));
            writer = new BufferedWriter(new FileWriter(pathOut2));

            String line2;

            while ((line2 = reader.readLine()) != null) {

                Pattern pattern = Pattern.compile("odc. ([0-9]{1,4})/([0-9]{1,4})");
                Pattern pattern2 = Pattern.compile("odc. ([0-9]{1,4})");
                Pattern pattern3 = Pattern.compile("odc ([0-9]{1,4})");

                Matcher matcher = pattern.matcher(line2);
                Matcher matcher2 = pattern2.matcher(line2);
                Matcher matcher3 = pattern3.matcher(line2);

                if (matcher.find()) {
                    writer.write(line2
                            .replace(matcher.group(), "")
                    );
                } else if (matcher2.find()) {
                    writer.write(line2
                            .replace(matcher2.group(), "")
                    );
                } else if (matcher3.find()) {
                    writer.write(line2
                            .replace(matcher3.group(), "")
                    );
                } else {
                    writer.write(line2
                            .replace("", ""));
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
            writer = new BufferedWriter(new FileWriter(pathOut3));

            String line3;

            while ((line3 = reader.readLine()) != null) {
                // szuka stringow (1), (12), (123) lub (1234)
                Pattern pattern = Pattern.compile(" \\(([0-9]{1,4})\\)");
                Matcher matcher = pattern.matcher(line3);

                if (matcher.find()) {
                    String foundMatcher = matcher.group();
                    //  zamienia znalezione stringi np. (2012) na 2012
                    writer.write(line3
                            .replace(foundMatcher, ", " + foundMatcher.substring(2, matcher.group().length() - 1))
                    );
                } else {
                    writer.write(line3
                            .replace("", ""));
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
            reader = new BufferedReader(new FileReader(pathOut3));
            writer = new BufferedWriter(new FileWriter(pathOut4));

            String line4;

            while ((line4 = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile("\\((.*)\\) ");
                Matcher matcher = pattern.matcher(line4);

                if (matcher.find()) {
                    writer.write(line4
                            .replace(matcher.group(), "")
                            .replace("-  - ", "- ")
                            .replace("  -", " -")
                    );
                } else {
                    writer.write(line4
                            .replace("", "")
                            .replace("-  - ", "- ")
                            .replace("  -", " -")
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
            reader = new BufferedReader(new FileReader(pathOut4));
            writer = new BufferedWriter(new FileWriter(pathOut5));

            String line5;

            while ((line5 = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile("- \\/([0-9]{1,4})\\/ ");
                Pattern pattern2 = Pattern.compile("odc. \\/([0-9]{1,4})\\/ ");
                Pattern pattern3 = Pattern.compile("Odc ([0-9]{1,4}/[0-9]{1,4}) - ");
                Pattern pattern4 = Pattern.compile("([0-9]{1,4}/[0-9]{1,4}) - ");
                Pattern pattern5 = Pattern.compile(" ([0-9]{1,4})' ");
                Pattern pattern6 = Pattern.compile(" -, ([0-9]){1,2}");
                Pattern pattern7 = Pattern.compile(" sezon ([0-9]){1,2}");
                Matcher matcher = pattern.matcher(line5);
                Matcher matcher2 = pattern2.matcher(line5);
                Matcher matcher3 = pattern3.matcher(line5);
                Matcher matcher4 = pattern4.matcher(line5);
                Matcher matcher5 = pattern5.matcher(line5);
                Matcher matcher6 = pattern6.matcher(line5);
                Matcher matcher7 = pattern7.matcher(line5);

                if (matcher.find()) {
                    writer.write(line5
                            .replace(matcher.group(), "")
                    );
                } else if (matcher2.find()){
                    writer.write(line5
                            .replace(matcher2.group(), ""));
                }
                else if (matcher3.find()){
                    writer.write(line5
                            .replace(matcher3.group(), ""));
                } else if (matcher4.find()){
                    writer.write(line5
                            .replace(matcher4.group(), ""));
                } else if (matcher5.find()){
                    writer.write(line5
                            .replace(matcher5.group(), ""));
                } else if (matcher6.find()){
                    writer.write(line5
                            .replace(matcher6.group(), ""));
                } else if (matcher7.find()){
                    writer.write(line5
                            .replace(matcher7.group(), ""));
                }
                else {
                    writer.write(line5
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
            reader = new BufferedReader(new FileReader(pathOut5));
            writer = new BufferedWriter(new FileWriter(pathOut6));

            String line6;

            while ((line6 = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile(", [0-9]{1,3} -");
                Pattern pattern2 = Pattern.compile(" - /[0-9]{1,3}");
                Pattern pattern3 = Pattern.compile(" \\((.*)\\), ");
                Pattern pattern4 = Pattern.compile("s. (.*), - ");
                Pattern pattern5 = Pattern.compile("s. (.*) - ");
                Matcher matcher = pattern.matcher(line6);
                Matcher matcher2 = pattern2.matcher(line6);
                Matcher matcher3 = pattern3.matcher(line6);
                Matcher matcher4 = pattern4.matcher(line6);
                Matcher matcher5 = pattern5.matcher(line6);

                if (matcher.find()) {
                    writer.write(line6
                            .replace(matcher.group(), "")
                            .replace("  ed. 3 -", "")
                            .replace("  JM -", "")
                            .replace("  ", " ")
                    );
                } else if (matcher2.find()){
                    writer.write(line6
                            .replace(matcher2.group(), ""));
                }
                else if (matcher3.find()){
                    writer.write(line6
                            .replace(matcher3.group(), ""));
                }
                else if (matcher4.find()){
                    writer.write(line6
                            .replace(matcher4.group(), ""));
                }
                else if (matcher5.find()){
                    writer.write(line6
                            .replace(matcher5.group(), ""));
                }
                else {
                    writer.write(line6
                            .replace("", "")
                            .replace("  ed. 3 -", "")
                            .replace("  JM -", "")
                            .replace("  ", " ")
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
            reader = new BufferedReader(new FileReader(pathOut6));
            writer = new BufferedWriter(new FileWriter(pathOut7));

            String line7;

            while ((line7 = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile("([0-9]{1,2}:[0-9]{1,2}) ");
                Matcher matcher = pattern.matcher(line7);

                if (matcher.find()) {
                    writer.write(line7
                            .replace(matcher.group(), matcher.group().substring(0, matcher.group().length() - 1) + "\t")
                            .replace("Kuli", "Kulisy - Postaw na milion")
                    );
                } else {
                    writer.write(line7
                            .replace("", "")
                            .replace("Kuli", "Kulisy - Postaw na milion")
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
            reader = new BufferedReader(new FileReader(pathOut7));
            writer = new BufferedWriter(new FileWriter(finalOut));

            String line8;

            while ((line8 = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile("([0-9]{1,2}:[0-9]{1,2}) ");
                Matcher matcher = pattern.matcher(line8);

                if (matcher.find()) {
                    writer.write(line8
                            .replace(matcher.group(), matcher.group().substring(0, matcher.group().length() - 1) + "\t")
                            .replace("milionfelieton" , "milion")
                    );
                } else {
                    writer.write(line8
                            .replace("", "")
                            .replace("milionfelieton" , "milion")
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
