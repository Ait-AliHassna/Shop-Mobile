package com.game.MobileShop

import kotlin.system.exitProcess

class Mobile_interface {
     private var name :String =""
     private var city: String =""
     private var selected: Int=0

    fun enter_data()
    {

       /// select_options()
        //select System IOS
        select_SYSTEM_Os()
        select_brand_phone()
        doyouwantsoethingelse()

    }
    fun doyouwantsoethingelse()
    {
        print("do you need something else : \n 1 : YES \n 2 : NO \n")
        var checkneed :Int= readln().toInt()
        when(checkneed)
        {
            1->select_SYSTEM_Os()
            2-> exitProcess(0)
            else-> print("the number is not valid")
        }
    }
     fun select_brand_phone()
     {
         print(" Enter ur brand phone \n")
         if(selected==1)
         {
             print ("Brand Phone list :\n" +
                     " 1 : Huawei \n 2 : Samsung \n 3: Xiaomi \n 4 : Quit \n")
             var brand:Int=Integer.valueOf(readln())
             when(brand){
                 1-> {
                     //Huawei().user_data()
                     Huawei().models()

                 }                 2-> {
                     Samsung().models()


             }                 3-> {
                // Xiaomi().user_data()
                     Xiaomi().models()


             }                 4-> exitProcess(0)
                 else-> print("invalide number ")
             }
         }
         else{
             Iphone().models()

         }

         doyouwantsoethingelse()

     }
     fun select_SYSTEM_Os()
     {
         print(" Enter ur OS SYSTEM PERFERD  \n")
         print(" 1: Android System  \n 2 : IOS SYSTEM \n 3 : quit()\n")
         selected=Integer.valueOf(readln())
         if(selected==3)
             exitProcess(0)
       select_brand_phone()
     }



}