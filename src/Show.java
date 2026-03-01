import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final int duration;
    protected final Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director){
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void addActor(Actor newActor) {
        if (listOfActors.isEmpty()) {
            listOfActors.add(newActor);
        } else {
            boolean isSame = false;
            for (Actor actor : listOfActors) {
                if (actor.equals(newActor)) {
                    System.out.println(newActor + " уже есть в списке!");
                    isSame = true;
                    break;
                }
            }
            if (!isSame) {
                listOfActors.add(newActor);
            }
        }
    }

    public boolean changeActor(Actor actorOn, String surnameActorOff) {
        boolean isInclude = false;
        int numberSameSurname = 0;
        int indexActorOff = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surnameActorOff)) {
                indexActorOff = i;
                isInclude = true;
                numberSameSurname++;
            }
        }
        if (isInclude && numberSameSurname == 1) {
            listOfActors.set(indexActorOff, actorOn);
            return true;
        } else if (isInclude && numberSameSurname > 1) {
            System.out.println("В списке спектакля " + title + " больше одного актера с фамилией "
                    + surnameActorOff + "!");
            return false;
        } else {
            System.out.println("Актера с фамилией " + surnameActorOff + " в списке спектакля " + title + " нет!");
            return false;
        }
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
