package com.example.thanh.mytest_phungduythanh.CSDL;

/**
 * Created by THANH on 7/6/2017.
 */

public class dlCustomSpinner {
    private int UrlImage;
    private String Tittle;

    public dlCustomSpinner(int urlImage, String tittle) {
        UrlImage = urlImage;
        Tittle = tittle;
    }

    public int getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(int urlImage) {
        UrlImage = urlImage;
    }

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }
}
