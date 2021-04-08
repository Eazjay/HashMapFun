import java.util.HashMap;
import java.util.Set;

public class MyHashMap{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Question", "Girl I got a question for ya, Can I get an answer?");
        trackList.put("Perfect Time", "Peanut butter seats came perfect time...");
        trackList.put("War Baby", "'Cause I'm a war-war-war baby...");
        trackList.put("Thong Song", "Let me see that Thong...Baby.");

        String trackLyrics = trackList.get("Thong Song");
        System.out.println("The lyrics of this song is: " + trackLyrics);

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.printf("%s: %s\n", key, trackList.get(key));
        }
    }

}