import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int year;
        int choice;
        int cchoice;
        System.out.println("Which Sport You Want");
        System.out.println("1. Circket ");
        System.out.println("2. Football");
        Scanner sc  = new Scanner(System.in);
        choice =  sc.nextInt();
        if(choice == 1){
            System.out.println("You Intersted in T20 or ODI ");
            System.out.println("1. T20  ");
            System.out.println("2. ODI ");
             cchoice = sc.nextInt();
            switch(cchoice){
                case  1 :
                System.out.println(WorldCupT20.class);
                break;
                case 2:
                System.out.println(WorldCupODI.class); 
                break;
                default : 
                System.out.println(" Please Enter the valid veriable");
                      
    

            }
            
        }else if(choice == 2){
            System.out.println(FifaWorldCup.class);
        }




        System.out.println(" ------Football WorldCups Since 2000------ ");
        System.out.println();
        System.out.println();
        System.out.println();

        //2002
        //2002
        //2002
        ArrayList<FootballTeam> FifaTeam2002 = new ArrayList<>();
        FifaWorldCup Fifa2002 = new FifaWorldCup("FIFA World Cup", 2002, 2705196, 16, "South Korea & Japan", "Brazil", FifaTeam2002);

        FootballTeam FifaBrazil02 = new FootballTeam("Brazil", "Cafu", 5, "Luiz Felipe Scolari");
        FootballTeam FifaGermany02 = new FootballTeam("Germany", "Oliver Kahn", 4, "Rudi Völler");
        FootballTeam FifaTurkey02 = new FootballTeam("Turkey", "Rüştü Reçber", 0, "Şenol Güneş");
        FootballTeam FifaSouthKorea02 = new FootballTeam("South Korea", "Hong Myung-bo", 0, "Guus Hiddink");
        FootballTeam FifaSpain02 = new FootballTeam("Spain", "Fernando Hierro", 0, "José Antonio Camacho");
        FootballTeam FifaEngland02 = new FootballTeam("England", "David Beckham", 0, "Sven-Göran Eriksson");
        FootballTeam FifaArgentina02 = new FootballTeam("Argentina", "Roberto Ayala", 2, "Marcelo Bielsa");
        FootballTeam FifaItaly02 = new FootballTeam("Italy", "Paolo Maldini", 0, "Giovanni Trapattoni");
        FootballTeam FifaFrance02 = new FootballTeam("France", "Marcel Desailly", 2, "Roger Lemerre");
        FootballTeam FifaNigeria02 = new FootballTeam("Nigeria", "Jay-Jay Okocha", 0, "Adegboye Onigbinde");
        FootballTeam FifaMexico02 = new FootballTeam("Mexico", "Cuauhtémoc Blanco", 0, "Javier Aguirre");
        FootballTeam FifaJapan02 = new FootballTeam("Japan", "Hidetoshi Nakata", 0, "Philippe Troussier");
        FootballTeam FifaUSA02 = new FootballTeam("USA", "Clint Mathis", 0, "Bruce Arena");
        FootballTeam FifaCameroon02 = new FootballTeam("Cameroon", "Rigobert Song", 0, "Winfried Schäfer");
        FootballTeam FifaPortugal02 = new FootballTeam("Portugal", "Fernando Couto", 0, "António Oliveira");
        FootballTeam FifaRussia02 = new FootballTeam("Russia", "Yuri Nikiforov", 0, "Oleg Romantsev");


        FifaTeam2002.add(FifaBrazil02);
        FifaTeam2002.add(FifaGermany02);
        FifaTeam2002.add(FifaTurkey02);
        FifaTeam2002.add(FifaSouthKorea02);
        FifaTeam2002.add(FifaSpain02);
        FifaTeam2002.add(FifaEngland02);
        FifaTeam2002.add(FifaArgentina02);
        FifaTeam2002.add(FifaItaly02);
        FifaTeam2002.add(FifaFrance02);
        FifaTeam2002.add(FifaNigeria02);
        FifaTeam2002.add(FifaMexico02);
        FifaTeam2002.add(FifaJapan02);
        FifaTeam2002.add(FifaUSA02);
        FifaTeam2002.add(FifaCameroon02);
        FifaTeam2002.add(FifaPortugal02);
        FifaTeam2002.add(FifaRussia02);


        Fifa2002.ShowFifaCupDetails();
        System.out.println();
        System.out.println();
        Fifa2002.FifaCupTeamsDetails();
        System.out.println();
        System.out.println();

        // 2006
        // 2006

        ArrayList<FootballTeam> FifaTeam2006 = new ArrayList<>();
        FifaWorldCup Fifa2006 = new FifaWorldCup("FIFA World Cup", 2006, 3359439, 16, "Germany", "Italy", FifaTeam2006);

        FootballTeam FifaItaly06 = new FootballTeam("Italy", "Fabio Cannavaro", 4, "Marcello Lippi");
        FootballTeam FifaFrance06 = new FootballTeam("France", "Zinedine Zidane", 1, "Raymond Domenech");
        FootballTeam FifaGermany06 = new FootballTeam("Germany", "Michael Ballack", 3, "Jürgen Klinsmann");
        FootballTeam FifaPortugal06 = new FootballTeam("Portugal", "Luís Figo", 0, "Luiz Felipe Scolari");
        FootballTeam FifaBrazil06 = new FootballTeam("Brazil", "Cafu", 5, "Carlos Alberto Parreira");
        FootballTeam FifaNetherlands06 = new FootballTeam("Netherlands", "Marco van Basten", 0, "Marco van Basten");
        FootballTeam FifaArgentina06 = new FootballTeam("Argentina", "Juan Román Riquelme", 0, "José Pékerman");
        FootballTeam FifaEngland06 = new FootballTeam("England", "David Beckham", 0, "Sven-Göran Eriksson");
        FootballTeam FifaSpain06 = new FootballTeam("Spain", "Raúl", 0, "Luis Aragonés");
        FootballTeam FifaMexico06 = new FootballTeam("Mexico", "Rafael Márquez", 0, "Ricardo La Volpe");
        FootballTeam FifaSweden06 = new FootballTeam("Sweden", "Freddie Ljungberg", 0, "Lars Lagerbäck");
        FootballTeam FifaCzechRepublic06 = new FootballTeam("Czech Republic", "Tomas Rosicky", 0, "Karel Brückner");
        FootballTeam FifaAustralia06 = new FootballTeam("Australia", "Mark Viduka", 0, "Guus Hiddink");
        FootballTeam FifaTunisia06 = new FootballTeam("Tunisia", "Riadh Bouazizi", 0, "Roger Lemerre");
        FootballTeam FifaSaudiArabia06 = new FootballTeam("Saudi Arabia", "Sami Al-Jaber", 0, "Marcos Paquetá");
        FootballTeam FifaIvoryCoast06 = new FootballTeam("Ivory Coast", "Didier Drogba", 0, "Henri Michel");


        FifaTeam2006.add(FifaItaly06);
        FifaTeam2006.add(FifaFrance06);
        FifaTeam2006.add(FifaGermany06);
        FifaTeam2006.add(FifaPortugal06);
        FifaTeam2006.add(FifaBrazil06);
        FifaTeam2006.add(FifaNetherlands06);
        FifaTeam2006.add(FifaArgentina06);
        FifaTeam2006.add(FifaEngland06);
        FifaTeam2006.add(FifaSpain06);
        FifaTeam2006.add(FifaMexico06);
        FifaTeam2006.add(FifaSweden06);
        FifaTeam2006.add(FifaCzechRepublic06);
        FifaTeam2006.add(FifaAustralia06);
        FifaTeam2006.add(FifaTunisia06);
        FifaTeam2006.add(FifaSaudiArabia06);
        FifaTeam2006.add(FifaIvoryCoast06);


        Fifa2006.ShowFifaCupDetails();
        System.out.println();
        System.out.println();
        Fifa2006.FifaCupTeamsDetails();
        System.out.println();
        System.out.println();

        //2010
        //2010

        ArrayList<FootballTeam> FifaTeam2010 = new ArrayList<>();
        FifaWorldCup Fifa2010 = new FifaWorldCup("FIFA World Cup", 2010, 3178856, 16, "South Africa", "Spain", FifaTeam2010);

        FootballTeam FifaSpain10 = new FootballTeam("Spain", "Iker Casillas", 1, "Vicente del Bosque");
        FootballTeam FifaNetherlands10 = new FootballTeam("Netherlands", "Giovanni van Bronckhorst", 0, "Bert van Marwijk");
        FootballTeam FifaGermany10 = new FootballTeam("Germany", "Philipp Lahm", 4, "Joachim Löw");
        FootballTeam FifaUruguay10 = new FootballTeam("Uruguay", "Diego Lugano", 2, "Óscar Tabárez");
        FootballTeam FifaArgentina10 = new FootballTeam("Argentina", "Javier Mascherano", 2, "Diego Maradona");
        FootballTeam FifaBrazil10 = new FootballTeam("Brazil", "Lúcio", 5, "Dunga");
        FootballTeam FifaGhana10 = new FootballTeam("Ghana", "John Mensah", 0, "Milovan Rajevac");
        FootballTeam FifaParaguay10 = new FootballTeam("Paraguay", "Justo Villar", 0, "Gerardo Martino");
        FootballTeam FifaJapan10 = new FootballTeam("Japan", "Makoto Hasebe", 0, "Takeshi Okada");
        FootballTeam FifaMexico10 = new FootballTeam("Mexico", "Rafael Márquez", 0, "Javier Aguirre");
        FootballTeam FifaPortugal10 = new FootballTeam("Portugal", "Simão Sabrosa", 0, "Carlos Queiroz");
        FootballTeam FifaEngland10 = new FootballTeam("England", "Steven Gerrard", 0, "Fabio Capello");
        FootballTeam FifaChile10 = new FootballTeam("Chile", "Claudio Bravo", 0, "Marcelo Bielsa");
        FootballTeam FifaKoreaRepublic10 = new FootballTeam("Korea Republic", "Park Ji-sung", 0, "Huh Jung-moo");
        FootballTeam FifaUSA10 = new FootballTeam("USA", "Carlos Bocanegra", 0, "Bob Bradley");
        FootballTeam FifaSlovakia10 = new FootballTeam("Slovakia", "Marek Hamšík", 0, "Vladimír Weiss");


        FifaTeam2010.add(FifaSpain10);
        FifaTeam2010.add(FifaNetherlands10);
        FifaTeam2010.add(FifaGermany10);
        FifaTeam2010.add(FifaUruguay10);
        FifaTeam2010.add(FifaArgentina10);
        FifaTeam2010.add(FifaBrazil10);
        FifaTeam2010.add(FifaGhana10);
        FifaTeam2010.add(FifaParaguay10);
        FifaTeam2010.add(FifaJapan10);
        FifaTeam2010.add(FifaMexico10);
        FifaTeam2010.add(FifaPortugal10);
        FifaTeam2010.add(FifaEngland10);
        FifaTeam2010.add(FifaChile10);
        FifaTeam2010.add(FifaKoreaRepublic10);
        FifaTeam2010.add(FifaUSA10);
        FifaTeam2010.add(FifaSlovakia10);


        Fifa2010.ShowFifaCupDetails();
        System.out.println();
        System.out.println();
        Fifa2010.FifaCupTeamsDetails();
        System.out.println();
        System.out.println();

        //2014
        //2014

        ArrayList<FootballTeam> FifaTeam2014 = new ArrayList<>();
        FifaWorldCup Fifa2014 = new FifaWorldCup("FIFA World Cup", 2014, 3429873, 32, "Brazil", "Germany", FifaTeam2014);

        FootballTeam FifaGermany14 = new FootballTeam("Germany", "Philipp Lahm", 4, "Joachim Löw");
        FootballTeam FifaNetherlands14 = new FootballTeam("Netherlands", "Robin van Persie", 0, "Louis van Gaal");
        FootballTeam FifaArgentina14 = new FootballTeam("Argentina", "Lionel Messi", 2, "Alejandro Sabella");
        FootballTeam FifaBrazil14 = new FootballTeam("Brazil", "Thiago Silva", 5, "Luiz Felipe Scolari");
        FootballTeam FifaColombia14 = new FootballTeam("Colombia", "Mario Yepes", 0, "José Pékerman");
        FootballTeam FifaBelgium14 = new FootballTeam("Belgium", "Vincent Kompany", 0, "Marc Wilmots");
        FootballTeam FifaFrance14 = new FootballTeam("France", "Hugo Lloris", 4, "Didier Deschamps");
        FootballTeam FifaCostaRica14 = new FootballTeam("Costa Rica", "Bryan Ruiz", 0, "Jorge Luis Pinto");
        FootballTeam FifaSwitzerland14 = new FootballTeam("Switzerland", "Gökhan Inler", 0, "Ottmar Hitzfeld");
        FootballTeam FifaMexico14 = new FootballTeam("Mexico", "Rafael Márquez", 0, "Miguel Herrera");
        FootballTeam FifaChile14 = new FootballTeam("Chile", "Claudio Bravo", 0, "Jorge Sampaoli");
        FootballTeam FifaUruguay14 = new FootballTeam("Uruguay", "Diego Godín", 2, "Óscar Tabárez");
        FootballTeam FifaAlgeria14 = new FootballTeam("Algeria", "Madjid Bougherra", 0, "Vahid Halilhodžić");
        FootballTeam FifaNigeria14 = new FootballTeam("Nigeria", "Joseph Yobo", 0, "Stephen Keshi");
        FootballTeam FifaGreece14 = new FootballTeam("Greece", "Giorgos Karagounis", 0, "Fernando Santos");
        FootballTeam FifaUSA14 = new FootballTeam("USA", "Clint Dempsey", 0, "Jürgen Klinsmann");


        FifaTeam2014.add(FifaGermany14);
        FifaTeam2014.add(FifaNetherlands14);
        FifaTeam2014.add(FifaArgentina14);
        FifaTeam2014.add(FifaBrazil14);
        FifaTeam2014.add(FifaColombia14);
        FifaTeam2014.add(FifaBelgium14);
        FifaTeam2014.add(FifaFrance14);
        FifaTeam2014.add(FifaCostaRica14);
        FifaTeam2014.add(FifaSwitzerland14);
        FifaTeam2014.add(FifaMexico14);
        FifaTeam2014.add(FifaChile14);
        FifaTeam2014.add(FifaUruguay14);
        FifaTeam2014.add(FifaAlgeria14);
        FifaTeam2014.add(FifaNigeria14);
        FifaTeam2014.add(FifaGreece14);
        FifaTeam2014.add(FifaUSA14);


        Fifa2014.ShowFifaCupDetails();
        System.out.println();
        System.out.println();
        Fifa2014.FifaCupTeamsDetails();
        System.out.println();
        System.out.println();


        //2018
        //2018

        ArrayList<FootballTeam> FifaTeam2018 = new ArrayList<>();
        FifaWorldCup Fifa2018 = new FifaWorldCup("FIFA World Cup", 2018, 3094577, 32, "Russia", "France", FifaTeam2018);

        FootballTeam FifaFrance18 = new FootballTeam("France", "Hugo Lloris", 2, "Didier Deschamps");
        FootballTeam FifaCroatia18 = new FootballTeam("Croatia", "Luka Modrić", 0, "Zlatko Dalić");
        FootballTeam FifaBelgium18 = new FootballTeam("Belgium", "Eden Hazard", 0, "Roberto Martínez");
        FootballTeam FifaEngland18 = new FootballTeam("England", "Harry Kane", 0, "Gareth Southgate");
        FootballTeam FifaUruguay18 = new FootballTeam("Uruguay", "Diego Godín", 2, "Óscar Tabárez");
        FootballTeam FifaBrazil18 = new FootballTeam("Brazil", "Neymar", 5, "Tite");
        FootballTeam FifaRussia18 = new FootballTeam("Russia", "Igor Akinfeev", 0, "Stanislav Cherchesov");
        FootballTeam FifaSweden18 = new FootballTeam("Sweden", "Andreas Granqvist", 0, "Janne Andersson");
        FootballTeam FifaColombia18 = new FootballTeam("Colombia", "Radamel Falcao", 0, "José Pékerman");
        FootballTeam FifaSpain18 = new FootballTeam("Spain", "Sergio Ramos", 1, "Fernando Hierro");
        FootballTeam FifaMexico18 = new FootballTeam("Mexico", "Andrés Guardado", 0, "Juan Carlos Osorio");
        FootballTeam FifaSwitzerland18 = new FootballTeam("Switzerland", "Stephan Lichtsteiner", 0, "Vladimir Petković");
        FootballTeam FifaJapan18 = new FootballTeam("Japan", "Makoto Hasebe", 0, "Akira Nishino");
        FootballTeam FifaDenmark18 = new FootballTeam("Denmark", "Simon Kjær", 0, "Åge Hareide");
        FootballTeam FifaPortugal18 = new FootballTeam("Portugal", "Cristiano Ronaldo", 0, "Fernando Santos");
        FootballTeam FifaArgentina18 = new FootballTeam("Argentina", "Lionel Messi", 2, "Jorge Sampaoli");


        FifaTeam2018.add(FifaFrance18);
        FifaTeam2018.add(FifaCroatia18);
        FifaTeam2018.add(FifaBelgium18);
        FifaTeam2018.add(FifaEngland18);
        FifaTeam2018.add(FifaUruguay18);
        FifaTeam2018.add(FifaBrazil18);
        FifaTeam2018.add(FifaRussia18);
        FifaTeam2018.add(FifaSweden18);
        FifaTeam2018.add(FifaColombia18);
        FifaTeam2018.add(FifaSpain18);
        FifaTeam2018.add(FifaMexico18);
        FifaTeam2018.add(FifaSwitzerland18);
        FifaTeam2018.add(FifaJapan18);
        FifaTeam2018.add(FifaDenmark18);
        FifaTeam2018.add(FifaPortugal18);
        FifaTeam2018.add(FifaArgentina18);


        Fifa2018.ShowFifaCupDetails();
        System.out.println();
        System.out.println();
        Fifa2018.FifaCupTeamsDetails();
        System.out.println();
        System.out.println();









        ArrayList<FootballTeam> FifaTeam2022 = new ArrayList<>();
        FifaWorldCup Fifa2022= new FifaWorldCup("Fifa World Cup",2022,4390870,16,"Qatar","Argentina",FifaTeam2022);

        FootballTeam FifaSaudia22 = new FootballTeam("Saudia Arbia","Salman al Faraj",0,"Herve Renard");
        FootballTeam FifaBrazil22 = new FootballTeam("Brazil","Thiago Silva",5,"Tite");
        FootballTeam FifaQatar22 = new FootballTeam("Qatar","Hassan al Qudoos",1,"Filen-Sachez ");
        FootballTeam FifaArgentina22 = new FootballTeam("Argentina","Lionel Messi",2,"Lionel Sacloni");
        FootballTeam FifaBelgium22 = new FootballTeam("Belgium","Eden Hazard",0,"Roberto martinez");
        FootballTeam FifaDenmark22 = new FootballTeam("Denmark","Simon Kazeer",0,"Kasper Hjulmand");
        FootballTeam FifaDEngland22 = new FootballTeam("England","Harry Kane",0,"Gareth Southgate");
        FootballTeam FifaFrance22 = new FootballTeam("FRANCE","HugoLoris",4,"Didear");
        FootballTeam FifaGermany22 = new FootballTeam("Germany","HansiFlick",2,"Manuel Neuer");
        FootballTeam FifaIran22 = new FootballTeam("Iran","Ehsan Hajsafi",0,"Dreagon Sofick");
        FootballTeam FifaNetherLands22 = new FootballTeam("NetherLands","Virgil Van",0,"Louis vs gaal");
        FootballTeam FifaSerbia22 = new FootballTeam("Serbia","Dusan Tadic",0,"Dragon Stojovic");
        FootballTeam FifaSpain22 = new FootballTeam("Spain","Sergio ",1,"Luis Enrique");
        FootballTeam FifaSwitzerland22 = new FootballTeam("Switzerland","Granit Xhaka",0,"Murat Yakin");
        FootballTeam FifaSouthKorea22 = new FootballTeam("SouthKorea","SOn Hyueng-min",0,"Paulo Banto");
        FootballTeam FifaUsa22 = new FootballTeam("Usa","Christian Pulisic ",0,"Gregg Berhhalter");
        FootballTeam FifaPoland22 = new FootballTeam("Poland","Robert Hoood",0,"Abid Panhwar");


        FifaTeam2022.add(FifaBrazil22);
        FifaTeam2022.add(FifaFrance22);
        FifaTeam2022.add(FifaDEngland22);
        FifaTeam2022.add(FifaPoland22);
        FifaTeam2022.add(FifaUsa22);
        FifaTeam2022.add(FifaSouthKorea22);
        FifaTeam2022.add(FifaSwitzerland22);
        FifaTeam2022.add(FifaSerbia22);
        FifaTeam2022.add(FifaArgentina22);
        FifaTeam2022.add(FifaSaudia22);
        FifaTeam2022.add(FifaGermany22);
        FifaTeam2022.add(FifaIran22);
        FifaTeam2022.add(FifaSpain22);
        FifaTeam2022.add(FifaBelgium22);
        FifaTeam2022.add(FifaNetherLands22);
        FifaTeam2022.add(FifaDenmark22);
        FifaTeam2022.add(FifaQatar22);


        Fifa2022.ShowFifaCupDetails();
        System.out.println();
        System.out.println();
        Fifa2022.FifaCupTeamsDetails();
        System.out.println();
        System.out.println();
















        System.out.println();
        System.out.println();
        System.out.println("------T20 World CUP Since 2007------ ");

        ArrayList<CricketTeam> T20Teams2007 = new ArrayList<>();
        WorldCupT20 T20WorldCup2007 = new WorldCupT20("T20 World Cup",2007,320000,8,"Srilanka","India",T20Teams2007);

        CricketTeam T20India2007 = new CricketTeam("India", "Mahendra Singh Dhoni", "Gary Kirsten");
        CricketTeam T20Pakistan2007 = new CricketTeam("Pakistan", "Shoaib Malik", "Intikhab Alam");
        CricketTeam T20Australia2007 = new CricketTeam("Australia", "Adam Gilchrist", "Tim Nielsen");
        CricketTeam T20NewZealand2007 = new CricketTeam("New Zealand", "Stephen Fleming", "John Bracewell");
        CricketTeam T20England2007 = new CricketTeam("England", "Paul Collingwood", "Peter Moores");
        CricketTeam T20Bangladesh2007 = new CricketTeam("Bangladesh", "Habibul Bashar", "Dav Whatmore");
        CricketTeam T20SouthAfrica2007 = new CricketTeam("South Africa", "Graeme Smith", "Mickey Arthur");
        CricketTeam T20SriLanka2007 = new CricketTeam("Sri Lanka", "Mahela Jayawardene", "Trevor Bayliss");

        T20Teams2007.add(T20India2007);
        T20Teams2007.add(T20Pakistan2007);
        T20Teams2007.add(T20Australia2007);
        T20Teams2007.add(T20NewZealand2007);
        T20Teams2007.add(T20England2007);
        T20Teams2007.add(T20Bangladesh2007);
        T20Teams2007.add(T20SouthAfrica2007);
        T20Teams2007.add(T20SriLanka2007);

        System.out.println();
        System.out.println();

        T20WorldCup2007.ShowWorldCupDetail20();
        System.out.println();
        T20WorldCup2007.worldCupTeamsDetails();
        System.out.println();
        System.out.println();

        // T20Cup2007



        // T20Cup2009

        ArrayList<CricketTeam> T20Teams2009 = new ArrayList<>();
        WorldCupT20 T20WorldCup2009 = new WorldCupT20("T20 World Cup",2009,420000,8,"Australia","Pakistan",T20Teams2009);

        CricketTeam T20India2009 = new CricketTeam("India", "Mahendra Singh Dhoni", "Gary Kirsten");
        CricketTeam T20Pakistan2009 = new CricketTeam("Pakistan", "Younis Khan", "Intikhab Alam");
        CricketTeam T20Australia2009 = new CricketTeam("Australia", "Ricky Ponting", "Tim Nielsen");
        CricketTeam T20NewZealand2009 = new CricketTeam("New Zealand", "Daniel Vettori", "Andy Moles");
        CricketTeam T20England2009 = new CricketTeam("England", "Paul Collingwood", "Andy Flower");
        CricketTeam T20Bangladesh2009 = new CricketTeam("Bangladesh", "Shakib Al Hasan", "Jamie Siddons");
        CricketTeam T20SouthAfrica2009 = new CricketTeam("South Africa", "Graeme Smith", "Mickey Arthur");
        CricketTeam T20SriLanka2009 = new CricketTeam("Sri Lanka", "Kumar Sangakkara", "Trevor Bayliss");

        T20Teams2009.add(T20India2009);
        T20Teams2009.add(T20Pakistan2009);
        T20Teams2009.add(T20Australia2009);
        T20Teams2009.add(T20NewZealand2009);
        T20Teams2009.add(T20England2009);
        T20Teams2009.add(T20Bangladesh2009);
        T20Teams2009.add(T20SouthAfrica2009);
        T20Teams2009.add(T20SriLanka2009);

        System.out.println();
        System.out.println();

        T20WorldCup2009.ShowWorldCupDetail20();
        System.out.println();
        T20WorldCup2009.worldCupTeamsDetails();
        System.out.println();
        System.out.println();


        // T20Cup2009



        // T20 Cup 2010
        ArrayList<CricketTeam> T20Teams2010 = new ArrayList<>();
        WorldCupT20 T20WorldCup2010 = new WorldCupT20("T20 World Cup",2010,20000,8,"WestIndies","England",T20Teams2010);

        CricketTeam T20India2010 = new CricketTeam("India", "Mahendra Singh Dhoni", "Gary Kirsten");
        CricketTeam T20Pakistan2010 = new CricketTeam("Pakistan", "Shahid Afridi", "Waqar Younis");
        CricketTeam T20Australia2010 = new CricketTeam("Australia", "Michael Clarke", "Tim Nielsen");
        CricketTeam T20NewZealand2010 = new CricketTeam("New Zealand", "Daniel Vettori", "John Wright");
        CricketTeam T20England2010 = new CricketTeam("England", "Paul Collingwood", "Andy Flower");
        CricketTeam T20Bangladesh2010 = new CricketTeam("Bangladesh", "Mashrafe Mortaza", "Jamie Siddons");
        CricketTeam T20SouthAfrica2010 = new CricketTeam("South Africa", "Graeme Smith", "Corrie van Zyl");
        CricketTeam T20SriLanka2010 = new CricketTeam("Sri Lanka", "Kumar Sangakkara", "Trevor Bayliss");

        T20Teams2010.add(T20India2010);
        T20Teams2010.add(T20Pakistan2010);
        T20Teams2010.add(T20Australia2010);
        T20Teams2010.add(T20NewZealand2010);
        T20Teams2010.add(T20England2010);
        T20Teams2010.add(T20Bangladesh2010);
        T20Teams2010.add(T20SouthAfrica2010);
        T20Teams2010.add(T20SriLanka2010);

        System.out.println();
        System.out.println();

        T20WorldCup2010.ShowWorldCupDetail20();
        System.out.println();
        T20WorldCup2010.worldCupTeamsDetails();
        System.out.println();
        System.out.println();

        // 2010

        // 2012
        ArrayList<CricketTeam> T20Teams2012 = new ArrayList<>();
        WorldCupT20 T20WorldCup2012 = new WorldCupT20("T20 World Cup",2012,620000,8,"England","Westindies",T20Teams2012);

        CricketTeam T20India2012 = new CricketTeam("India", "Mahendra Singh Dhoni", "Duncan Fletcher");
        CricketTeam T20Pakistan2012 = new CricketTeam("Pakistan", "Mohammad Hafeez", "Dav Whatmore");
        CricketTeam T20Australia2012 = new CricketTeam("Australia", "George Bailey", "Mickey Arthur");
        CricketTeam T20NewZealand2012 = new CricketTeam("New Zealand", "Ross Taylor", "Mike Hesson");
        CricketTeam T20England2012 = new CricketTeam("England", "Stuart Broad", "Andy Flower");
        CricketTeam T20Bangladesh2012 = new CricketTeam("West Indies", "Darren Sammy", "Ottis Gibson");
        CricketTeam T20SouthAfrica2012 = new CricketTeam("South Africa", "AB de Villiers", "Gary Kirsten");
        CricketTeam T20SriLanka2012 = new CricketTeam("Sri Lanka", "Mahela Jayawardene", "Graham Ford");

        T20Teams2012.add(T20India2012);
        T20Teams2012.add(T20Pakistan2012);
        T20Teams2012.add(T20Australia2012);
        T20Teams2012.add(T20NewZealand2012);
        T20Teams2012.add(T20England2012);
        T20Teams2012.add(T20Bangladesh2012);
        T20Teams2012.add(T20SouthAfrica2012);
        T20Teams2012.add(T20SriLanka2012);

        System.out.println();
        System.out.println();

        T20WorldCup2012.ShowWorldCupDetail20();
        System.out.println();
        T20WorldCup2012.worldCupTeamsDetails();
        System.out.println();
        System.out.println();

        //2012

        //2014

        ArrayList<CricketTeam> T20Teams2014 = new ArrayList<>();
        WorldCupT20 T20WorldCup2014 = new WorldCupT20("T20 World Cup", 2014, 620000, 8, "Bangladesh", "Sri Lanka", T20Teams2014);

        CricketTeam T20India2014 = new CricketTeam("India", "Mahendra Singh Dhoni", "Duncan Fletcher");
        CricketTeam T20Pakistan2014 = new CricketTeam("Pakistan", "Mohammad Hafeez", "Moin Khan");
        CricketTeam T20Australia2014 = new CricketTeam("Australia", "George Bailey", "Darren Lehmann");
        CricketTeam T20NewZealand2014 = new CricketTeam("New Zealand", "Brendon McCullum", "Mike Hesson");
        CricketTeam T20England2014 = new CricketTeam("England", "Stuart Broad", "Ashley Giles");
        CricketTeam T20Bangladesh2014 = new CricketTeam("Bangladesh", "Mushfiqur Rahim", "Chandika Hathurusingha");
        CricketTeam T20SouthAfrica2014 = new CricketTeam("South Africa", "Faf du Plessis", "Russell Domingo");
        CricketTeam T20SriLanka2014 = new CricketTeam("Sri Lanka", "Lasith Malinga", "Paul Farbrace");

        T20Teams2014.add(T20India2014);
        T20Teams2014.add(T20Pakistan2014);
        T20Teams2014.add(T20Australia2014);
        T20Teams2014.add(T20NewZealand2014);
        T20Teams2014.add(T20England2014);
        T20Teams2014.add(T20Bangladesh2014);
        T20Teams2014.add(T20SouthAfrica2014);
        T20Teams2014.add(T20SriLanka2014);

        System.out.println();
        System.out.println();

        T20WorldCup2014.ShowWorldCupDetail20();
        System.out.println();
        T20WorldCup2014.worldCupTeamsDetails();
        System.out.println();
        System.out.println();

        // 2014

        ArrayList<CricketTeam> T20Teams2016 = new ArrayList<>();
        WorldCupT20 T20WorldCup2016 = new WorldCupT20("T20 World Cup", 2016, 620000, 8, "India", "West Indies", T20Teams2016);

        CricketTeam T20India2016 = new CricketTeam("India", "Mahendra Singh Dhoni", "Ravi Shastri");
        CricketTeam T20Pakistan2016 = new CricketTeam("Pakistan", "Shahid Afridi", "Waqar Younis");
        CricketTeam T20Australia2016 = new CricketTeam("Australia", "Steven Smith", "Darren Lehmann");
        CricketTeam T20NewZealand2016 = new CricketTeam("New Zealand", "Kane Williamson", "Mike Hesson");
        CricketTeam T20England2016 = new CricketTeam("England", "Eoin Morgan", "Trevor Bayliss");
        CricketTeam T20WestIndies2016 = new CricketTeam("West Indies", "Darren Sammy", "Phil Simmons");
        CricketTeam T20SouthAfrica2016 = new CricketTeam("South Africa", "Faf du Plessis", "Russell Domingo");
        CricketTeam T20SriLanka2016 = new CricketTeam("Sri Lanka", "Angelo Mathews", "Graham Ford");

        T20Teams2016.add(T20India2016);
        T20Teams2016.add(T20Pakistan2016);
        T20Teams2016.add(T20Australia2016);
        T20Teams2016.add(T20NewZealand2016);
        T20Teams2016.add(T20England2016);
        T20Teams2016.add(T20WestIndies2016);
        T20Teams2016.add(T20SouthAfrica2016);
        T20Teams2016.add(T20SriLanka2016);

        System.out.println();
        System.out.println();

        T20WorldCup2016.ShowWorldCupDetail20();
        System.out.println();
        T20WorldCup2016.worldCupTeamsDetails();
        System.out.println();
        System.out.println();






        System.out.println("-------Details Of World Cup After 2002------- ");

        System.out.println();
        System.out.println();
        // 2003
        CricketTeam india2003 = new CricketTeam("India", "Sourav Gangly", "John Wright");
        CricketTeam Pakistan2003 = new CricketTeam("Pakistan", "Wasim Akram", "Richard Pybus");
        CricketTeam Australia2003 = new CricketTeam("Australia", "Ricky Pointing", "John Buchanan");
        CricketTeam NewZealand2003 = new CricketTeam("New Zealand", "Stephen Fleming", "David Trist");
        CricketTeam England2003 = new CricketTeam("England", "Nasser Hussain", "Duncan Fletcher");
        CricketTeam Bangladesh2003 = new CricketTeam("Bangladesh", "Khaled Mahmud", "Mohsin Kamal");
        CricketTeam SouthAfrica2003 = new CricketTeam("South Africa", "Shaun Pollock", "Eric Simons");
        CricketTeam SriLanka2003 = new CricketTeam("Sri Lanka", "Sanath Jayasuriya", "Dav Whatmore");
        // 2003

        ArrayList<CricketTeam> ODITeamList03 = new ArrayList<>();

        ODITeamList03.add(india2003);
        ODITeamList03.add(Pakistan2003);
        ODITeamList03.add(Australia2003);
        ODITeamList03.add(NewZealand2003);
        ODITeamList03.add(England2003);
        ODITeamList03.add(Bangladesh2003);
        ODITeamList03.add(SouthAfrica2003);
        ODITeamList03.add(SriLanka2003);

        WorldCupODI ODI2003 = new WorldCupODI("ODI World Cup", 2003, 20000, 8, "South Africa, Zimbabwe And Kenya", "Australia", ODITeamList03);
        ODI2003.ShowWorldCupDetailss();
        System.out.println();
        ODI2003.worldCupTeamsDetails();
        System.out.println();
        System.out.println();
        System.out.println();

        // 2007
        // 2007
        // 2007
        CricketTeam india2007 = new CricketTeam("India", "Rahul Dravid", "Greg Chappell");
        CricketTeam Pakistan2007 = new CricketTeam("Pakistan", "Inzamam-ul-Haq", "Bob Woolmer");
        CricketTeam Australia2007 = new CricketTeam("Australia", "Ricky Ponting", "John Buchanan");
        CricketTeam NewZealand2007 = new CricketTeam("New Zealand", "Stephen Fleming", "John Bracewell");
        CricketTeam England2007 = new CricketTeam("England", "Michael Vaughan", "Duncan Fletcher");
        CricketTeam Bangladesh2007 = new CricketTeam("Bangladesh", "Habibul Bashar", "Dav Whatmore");
        CricketTeam SouthAfrica2007 = new CricketTeam("South Africa", "Graeme Smith", "Mickey Arthur");
        CricketTeam SriLanka2007 = new CricketTeam("Sri Lanka", "Mahela Jayawardene", "Trevor Bayliss");

        ArrayList<CricketTeam> ODITeamList07 = new ArrayList<>();


        ODITeamList07.add(india2007);
        ODITeamList07.add(Pakistan2007);
        ODITeamList07.add(Australia2007);
        ODITeamList07.add(NewZealand2007);
        ODITeamList07.add(England2007);
        ODITeamList07.add(Bangladesh2007);
        ODITeamList07.add(SouthAfrica2007);
        ODITeamList07.add(SriLanka2007);

        WorldCupODI ODI2007 = new WorldCupODI("ODI World Cup", 2007, 200100, 8, "Australia", "Australia", ODITeamList07);
        ODI2007.ShowWorldCupDetailss();
        System.out.println();
        ODI2007.worldCupTeamsDetails();
        System.out.println();
        System.out.println();
        System.out.println();

        // 2007

        // 2011
        CricketTeam india = new CricketTeam("India", "MS Dhoni", "Gary Kirsten");
        CricketTeam Pakistan = new CricketTeam("Pakistan", "Shahid Afridi", "Waqar Younis");
        CricketTeam Australia = new CricketTeam("Australia", "Ricky Ponting", "John Buchanan");
        CricketTeam NewZealand = new CricketTeam("New Zealand", "Brendon McCullum", "Mike Hesson");
        CricketTeam England = new CricketTeam("England", "Eoin Morgan", "Trevor Bayliss");
        CricketTeam Bangladesh = new CricketTeam("Bangladesh", "Mashrafe Mortaza", "Chandika Hathurusingha");
        CricketTeam SouthAfrica = new CricketTeam("South Africa", "AB de Villiers", "Russell Domingo");
        CricketTeam SriLanka = new CricketTeam("Sri Lanka", "Angelo Mathews", "Chandika Hathurusingha");


        //  2011
        //  2011
        //  2011

        ArrayList<CricketTeam> ODITeamList11 = new ArrayList<>();

        ODITeamList11.add(india);
        ODITeamList11.add(Pakistan);
        ODITeamList11.add(Australia);
        ODITeamList11.add(NewZealand);
        ODITeamList11.add(England);
        ODITeamList11.add(Bangladesh);
        ODITeamList11.add(SouthAfrica);
        ODITeamList11.add(SriLanka);

        WorldCupODI ODI2011 = new WorldCupODI("ODI World Cup", 2011, 500000, 8, "India", "India", ODITeamList11);
        ODI2011.ShowWorldCupDetailss();
        System.out.println();
        ODI2011.worldCupTeamsDetails();

        //2011
        //2011
        //2011





        // 2015
        // 2015

        CricketTeam india2015 = new CricketTeam("India", "MS Dhoni", "Duncan Fletcher");
        CricketTeam Pakistan2015 = new CricketTeam("Pakistan", "Misbah-ul-Haq", "Waqar Younis");
        CricketTeam Australia2015 = new CricketTeam("Australia", "Michael Clarke", "Darren Lehmann");
        CricketTeam NewZealand2015 = new CricketTeam("New Zealand", "Brendon McCullum", "Mike Hesson");
        CricketTeam England2015 = new CricketTeam("England", "Eoin Morgan", "Peter Moores");
        CricketTeam Bangladesh2015 = new CricketTeam("Bangladesh", "Mashrafe Mortaza", "Chandika Hathurusingha");
        CricketTeam SouthAfrica2015 = new CricketTeam("South Africa", "AB de Villiers", "Russell Domingo");
        CricketTeam SriLanka2015 = new CricketTeam("Sri Lanka", "Angelo Mathews", "Marvan Atapattu");

        ArrayList<CricketTeam> ODITeamList15 = new ArrayList<>();

        ODITeamList15.add(india2015);
        ODITeamList15.add(Pakistan2015);
        ODITeamList15.add(Australia2015);
        ODITeamList15.add(NewZealand2015);
        ODITeamList15.add(England2015);
        ODITeamList15.add(Bangladesh2015);
        ODITeamList15.add(SouthAfrica2015);
        ODITeamList15.add(SriLanka2015);

        System.out.println();
        System.out.println();
        WorldCupODI ODI2015 = new WorldCupODI("ODI World Cup", 2015, 100000, 8, "Australia and New Zealand", "Australia", ODITeamList15);
        ODI2015.ShowWorldCupDetailss();
        System.out.println();
        ODI2015.worldCupTeamsDetails();
        System.out.println();
        System.out.println();



        //2015
        //2015


        // 2019
        CricketTeam india2019 = new CricketTeam("India", "Virat Kohli", "Ravi Shastri");
        CricketTeam Pakistan2019 = new CricketTeam("Pakistan", "Sarfaraz Ahmed", "Mickey Arthur");
        CricketTeam Australia2019 = new CricketTeam("Australia", "Aaron Finch", "Justin Langer");
        CricketTeam NewZealand2019 = new CricketTeam("New Zealand", "Kane Williamson", "Gary Stead");
        CricketTeam England2019 = new CricketTeam("England", "Eoin Morgan", "Trevor Bayliss");
        CricketTeam Bangladesh2019 = new CricketTeam("Bangladesh", "Mashrafe Mortaza", "Steve Rhodes");
        CricketTeam SouthAfrica2019 = new CricketTeam("South Africa", "Faf du Plessis", "Ottis Gibson");
        CricketTeam SriLanka2019 = new CricketTeam("Sri Lanka", "Dimuth Karunaratne", "Chandika Hathurusingha");


        ArrayList<CricketTeam> ODITeamList19 = new ArrayList<>();

        ODITeamList19.add(india2019);
        ODITeamList19.add(Pakistan2019);
        ODITeamList19.add(Australia2019);
        ODITeamList19.add(NewZealand2019);
        ODITeamList19.add(England2019);
        ODITeamList19.add(Bangladesh2019);
        ODITeamList19.add(SouthAfrica2019);
        ODITeamList19.add(SriLanka2019);

        WorldCupODI ODI2019 = new WorldCupODI("ODI World Cup", 2019, 900000, 8, "England And Wales", "England", ODITeamList19);

        System.out.println();
        System.out.println();

        ODI2019.ShowWorldCupDetailss();
        System.out.println();
        ODI2019.worldCupTeamsDetails();
        System.out.println();
        System.out.println();


        // 2019
        // 2019


    }
}