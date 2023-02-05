package com.game.MobileShop

class Iphone : Mobile(){
    var selected :Int=0;
    var model : String="";
    var memory:String=""
    var RAM:String=""
    var version:String=""
    var Display:String=""
    var Battery :String=""
    var Price : String=""
    var Stock:String=""
    var name:String=""
    var City:String=""

    override fun OperationSystem() {
        print(" Operation System : IOS")
    }
    override fun RamCapcity() {
        when(selected)
        {
            1->RAM="1 GB "
            2->RAM=" 2 GB"
            3-> RAM="4 GB"
            4-> RAM="8 GB "
            5,6-> RAM="16 GB"
            else-> print("number is invalid ")
        }
    }
    override fun StorageCapcity() {
        when(selected)
        {
            1->memory="16 GB "
            2->memory=" 32 GB"
            3-> memory="64 GB"
            4-> memory="128 GB "
            5,6->memory="256 GB"
            else-> print("Number is invalid ")
        }
    }
    override fun SystemVersion() {
        when(selected)
        {
            1->version="IOS 15 "
            2,6->version="IOS 14.1"
            3,4,5->version="IOS 13"
            else-> print("number is invalid ")
        }

    }
    override fun Display() {
        when(selected)
        {
            1->Display="1284 x 2778 pixels, 19.5:9 ratio (~458 ppi density) "
            2->Display=" 1170 x 2532 pixels, 19.5:9 ratio (~460 ppi density)"
            3-> Display="750 x 1334 pixels, 16:9 ratio (~326 ppi density)"
            4-> Display="828 x 1792 pixels, 19.5:9 ratio (~326 ppi density) "
            5-> Display="1242 x 2688 pixels, 19.5:9 ratio (~458 ppi density)"
            6-> Display="1640 x 2360 pixels (~264 ppi density)"
            else-> print("number is invalid ")
        }


    }
    override fun battery() {
        when(selected)
        {
            1->Battery="\tLi-Ion 4352 mAh, non-removable (16.75 Wh)"
            2->Battery="\tLi-Ion 2815 mAh, non-removable (10.78 Wh)"
            3->Battery="\tLi-Ion 1821 mAh, non-removable (6.91 Wh)"
            4->Battery="\tLi-Ion 3110 mAh, non-removable (11.91 Wh)"
            5->Battery="\tLi-Ion 3969 mAh, non-removable (15.04 Wh)"
            6-> Battery="\tLi-Ion 2227 mAh, non-removable (8.57 Wh)"
            else-> print("number is invalid ")
        }
    }
    override fun price() {
        when(selected)
        {
            1->Price="4000.00 DH "
            2->Price="3000.00 DH"
            3-> Price="3500.00 DH "
            4-> Price="5500.00 DH  "
            5->Price="4500 DH "
            6->Price="5600 DH"
            else-> print("number is invalid ")
        }

    }

    override fun stock() {
        when(selected)
        {
            1->Stock="10"
            2->Stock="2O"
            3-> Stock="0"
            4-> Stock="10"
            5,6-> Stock="6"
            else-> print("number is invalid ")
        }


    }
    override fun models() {
        print("Choose the model phone : ")
        print("Samsung Models :  \n \t 1: Apple iPhone 13 Pro Max. \n \t 2: Apple iPhone 12 Pro. \n \t 3 : Apple iPhone SE (2020)\n \t 4: Apple iPhone 11." +
                "  5: Apple iPhone 11 Pro Max\n  6: Apple iPhone 12 mini \n ")
        selected = readln().toInt()
        when(selected)
        {
            1->model ="Apple iPhone 13 Pro Max."
            2->model="Apple iPhone 12 Pro."
            3->model= "Apple iPhone SE (2020)"
            4->model ="Apple iPhone 11"
            5->model="Apple iPhone 11 Pro Max"
            6->model="Apple iPhone 12 mini"
            else-> print("Number is invalid ")
        }
        price()
        battery()
        Display()
        StorageCapcity()
        SystemVersion()
        RamCapcity()
        stock()
        print("Model chosen : $model \n")
        print("Memory : $memory \n")
        print("Battery : $Battery \n")
        print("Display Quality : $Display\n")
        print("Android Version : $version \n")
        print("the amount available : $Stock \n")
        print("Price (DH) : $Price \n")


    }

}