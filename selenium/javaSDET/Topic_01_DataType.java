package javaSDET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Map;

public class Topic_01_DataType {
    //2 nhom kieu du lieu
    // Cach khai bao:
    // Access modifier: pham vi truy cap (private/public/protect/default)
    // 1- Access modifier- kieu du lieu-Ten bien - Gia tri cua bien (ngoai ham hay trong ham deu duoc)
    public char cName = 'b';
    //2.1 Access modifier- kieu du lieu- Ten bien
    public char address;
    //2.2 Ten bien - gia tri gan sau ( trong ham)
    public void clickToElement () {
        address = 'c';
        char city = 'd';

    }


    //nhom 1: kieu du lieu nguyen thuy
    //char: ky tu

    //khi gan gia tri thi phai nam trong ''

    // byte/short/int/long : so nguyen
    byte bNumber = 127;
    int bNuber2 = 1200;

    // float/ double: so thuc
    float fNumber = 15.7f;


    //boolean: logic

    boolean gend = false;

    //nhom 2: kieu du lieu tham chieu
    //string: chuoi
    String fullName = "jason pan";
    //Class
    FirefoxDriver fDriver = new FirefoxDriver();
    Actions action = new Actions(fDriver);

    //Interface

    WebDriver driver;
    //Array
    //List/set
    //Map
    //Object
    // khi gan gia tri nam trong dau nhay doi " "


}
