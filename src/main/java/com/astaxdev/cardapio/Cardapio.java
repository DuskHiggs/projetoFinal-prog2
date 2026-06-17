/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.astaxdev.cardapio;
import com.astaxdev.cardapio.view.Login;
import com.astaxdev.cardapio.view.Main;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
/**
 *
 * @author astaxgg
 */
public class Cardapio {

    public static void main(String[] args) {
        FlatLightLaf.setup();
        
        new Login().setVisible(true);
    }
}
