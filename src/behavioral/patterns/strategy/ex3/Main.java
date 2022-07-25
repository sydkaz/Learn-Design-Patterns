package behavioral.patterns.strategy.ex3;

import behavioral.patterns.strategy.ex3.Notifier;
import behavioral.patterns.strategy.ex3.profiles.MeetingProfile;
import behavioral.patterns.strategy.ex3.profiles.OutdoorProfile;
import behavioral.patterns.strategy.ex3.profiles.SleepingProfile;
import behavioral.patterns.strategy.ex3.states.Ring;
import behavioral.patterns.strategy.ex3.states.Silent;
import behavioral.patterns.strategy.ex3.states.Vibrate;

public class Main {
    public static void main(String[] args){
        SleepingProfile sleepingProfile = new SleepingProfile();
        new Silent().addAction(sleepingProfile);

        MeetingProfile meetingProfile = new MeetingProfile();
        new Vibrate().addAction(meetingProfile);

        OutdoorProfile outdoorProfile = new OutdoorProfile();
        new Vibrate().addAction(outdoorProfile);
        new Ring().addAction(outdoorProfile);

        Notifier notifier = new Notifier();


        System.out.println("Outdoor");
                notifier.setProfile(outdoorProfile);
                notifier.sendAlerts();

        System.out.println("Meeting");
                notifier.setProfile(meetingProfile);
                notifier.sendAlerts();

        System.out.println("Sleep");
                notifier.setProfile(sleepingProfile);
                notifier.sendAlerts();
    }
}
