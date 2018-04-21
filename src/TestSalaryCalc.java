

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;

import org.junit.Test;

public class TestSalaryCalc {
    
    
    @Test
    public void testCalcSalary(){
        try{
            //��������� ��������� �������� ��� �����
            SalaryCalc sc = new SalaryCalc();
            sc.arrTf[0].setText("100");
            sc.arrTf[1].setText("9");
            sc.arrTf[2].setText("24");
            sc.arrTf[3].setText("13");
            //����� ������ ������� ��������
            sc.calcSalary();
            //���� ��������� �� ��������� � ���������, ������ ����� ������� ��������� � ���� �������
            Assert.assertTrue("20671,20".equals(sc.arrTf[7].getText()));
        }catch(Exception e){
            //� ������ ������������� ������, ���� ����� �������� � � ������� ����� �������� ���������:
            Assert.fail("��������� ������������ ������� ��������");
        }
        
    }
}
