package com.example.nikkoekasaputra.belajaractiveandroid.database;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Nikko Eka Saputra on 25/02/2018.
 */

@Table(name = "Inventory")

public class Inventory extends Model {

    @Column(name = "name")
    public String name;

}
