package methods;

import java.io.*;
import java.util.Scanner;

public class TV4 {

    public static void main(String[] args) throws Exception {

        String path = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\input\\TV4.txt";
        String pathOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTV4_1.txt";
        String pathOut2 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTV4_2.txt";
        String finalOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\output\\finalTV4.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;

        Scanner reader2 = null;
        PrintWriter writer2 = null;

        try {
            reader = new BufferedReader(new FileReader(path));
            writer = new BufferedWriter(new FileWriter(pathOut));

            String line1;

            while ((line1 = reader.readLine()) != null) {


                if (line1.contains("Detektywi w Akcji")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Detektywi w akcji - serial kryminalny prod. Polska")
                    );

                } else if (line1.contains("Jeźdźcy smoków,")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Jeźdźcy smoków")
                    );
                } else if (line1.contains("Dragons: Defenders of Berk")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Dragons: Defenders of Berk")
                    );
                } else if (line1.contains("Drużyna A")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Drużyna A")
                    );
                } else if (line1.contains("Detektyw Monk")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Detektyw Monk - serial kryminalny")
                    );
                } else if (line1.contains("Sekrety Sąsiadów")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Sekrety Sąsiadów")
                    );
                } else if (line1.contains("Galileo")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Galileo")
                    );
                } else if (line1.contains("Nie igraj z aniołem")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Nie igraj z aniołem - telenowela")
                    );
                } else if (line1.contains("Policjantki i Policjanci")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Policjantki i Policjanci - serial obyczajowy prod. Polska")
                    );
                } else if (line1.contains("Czasy ostateczne")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Czasy ostateczne: Pozostawieni")
                    );
                } else if (line1.contains("Sprawiedliwi")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Sprawiedliwi - Wydział Kryminalny")
                    );
                } else if (line1.contains("Na Patrolu")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Na Patrolu")
                    );
                } else if (line1.contains("Jeźdźcy smoków na końcu świata,")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Jeźdźcy smoków na końcu świata - serial przygodowy")
                    );
                } else if (line1.contains("Disco Polo Life")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Disco Polo Life")
                    );
                } else if (line1.contains("Top 10 lista przebojów")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Top 10 lista przebojów")
                    );
                } else if (line1.contains("Tom i Jerry Show,")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Tom i Jerry Show")
                    );
                } else if (line1.contains("STOP Drogówka")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "STOP Drogówka")
                    );
                } else if (line1.contains("Mecenas Lena Barska,")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Mecenas Lena Barska")
                    );
                } else if (line1.contains(" - Polska, 2018 ")) {
                    writer.write(line1
                            .replace(line1, "")
                    );
                } else if (line1.contains(" - Polska - ")) {
                    writer.write(line1
                            .replace(line1, "")
                    );
                } else if (line1.contains("Cafe Futbol")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Cafe Futbol")
                    );
                } else if (line1.contains("Anthony Bourdain")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Anthony Bourdain")
                    );
                } else if (line1.contains(" i audiodeskrypcja")) {
                    writer.write(line1
                            .replace(line1, "")
                    );
                } else {
                    writer.write(line1

                            .replace("Dla małoletnich od lat 12", "")
                            .replace("Dla małoletnich od lat 16", "")
                            .replace("Dla małoletnich od lat 7", "")
                            .replace("Udogodnienia: napisy dla niesłyszących i audiodeskrypcja", "")
                            .replace("Udogodnienia: napisy dla niesłyszących", "")
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
            reader = new BufferedReader(new FileReader(pathOut));
            writer = new BufferedWriter(new FileWriter(pathOut2));

            String line3;

            while ((line3 = reader.readLine()) != null) {

                if (line3.length() > 200 && line3.contains("reż.") && line3.contains("wyk.")) {
                    writer.write(line3
                            .replace("", ""));

                } else if (line3.length() > 200 && line3.contains("r.") && line3.contains("w.")) {
                    writer.write(line3
                            .replace("", ""));

                } else if (line3.length() > 200) {

                    writer.write(line3
                            .replace(line3, ""));
                } else {
                    writer.write(line3
                            .replace("", "")
                            .replace(" - US\tAnthony Bourdain", "")
                            .replace(" - Wielka Brytania - ", "")

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
            reader2 = new Scanner(new File(pathOut2));
            writer2 = new PrintWriter(finalOut);


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


    }

}
