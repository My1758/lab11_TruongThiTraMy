package efs.task.collections.data;

import efs.task.collections.entity.Hero;
import efs.task.collections.entity.Town;

import java.util.*;

public class DataProvider {

    public static final String DATA_SEPARATOR = ",";

    // TODO Utwórz listę miast na podstawie tablicy Data.baseTownsArray.
    //  Tablica zawiera String zawierający nazwę miasta oraz dwie klasy bohatera związane z tym miastem oddzielone przecinkami.
    //  Korzystając z funkcji split() oraz stałej DATA_SEPARATOR utwórz listę obiektów klasy efs.task.collections.entities.Town.
    //  Funkcja zwraca listę obiektów typu Town ze wszystkimi dziewięcioma podstawowymi miastami.
    //public List<Town> getTownsList() {
      //  return null;
    public List<Town> getTownsList() {
        List<Town> TownsList = new ArrayList<>();
        for (String line : Data.baseTownsArray) {
            String[] lineSplit = line.split(DATA_SEPARATOR);
            Town tmp = new Town(lineSplit[0].trim(), Arrays.asList(lineSplit[1].trim(), lineSplit[2].trim()));
            TownsList.add(tmp);
            
        }
        return TownsList;
    }

    //TODO Analogicznie do getTownsList utwórz listę miast na podstawie tablicy Data.DLCTownsArray
    //public List<Town> getDLCTownsList() {
      //  return null;
    public List<Town> getDLCTownsList() {
        List<Town> TownsList = new ArrayList<>();
        for (String line : Data.dlcTownsArray) {
            String[] lineSplit = line.split(DATA_SEPARATOR);
            Town tmp = new Town(lineSplit[0].trim(), Arrays.asList(lineSplit[1].trim(), lineSplit[2].trim()));
            TownsList.add(tmp);
        }
        return TownsList;
    }

    //TODO Na podstawie tablicy Data.baseCharactersArray utworzyć listę bohaterów dostępnych w grze.
    // Tablica Data.baseCharactersArray zawiera oddzielone przecinkiem imie bohatera, klasę bohatera.
    // Korzystając z funkcji split() oraz DATA_SEPARATOR utwórz listę unikalnych obiektów efs.task.collections.entities.Hero.
    // UWAGA w Data.baseCharactersArray niektórzy bohaterowie powtarzają się, do porównania bohaterów używamy zarówno imie jak i jego klasę;
    //public Set<Hero> getHeroesSet() {
      //  return null;
    public Set<Hero> getHeroesSet() {
        Set<Hero> heroesSet = new HashSet<>();
        for (String line : Data.baseCharactersArray) {
            String[] lineSplit = line.split(DATA_SEPARATOR);
            Hero tmp = new Hero(lineSplit[0].trim(), lineSplit[1].trim());
            heroesSet.add(tmp);
        }
        return heroesSet;
    }

    //TODO Analogicznie do getHeroesSet utwórz listę bohaterów na podstawie tablicy Data.DLCCharactersArray
   // public Set<Hero> getDLCHeroesSet() {
     //   return null;
    public Set<Hero> getDLCHeroesSet() {
        Set<Hero> heroesSet = new HashSet<>();
        for (String line : Data.dlcCharactersArray) {
            String[] lineSplit = line.split(DATA_SEPARATOR);
            Hero tmp = new Hero(lineSplit[0].trim(), lineSplit[1].trim());
            heroesSet.add(tmp);
        }
        return heroesSet;
    }
}
