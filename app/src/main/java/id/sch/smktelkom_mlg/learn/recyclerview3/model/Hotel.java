package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by kambing.ui.ac.id on 2/1/2017.
 */

public class Hotel implements Serializable
{
    public String judul;
    public String deskripsi;
    public String detail;
    public String lokasi;
    public String foto;

    public Hotel(String judul ,String deskripsi, String detail , String lokasi , String foto)
    {
        this.judul =judul;
        this.deskripsi=deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto= foto;
    }
}
