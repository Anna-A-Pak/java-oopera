public class Main {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Смирнов", Gender.MALE, 180);
        Actor actor2 = new Actor("Ирина", "Иванова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Егор", "Ушаков", Gender.MALE, 185);
        Director director1 = new Director("Константин", "Попов", Gender.MALE, 1);
        Director director2 = new Director("Елена", "Сидорова", Gender.FEMALE, 1);
        String musicAuthor = "Павел Соколов";
        String choreographer = "Екатерина Павлова";
        String librettoKarmen = "Действие I: Площадь в Севилье. Солдат Хозе встречает Кармен. Та соблазняет его, " +
                "чтобы избежать ареста после драки.";
        String librettoNutcracker = "Эпилог: Чудесный сон заканчивается и Мари просыпается утром с куклой в руках.";

        Show show = new Show("Анна Каренина", 210, director1);
        Opera opera = new Opera("Кармен", 145, director2, musicAuthor, librettoKarmen,3);
        Ballet ballet = new Ballet("Щелкунчик", 120, director2, musicAuthor, librettoNutcracker, choreographer);

        show.addActor(actor1);
        show.addActor(actor2);
        System.out.println("Актерский состав спектакля " + show.title + ":");
        System.out.println(show.listOfActors + "\n");

        opera.addActor(actor1);
        opera.addActor(actor2);
        System.out.println("Актерский состав спектакля " + opera.title + ":");
        System.out.println(opera.listOfActors + "\n");

        ballet.addActor(actor2);
        ballet.addActor(actor3);
        System.out.println("Актерский состав спектакля " + ballet.title + ":");
        System.out.println(ballet.listOfActors + "\n");

        show.changeActor(actor3, "Смирнов");
        System.out.println("Измененный актерский состав спектакля " + show.title + ":");
        System.out.println(show.listOfActors + "\n");

        ballet.changeActor(actor1, "Петров");
        System.out.println();

        System.out.println("Текст либретто к спектаклю " + opera.title + " - " + opera.librettoText);
        System.out.println("Текст либретто к спектаклю " + ballet.title + " - " + ballet.librettoText);
    }
}
