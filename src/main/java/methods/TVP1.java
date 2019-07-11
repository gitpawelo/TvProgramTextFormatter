package methods;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TVP1 {

    public static void main(String[] args) throws Exception {

            String path = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\input\\TVP1.txt";
            String pathOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP1_1.txt";
            String pathOut2 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP1_2.txt";
            String pathOut3 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP1_3.txt";
            String pathOut4 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP1_4.txt";
            String pathOut5 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP1_5.txt";
            String pathOut6 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVP1_6.txt";
            String finalOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\output\\finalTVP1.txt";
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
                    Matcher matcher = pattern.matcher(line5);
                    Matcher matcher2 = pattern2.matcher(line5);

                    if (matcher.find()) {
                        writer.write(line5
                                .replace(matcher.group(), "")
                        );
                    } else if (matcher2.find()){
                        writer.write(line5
                        .replace(matcher2.group(), ""));
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
                    Pattern pattern2 = Pattern.compile(" [0-9]{1,3}' ");
                    Matcher matcher = pattern.matcher(line6);
                    Matcher matcher2 = pattern2.matcher(line6);

                    if (matcher.find()) {
                        writer.write(line6
                                .replace(matcher.group(), "")
                                .replace("- w tym: Teleexpress Poranny:  6:30,7:00,7:30. ", "")
                        );
                    } else if (matcher2.find()){
                        writer.write(line6
                                .replace(matcher2.group(), "")
                                .replace("- w tym: Teleexpress Poranny:  6:30,7:00,7:30. ", "")
                        );
                    }
                    else {
                        writer.write(line6
                                .replace("", "")
                                .replace("- w tym: Teleexpress Poranny:  6:30,7:00,7:30. ", "")
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
                writer = new BufferedWriter(new FileWriter(finalOut));

                String line7;

                while ((line7 = reader.readLine()) != null) {
                    Pattern pattern = Pattern.compile("([0-9]{1,2}:[0-9]{1,2}) ");
                    Matcher matcher = pattern.matcher(line7);

                    if (matcher.find()) {
                        writer.write(line7
                                .replace(matcher.group(), matcher.group().substring(0, matcher.group().length() - 1) + "\t")
                                .replace("- -", "-")
                        );
                    } else {
                        writer.write(line7
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
