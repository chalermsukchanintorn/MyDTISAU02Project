package com.dti.controlflow;

//Control Flow กลุ่ม Selection/Condition การเลือกทำ

public class Km01CF {
    public static void main(String[] args) {
        //แบบที่ 1 พิสูจน์ครั้งเดียวจริงทำ เท็จไม่ทำ : if
        int a = 2;        
        if( a < 5 ){
            System.out.println("Hello.....");
        }
        System.out.println("+++++++++++++++++++");
        //แบบที่ 2 พิสูจน์ครั้งเดียวจริงทำอย่าง เท็จทำอีกอย่าง : if-else
        int b = 100;
        if( b < 80 ){
            System.out.println("Wow...");
        }else{
            System.out.println("Woo...");
        }
        System.out.println("+++++++++++++++++++");
        //แบบที่ 3 พิสูจน์หลายครั้ง : if-else-if , switch-case
        int c = 70;
        if( c > 80){
            System.out.println("111");
        }else if( c >= 70 ){
            System.out.println("222");
        }else if( c > 60 ){
            System.out.println("333");
        }else{  //ไม่จำเป็นต้องมี if ทั้งนี้ขึ้นอยู่กับโจทย์
            System.out.println("555555555");
        }
        System.out.println("+++++++++++++++++++");
        int busNumber = 56;
        switch( busNumber  ){
            case 80 : System.out.println("Sanamlong"); 
                            break; //ทุกควรจะมี break
            case 57 : System.out.println("PATA");
                            break;
            case 84 : System.out.println("Wat Rai King");
                            break;
            case 81 : System.out.println("Siriraj");
                            break;
            default : System.out.println("Don't have data T_T");
        }
    }
}


















