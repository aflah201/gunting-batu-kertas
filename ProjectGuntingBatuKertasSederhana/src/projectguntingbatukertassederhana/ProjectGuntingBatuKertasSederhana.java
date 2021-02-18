package projectguntingbatukertassederhana;

import java.util.Scanner;
import java.util.Random;

public class ProjectGuntingBatuKertasSederhana {
    
    static int inputPlayer = 0;
    static int inputEnemy = 0;
    
    static int playerScore = 0;
    static int enemyScore = 0;
    
    static int gunting = 0;
    static int batu = 1;
    static int kertas = 2;
    
    static int round = 1;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random acak = new Random();
        
        System.out.println("Selamat datang di Permainan Sederhana");
        System.out.println("Silahkan pilih angka dibawah ini");
        System.out.println("0 = Gunting");
        System.out.println("1 = Batu");
        System.out.println("2 = Kertas");
        System.out.println("-------------------------------------");
        
        while(round <= 3){
            System.out.println("Ronde " + round);
            System.out.print("Masukkan Pilihan Angka mu : ");
            inputPlayer = input.nextInt();
            
            inputEnemy = acak.nextInt(3);
            
            compareSign();
            choosePlayer();
            chooseEnemy();
            
            round++;
            tampilScore();
            
            System.out.println("");
        }
        System.out.println("Pertandingan telah berakhir!!!");
        cekFinalScore();
    }
    
    public static void compareSign(){
        if(inputPlayer == kertas && inputEnemy == batu){
            playerScore++;
            System.out.println("Anda Menang");
        }
        else if(inputPlayer == kertas && inputEnemy == gunting){
            playerScore++;
            System.out.println("Anda Menang");
        }
        else if(inputPlayer == gunting && inputEnemy == kertas){
            playerScore++;
            System.out.println("Anda Menang");
        }
        else if(inputPlayer == inputEnemy){
            System.out.println("Seri");
        }
        else {
            enemyScore++;
            System.out.println("Anda Kalah");
        }
    }
    
    public static void choosePlayer(){
        if(inputPlayer == 0){
            System.out.println("Pilihan anda adalah Gunting");
        }
        else if(inputPlayer == 1){
            System.out.println("Pilihan anda adalah Batu");
        }
        else if(inputPlayer == 2){
            System.out.println("Pilihan anda adalah Kertas");
        }
        else {
            System.out.println("Pilihan anda tidak sesuai");
        }
    }
    
    public static void chooseEnemy(){
        if(inputEnemy == 0){
            System.out.println("Pilihan musuh adalah Gunting");
        }
        else if(inputEnemy == 1){
            System.out.println("Pilihan musuh adalah Batu");
        }
        else if(inputEnemy == 2){
            System.out.println("Pilihan musuh adalah Kertas");
        }
        else {
            System.out.println("Pilihan musuh tidak sesuai");
        }
    }
    
    public static void tampilScore(){
        System.out.println("Skor sementara Player : " + playerScore + " vs " + "Enemy : " + enemyScore);
    }
    
    public static void cekFinalScore(){
        if(playerScore > enemyScore){
            System.out.println("Selamat Anda Memenangkan Pertandingan!!!");
            System.out.println("Hasil akhir Player : " + playerScore + " vs " + "Enemy : " + enemyScore);
        }
        else if(playerScore == enemyScore){
            System.out.println("Pertandingan ini Seri!!!");
            System.out.println("Hasil akhir Player : " + playerScore + " vs " + "Enemy : " + enemyScore);
        }
        else{
            System.out.println("Maaf, anda kalah dalam Pertandingan ini!!!");
            System.out.println("Hasil akhir Player : " + playerScore + " vs " + "Enemy : " + enemyScore);
        }
    }
}
