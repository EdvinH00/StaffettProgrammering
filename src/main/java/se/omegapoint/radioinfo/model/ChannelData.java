package se.omegapoint.radioinfo.model;

import java.util.List;

public record ChannelData(String copyright, List<Channel> channels, Pagination pagination) {
}
