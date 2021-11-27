package by.itoverone.Service;

import by.itoverone.entity.Programmer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgrammerService extends Programmer {
    public static List<Programmer> sortOfProgrammers() throws FileNotFoundException {
        File file = new File("file.txt");
        Scanner scanner = new Scanner(file);
        List<Programmer> pr1 = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] lines = s.split("_");
            String nameOfPr = lines[0];
            String PrLang = lines[1];
            pr1.add(new Programmer(nameOfPr, PrLang));

        }
        System.out.println("имена програмистов,которые владеют Java : ");
        for (int i = 0; i < pr1.size(); i++) {
            if (pr1.get(i).getPrLang().equals("Java")) {
                System.out.println(pr1.get(i).getNameOfPr());
            }
        }
        return pr1;
    }
}


