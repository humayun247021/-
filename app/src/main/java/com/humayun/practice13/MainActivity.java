package com.humayun.practice13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView2,text1,tvdisplay,text2,text3,text4,text5,text6,text7;
    ImageView copy;
    ScrollView scroll;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scroll=findViewById(R.id.scroll);
        textView2=findViewById(R.id.textView2);
        copy=findViewById(R.id.copy);
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Text",tvdisplay.getText().toString());
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(MainActivity.this, "copied to clipboard", Toast.LENGTH_SHORT).show();

            }
        });

        tvdisplay=findViewById(R.id.tvdisplay);
        text1=findViewById(R.id.text1);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scroll.setVisibility(View.VISIBLE);
                tvdisplay.setText("\n" +
                        "সমস্ত প্রশংসাতো, শুধুমাত্র তার ;\n" +
                        "\n" +
                        "সকল ইবাদাতের যিনি, একক হকদার ।\n" +

                        "আরশের অধীপতি, মালিক মহান ;\n" +
                        "\n" +
                        "তার ভয়ে কম্পমান, জমিন আসমান ।\n" +

                        "বড় বড় রাজা বাদশা, তাকে করে ভয় ;\n" +
                        "\n" +
                        "মুমীনের অন্তরে তার, ভালবাসা রয় ।\n" +

                        "মহামহীম আল্লাহ তায়ালা, বড়ই ক্ষমাশীল ;\n" +
                        "\n" +
                        "রহমত ও দয়া করেন, তিনি যে সীমাহীন ।\n" +

                        "ভালবাসে যে আল্লাহকে, সে হবে সফল ;\n" +
                        "\n" +
                        "কাফির, মুশরিকের প্রচেষ্টা, সবই হবে বিফল ।");

            }
        });

        text2=findViewById(R.id.text2);

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scroll.setVisibility(View.VISIBLE);
                tvdisplay.setText("সমস্ত প্রশংসাতো, শুধুমাত্র তার ;\n" +
                        "\n" +
                        "সকল ইবাদাতের যিনি, একক হকদার ।\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "আরশের অধীপতি, মালিক মহান ;\n" +
                        "\n" +
                        "তার ভয়ে কম্পমান, জমিন আসমান ।\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "বড় বড় রাজা বাদশা, তাকে করে ভয় ;\n" +
                        "\n" +
                        "মুমীনের অন্তরে তার, ভালবাসা রয় ।\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "মহামহীম আল্লাহ তায়ালা, বড়ই ক্ষমাশীল ;\n" +
                        "\n" +
                        "রহমত ও দয়া করেন, তিনি যে সীমাহীন ।\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "ভালবাসে যে আল্লাহকে, সে হবে সফল ;\n" +
                        "\n" +
                        "কাফির, মুশরিকের প্রচেষ্টা, সবই হবে বিফল ।");

            }
        });



        text3=findViewById(R.id.text3);

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scroll.setVisibility(View.VISIBLE);
                tvdisplay.setText("\n" +
                        "গভীর রজণী, মরুময় প্রান্তর\n" +
                        "\n" +
                        "দূর নিহারিকা কুঞ্জের, আলোকোঞ্জল সম্ভার !\n" +
                        "\n" +
                        "সমগ্র মুসলিম বাহিনী, গভীর নিদ্রায় শায়িত\n" +
                        "\n" +
                        "আল্লাহ’র হাবীব তখনওব্ধি, সেজদায় অবনত ।\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "পরদিন বেজে ওঠে, যুদ্ধের দামামা\n" +
                        "\n" +
                        "নিজ হাতে নবীজি করেন, যুদ্ধের বুহ্য রচনা ।\n" +
                        "\n" +
                        "প্রচন্ড ঝড়ের পূর্বে, সাগর যেমন নিশ্চুপ\n" +
                        "\n" +
                        "সাহাবী আজমাইনরাও, ছিলেন ঠিক তদ্রুপ ।\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "তাওহীদের ক্ষুদ্রবাহিনীর চোখে, ছিলনা কোন ভয়\n" +
                        "\n" +
                        "আল্লাহ তায়ালা মহা পরাক্রমশীল, তিনি দান করেন বিজয় ।\n" +
                        "\n" +
                        "সত্যের সঙ্গে মিথ্যার আর অন্ধকারের সাথে আলোর\n" +
                        "\n" +
                        "হক ও বাতিল শক্তির সংঘর্ষে, তপ্ত বদরের প্রান্তর ।\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "সবার হাতেই রক্ত পিয়াসূ, উনমুক্ত তরবারী\n" +
                        "\n" +
                        "মুশরিকদের বিরুদ্ধে মুসলমানদের,’আল্লাহ’ করলেন বিজয়ী ।");

            }
        });



        text4=findViewById(R.id.text4);

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scroll.setVisibility(View.VISIBLE);
                tvdisplay.setText("মানব জাতিকে ‘আল্লাহ’ করলেন, শ্রেষ্ঠতম এক কিতাব দান\n" +
                        "\n" +
                        "পথ হারাদের পথের দিশারী, মহাগ্রন্থ ‘আল কূরআন’ ।\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "সূরা সংখ্যা একশ চোদ্দ, আয়াত ছ’হাজার ছেষট্টি\n" +
                        "\n" +
                        "সিজদা হল চোদ্দ আর মনজীল আছে সাতটি ।\n" +
                        "\n" +
                        "ছিয়াশিটি মক্কি ও আঠাশটি সূরা মাদানি,\n" +
                        "\n" +
                        "ত্রিশ পারায় বিভক্ত তা অন্তর করে নূরানী !\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "সর্বকালের শ্রেষ্ঠ কাব্য গ্রন্থ বলে স্বীকৃত\n" +
                        "\n" +
                        "বিজ্ঞানময় ‘কূরআন’ এটি, জীবন করে আলোকিত\n" +
                        "\n" +
                        "সৃষ্টিকর্তার নির্ধারিত, নির্ভুল এক জীবন বিধান\n" +
                        "\n" +
                        "সর্বশেষ ও চুড়ান্ত এই মানবতার সংবিধান ।");

            }
        });

        text5=findViewById(R.id.text5);

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scroll.setVisibility(View.VISIBLE);
                tvdisplay.setText("অঙ্গতার অন্ধকারে, আচ্ছন্য যত মানব মন\n" +
                        "\n" +
                        "পাপাচারে গা ভাষায়ে, নিশ্চন্তে চলে জীবন-যাপন ।\n" +
                        "\n" +
                        "অর্থ লিপ্সা, হিংসা, ঘৃনা, গীবত অনাচার\n" +
                        "\n" +
                        "পূন্যবানরা সংখ্যালঘু, সহে অত্যাচার ।\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "কূরআন শিক্ষা, নামায-কালাম, ধর্মীয় যত বিধী-বিধান\n" +
                        "\n" +
                        "বাদ দিয়ে সব শিখছে সবাই, বিদআতি নাচ ও গান ।\n" +
                        "\n" +
                        "মুসলমান আজ নামে সবাই, নামায পড়ার সময় কোথায় ?\n" +
                        "\n" +
                        "দুই ঈদে আর জুম্মাহ বাদে, মসজিদে কি ভুলেও যায় ?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "মরণ অতি সন্নিকটে, করতে হবে মৃত্যু বরন\n" +
                        "\n" +
                        "বিলাশ বহুল জীবন যাপন, হবে চির দূঃখের কারন ।");

            }
        });

        text6=findViewById(R.id.text6);

        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scroll.setVisibility(View.VISIBLE);
                tvdisplay.setText("জীবন সামগ্রীর আধিক্য, বিলাস বহুল বাড়ি\n" +
                        "\n" +
                        "কোটি টাকা ব্যাঙ্ক ব্যালেন্স, ব্রান্ড নিউ গাড়ি ।\n" +
                        "\n" +
                        "শতাধিক বিঘা জমি, বসুন্ধরায় প্লট\n" +
                        "\n" +
                        "দূর্নিতী করে কামায়, কাড়ি কাড়ি নোট ।\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "সন্তানের উচ্চ শিক্ষ্যা, শেখায় মড়ার্ন কালচার\n" +
                        "\n" +
                        "স্ত্রীর চাই দামি শাড়ি, প্রচুর স্বর্ণালঙ্কার ।\n" +
                        "\n" +
                        "টাকার অভাব নাই, তবু আরো টাকা চাই !\n" +
                        "\n" +
                        "টাকার পিছনে ছুটে, নাওয়া খাওয়া ঘুম নাই\n" +
                        "\n" +
                        "ছুটো ছুটি, লুটো পুটি, মনে নাই কেন সূখ ?\n" +
                        "\n" +
                        "টাকাই কি সব কিছু, পারেকি ঘোচাতে দূঃখ ?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "শীততাপ বিল্ডিং এসি চলে রাত দিন\n" +
                        "\n" +
                        "লাখ টাকা দিয়ে কি আসে ঘুম কোন দিন ??");

            }
        });




        text7=findViewById(R.id.text7);

        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scroll.setVisibility(View.VISIBLE);
                tvdisplay.setText("\n" +
                        "আসন্ন সেই মহাদিবস, সন্নিকটে পরকাল\n" +
                        "\n" +
                        "কত করব পাপাচার, ভোগ করব হারাম মাল ।\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "সুবিশাল সেই আদালত, যাহা খ্যাত হাশরের ময়দান\n" +
                        "\n" +
                        "জড়ো করা হবে সব মাখলুখকে, হবে সবার পুনরুত্থান ।\n" +
                        "\n" +
                        "সরিবদ্ধ সব ফেরেস্থাকুল, করবে সেখানে অবস্থান\n" +
                        "\n" +
                        "বিচার দিনের সব আয়োজন, করবে তারা প্রানপণ ।\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "পাপের বোঝা ঘাড়ে নিয়ে, হাজির হবে পাপিগণ\n" +
                        "\n" +
                        "পূন্যবানদের ‘আল্লাহ’ করবেন, নূরানি এক সূরত দান ।\n" +
                        "\n" +
                        "আরশের অধিপতি, আল্লাহ তায়ালা সুমহান\n" +
                        "\n" +
                        "নেককারকে ক্ষমা করবেন, পাপিকে ভীষন অপমান ।\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "আমলনামা অনুসারে, মুমিনদের চিরস্থায়ী জান্নাত\n" +
                        "\n" +
                        "কাফের-মুশরিক, মুনাফিকদের, নাই সেদিন নাজাত ।");

            }
        });


    }
}