package methods;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StopklatkaTV {


    public static void main(String[] args) throws Exception {

        String path = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\input\\Stopklatka TV.txt";
        String pathOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputStopklatka TV_1.txt";
        String pathOut2 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputStopklatka TV_2.txt";
        String pathOut3 = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\tempFiles\\outputStopklatka TV_3.txt";
        String finalOut = "E:\\IdeaProjects\\ProgramObrobkaPlikowTV\\documents\\output\\finalStopklatka TV.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(path));
            writer = new BufferedWriter(new FileWriter(pathOut));

            String line1;

            while ((line1 = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile("([0-9]{1,2}):([0-9]{1,2})\t");
                Matcher matcher = pattern.matcher(line1);

                if (matcher.find()) {
                    writer.write(line1
                            .replace(matcher.group(), matcher.group().substring(0, 2) + "\t")
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
            reader = new BufferedReader(new FileReader(pathOut));
            writer = new BufferedWriter(new FileWriter(pathOut2));

            String line2;

            while ((line2 = reader.readLine()) != null) {


                if (line2.contains("Złotopolscy")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Złotopolscy - komedia obyczajowa")
                    );
                } else if (line2.contains("MiłośćKropka.pl")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "MiłośćKropka.pl - rozrywkowa")
                    );
                } else if (line2.contains("Niania")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Niania - komedia")
                    );
                } else if (line2.contains("Umrzesz ze śmiechu")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Umrzesz ze śmiechu - wpadki i wypadki - rozrywkowa")
                    );
                } else if (line2.contains("Pułapki umysłu")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Pułapki umysłu - film dokumentalny")
                    );
                } else if (line2.contains("Katastrofy w przestworzach")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Katastrofy w przestworzach - film dokumentalny")
                    );
                } else if (line2.contains("Pułapki umysłu")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Pułapki umysłu - film dokumentalny")
                    );
                } else if (line2.contains("Stawka większa")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Stawka większa niż życie - wojenny")
                    );
                } else if (line2.contains("Horror piątkowej nocy")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Horror piątkowej nocy")
                    );
                } else if (line2.contains("Wolf Creek")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Wolf Creek - thriller")
                    );
                } else if (line2.contains("Popioły")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Popioły - dramat kostiumowy")
                    );
                } else if (line2.contains("Komisarz Rex")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Komisarz Rex - sensacyjny")
                    );
                } else if (line2.contains("Poirot")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Poirot: Dwanaście prac Herkulesa - kryminalny")
                    );
                } else if (line2.contains("Szpital nadziei")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Szpital nadziei - obyczajowy")
                    );
                } else if (line2.contains("Ciężarówką po antypodach")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Ciężarówką po antypodach - film dokumentalny")
                    );
                } else if (line2.contains("Titanic 1912")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Titanic 1912: akta sprawy - film dokumentalny")
                    );
                } else if (line2.contains("Sekrety luksusowych hoteli")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Sekrety luksusowych hoteli - film dokumentalny")
                    );
                } else if (line2.contains("Meteor")) {
                    writer.write(line2
                            .replace(line2, line2.substring(0, 5) + "\t" + "Meteor - science fiction")
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

            String line2;

            while ((line2 = reader.readLine()) != null) {

                String sentence = line2;

                if (line2.length() > 100) {

                    String[] array = sentence.split(", Kraj");
                    String word = array[0];

                    writer.write(line2
                            .replace(sentence, word)
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
                reader = new BufferedReader(new FileReader(pathOut3));
                writer = new BufferedWriter(new FileWriter(finalOut));

                String line3;

                while ((line3 = reader.readLine()) != null) {

                    Pattern pattern = Pattern.compile("\\((.*)\\), ");
                    Matcher matcher = pattern.matcher(line3);

                    if (matcher.find()) {
                        writer.write(line3
                                .replace(matcher.group(), "")
                                .replace(" fabularny, dramat, thriller", " - thriller")
                                .replace("fabularny, thriller", "- fabularny")
                                .replace("fabularny, przygodowo-fantastyczny", "- przygodowo-fantastyczny")
                                .replace(" fabularny, komedia obyczajowa", " - komedia obyczajowa")
                                .replace("dokumentalny, film dokumentalny", "- film dokumentalny")
                                .replace("fabularny, przygodowy, sensacyjny", "- przygodowy")
                                .replace("fabularny, dramat historyczny", "- dramat historyczny")
                                .replace("fabularny, kryminalny", "- kryminalny")
                                .replace("fabularny, sensacyjny", "- sensacyjny")
                                .replace("fabularny, komedia, przygodowy", "- komedia")
                                .replace("fabularny, komedia romantyczna", "- komedia romantyczna")
                                .replace("fabularny, komedia", "- komedia")
                                .replace("fabularny, dramat", "- dramat")
                                .replace("etiuda fabularna, krótkometrażowy", "- krótkometrażowy")
                                .replace("fabularny, horror", "- horror")
                                .replace("komedia, komedia sensacyjna", "komedia sensacyjna")
                                .replace("  ", " ")
                                .replace(", -", " -")
                                .replace("  -", " -")
                        );
                    } else {
                        writer.write(line3
                                .replace("", "")
                                .replace(" fabularny, dramat, thriller", " - thriller")
                                .replace("fabularny, thriller", "- fabularny")
                                .replace("fabularny, horror", "- horror")
                                .replace("fabularny, komedia", "- komedia")
                                .replace("fabularny, przygodowo-fantastyczny", "- przygodowo-fantastyczny")
                                .replace(" fabularny, komedia obyczajowa", " - komedia obyczajowa")
                                .replace("dokumentalny, film dokumentalny", "- film dokumentalny")
                                .replace("etiuda fabularna, krótkometrażowy", "- krótkometrażowy")
                                .replace("fabularny, dramat", "- dramat")
                                .replace("fabularny, przygodowy, sensacyjny", "- przygodowy")
                                .replace("fabularny, komedia romantyczna", "- komedia romantyczna")
                                .replace("fabularny, dramat historyczny", "- dramat historyczny")
                                .replace("fabularny, kryminalny", "- kryminalny")
                                .replace("fabularny, sensacyjny", "- sensacyjny")
                                .replace("fabularny, komedia, przygodowy", "- komedia")
                                .replace("fabularny, przygodowy", "- przygodowy")
                                .replace("komedia, komedia sensacyjna", "komedia sensacyjna")
                                .replace("  ", " ")
                                .replace(", -", " -")
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


    }
}
