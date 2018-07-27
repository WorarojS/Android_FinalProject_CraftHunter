package com.s.wrj.crafthuntervancouver;

public class NewsLibrary {
    private String Title;
    private String Intro;
    private String Description ;
    private int Thumbnail ;

    public NewsLibrary() {
    }

    public NewsLibrary(String title,String
            intro,String description, int thumbnail) {
        Title = title;
        Intro = intro;
        Description = description;
        Thumbnail = thumbnail;
    }


    public String getTitle() {
        return Title;
    }
    public String getIntro(){
        return Intro;
    }


    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }


    public void setTitle(String title) {
        Title = title;
    }

    public void setIntro(String intro) {
        Intro = intro;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}

