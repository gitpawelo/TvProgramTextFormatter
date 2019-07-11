package methods;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TVPuls2 {


    public static void main(String[] args) throws Exception {

        String path = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\input\\TV Puls 2.txt";
        String pathOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTV Puls 2_1.txt";
        String pathOut2 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTV Puls 2_2.txt";
        String pathOut3 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTV Puls 2_3.txt";
        String pathOut4 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTV Puls 2_4.txt";
        String pathOut5 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTV Puls 2_5.txt";
        String finalOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\output\\finalTV Puls 2.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;

        Scanner reader2 = null;
        PrintWriter writer2 = null;

        try {
            reader = new BufferedReader(new FileReader(path));
            writer = new BufferedWriter(new FileWriter(pathOut));

            String line4;

            while ((line4 = reader.readLine()) != null) {

                Pattern pattern = Pattern.compile("([0-9]{4})-([0-9]{2})-([0-9]{2})\t");
                Matcher matcher = pattern.matcher(line4);

                if (matcher.find()) {
                    writer.write(line4
                            .replace(matcher.group(), ""));

                } else {
                    writer.write(line4
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

                if (line1.contains("Teletubisie")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Teletubisie - animacja")
                    );

                } else if (line1.contains("Jake i piraci z Nibylandii")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Jake i piraci z Nibylandii - animacja")
                    );
                } else if (line1.contains("Gumisie")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Gumisie - animacja")
                    );
                } else if (line1.contains("Tomek i przyjaciele")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Tomek i przyjaciele - animacja")
                    );
                } else if (line1.contains("Drużyna Umizoomi")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Drużyna Umizoomi - animacja")
                    );
                } else if (line1.contains("Straszne historie Maszy")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Straszne historie Maszy - animacja")
                    );
                } else if (line1.contains("Bajeczki Maszy")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Bajeczki Maszy - animacja")
                    );
                } else if (line1.contains("Noddy")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Noddy - animacja")
                    );
                } else if (line1.contains("Dora poznaje świat")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Dora poznaje świat - animacja")
                    );
                } else if (line1.contains("Przygody kota Filemona")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Przygody kota Filemona - animacja")
                    );
                } else if (line1.contains("Reksio")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Reksio - animacja")
                    );
                } else if (line1.contains("Bolek i Lolek wśród górników")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Bolek i Lolek wśród górników - animacja")
                    );
                } else if (line1.contains("Kuba i Śruba")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Kuba i Śruba - animacja")
                    );
                } else if (line1.contains("Flintstonowie")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Flintstonowie - animacja")
                    );
                } else if (line1.contains("Gumisie")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Gumisie - animacja")
                    );
                } else if (line1.contains("Sylwester i Tweety na tropie")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Sylwester i Tweety na tropie - animacja")
                    );
                } else if (line1.contains("SpongeBob Kanciastoporty")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "SpongeBob Kanciastoporty - animacja")
                    );
                } else if (line1.contains("Kung Fu Panda")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Kung Fu Panda - animacja")
                    );
                } else if (line1.contains("Alvinnn!!! I wiewiórki")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Alvinnn!!! I wiewiórki - animacja")
                    );
                } else if (line1.contains("Niech żyje")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Niech żyje król Julian - animacja")
                    );
                } else if (line1.contains("Pingwiny z Madagaskaru")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Pingwiny z Madagaskaru - animacja")
                    );
                } else if (line1.contains("Lombard")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Lombard. Życie pod zastaw")
                    );
                } else if (line1.contains("Agenci NCIS")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Agenci NCIS - fabularny")
                    );
                } else if (line1.contains("Przytul mnie")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Przytul mnie - animacja")
                    );
                } else if (line1.contains("Timon i Pumba")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Timon i Pumba - animacja")
                    );
                } else if (line1.contains("Listonosz Pat")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Listonosz Pat - animacja")
                    );
                } else if (line1.contains("Bolek i Lolek")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Bolek i Lolek - animacja")
                    );
                } else if (line1.contains("Niesamowite!")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Niesamowite! - fabularny")
                    );
                } else if (line1.contains("Niesamowite!")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Niesamowite! - akcja")
                    );
                } else if (line1.contains("Akademia Rocco")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Akademia Rocco - erotyczny")
                    );
                } else if (line1.contains("Gorący patrol")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Gorący patrol - erotyczny")
                    );
                } else if (line1.contains("Łowca błyskawic")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Łowca błyskawic - akcja")
                    );
                } else if (line1.contains("Lawalantula 2")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Lawalantula 2 - katastroficzny")
                    );
                } else if (line1.contains("Najśmieszniejsi")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Najśmieszniejsi - kabaret")
                    );
                } else if (line1.contains("JRG w akcji")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "JRG w akcji - akcja")
                    );
                } else if (line1.contains("Motyw")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Motyw - fabularny")
                    );
                } else if (line1.contains("Top Gear")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Top Gear - motoryzacyjny")
                    );
                } else {
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

                Pattern pattern = Pattern.compile("([0-9]{1,2}):([0-9]{1,2})\t");
                Matcher matcher = pattern.matcher(line3);

                if (matcher.find()) {
                    writer.write(line3
                            .replace("", ""));

                } else {
                    writer.write(line3
                            .replace(line3, "")
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
            writer = new BufferedWriter(new FileWriter(pathOut5));

            String line2;

            while ((line2 = reader.readLine()) != null) {


                Pattern pattern4 = Pattern.compile("\\((.*)\\)");
                Matcher matcher4 = pattern4.matcher(line2);

                if (matcher4.find()) {
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
            reader = new BufferedReader(new FileReader(pathOut5));
            writer = new BufferedWriter(new FileWriter(finalOut));

            String line2;

            while ((line2 = reader.readLine()) != null) {


                if (line2.contains("Na jedwabnym szlaku")) {
                    writer.write(line2
                            .replace(line2, line2 + "\n"));
                } else if (line2.contains("Biesiada na cztery pory roku")) {
                    writer.write(line2
                            .replace(line2, line2 + "\n"));
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






