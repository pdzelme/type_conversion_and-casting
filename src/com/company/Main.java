package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// Automatic conversion
        // conversions that do not cause any data loss.
        //byte to short
        byte value_byte = 124;
        short value_short = value_byte;
        System.out.println("New value of short from byte 124 is (value_short): " + value_short);

        // value
        float value_float = value_byte;


        //conversions that will cause data loss
        int value_of_int = 123456789;
        float value_of_float = value_of_int;
        System.out.println("New value of float from int 123456789 is (value_float): " + value_of_float);


        int money_deposited = 123456789;
        float converted_value_of_deposit = money_deposited;
        System.out.println("Money deposited in float is: " + converted_value_of_deposit);

        //long to float
        long value_of_long = 2031324142431L;
        float newValueOfFloat = value_of_long;
        System.out.println("New value of float from long 2031324142431L is (newValueOfFloat) : " + newValueOfFloat);

        //long to double
        double value_of_double = value_of_long;
        System.out.println("New value of double from long 2031324142431L is (value_of_double) : " + value_of_double);


        // casting.
        //double to float
        double available_balance = 99.9989;
        float float_available_balance = (float) available_balance;
        System.out.println("Available Balance in float:" + float_available_balance);


        // double to long
        long long_available_balance = (long) available_balance;
        System.out.println("Available Balance in long:" + long_available_balance);

        // classwork

        // double to int
        //float to  int
        // long to int

        // double to int
        //1
        double new_balance = 99.9989;
        int new_int = (int)new_balance;
        System.out.println("new_balance to new_int:" + new_int);

        //2
        int  int_available_balance = (int) available_balance;
        System.out.println("Available Balance in int:" + int_available_balance);


        //float to int
        //1
        float new_float = 12.34567f;
        int float_to_int = (int) new_float;
        System.out.println("new_float to int:" + float_to_int);

        //2
        float float_value = 12.32f;
        int float_value_casted_to_int = (int) float_value;
        System.out.println("float value in long:" + float_value_casted_to_int);


        //long to int
        //1
        long new_long = 1234567891234L;
        int long_to_int = (int) new_long;
        System.out.println("new_long to int:" + long_to_int);

        //2
        long long_value = 1232442414L;
        int long_value_casted_to_int = (int) long_value;
        System.out.println("new_long to int:" + long_value);



    }


}
