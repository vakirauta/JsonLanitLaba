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

//        1-�����;
//        methodsPeoples.getAllPeople();
//        System.out.println("-----------------------------------------");
//        2-�����
//        methodsPeoples.getPeopleById(2);
//        System.out.println("-----------------------------------------");
//        3-�����
//        methodsPeoples.getPeopleByName("Finis Valorum");
//        System.out.println("-----------------------------------------");
//        1-�����
//        methodsPlanets.getAllPlanets();
//        System.out.println("-----------------------------------------");
//        2-�����
//        methodsPlanets.getPlanetById(5);
//        System.out.println("-----------------------------------------");
//        3-�����
//        methodsPlanets.getPlanetByName("Naboo");
//        System.out.println("-----------------------------------------");
//        1-�����
        methodsFilms.getAllFilms();
        System.out.println("-----------------------------------------");
//        2-�����
        methodsFilms.getFilmById(5);
        System.out.println("-----------------------------------------");
//        3-�����
        methodsFilms.getFilmByName("The Phantom Menace");
        System.out.println("-----------------------------------------");

    }
}
