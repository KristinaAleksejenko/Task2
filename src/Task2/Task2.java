/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Создать проект с названием JavaHello. Программа должна выводить в консоль слова “Java Hello!”. 
//Создать локальный репозиторий Git. Создать удаленный репозиторий и связать с ним локальный. 
//Загрузить код проекта на удаленный репозиторий Git.
package Task2;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите трехзначное число:");
        Scanner scanner = new Scanner(System.in);//новый экземпляр класса сканер (считывание введеной цифры)
        int num = scanner.nextInt();
        int first = num/100;
        int second = (num/10)%10;
        int third = num%10;
        int answer = first+second+ third;
        System.out.println(answer);
        
    }
    
}
