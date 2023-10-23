package TIL.Homepage;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public interface Back {
    void createPost();

    List<String> userPosting = new LinkedList<>();
    List<LocalTime> postingTime = new LinkedList<java.time.LocalTime>();
}
