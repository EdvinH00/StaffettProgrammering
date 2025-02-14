package Active.RadioInfo.src.main.java.se.omegapoint.radioinfo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChannelAdapter {

    private static final String urlChannels = "https://api.sr.se/api/v2/channels?format=json";
    private final URL channelsUrl;

    public ChannelAdapter() throws IOException {
        channelsUrl = new URL(urlChannels);
    }

    public String getChannelContent() throws IOException {
        HttpURLConnection con = (HttpURLConnection) channelsUrl.openConnection();
        con.setRequestMethod("GET");

        con.setDoOutput(true);

        int status = con.getResponseCode();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        System.out.println(content);

        con.disconnect();
        return content.toString();
    }

}
