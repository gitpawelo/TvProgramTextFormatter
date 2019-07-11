package methods;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TVPuls {

    public static void main(String[] args) throws Exception {

        String path = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\input\\TV Puls.txt";
        String pathOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTV Puls_1.txt";
        String pathOut2 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTV Puls_2.txt";
        String pathOut3 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTV Puls_3.txt";
        String pathOut4 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTV Puls_4.txt";
        String pathOut5 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputTV Puls_5.txt";
        String finalOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\output\\finalTV Puls.txt";
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

                if (line1.contains("To moje życie!")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "To moje życie! - telenowela")
                    );
                } else if (line1.contains("Dziesięć przykazań")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Dziesięć przykazań - fabularny")
                    );
                } else if (line1.contains("Lombard. Życie pod zastaw")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Lombard. Życie pod zastaw - serial obyczajowy")
                    );
                } else if (line1.contains("Na wariackich papierach")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Na wariackich papierach - fabularny")
                    );
                } else if (line1.contains("Gliniarz i prokurator")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Gliniarz i prokurator - fabularny")
                    );
                } else if (line1.contains("Kobra - oddział specjalny")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Kobra - oddział specjalny - fabularny")
                    );
                } else if (line1.contains("Agenci NCIS: Los Angeles")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Agenci NCIS: Los Angeles - fabularny")
                    );
                } else if (line1.contains("Biesiada na cztery pory roku")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Biesiada na cztery pory roku - serial obyczajowy")
                    );
                } else if (line1.contains("Menu na miarę")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Menu na miarę - fabularny")
                    );
                } else if (line1.contains("Z archiwum policji")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Z archiwum policji - fabularny")
                    );
                } else if (line1.contains("Skorpion")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Skorpion - fabularny")
                    );
                } else if (line1.contains("Taki jest świat")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Taki jest świat - program informacyjny")
                    );
                } else if (line1.contains("Tajemnice medyczne")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Tajemnice medyczne - akcja")
                    );
                } else if (line1.contains("Na jedwabnym szlaku")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Na jedwabnym szlaku - serial dokumentalny")
                    );
                } else if (line1.contains("Ostatni smok")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Ostatni smok - przygodowy")
                    );
                } else if (line1.contains("Alvin i wiewiórki 2")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Alvin i wiewiórki 2 - familijny")
                    );
                } else if (line1.contains("Królowa Serc")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Królowa Serc - telenowela")
                    );
                } else if (line1.contains("Co ludzie powiedzą?")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Co ludzie powiedzą? - fabularny")
                    );
                } else if (line1.contains("Wikingowie")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Wikingowie - fabularny")
                    );
                } else if (line1.contains("Niech żyje")) {
                    writer.write(line1
                            .replace(line1, line1.substring(0, 5) + "\t" + "Niech żyje król Julian - animacja")
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


                if (line2.contains("Królowa Serc")) {
                    writer.write(line2
                            .replace(line2, line2 + "\n"));
                } else if (line2.contains("Menu na miarę")) {
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
