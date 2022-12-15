public class Main {
    public static void main(String[] args) {
        Human maks = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Human anja = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human katja = new Human("Катя", 1992, "Калинингад", "продакт-менеджер");
        Human artjom = new Human(" ", 0,"", null);
        System.out.println(maks);
        System.out.println(anja);
        System.out.println(katja);
        System.out.println(artjom);
    }
}