package TIL.Homepage;

import java.util.ArrayList;
import java.util.List;

public interface Back {
    void user();
    void contents();
    void createPost();

    List<String> userPosting = new ArrayList<>();
}
