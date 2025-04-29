
package ObserverPattern.Old;
import ObserverPattern.Old.Notifier.EmailNotifier;
import ObserverPattern.Old.Notifier.PhoneNotifier;
import ObserverPattern.Old.Notifier.YoutubeNotifier;


public class VideoData {
    private String title;
    private String description;
    private String fileName;
    private final EmailNotifier emailNotifier;
    private final PhoneNotifier phoneNotifier;
    private final YoutubeNotifier youtubeNotifier;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        videoDataChanged();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        videoDataChanged();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        videoDataChanged();
    }

    public VideoData() {
        this.emailNotifier = new EmailNotifier();
        this.phoneNotifier = new PhoneNotifier();
        this.youtubeNotifier = new YoutubeNotifier();
    }

    private void videoDataChanged() {
        String title = getTitle();
        String description = getDescription();
        String fileName = getFileName();

        emailNotifier.notify(title, description, fileName);
        phoneNotifier.notify(title, description, fileName);
        youtubeNotifier.notify(title, description, fileName);
    }
}
