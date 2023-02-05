package com.game.MobileShop

class Xiaomi : Mobile(){
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
        print(" Operation System : Android")
    }
    override fun RamCapcity() {
        when(selected)
        {
            1,4->RAM="2 GB "
            2,3,5->RAM="4 GB"
            6->RAM="6 GB"
            else-> print("number is invalid ")
        }
    }
    override fun StorageCapcity() {
        when(selected)
        {
            1,4->memory="32 GB "
            2,3,5,6->memory=" 128 GB"

            else-> print("Number is invalid ")
        }
    }
    override fun SystemVersion() {
        when(selected)
        {
            1,3->version="Android 10 "
            2,6,5->version="Android 11"
            4->version="Android 12"
            else-> print("number is invalid ")
        }

    }
    override fun Display() {
        when(selected)
        {
            1,2,3,4,5,6->Display="720x1600 HD+"
            else-> print("number is invalid ")
        }


    }
    override fun battery() {
        when(selected)
        {
            1,3,4->Battery="\t5000mAh (typ) Supports 10W charge"
            2,5,6->Battery="\t5000mAh (typ) Supports 33W charge"
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
        print("Xiaomi Models :  \n \t 1: Xiaomi Redmi 9A . \n \t 2: Xiaomi Redmi Note 11. \n \t 3 : Xiaomi Redmi 9C Smartphone \n \t 4: Xiaomi Redmi A1 \n" +
                "  5: Xiaomi Redmi 10 4G \n  6: Redmi Note 10s  \n ")
        selected = readln().toInt()
        when(selected)
        {
            1->model ="Xiaomi Redmi 9A ."
            2->model="Xiaomi Redmi Note 11."
            3->model= "Xiaomi Redmi 9C Smartphone "
            4->model ="Xiaomi Redmi A1 "
            5->model="Xiaomi Redmi 10 4G"
            6->model="Redmi Note 10s "
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