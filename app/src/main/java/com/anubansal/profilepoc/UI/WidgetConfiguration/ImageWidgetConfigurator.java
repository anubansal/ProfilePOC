package com.anubansal.profilepoc.UI.WidgetConfiguration;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;

import com.anubansal.profilepoc.R;
import com.facebook.common.internal.Sets;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.Map;
import java.util.Set;

/**
 * Created by arpitratan on 07/03/17.
 */

//TODO: Filter out configurations specific to a template to a separate class or make those configs applicable for each template.

public class ImageWidgetConfigurator implements IWidgetConfigurator {
    private int finalDimen;
    private ImageView finalImageView;
    private String url;
    private static final String TAG = ImageWidgetConfigurator.class.getSimpleName();

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
        return Sets.newHashSet("url");
    }

    @Override
    public int resId() {
        return -1;
    }

    @Override
    public void setConfiguration(final Map<String, Object> viewConfig, final View view) {

//        Uri imageUri = Uri.parse("https://i.imgur.com/tGbaZCY.jpg");
//        SimpleDraweeView draweeView = view.findViewById(R.id.avatar);
//        draweeView.setImageURI(imageUri);
//        ImageView imageView;
//        Object tag = null;
//        int dimen = view.getContext().getResources().getDimensionPixelSize(R.dimen.kairos_dp_size);
//
//        view.setTag(R.id.img_exist, "true");
//
//        if(view != null) {
//            tag = view.getTag();
//        }
//
//        if (viewConfig.containsKey("alphaAnimation")) {
//            boolean alphaAnimation = (boolean) viewConfig.get("alphaAnimation");
//            if (alphaAnimation) {
//                view.setTag(R.id.tag_alpha, "true");
//            }
//        }
//
//        if(view instanceof ImageView) {
//            imageView = (ImageView) view;
//        }
//        else {
//            imageView = (ImageView) view.findViewById(R.id.avatar);
//            url = (String) viewConfig.get("url");
//            if (viewConfig.containsKey("style") && viewConfig.get("style").equals("square")) {
//                imageView.setVisibility(View.GONE);
//                imageView = (ImageView) view.findViewById(R.id.gif_avatar);
//                imageView.setVisibility(View.VISIBLE);
//                dimen = view.getContext().getResources().getDimensionPixelSize(R.dimen.kairos_img_size);
//                view.setLayoutParams(new LinearLayout.LayoutParams(dimen, dimen));
//            }
//
//            View avatarOutlineView = view.findViewById(R.id.avatar_outline);
//            if ((viewConfig.containsKey("style") && viewConfig.get("style").equals("circle")) && viewConfig.containsKey("border")) {
//                avatarOutlineView.setVisibility(((Boolean) viewConfig.get("border") == true) ? View.VISIBLE : View.GONE);
//            }else {
//                avatarOutlineView.setVisibility(View.GONE);
//            }
//        }
//
//        ViewTreeObserver vto = imageView.getViewTreeObserver();
//        finalDimen = dimen;
//        finalImageView = imageView;
//        final Object objTag = tag;
//        vto.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
//            public boolean onPreDraw() {
//                if(view.getMeasuredHeight() == 0 || view.getMeasuredWidth() == 0)
//                    return false;
//                finalImageView.getViewTreeObserver().removeOnPreDrawListener(this);
//
//                url = (String) viewConfig.get("url");
//
//                AssetUtils assetUtils = new AssetUtils();
//                String fullFilePath = assetUtils.getAssetPath((String) viewConfig.get("url"));
//
//                if (url.startsWith("hike://datasource/contact/")) {
//                    loadImage(url, view, objTag);
//                }
//
//                //TODO:Movie loading of gif on async thread.
//                else if( (url.contains(".gif") || url.contains("anim=1") ) && finalImageView instanceof GifImageView) {
//                    GifImageView gifImageView = (GifImageView) finalImageView;
//                    String key = url.replaceAll("[^a-zA-Z0-9_-]", "");
//                    GifIORequestExecutor gifIORequestExecutor = new GifIORequestExecutor();
//                    gifIORequestExecutor.setCacheEnable(true);
//                    gifIORequestExecutor.loadImage(key, fullFilePath, gifImageView);
//
//                } else {
//                    File file = new File(fullFilePath);
//                    FileImageLoader fileImageLoader = new FileImageLoader(finalImageView.getMeasuredWidth(), finalImageView.getMeasuredHeight());
//                    fileImageLoader.setDefaultDrawableNull(false);
//                    fileImageLoader.setImageFadeIn(false);
//                    fileImageLoader.setDefaultAvatarIfNoCustomIcon(false);
//                    fileImageLoader.setScale(false);
//                    fileImageLoader.loadImage(FileImageLoader.FILE_KEY_PREFIX + file.getAbsolutePath(), finalImageView);
//                }
//                return true;
//            }
//        });

    }

    private void loadImage(String url, View view, final Object tag) {
//        Map<String, String> mParams = Utils.jsonToMap(url.substring(url.indexOf('{')));
//        String uid = mParams.get("uid");
//        final String displayName = mParams.get("dn");
//
//        IconLoader iconLoader = new IconLoader(view.getContext(), finalDimen);
//        iconLoader.setDefaultAvatarIfNoCustomIcon(false);
//        iconLoader.setImageLoaderListener(new ImageWorker.ImageLoaderListener() {
//            @Override
//            public void onImageWorkSuccess(ImageView imageView) {
//                // Do nothing
//            }
//
//            @Override
//            public void onImageWorkFailed(ImageView imageView) {
//                    if(tag!=null && tag instanceof String) {
//                        imageView.setImageDrawable(HikeBitmapFactory.getDefaultTextAvatar(displayName, finalDimen));
//                    }
//            }
//        });
//        iconLoader.loadImage(uid, finalImageView, false, false, false, displayName);
    }

    @Override
    public void onClick(Map<String, Object> viewConfig, View view) {

    }

}
