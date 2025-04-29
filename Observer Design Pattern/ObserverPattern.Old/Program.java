package ObserverPattern.Old;

public class Program {
    public static void main(String[] args) {
        ObserverPattern.Old.VideoData videoData = new ObserverPattern.Old.VideoData();

        videoData.setTitle("Observer Design Pattern");

        System.out.println("\ncập nhật vi đeo\n");

        videoData.setDescription("mô tả mới");
    }
}
