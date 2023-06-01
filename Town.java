package efs.task.collections.entity;

import java.util.List;
import java.util.Objects;
public class Town implements Comparable{
    private String townName;
    private List<String> startingHeroClasses;

    public Town(String townName, List<String> startingHeroesClass) {
        this.townName = townName;
        startingHeroClasses = startingHeroesClass;
    }

    public String getTownName() {
        return townName;
    }

    public List<String> getStartingHeroClasses() {
        return startingHeroClasses;
    }

    //TODO implementacja metody equal porównująca obiekty Town na podstawie tylko townName.
   // @Override
   // public boolean equals(Object o) {
    //    return true;
    //}
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Town town = (Town) o;
        return townName.equals(town.townName);
    }

    //TODO implementacja metody equal biorąca pod uwagę tylko townName.
   // @Override
   // public int hashCode() {
  //      return 1;
   // }
     public int hashCode() {
        return Objects.hash(townName);
    }

    @Override
    public String toString() {
        return "Miasto :" + townName;
    }
    public int compareTo(Object town) {
        Town otherTown = (Town) town;
        return this.getTownName().compareTo(otherTown.getTownName());
    }
}
