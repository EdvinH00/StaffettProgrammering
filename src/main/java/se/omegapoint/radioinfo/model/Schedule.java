package se.omegapoint.radioinfo.model;

public record Schedule(int episodeid,
                       String title,
                       String subtitle,
                       String description,
                       String starttimeutc,
                       String endtimeutc,
                       ProgramChannel program,
                       ProgramChannel channel,
                       String imageurl,
                       String imageurltemplate,
                       String photographer) {
}
