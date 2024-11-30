/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.ino;

import me.ino.controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *
 * @author Inosensius
 */
@SpringBootApplication
public class Pertemuan5_50421655 implements CommandLineRunner{
    @Autowired
    private MahasiswaController mhsController;
    
    public static void main(String[] args) {
        SpringApplication.run(Pertemuan5_50421655.class, args);
    }
    @Override
    public void run(String...args) throws Exception {
        mhsController.tampilkanMenu();
    }
}
