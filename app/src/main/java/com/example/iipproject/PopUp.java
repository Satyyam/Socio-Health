package com.example.iipproject;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PopUp extends AppCompatActivity {

    String agestring;
    String Name;
    String time;
    String radioid;

    TextView Nam;
    TextView status1;
    TextView agegrp;
    TextView idtime;
    TextView content;
    ImageView logo;
    TextView Age1;
    TextView time1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);

        // Recieving the intent from previous Activity
        Intent intent=getIntent();
        agestring = intent.getStringExtra("ageuser");
        time = intent.getStringExtra("time");
        radioid = intent.getStringExtra("radiobutton");
        Name = intent.getStringExtra("Name");

        // Converting Strings to Integer and Float types
        int agenum = Integer.parseInt(agestring);
        int timenum = Integer.parseInt(time);
        int radid = Integer.parseInt(radioid);

        Nam =(TextView) findViewById(R.id.name);
        Age1 = (TextView) findViewById(R.id.age);
        time1 = (TextView) findViewById(R.id.time);
        status1 = (TextView) findViewById(R.id.sts);
        logo = (ImageView) findViewById(R.id.logo);
        agegrp = (TextView) findViewById(R.id.age_category);
        idtime = (TextView) findViewById(R.id.ideal_time);
        content = (TextView) findViewById(R.id.content);

        Age1.setText("Age : "+ agenum );
        time1.setText("Time Spent: "+timenum+" min.");

        if(Name==" ")
            Nam.setText("Hello, User!");
        else
            Nam.setText("Hello, "+Name+ "!");



        // Set image
        if(radid==1)
            logo.setImageResource(R.drawable.whatsapplogo);
        else if(radid==2)
            logo.setImageResource(R.drawable.logoinstagram);
        else if(radid==3)
            logo.setImageResource(R.drawable.facebook);
        else if(radid==4)
            logo.setImageResource(R.drawable.linkedinlogo);
        else if(radid==5)
            logo.setImageResource(R.drawable.pinterest);

        // Content
        String cont = "0";
        String ideal_time=" 0 Min.";
        String Age_group = "0";
        String status = "0";
        if(radid!=4) {                      // For Others except LinkedIn
            if ((agenum > 12) && (agenum <= 18)) {
                ideal_time = "20 Min.";
                Age_group = "13-18 years";
                if (timenum < 20)
                    status = "Good";
                else
                    status = "Would have been Better!";
                cont = "> For your Age Category, your time consumption on the media should be an average of 20 min. per day. \n " +
                        "> You should be concentrating more on your studies rather than spending time here untill and unless it is for study purpose. ";
            } else if ((agenum > 18) && (agenum <= 25)) {
                ideal_time = "23 Min.";
                Age_group = "18-25 years";
                if (timenum < 23)
                    status = "Good";
                else
                    status = "Would have been Better!";
                cont = "> In this age group, a little proportion of people use this platform for the purpose of Business/work/Digital Marketing while others to gain knowledge.";
            } else if ((agenum > 25) && (agenum <= 34)) {
                ideal_time = "30 Min.";
                Age_group = "25-34 years";
                if (timenum < 30)
                    status = "Good";
                else
                    status = "Would have been Better!";
                cont = "> Mostly used for Business/work/Marketting purpose by these category of people.";
            } else if ((agenum > 34) && (agenum <= 49)) {
                ideal_time = "38 Min.";
                Age_group = "35-44 years";
                if (timenum < 38)
                    status = "Good";
                else
                    status = "Would have been Better!";
                cont = "> 40% of the people use this platform at this age for Business/work/Marketing purpose or maybe for chatting only. \n " +
                        "> People falling in this category use the media to get news for most of the time.";
            } else if ((agenum > 49) && (agenum <= 64)) {
                ideal_time = "25 Min.";
                Age_group = "50-64 years";
                if (timenum < 25)
                    status = "Good";
                else
                    status = "Would have been Better!";
                cont = "> Amongst this group is a notable concentration of high-ranking professionals who use the business-oriented social network, LinkedIn. \n " +
                        "> People falling in this category use the media other than LinkedIn to get news for most of the time.";
            } else if (agenum > 64) {
                ideal_time = "30 Min.";
                Age_group = "Over 65s";
                if (timenum < 30)
                    status = "Good";
                else
                    status = "Would have been Better!";
                cont = "> Senior users have generally demonstrated a tendency towards using the platform primarily to network and participate in conversations; in contrast with the youngest users, many of whom are more interested in identity-forming activities like posting selfies. Key topics for older social users are health and community.";
            }
        }
        else if(radid==4)   // that is for LinkedIn
        {
            if ((agenum > 12) && (agenum <= 18)) {
                ideal_time = "20 Min.";
                Age_group = "13-18 years";
                if (timenum < 20)
                    status = "Good";
                else
                    status = "Would have been Better!";
                cont = "> For your Age Category, your time consumption on the media should be an average of 20 min. per day. \n " +
                        "> You should be concentrating more on your studies rather than spending time here untill and unless it is for study purpose. ";
            } else if ((agenum > 18) && (agenum <= 25)) {
                ideal_time = "23 Min.";
                Age_group = "18-25 years";
                if (timenum < 23)
                    status = "Good";
                else
                    status = "Would have been Better!";
                cont = "> In this age group, people look for job openings and especially they develop their technical skill to showcase over here.\n" +
                        "> Also referals are asked by the people of this category from their connections";
            } else if ((agenum > 25) && (agenum <= 34)) {
                ideal_time = "30 Min.";
                Age_group = "25-34 years";
                if (timenum < 30)
                    status = "Good";
                else
                    status = "Would have been Better!";
                cont = "> Mostly used for Business/work/Marketting purpose by these category of people.";
            } else if ((agenum > 34) && (agenum <= 49)) {
                ideal_time = "38 Min.";
                Age_group = "35-44 years";
                if (timenum < 38)
                    status = "Good";
                else
                    status = "Would have been Better!";
                cont = "> Mostly used for hiring purpose by the officials of the company looking for suitable candidates. ";
            } else if ((agenum > 49) && (agenum <= 64)) {
                ideal_time = "25 Min.";
                Age_group = "50-64 years";
                if (timenum < 25)
                    status = "Good";
                else
                    status = "Would have been Better!";
                cont = "> Amongst this group is a notable concentration of high-ranking professionals who use the business-oriented social network";
            } else if (agenum > 64) {
                ideal_time = "30 Min.";
                Age_group = "Over 65s";
                if (timenum < 30)
                    status = "Good";
                else
                    status = "Would have been Better!";
                cont = "> At this stage there are less active users, but they do look for hiring people for the company as they are more experienced.";
            }
        }
        else if(radid==0){
            status = "NA";
            if ((agenum > 12) && (agenum <= 18))
                Age_group = "13-18 years";
            else if ((agenum > 18) && (agenum <= 25))
                Age_group = "18-25 years";
            else if ((agenum > 25) && (agenum <= 34))
                Age_group = "25-34 years";
            else if ((agenum > 34) && (agenum <= 49))
                Age_group = "35-44 years";
            else if ((agenum > 49) && (agenum <= 64))
                Age_group = "50-64 years";
            else if (agenum > 64)
                Age_group = "Over 65s";

            cont = "> Select the Media from the previous screen, you haven't selected one!";
        }

        if (agenum<13)
        {
            status="Not good at all!";
            ideal_time = "0 Min";
            Age_group="Below 13";
            cont="> Usually at this age, kids don't have a mobile phone and a social media account, but this may not be the case in future. ";
        }


        //set the status
        status1.setText("Status: "+status);

        //set the ideal time
        idtime.setText("Ideal time should be "+ideal_time);

        //set the age group
        agegrp.setText("Age Group: "+Age_group);

        //set content
        content.setText(cont);
    }
}
