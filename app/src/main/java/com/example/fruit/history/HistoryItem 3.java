package com.example.fruit.history;

public class HistoryItem {
    public String imgPath;//图片地址
    private String title;//历史记录名字
    private String url;//历史记录URL
    private boolean isSelected;//是否选中


    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }



    public HistoryItem() {

    }

    public HistoryItem(String title, String url, String imgPath) {
        this.title = title;
        this.url = url;
        this.imgPath = imgPath;
    }

    @Override
    public String toString() {
        return "HistoryItem{" +
                "title='" + title + '\'' +
                ", url=" + url +
                ",imgPath='" + imgPath +
                '}';
    }


}
