package com.example.justina

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.justina.adapters.ImageAdapter
import com.example.justina.models.ImageItem
import java.util.UUID

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val imageRV = findViewById<RecyclerView>(R.id.imageRV)

        val imageList = arrayListOf(
            ImageItem(
                UUID.randomUUID().toString(),
                "https://scontent.flos1-2.fna.fbcdn.net/v/t39.30808-6/306072666_3212895152288397_180302181838817889_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=833d8c&_nc_eui2=AeEmMGfyyg21FY8eH5O9kKgcFmOe2fniawYWY57Z-eJrBmD1jsZfoQhzQ22kK-wBYXxkY6t28FfBnV4E3aJrzanO&_nc_ohc=C5ia2AcWPEkQ7kNvgGVByUH&_nc_zt=23&_nc_ht=scontent.flos1-2.fna&oh=00_AYDNgeLWbxV_IEH2SnDQL4j8gdVXWltxP5GPTbct2c_pfw&oe=66EE158C"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://scontent.flos1-1.fna.fbcdn.net/v/t39.30808-6/453263064_3699631690281405_5601114784960055774_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=833d8c&_nc_eui2=AeFOX9Dn0WFtJgtjo3FyaoCz-_f_JNuTPUv79_8k25M9S1Ei9fj0PanThWYylQ4pnChKiebR8Yc2jqmH-LYUu3XM&_nc_ohc=igKl6NGm3uYQ7kNvgFNrKVW&_nc_zt=23&_nc_ht=scontent.flos1-1.fna&oh=00_AYA-0fC9AjcrgsttLJMR_IL4ywWd9ZndpMLMzNqqCXH__w&oe=66EE06E8"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://scontent.flos1-1.fna.fbcdn.net/v/t1.6435-9/41395101_2138856929721286_2905375243499470848_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=7b2446&_nc_eui2=AeH2_W9ImJ_ve2nuOlGUe71BHAVL7h5iLLYcBUvuHmIstu_dekSCDUMBtQYRUgTXPEF-llxRQl37QMT5QUBOCB-o&_nc_ohc=SsT1ahZDjJ8Q7kNvgG88pT2&_nc_ht=scontent.flos1-1.fna&oh=00_AYAX5JQSVDfTViZTbeUti2Ux8becqpuyQkYRM7Vy8YmczQ&oe=670F9CDF"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://scontent.flos1-2.fna.fbcdn.net/v/t39.30808-6/455218138_3710708805840360_4512854385687049420_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=833d8c&_nc_eui2=AeH_AZQa7hJN2RjGnlsGvYvDe3lA-PPJw1J7eUD488nDUlygAgidpItsxN01PdlFV29--O9qOjCRR0_zWYZyla5b&_nc_ohc=X2suxJ6Ox3YQ7kNvgFwNIsu&_nc_zt=23&_nc_ht=scontent.flos1-2.fna&oh=00_AYDsrksDt6Q90TE-tcYCCSY2PuZ8bfz53k4HY0cZVSD8iw&oe=66EE2FB4"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://scontent.flos1-1.fna.fbcdn.net/v/t39.30808-6/244595418_4522626211135357_2147517756071790003_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=833d8c&_nc_eui2=AeE7WOOq1J2JgG8ow4s7tm-OQTrhrsBONppBOuGuwE42mrjrJdyClRrG0uQA2qv8dFe8MqteuR6FjqLe5lO29Lwx&_nc_ohc=mqZwFh_98MYQ7kNvgE7U2Jz&_nc_zt=23&_nc_ht=scontent.flos1-1.fna&oh=00_AYC_2S2JCFU6zVNLNJf3JEsBs6de9kkYjW9Gb0S_EmHW0g&oe=66EE2406"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://scontent.flos1-1.fna.fbcdn.net/v/t39.30808-6/459228724_8347502295314377_8984549195674096902_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=833d8c&_nc_eui2=AeEM5sD-RoBbn8Hj6gJaNsv2mLSrTovLk3uYtKtOi8uTezOpfD-GxAjRk3la1SjcS8KoQhSQ_-CcuocV_W6oc1B9&_nc_ohc=M2bbMeRLXwYQ7kNvgGe__Ip&_nc_zt=23&_nc_ht=scontent.flos1-1.fna&_nc_gid=A71j7rsKnnsZ-rEiRVJ25is&oh=00_AYBggEpf8r_rIzBoI2r4ngh-fsNg4fhtpvckbW_mpclPfg&oe=66EE1377"
            ),
            ImageItem(
                    UUID.randomUUID().toString(),
            "https://scontent.flos1-1.fna.fbcdn.net/v/t39.30808-6/232771640_2919211101656805_6656908154233450012_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=833d8c&_nc_eui2=AeFULLDilc7wUPdTzBWZyszy8IJkLjokqKrwgmQuOiSoqhne4AxBB8xSBwPuSHvY9hzMG6SBRXYBHuhXRRC37QeZ&_nc_ohc=h1vDFa1zwu4Q7kNvgFG-WU3&_nc_zt=23&_nc_ht=scontent.flos1-1.fna&_nc_gid=A2lRXhucQVhCYr2OU7Bn61O&oh=00_AYAVWa18p9ljYs6kpyialp089BYJm7ZpN64hmqAUq0ODUA&oe=66EE3059"
            ),
            ImageItem(
            UUID.randomUUID().toString(),
            "https://scontent.flos1-2.fna.fbcdn.net/v/t39.30808-6/442412916_3646716862239555_2958015353442300598_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=833d8c&_nc_eui2=AeGoOwEEDqige7v-bN4GDLpD1cCZC73LxhLVwJkLvcvGEpK_MCZCO9hEi5wqOMxHTJxlIHlnk9z4JkcUEhQqdudA&_nc_ohc=BiAHXFd0S9oQ7kNvgEHcp9F&_nc_zt=23&_nc_ht=scontent.flos1-2.fna&_nc_gid=AJ_9RhgYhaUp8Wspwv1GPuq&oh=00_AYAfwdBz7-XoSWQTdRK8klUOcaJZe0fDz45YLSmkYRgw6Q&oe=66EE29B9"
            ),
            ImageItem(
            UUID.randomUUID().toString(),
            "https://scontent.flos1-2.fna.fbcdn.net/v/t39.30808-6/420511349_3615887665322475_7752027866429975568_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=833d8c&_nc_eui2=AeGiSd79hJ3xfu3BE3-_b1NDK7bsQ-0r9akrtuxD7Sv1qTfSieaScosvY7AqPL_ACqoRLNxvxfjwS3IZnS7L5aBz&_nc_ohc=OGuuWxuTJZsQ7kNvgHDwzBy&_nc_zt=23&_nc_ht=scontent.flos1-2.fna&_nc_gid=AXuz94_9vcXs_PjBkZCjHdN&oh=00_AYDE2dUrISdumc14bK8KR__IWbWmzIOQyi0MYyWpsJcs_Q&oe=66EE2190"
            ),
            ImageItem(
            UUID.randomUUID().toString(),
            "https://scontent.flos1-2.fna.fbcdn.net/v/t1.6435-9/110287071_2624630334448218_5601318672277431259_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=7b2446&_nc_eui2=AeGd9EdIOJicvvb9dN8ZQEMijjtR-i2nWqCOO1H6LadaoD-S6N1rZU-pRlj02lljG9327aPPIl94_1Qgjjmrxvbe&_nc_ohc=eotPzWLUF0IQ7kNvgF_-2dH&_nc_ht=scontent.flos1-2.fna&oh=00_AYB4mW1UWOdfyzB-9sKfvZLIJFIqXyAPPeWk7p-uUik_Jg&oe=670FC1BA"
            ),
            ImageItem(
            UUID.randomUUID().toString(),
            "https://scontent.flos1-1.fna.fbcdn.net/v/t1.6435-9/118672731_2658370094407575_1215228809252266220_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=7b2446&_nc_eui2=AeFJiOCsZsfKt2y0uMY-guuyBE3j_3ytO5wETeP_fK07nPPw5SytAiJ7EdbDA2BZdSwepsBV6_UHMQt37owziUor&_nc_ohc=j5RiqGkzlAwQ7kNvgHEi6y4&_nc_ht=scontent.flos1-1.fna&_nc_gid=AfyMGd6LAZjQ6jtb4l-iRtj&oh=00_AYC83BccI8tBCz2wKD2x9yLROQ_l4uYzxCaGBtIpHZK8tQ&oe=670FC8EA"
            ),
            ImageItem(
            UUID.randomUUID().toString(),
            "https://scontent.flos1-2.fna.fbcdn.net/v/t1.6435-9/133362091_2761245487453368_4326173822386059906_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=7b2446&_nc_eui2=AeHkCSEg1fCidIixzNm7_1MXuL-DswWGJm64v4OzBYYmbqEfoa7-qUzOPB98B-Cb5sFGnH2T0VdQ17RPrmAYOGvk&_nc_ohc=1GP9Ubkq-54Q7kNvgFlZtZn&_nc_ht=scontent.flos1-2.fna&oh=00_AYBLKUb2N4QlkJS0TOGqykC9u1dKWc9NWBdgnp6ZSDpv8g&oe=670FB589"
            )
        )

        val imageAdapter = ImageAdapter()
        imageRV.adapter = imageAdapter
        imageAdapter.submitList(imageList)

    }
}