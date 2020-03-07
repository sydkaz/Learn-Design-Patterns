package behavioral.patterns.state.ex3;


import behavioral.patterns.state.ex3.profiles.Profile;

public class Notifier  {
    Profile profile;

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void sendAlerts(){
        profile.sentAlert();
    }


}
