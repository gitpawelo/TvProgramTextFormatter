package methods;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polsat {

    public static void main(String[] args) throws Exception {

        String path = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\input\\Polsat.txt";
        String pathOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputPolsat_1.txt";
        String pathOut2 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputPolsat_2.txt";
        String pathOut3 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputPolsat_3.txt";
        String pathOut4 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputPolsat_4.txt";
        String finalOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\output\\finalPolsat.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;

        Scanner reader2 = null;
        PrintWriter writer2 = null;


        try {
            reader = new BufferedReader(new FileReader(path));
            writer = new BufferedWriter(new FileWriter(pathOut));

            String line2;

            while ((line2 = reader.readLine()) != null) {

                Pattern pattern = Pattern.compile(", odc.([0-9]{1,3})/([0-9]{1,3})");
                Pattern pattern2 = Pattern.compile(", odc.([0-9]{1,4})");

                Matcher matcher = pattern.matcher(line2);
                Matcher matcher2 = pattern2.matcher(line2);

                if (matcher.find()) {

                    writer.write(line2
                            .replace(matcher.group(), "")

                    );
                } else if (matcher2.find()) {
                    writer.write(line2
                            .replace(matcher2.group(), "")

                    );
                }
                else {
                    writer.write(line2

                            .replace("Dla małoletnich od lat 12", "")
                            .replace("Dla małoletnich od lat 16", "")
                            .replace("Dla małoletnich od lat 7", "")
                            .replace("Udogodnienia: napisy dla niesłyszących i audiodeskrypcja", "")
                            .replace("Udogodnienia: napisy dla niesłyszących", "")
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
            reader = new BufferedReader(new FileReader(pathOut));
            writer = new BufferedWriter(new FileWriter(pathOut2));

            String line1;

            while ((line1 = reader.readLine()) != null) {


                if (line1.contains("Malanowski i Partnerzy")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Malanowski i Partnerzy - serial kryminalny prod. Polska")
                    );

                } else if (line1.contains("Pierwsza miłość")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Pierwsza miłość - serial obyczajowy prod. Polska")
                    );
                } else if (line1.contains("Interwencja")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Interwencja - magazyn reporterów")
                    );
                } else if (line1.contains("Dzień. który zmienił moje życie")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Dzień, który zmienił moje życie - serial obyczajowy prod. Polska")
                    );
                } else if (line1.contains("Świat według Kiepskich")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Świat według Kiepskich - serial komediowy prod. Polska")
                    );
                }  else {
                    writer.write(line1
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

                if (line3.length() > 200 && line3.contains("reż.") && line3.contains("wyk.")) {
                    writer.write(line3
                            .replace("", ""));

                } else if (line3.length() > 200 && line3.contains("r.") && line3.contains("w.")) {
                    writer.write(line3
                            .replace("", ""));

                }

                else if (line3.length() > 200) {

                    writer.write(line3
                            .replace(line3, ""));
                } else {
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


        try {
            reader2 = new Scanner(new File(pathOut3));
            writer2 = new PrintWriter(pathOut4);



            while ((reader2.hasNext())) {
                String line2 = reader2.nextLine().trim();

                if (!line2.isEmpty()) {
                    writer2.write(line2);
                    writer2.write("\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader2 != null) {
                reader2.close();
            }
            if (writer2 != null) {
                writer2.close();
            }

        }

        try {
            reader = new BufferedReader(new FileReader(pathOut4));
            writer = new BufferedWriter(new FileWriter(finalOut));

            String line2;

            while ((line2 = reader.readLine()) != null) {


                if (line2.contains("Disco Gramy")) {
                    writer.write(line2
                            .replace(line2, line2 + "\n"));
                }else if (line2.contains("PONIEDZIAŁEK") || line2.contains("WTOREK") || line2.contains("ŚRODA") || line2.contains("CZWARTEK") || line2.contains("PIĄTEK") || line2.contains("SOBOTA") || line2.contains("NIEDZIELA")) {
                    System.out.println(line2);
                    writer.write(line2
                            .replace(line2, "\t" + line2)

                    );
                }
                else {
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




    }
}

