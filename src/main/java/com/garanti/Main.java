package com.garanti;

import com.garanti.model.*;
import com.garanti.repo.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.err.println("merhaba git");
         // Amend bir önceki commitin üzerine yazar.
        System.err.println("merhaba git intellij");




    /*    try {
            getOgretmenler();
        } catch (Exception e) {
            e.getMessage();
        }*/

        /*OgretmenRepo ogretmenRepo = new OgretmenRepo();
        ArrayList<Ogretmen> ogretmenler = ogretmenRepo.getAll();
        System.err.println(ogretmenler.toString());
        System.err.println(ogretmenRepo.getById(4));
        if (ogretmenRepo.deleteById(5))
        {
            System.err.println("Başarı ile silindi");
        }
        else
        {
            System.err.println("Başarı ile silinemedi");
        }
        if (ogretmenRepo.save(new Ogretmen("Deniz", true)))
        {
            System.err.println("Başarı ile kaydedildi");
        }
        else
        {
            System.err.println("Başarı ile kaydedilemedi");
        }

        System.err.println(ogretmenRepo.getAllLike("a"));*/


     /*   OgrenciRepo ogrenciRepo = new OgrenciRepo();
        ArrayList<Ogrenci> ogrenciler = ogrenciRepo.getAll();
        System.err.println(ogrenciler.toString());
        System.err.println(ogrenciRepo.getById(1));

        if (ogrenciRepo.save(new Ogrenci("DENİZ",11111,2)));
        {
            System.err.println("Başarı ile kaydedildi");
        }
        else
        {
            System.err.println("Başarı ile kaydedilemedi");
        }
        if (ogrenciRepo.deleteById(5))
        {
            System.err.println("Başarı ile silindi");
        }
        else
        {
            System.err.println("Başarı ile silinemedi");
        }
*/


        /*KonuRepo konuRepo = new KonuRepo();
        ArrayList<Konu> konular = konuRepo.getALl();
        System.err.println(konular.toString());
        System.err.println(konuRepo.getById(1));*/

        /*Ders_OgrenciRepo dersOgrenciRepo = new Ders_OgrenciRepo();
        ArrayList<Ders_Ogrenci> dersOgrenci = dersOgrenciRepo.getAll();
        System.err.println(dersOgrenci.toString());
        System.err.println(dersOgrenciRepo.getById(6));*/

      /*  DersRepo dersRepo = new DersRepo();
        ArrayList<Ders> dersler = dersRepo.getAll();
        System.err.println(dersler.toString());
        System.err.println(dersRepo.getById(7));*/
    }


/*    public static void getOgretmenler() throws Exception
    {
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "BILGE", "12345");
        System.err.println(connection.getClass());
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("select * from BILGE.OGRETMEN");
        while (result.next()) {
            String isim = result.getString("NAME");
            System.err.println(isim);
        }
        result.close();
        stmt.close();
        connection.close();
    }*/
}