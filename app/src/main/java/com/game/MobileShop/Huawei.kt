package com.game.MobileShop

class Huawei : Mobile(){
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
            1->RAM="1 GB "
            2->RAM=" 2 GB"
            3-> RAM="4 GB"
            4-> RAM="8 GB "
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
            else-> print("number is invalid ")
        }
    }
    override fun SystemVersion() {
        when(selected)
        {
            1->version="Android 4.2 "
            2->version=" Android 4.1"
            3-> version="Android 8"
            4-> version="Android 9 "
            else-> print("number is invalid ")
        }

    }
    override fun Display() {
        when(selected)
        {
            1->Display="5.9-inch 1080 x 1920 pixels IPS display, 16.7M colors \n "
            2->Display=" 5.9-inch 1080 x 1920 pixels IPS display, 16.7M colors"
            3-> Display="5.9-inch 1080 x 1820 pixels IPS display, 16.7M colors"
            4-> Display="5.9-inch 1080 x 1920 pixels IPS display, 16.7M colors "
            else-> print("number is invalid ")
        }


    }
    override fun battery() {
        when(selected)
        {
            1->Battery="\t4,000 mAh Li-ion battery"
            2->Battery="\t7,000 mAh Li-ion battery"
            3-> Battery="\t8,000 mAh Li-ion battery"
            4-> Battery="\t9,000 mAh Li-ion battery "
            else-> print("number is invalid ")
        }
    }
    override fun price() {
        when(selected)
        {
            1->Price="2000.00 DH "
            2->Price="1000.00 DH"
            3-> Price="1500.00 DH "
            4-> Price="2500.00 DH  "
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
        print("Huwaei Models :  \n  1: Huawei Ascend Mate (2013) \n  2: Huawei Ascend Mate 7 \n  3 : Huawei Mate S (2015) \n  4: Huawei Mate SE (2017)\n")
        selected = readln().toInt()
        when(selected)
        {
            1->model ="Huawei Ascend Mate (2013)"
            2->model=" Huawei Ascend Mate 7"
            3->model= "Huawei Mate S (2015)"
            4->model ="Huawei Mate SE (2017)"
            else-> print("number is invalid ")
        }
        stock()
        price()
        battery()
        Display()
        StorageCapcity()
        SystemVersion()
        RamCapcity()
        print("Model chosen : $model \n")
        print("Android Version : $version \n")
        print("Memory : $memory \n")
        print("Battery : $Battery \n")
        print("Display Quality : $Display\n")
        print("the amount available : $Stock \n")
        print("Price (DH) : $Price \n")



    }

}