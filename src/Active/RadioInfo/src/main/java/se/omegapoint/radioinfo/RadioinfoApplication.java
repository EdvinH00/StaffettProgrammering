package Active.RadioInfo.src.main.java.se.omegapoint.radioinfo;


import java.io.IOException;
import java.net.MalformedURLException;

public class RadioinfoApplication {

	public static void main(String[] args) {
        try {
            new ChannelAdapter().getChannelContent();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
