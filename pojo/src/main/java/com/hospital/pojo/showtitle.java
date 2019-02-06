package com.hospital.pojo;

public class showtitle {
    private String titleId;

    private String title;

    private String titleUrl;

    private String showInfo;

    public showtitle(String titleId, String title, String titleUrl, String showInfo) {
        this.titleId = titleId;
        this.title = title;
        this.titleUrl = titleUrl;
        this.showInfo = showInfo;
    }

    public showtitle() {
        super();
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId == null ? null : titleId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTitleUrl() {
        return titleUrl;
    }

    public void setTitleUrl(String titleUrl) {
        this.titleUrl = titleUrl == null ? null : titleUrl.trim();
    }

    public String getShowInfo() {
        return showInfo;
    }

    public void setShowInfo(String showInfo) {
        this.showInfo = showInfo == null ? null : showInfo.trim();
    }
}