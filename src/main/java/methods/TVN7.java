package methods;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TVN7 {

    public static void main(String[] args) throws Exception {

        String path = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\input\\TVN7.txt";
        String pathOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVN7_1.txt";
        String pathOut2 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTVN7_2.txt";
        String finalOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\output\\finalTVN7.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(path));
            writer = new BufferedWriter(new FileWriter(pathOut));

            String line1;

            while ((line1 = reader.readLine()) != null) {
                writer.write(line1
                        .replace(" (dla małoletnich od lat 12)", "")
                        .replace(" (dla małoletnich od lat 16)", "")
                        .replace(", audiodeskrypcja", "")
                        .replace(", Dolby", "")
                        .replace(", live ", "")
                        .replace(" , live ", "")
                        .replace(", napisy", "")
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

                Pattern pattern = Pattern.compile(" \\(([0-9]{1,4})/([0-9]{1,4})\\)");
                Pattern pattern2 = Pattern.compile(" \\(([0-9]{1,4})\\)");
                Pattern pattern3 = Pattern.compile(" \\(([0-9]{1,4})\\)");
                Pattern pattern4 = Pattern.compile("\\((.*)\\) ");

                Matcher matcher = pattern.matcher(line2);
                Matcher matcher2 = pattern2.matcher(line2);
                Matcher matcher3 = pattern3.matcher(line2);
                Matcher matcher4 = pattern4.matcher(line2);

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
                } else if (matcher4.find()) {
                    writer.write(line2
                            .replace(matcher4.group(), "")
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
            writer = new BufferedWriter(new FileWriter(finalOut));

            String line3;

            while ((line3 = reader.readLine()) != null) {

                Pattern pattern = Pattern.compile(" ([0-9]{4})");
                Pattern pattern2 = Pattern.compile(" ([0-9]{1,2}) ");

                Matcher matcher = pattern.matcher(line3);
                Matcher matcher2 = pattern2.matcher(line3);

                if (matcher.find()) {
                    writer.write(line3
                            .replace(matcher.group(), "," + matcher.group())
                            .replace(" , ", ", ")
                            .replace(",,", ",")
                            .replace(" (TVN7 noc)", "")
                    );
                } else if (matcher2.find()) {
                    writer.write(line3
                            .replace(matcher2.group(), " ")
                            .replace(" , ", ", ")
                            .replace(",,", ",")
                            .replace(" (TVN7 noc)", "")
                    );
                }

                else {
                    writer.write(line3
                            .replace("", "")
                            .replace(" , ", ", ")
                            .replace(",,", ",")
                            .replace(" (TVN7 noc)", "")
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


    }}
