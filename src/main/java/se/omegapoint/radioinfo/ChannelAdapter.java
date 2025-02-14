package se.omegapoint.radioinfo;


import com.fasterxml.jackson.databind.ObjectMapper;
import se.omegapoint.radioinfo.model.ChannelData;
import se.omegapoint.radioinfo.model.ChannelSchedule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class ChannelAdapter {

    private static final String urlChannels = "https://api.sr.se/api/v2/channels?format=json";
    private static final String channelBaseUrl = "https://api.sr.se/v2/scheduledepisodes?channelid=BASE&format=json";
    private final URL channelsUrl;
    private final ObjectMapper objectMapper;

    public ChannelAdapter() throws IOException {
        channelsUrl = URI.create(urlChannels).toURL();

        objectMapper = new ObjectMapper();
    }

    public ChannelData getChannelContent() throws IOException {
        StringBuffer content = call(channelsUrl);

        return objectMapper.readValue(content.toString(), ChannelData.class);
    }

    public ChannelSchedule getProgramSchedule(int id) {
        try {
            URL scheduleUrl = URI.create(channelBaseUrl.replace("BASE", String.valueOf(id))).toURL();
            StringBuffer content = call(scheduleUrl);

            return objectMapper.readValue(content.toString(), ChannelSchedule.class);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

    }

    private StringBuffer call(URL channelsUrl) throws IOException {
        HttpURLConnection con = (HttpURLConnection) channelsUrl.openConnection();
        con.setRequestMethod("GET");

        con.setDoOutput(true);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        con.disconnect();
        return content;
    }

}
