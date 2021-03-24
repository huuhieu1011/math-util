/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lehuuhieu.Mathutil.test;

import com.lehuuhieu.mathutil.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @authro lehuuhieu
 */
public class MathUtilityTest {
    
    //dat ham theo chuan dan test phan mem, QA/QC
    @Test //bien ham nay thanh main()
    public void testFactorialGivenRightArgumentReturnsGoodResults() {
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        
        assertEquals(expected, actual);
        assertEquals(720, MathUtility.getFactorial(6));//6 gia thua co dung la 720 khong
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        //mau do den theo 2 nghia
        //ham tinh dung ki vong sai
        //ham tinh sai ki vong dung
        //moi loi goi ham o tren duoc goi la 1 test case
        
    }
    
    //test ngoai le thi test nhu nao
    //vi khi ngoai le xay ra app dung lien, mau do vi da co dieu gi khong on da xay ra
    //ngoai le khong phai la mot value de so sanh, khong biet no la so may chuoi gi
    //test ngoai le nen duoc doc va dien giai nhu sau
    //tuc neu getFactorial(-5) ma nem ra ngoai le
    //dung nhu thiet ke
    //tuc la neu getFactorial(-5) ma nem ra ngoai le
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrrongArgumentThrowsException() {
        MathUtility.getFactorial(-5);//chay ham, chua test
        MathUtility.getFactorial(21);
        MathUtility.getFactorial(-1);
        MathUtility.getFactorial(40);
    }
    
}
//viec test dung mau sac, dung thu vien Unit Test co quy uoc neu tat ca cac cap expected va actual khop nhau (equals) thi coi nhu ham chay dung moi tinh huong ta da test => xanh

//neu trong tat ca cac cao ma ta test, co it nhap 1 cap khong khop nhau - it nhat 1 mau do, coi nhu ham khong on -> do chung
//dieu nay de dam bao rang, phan ham ma da test cac tinh huong thi phai dung het cac tinh huong da test