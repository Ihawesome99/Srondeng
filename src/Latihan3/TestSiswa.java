/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author IRFANHI_
 */
public class TestSiswa {
    public static void main (String arg[]){
        EncapSiswa siswa1 = new EncapSiswa();
        siswa1.setName("Irfan");
        siswa1.setAbsen(18);
        siswa1.setAddress("Tulungagung");
        
        System.out.println("Name : " + siswa1.getName()+" Absen : "+siswa1.getAbsen()+" Address: " 
                +siswa1.getAddress());
    }
    
}
