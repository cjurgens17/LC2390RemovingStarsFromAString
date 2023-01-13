import static org.junit.Assert.*;

public class LC2390Test {

    @org.junit.Test
    public void removeStars() {

        String actual1 = LC2390.removeStars("leet**cod*e");
        String actual2 = LC2390.removeStars("erase*****");

        assertEquals("lecoe",actual1);
        assertEquals("",actual2);
    }
}