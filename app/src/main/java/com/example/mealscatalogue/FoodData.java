package com.example.mealscatalogue;

import java.util.ArrayList;
import java.util.Collection;

public class FoodData {

    public static String[][] data = new String[][] {
            {"Mie Aceh", "Provinsi Aceh", "https://makananoleholeh.com/wp-content/uploads/2018/10/Mie-Aceh.jpg" , "Makanan ini memang sangat terkenal bukan hanya di tengah masyarakat aceh saja melainkan juga dikenal oleh masyarakat luar aceh karena citarasanya sangat istimewa. Perbedaan mie aceh dengan mie di daerah lain adalah mie aceh memiliki tekstur yang lebih tebal dan biasanya disajikan dengan daging dan disiram sop sejenis kari yang pedas dan gurih. Rasa makanan ini memang sangat kaya rempah sehingga terasa begitu nikmat."},
            {"Bika Ambon", "Provinsi Sumatera utara", "https://makananoleholeh.com/wp-content/uploads/2018/10/Bika-Ambon.jpg", "Makanan ini banyak dikira sebagai makanan khas ambon pada berasal dari sumatera. Bika ambon merupakan kue yang banyak di jual di berbagai wilayah di indonesia karena memang banyak digemari masyarakat indonesia. Rasa bika ambon biasanya rasa durian, keju, dan yang lainnya. Selain itu teksturnya juga sangat manis dan lembut sehingga akan membuat siapa saja ketagihan dengan makanan satu ini."},
            {"Rendang Padang", "Provinsi Sumatera barat", "https://makananoleholeh.com/wp-content/uploads/2018/10/Rendang-Padang.jpg", "Makanan ini memang sangat terkenal karena bukan hanya karena asal daerahnya saja namun memang rendang merupakan salah satu makanan terlezat di dunia versi cnn internasional. Anda bisa menemukan makanan ini di rumah makan khas padang atau di tempat lainnya yang memang menyediakan menu khas padang. Rendang terbuat dari daging sapi yang dimasak dengan bumbu rempah yang banyak sehingga rasanya sangat lezat dan kuat."},
            {"Gulai Ikan Patin", "Provinsi Jambi", "https://makananoleholeh.com/wp-content/uploads/2018/10/Gulai-Ikan-Patin.jpg", "Gulai ini dimasak dengan daging durian yang telah difermentasi atau sering disebut dengan tempoyak. Anda bisa membayangkan berapa rasa dari gulai ikan patin akan sangat khas dan juga unik. Saat ini gulai ikan patin sudah lebih banyak dimasak dengan menggunakan santan kelapa karena baunya tidak menyengat seperti jika menggunakan tempoyak."},
            {"Gulai Belacan", "Provinsi Riau", "https://makananoleholeh.com/wp-content/uploads/2018/10/Gulai-Belacan.jpg", "Masyarakat riau juga memiliki makananannya sendiri. Jika anda berkunjung ke bengkulu sebaiknya mencoba untuk menikmati makanan yang terbuat dari bahan dasar ikan atau udang. Makanan ini merupakan makanan yang tidak kalah dengan gulai ikan patin. Masyarakat disana menyebutnya gulai belacan. Makanan ini merupakan makanan yang dibuat dari bahan ikan atau udang yang dibumbui dengan campuran kuah belacan atau terasi. Rasa dari makanan ini sangat khas dan juga nikmat sehingga anda akan sangat menyukainya."},
            {"Otak-otak", "Provinsi Kepulauan Riau", "https://makananoleholeh.com/wp-content/uploads/2018/10/Otak-otak.jpg", "Di kepulauan riau anda bisa menemukan makanan yang sangat khas yakni otak-otak. Makanan ini memang sangat khas karena terbuat dari bahan ikan dan cumi yang diberi bumbu pedas. Aroma dari makanan ini sangat lezat karena selain terbuat dari ikan makanan ini juga dimasak dengan dibungkus daun pisang dan kemudian akan dibakar."},
            {"Pempek", "Provinsi Sumatera selatan", "https://makananoleholeh.com/wp-content/uploads/2018/10/Pempek.jpg", "Empek-empek adalah makanan khas dari sumatera selatan yang saat ini sudah banyak dijual di berbagai wilayah di indonesia. Makanan ini memang sangat lezat karena terbuat dari bahan sagu dan ikan yang kemudian akan di sajikan dengan kuah dari air, gula merah, cabe, bawang, garam, udang ebi dan sedikit cuka. Pempek sangat nikmat dan gurih karena terasa kenyal dan juga begitu terasa sekali aroma ikannya. Anda bisa membuat makanan ini sendiri di rumah karena sangat mudah sekali cara pembuatannya."},
            {"Kerak Telor", "Provinsi Jakarta", "https://makananoleholeh.com/wp-content/uploads/2018/10/Kerak-Telor.jpg", "Siapa sih yang tidak kenal denganKerak Telor, makanan khas jakarta ini memang rasanya nikmat banget. Nah buat kalian yang belum pernah coba kerak telor, cobain deh rasanya enak banget."},
            {"Nasi Gudeg", "Provinsi D.I. Yogyakarta", "https://makananoleholeh.com/wp-content/uploads/2018/10/Nasi-Gudeg.jpg", "Yang sudah merasakan berwisata ke kota yogyakarta tentunya sudah pernah merasakan makanan  khas jogja ini. Gudeg salah satu menu makanan yang cukup populer di kota istimewa ini. Dibuat dari kuah santan kental, krecek, cabai, daging ayam atau telor."},
            {"Lapa-Lapa", "Provinsi Sulawesi Tenggara", "https://makananoleholeh.com/wp-content/uploads/2018/10/Lapa-Lapa.jpg", "Walaupun bentuknya kurang menggugah selera, namun rasanya cukup enak juga jika disajikan dengan menu makanan lainnya misalnya ikan asin ataupun sup."}
    };

    public static Collection<? extends Food> getListData() {
        Food food = null;
        ArrayList<Food> list =  new ArrayList<>();
        for (String[] foodData : data) {
            food = new Food();
            food.setName(foodData[0]);
            food.setOrigin(foodData[1]);
            food.setImage(foodData[2]);
            food.setDesc(foodData[3]);

            list.add(food);
        }
        return list;
    }

}
