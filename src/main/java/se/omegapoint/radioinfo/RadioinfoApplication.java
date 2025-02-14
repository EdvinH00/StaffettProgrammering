package se.omegapoint.radioinfo;


import se.omegapoint.radioinfo.model.ChannelData;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class RadioinfoApplication {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            ChannelAdapter channelAdapter = new ChannelAdapter();
            ChannelData data = channelAdapter.getChannelContent();


            data.channels().forEach(channel -> System.out.println(channel.name()));
            System.out.println(data);
            System.out.println("Skriv kanal:");
            String channel = scanner.nextLine();
            data.channels().stream()
                    .filter(ch -> ch.name().equals(channel))
                    .findFirst()
                    .ifPresent(ch -> {
                        channelAdapter.getProgramSchedule(ch.id()).schedule()
                                .forEach(System.out::println);
                    });
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
