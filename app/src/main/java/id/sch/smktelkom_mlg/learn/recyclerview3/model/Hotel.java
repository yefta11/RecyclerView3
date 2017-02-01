package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import android.graphics.drawable.Drawable;

/**
 * Created by kambing.ui.ac.id on 2/1/2017.
 */

public class Hotel
{
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul ,String deskripsi, Drawable foto)
    {
        this.judul =judul;
        this.deskripsi=deskripsi;
        this.foto= foto;
    }
}
