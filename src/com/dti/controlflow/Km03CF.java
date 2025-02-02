package com.dti.controlflow;

//คำสั่ง break; และ continue; ใน Loop
//break ในลูปทำงานเมื่อไหร่จบ Loop เลย
//continue ในลูปทำงานเมื่อไหร่ จบรอบนั้นไปรอบต่อไปเลย
public class Km03CF {
    public static void main(String[] args) {
        for (int c = 1; c <= 5; c = c + 1) {
            if (c == 3) {
                break;
            }
            System.out.println(c + "__Hey...");
        }
        System.out.println("+++++++++++++++++++++");
        for (int c = 1; c <= 5; c = c + 1) {
            if (c == 3) {
                continue;
            }
            System.out.println(c + "__Hum...");
        }
    }
}
