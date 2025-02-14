package se.omegapoint.radioinfo.model;

import java.util.List;

public record ChannelSchedule(String copyright,
                              List<Schedule> schedule,
                              Pagination pagination) {
}
