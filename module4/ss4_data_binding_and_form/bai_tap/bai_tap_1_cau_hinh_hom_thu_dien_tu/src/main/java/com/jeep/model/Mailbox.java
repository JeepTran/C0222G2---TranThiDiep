package com.jeep.model;

public class Mailbox {
    private String languages;
    private int pageSize;
    private boolean SpamsFilter;
    private String signature;

    public Mailbox() {
    }

    public Mailbox(String languages, int pageSize, boolean spamsFilter, String signature) {
        this.languages = languages;
        this.pageSize = pageSize;
        SpamsFilter = spamsFilter;
        this.signature = signature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean getSpamsFilter() {
        return SpamsFilter;
    }

    public void setSpamsFilter(boolean spamsFilter) {
        SpamsFilter = spamsFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
