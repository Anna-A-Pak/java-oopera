import java.util.ArrayList;
import java.util.Objects;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
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

    public void changeActor(Actor actorOn, String surnameActorOff) {
        boolean isInclude = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if(listOfActors.get(i).surname.equals(surnameActorOff)) {
                listOfActors.set(i, actorOn);
                isInclude = true;
                break;
            }
        }
        if (!isInclude) {
            System.out.println("Актера с фамилией " + surnameActorOff + " в списке спектакля " + title + " нет!");
        }
    }

    @Override
    public String toString() {
        return "Show{" +
                "listOfActors=" + listOfActors +
                '}';
    }
}
