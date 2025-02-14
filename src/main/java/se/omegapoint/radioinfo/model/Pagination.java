package se.omegapoint.radioinfo.model;

public record Pagination(int page, int size, int totalhits, int totalpages, String nextpage) {
}
