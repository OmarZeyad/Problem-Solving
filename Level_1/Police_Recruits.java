import java.util.Scanner;

public class Police_Recruits {

    static final int CRIME_EVENT = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int availableOfficers = 0;
        int untreatedCrimes   = 0;
        for(int nEvents = sc.nextInt(); nEvents > 0; --nEvents) {
            int event = sc.nextInt();
            if(event == CRIME_EVENT && availableOfficers == 0)
                ++untreatedCrimes;
            else
                availableOfficers += event;
        }
        System.out.println(untreatedCrimes);
    }

}