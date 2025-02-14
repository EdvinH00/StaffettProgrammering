package se.omegapoint.radioinfo.model;

public record Channel(String image,
                      String imagetemplate,
                      String color,
                      String tagline,
                      String siteurl,
                      LiveAudio liveaudio,
                      String scheduleurl,
                      String channeltype,
                      String xmltvid,
                      int id,
                      String name) {
}
