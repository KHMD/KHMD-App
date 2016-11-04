package in.co.khmd.khmdapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class IntroActivity extends AppIntro {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String title = "Hello There", description = "Hello";

        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest.
        addSlide(AppIntroFragment.newInstance(title, description, R.drawable.sativa, getResources().getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance(title, description, R.drawable.sativa, getResources().getColor(R.color.colorPrimaryDark)));

        // SHOW or HIDE the statusbar
        showStatusBar(false);

        // Edit the color of the nav bar on Lollipop+ devices
        setNavBarColor("#3F51B5");

        // Hide Skip/Done button.
        showSkipButton(true);
        setProgressButtonEnabled(true);

        setFadeAnimation();

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        //currentFragment.getActivity().getSupportFragmentManager().beginTransaction().remove(currentFragment).commit();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}
