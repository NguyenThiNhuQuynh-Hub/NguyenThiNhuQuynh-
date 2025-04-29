package ObserverPattern.New.Notifiers;

import ObserverPattern.New.Base.Observer;
import ObserverPattern.New.Base.Subject;
import ObserverPattern.New.VideoData;

public class PhoneNotifier extends Observer {

    public PhoneNotifier(Subject subject) {
        this.subject = subject;
        this.subject.attachObserver(this);
    }

    @Override
    public void notify(Object arg) {
        if (subject instanceof VideoData) {
            VideoData videoData = (VideoData) subject;
            System.out.println("Notify all subscribers via PHONE NUMBER with new data" +
                    "\n\tName: " + videoData.getTitle() +
                    "\n\tDescription: " + videoData.getDescription() +
                    "\n\tFile name: " + videoData.getFileName());
        }
    }
}
