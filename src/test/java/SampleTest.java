import core.Hooks;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class SampleTest extends Hooks {

    SampleAction sampleAction = new SampleAction();

    @Test
    void androidLaunchTest()  {
        sampleAction.soma("3", "4");
    }


    @Test
    void iosLaunchTest() {
        sampleAction.soma("3", "4");
    }
}
