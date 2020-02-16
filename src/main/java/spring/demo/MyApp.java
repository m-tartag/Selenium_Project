package spring.demo;

public class MyApp {

    public static void main(String[] args) {

        // create the object

        Coach coachOne = new BaseballCoach();
        Coach coachTwo = new TrackCoach();

        // use the object



        System.out.println(coachOne.getDailyWorkout());
        System.out.println(coachTwo.getDailyWorkout());

    }

}
