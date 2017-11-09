package com.anubansal.profilepoc.UI.WidgetConfiguration;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.anubansal.profilepoc.UtilsAndConstants.KairosConstants;
import com.anubansal.profilepoc.UtilsAndConstants.Utils;
import com.facebook.common.internal.Sets;

import java.util.Map;
import java.util.Set;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;
import static com.anubansal.profilepoc.UtilsAndConstants.KairosConstants.CLICKED_TEXT;
import static com.anubansal.profilepoc.UtilsAndConstants.KairosConstants.TEXT;

/**
 * Created by arpitratan on 07/03/17.
 */
public class ButtonWidgetConfigurator implements IWidgetConfigurator {
    @Override
    public Set<String> validChildTypes() {
        return null;
    }

    @Override
    public Set<String> requiredChildTypes() {
        return null;
    }

    @Override
    public Set<String> requiredViewConfigs() {
        return Sets.newHashSet(TEXT, CLICKED_TEXT);
    }

    @Override
    public int resId() {
        return -1;
    }

    @Override
    public void setConfiguration(Map<String, Object> viewConfig, View view) {
        TextView btnText = (TextView) view;
        String text = (String)viewConfig.get(TEXT);
        btnText.setText(text);
        if (viewConfig.containsKey(KairosConstants.TICK_ENABLED) && (Boolean) viewConfig.get(KairosConstants.TICK_ENABLED) == false) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = WRAP_CONTENT;
            view.setLayoutParams(layoutParams);
            // Since ellipsize was not working with WRAP_CONTENT, i had to resolve to this method.
            if (text.length() > 10) {
                text = text.substring(0, 8) + "...";
            }
            btnText.setText(text);
            btnText.setPadding(new Utils().dpToPx(15), 0, new Utils().dpToPx(15), 0);
        }
    }

    @Override
    public void onClick(Map<String, Object> viewConfig, View view) {
        TextView btnText = (TextView) view;
        String text = (String)viewConfig.get(CLICKED_TEXT);
        btnText.setText(text);
//        if (!(viewConfig.containsKey(KairosConstants.TICK_ENABLED) && (Boolean)viewConfig.get(KairosConstants.TICK_ENABLED) == false)) {
//            TextView btnText = (TextView) view;
//            btnText.setText("");
//            btnText.setPadding(new Utils().dpToPx(24),0,0,0);
//            Drawable tickMark = ContextCompat.getDrawable(HikeMessengerApp.getInstance().getApplicationContext(), R.drawable.ic_bold_tick);
//            DrawableUtils.fillColor(tickMark, HikeMessengerApp.getInstance().getThemeCoordinator().getCurrentTheme().getColorPallete().getTransBgColor());
//            tickMark.setBounds(0, 0, tickMark.getIntrinsicWidth(), tickMark.getIntrinsicHeight());
//            btnText.setCompoundDrawables(
//                    tickMark,
//                    null, null, null);
//            btnText.setCompoundDrawablePadding(Utils.dpToPx(-24));
//            btnText.setEnabled(false);
//        }
    }


}
