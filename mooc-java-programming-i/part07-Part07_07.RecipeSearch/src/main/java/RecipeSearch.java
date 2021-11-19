
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> recipes = new ArrayList<>();
        ArrayList<String> ingredients = new ArrayList<>();

        System.out.println("File to read:");
        String filename = scanner.nextLine();

        try (Scanner file = new Scanner(Paths.get(filename))) {
            String recipe;
            while (file.hasNextLine()) {
                recipe = file.nextLine();
                recipes.add(recipe);
            }

            while (true) {
                System.out.println("Commands:");
                System.out.println("list - lists the recipes");
                System.out.println("stop - stops the program:");
                System.out.println("find name - searches recipes by name");
                System.out.println("find cooking time - searches recipes by cooking time");
                System.out.println("Enter command:");
                String command = scanner.nextLine();
                if (command.equals("stop")) {
                    break;
                }

                if (command.equals("list")) {
                    System.out.println("Recipes:");
                    System.out.println(recipes.get(0) + ", cooking time: " + recipes.get(1));
                    for (int i = 0; i < recipes.size(); i++) {
                        if (recipes.get(i).equals("")) {
                            System.out.println(recipes.get(i + 1) + ", cooking time: " + recipes.get(i + 2));

                        }
                    }
                }

                if (command.equals("find name")) {
                    System.out.println("Searched word:");
                    String searchWord = scanner.nextLine();

                    System.out.println("Recipes:");
                    if (recipes.get(0).equals(searchWord)) {
                        System.out.println(recipes.get(0) + ", cooking time: " + recipes.get(1));
                    }

                    for (int i = 0; i < recipes.size(); i++) {
                        if (recipes.get(i).equals("")) {
                            if (recipes.get(i + 1).contains(searchWord)) {
                                System.out.println("Recipes:");
                                System.out.println(recipes.get(i + 1) + ", cooking time: " + recipes.get(i + 2));
                            }
                        }
                    }
                }

                if (command.equals("find cooking time")) {
                    System.out.println("Max cooking time:");
                    int cookingTime = Integer.parseInt(scanner.nextLine());

                    System.out.println("Recipes:");
                    if (Integer.parseInt(recipes.get(1)) <= cookingTime) {
                        System.out.println(recipes.get(0) + ", cooking time: " + recipes.get(1));
                    }

                    for (int i = 0; i < recipes.size(); i++) {
                        if (recipes.get(i).equals("")) {
                            if (Integer.parseInt(recipes.get(i + 2)) <= cookingTime) {
                                System.out.println(recipes.get(i + 1) + ", cooking time: " + recipes.get(i + 2));
                            }
                        }
                    }
                }

                if (command.equals("list ingredients")) {
                    for (int i = 0; i < recipes.size(); i++) {
                        if (recipes.get(i).equals("")) {
                            for (int j = 2; j < recipes.size(); j++) {
                                System.out.println(recipes.get(j));
                            }

                        }
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
