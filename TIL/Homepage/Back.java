package TIL.Homepage;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public interface Back {
    void user();
    void contents();
    void createPost();

    List<String> userPosting = new LinkedList<>();
    List<LocalTime> postingTime = new LinkedList<java.time.LocalTime>();
}
