package com.example.javalaba63;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Locale;

import static com.example.javalaba63.DataFormatDemo.showBothStyles;


public class Test {
    public Test() {
    }

    public static Worker[] createTeam(Locale loc) {
        Worker[] team = new Worker[5];
        team[0] = new Programmer(AppLocale.getString("Pasha"));
        team[0].setInfo(AppLocale.getString("MiddleJavaProgrammer"));
        team[0].setCreationDate(new Date());
        team[1] = new QA(AppLocale.getString("Anna"));
        team[1].setInfo(AppLocale.getString("AutomaticTestingSpecialist"));
        team[1].setCreationDate(new Date());
        team[2] = new Designer(AppLocale.getString("Daniel"));
        team[2].setInfo(AppLocale.getString("MotionDesigner"));
        team[2].setCreationDate(new Date());
        team[3] = new Analyst(AppLocale.getString("Alex"));
        team[3].setInfo(AppLocale.getString("BusinessAnalyst"));
        team[3].setCreationDate(new Date());
        team[4] = new Manager(AppLocale.getString("Sax"));
        team[4].setInfo(AppLocale.getString("ProductManager"));
        team[4].setCreationDate(new Date());
        return team;
    }

    static Locale createLocale(String[] args) {
        if (args.length == 2) {
            return new Locale(args[0], args[1]);
        } else {
            return args.length == 4 ? new Locale(args[2], args[3]) : null;
        }
    }

    static void setupConsole(String[] args) {
        if (args.length >= 2 && args[0].equals("-encoding")) {
            try {
                System.setOut(new PrintStream(System.out, true, args[1]));
            } catch (UnsupportedEncodingException var2) {
                System.err.println("Unsupported encoding: " + args[1]);
                System.exit(1);
            }
        }

    }

    public static void main(String[] args) {
        try {
            setupConsole(args);
            Locale loc = createLocale(args);
            if (loc == null) {
                System.err.println("Invalid argument(s)\nSyntax: [-encoding ENCODING_ID] language country\n" +
                        "Example: -encoding Cp855 be BY");
                System.exit(1);
            }

            AppLocale.set(loc);
            Connector con = new Connector("team_stage2.dat");
            con.write(createTeam(loc));
            Worker[] team = con.read();
            System.out.println(AppLocale.getString(AppLocale.worker)+":");
            for ( Worker n : team ) {
                System.out.println(n);
                System.out.println(showBothStyles(loc));
            }
            System.out.println();


        } catch (Exception e) {
            System.err.println(e);
        }

    }}


