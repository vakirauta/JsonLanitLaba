import models.Peoples;
import utils.GetAllUrl;
import utils.MethodsFilms;
import utils.MethodsPeoples;
import utils.MethodsPlanets;

public class Main {
    public static void main(String[] args) {
        MethodsPeoples methodsPeoples = new MethodsPeoples();
        MethodsPlanets methodsPlanets = new MethodsPlanets();
        MethodsFilms methodsFilms = new MethodsFilms();

//        1-метод;
//        methodsPeoples.getAllPeople();
//        System.out.println("-----------------------------------------");
//        2-метод
//        methodsPeoples.getPeopleById(2);
//        System.out.println("-----------------------------------------");
//        3-метод
//        methodsPeoples.getPeopleByName("Finis Valorum");
//        System.out.println("-----------------------------------------");
//        1-метод
//        methodsPlanets.getAllPlanets();
//        System.out.println("-----------------------------------------");
//        2-метод
//        methodsPlanets.getPlanetById(5);
//        System.out.println("-----------------------------------------");
//        3-метод
//        methodsPlanets.getPlanetByName("Naboo");
//        System.out.println("-----------------------------------------");
//        1-метод
        methodsFilms.getAllFilms();
        System.out.println("-----------------------------------------");
//        2-метод
        methodsFilms.getFilmById(5);
        System.out.println("-----------------------------------------");
//        3-метод
        methodsFilms.getFilmByName("The Phantom Menace");
        System.out.println("-----------------------------------------");

    }
}
