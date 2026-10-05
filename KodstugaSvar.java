public class KodstugaSvar {

    public static void main(String[] args) {

        ovning1();
        ovning2();
        ovning3();
        ovning4();
        ovning5();

    }

    // Övning 1 – Gör Java utan Run-knappen
    public static void ovning1() {
        System.out.println("Fredagens kodstuga");
        
    }
    // Javac KodstugaSvar.java
    // java KodstugaSvar

    // Övning 2 – Bygg ett personkort
    public static void ovning2() {
        
        //Del 1 Skriv ut värden
        String firstName = "Lisa";
        String lastName = "Andersson";
        int age = 28;
        double height = 1.72;
        char grade = 'B';
        boolean likesJava = true;

        System.out.println("Namn: " + firstName + " " + lastName);
        System.out.println("Ålder: " + age);
        System.out.println("Längd: " + height);
        System.out.println("Betyg: " + grade);
        System.out.println("Gillar Java: " + likesJava);


        //Del 2 Beräkna nästa års ålder
        int ageNextYear = age + 1;
        System.out.println("Nästa år är " + firstName + " " + ageNextYear + " år.");

        //Del 3 Förbättrea variabelnamn från n..
        String carBrand = "Volvo";
        int modelYear = 2022;
        double price = 185000;
        boolean isElectric = true;

        System.out.println("Bilmärke: " + carBrand);
        System.out.println("Årsmodell: " + modelYear);
        System.out.println("Pris: " + price);
        System.out.println("Elbil: " + isElectric);
        System.out.println();
    }

    // Övning 3 – Operatorlabbet
    public static void ovning3() {
        
        //Del 1 Vad skrivs ut?
        int a = 10;
        int b = 3;

        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1


        //Del 2 Remainder operator
        int number = 17;
        System.out.println(number % 2); // 1

        number = 18;
        System.out.println(number % 2); // 0

        //Kan användas för att hitta jämna och ojämna siffror.

        //Del 3 Jämförelseoperatorer
        int age = 20;

        boolean test1 = age > 18; //true
        boolean test2 = age < 18; //false
        boolean test3 = age == 20; //true
        boolean test4 = age != 20; //false

        System.out.println(test1); //true
        System.out.println(test2); //false
        System.out.println(test3); //true
        System.out.println(test4); //false


        // Testa sedan logiska operatorer
        boolean hasTicket = true;
        boolean isAdult = true;

        boolean allowed = hasTicket && isAdult;
        System.out.println(allowed); //true

        boolean allowedWithOr = hasTicket || isAdult;
        System.out.println(allowedWithOr); //true
    }

    // Övning 4 – Stringverkstaden
    public static void ovning4() {

        //Kopiera

        String firstName = "Anna";
        String lastName = "Andersson";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.length()); // 13


        //Bygg sedan utskriften
        System.out.println("Hej! Jag heter " + fullName + ".");
        System.out.println("Mitt namn innehåller " + fullName.length() + " tecken.");


        //Bonus, använder variabler för meningarna
        String city = "Göteborg";
        String profession = "Mjukvarutestare";

        System.out.println(
            fullName + " bor i " + city +
            " och utbildar sig till " + profession + "."
        );

    }

    // Övning 5 – Bug Hunt
    public static void ovning5() {

        String name = "Ada"; //Saknade ; och litet S
        int age = 25; //Har "" på int
        double height = 1.72; // Komma
        char grade = 'A'; // '' istället för ""
        boolean likesJava = true; //""

        int apples = 5;
        int bananas = 2;

        System.out.println("Fruit: " + (apples + bananas));
        System.out.println("Name: " + name);
        System.out.println(age == 25);

        // Använd alla variabler
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Likes Java: " + likesJava);
    }

    /*
     * Övning 6 – Git it done
     *
     * Kör dessa kommandon i terminalen:
     *
     * git status
     * git add .
     * git status
     * git commit -m "Kodstuga 1 - Java grunder"
     * git push
     */
}
