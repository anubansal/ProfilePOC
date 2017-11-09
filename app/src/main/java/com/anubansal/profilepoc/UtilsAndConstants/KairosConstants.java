package com.anubansal.profilepoc.UtilsAndConstants;

/**
 * Created by arpitratan on 17/03/17.
 */

public interface KairosConstants {

    String TEXT = "text";
    String CLICKED_TEXT = "clickedText";
    String ACTION = "action";
    String NAME = "name";
    String SECTIONS = "sections";
    String ID = "id";
    String IDS = "ids";
    String URL = "url";
    String TICK_ENABLED = "tick_enabled";
    String KAIROS_LONGEST_SHOWN_NOTIF_SEPARATOR = "::";
    String FTUE_COUNT = "ftueCount";
    String FTUE_ACTION = "ftueAction";
    String KRS_PUSH_REFRESH_CONFIG = "push_refresh";
    String KRS_PUSH_REFRESH_TIME = "refresh_time";
    long KRS_PUSH_DEFAULT_REFRESH_TIME = 4*60*60*1000;

    interface PARAMS {
        String NOTIF_ID = "notifID";
        String TEMPLATE_Id = "templateId";
        String SUB_TEMPLATES = "subTemplates";
        String TEMPLATE_TAG = "tag";
        String TEXT = "text";
        String STICKER_ID = "stickerId";
        String CATEGORY_ID = "categoryId";
    }

    interface CHANGE_TYPES {
        String INSERT = "insert";
        String DELETE = "delete";
        String UPDATE = "update";
    }

    interface NOTIF_TYPE {
        String PUSH = "push";
        String PUSH_KAIROS = "push_kairos";
        String KAIROS = "kairos";
    }

    interface TEMPLATE {
        String TEMPLATE1 = "template1";
        String TEMPLATE_SHORT_GREETING = "shortGreeting";
        String TEMPLATE3 = "template3";
        String TEMPLATE_GREETING_CHOOSER = "greetingChooserTemplate";
        String TEMPLATE_GREETING_CHOOSER_V2 = "greetingChooserTemplate_v2";
        String TEMPLATE_EXPANDABLE_GREETING = "expandableGreeting";
        String TEMPLATE5 = "template5";
        String TEMPLATE_YES_NO_QUESTIONS = "yesNoQuestionTemplate";
        String TEMPLATE_STICKER_POPUP = "stickerPopupTemplate";
    }

    interface CATEGORY {
        int HEADER = 0;
        int CAMERA = 1;
    }

    interface SUB_TEMPLATES {
        interface TAGS {
            String IMAGE_VIEW = "imageview";
            String TITLE = "title";
            String SUB_TITLE = "subtitle";

            String SHORT_GREETING_IMAGE = "sgImage";
            String SHORT_GREETING_TITLE = "sgTitle";
            String SHORT_GREETING_PROMPT = "sgPrompt";

            //greeting chooser template.
            String GCT_IMAGE_VIEW = "gctImage";
            String GCT_TITLE = "gctTitle";
            String GCT_SUBTITLE = "gctSubtitle";
            String GCT_ACTION_BUTTON = "gctActionButton";
            String GCT_CANCEL_BUTTON = "gctCancelButton";
            String GCT_HORIZONTAL_SCROLL_VIEW = "gctHorizontalScrollView";

            //expandable greeting template
            String EG_IMAGE_VIEW = "egImage";
            String EG_TITLE = "egTitle";
            String EG_SUB_TITLE = "egSubtitle";
            String EG_COLLAPSED_ACTION_BUTTON = "egCollapsedActionButton";
            String EG_EXPANDED_ACTION_BUTTON = "egExpandedActionButton";

            //sticker popup template
            String SPT_TITLE = "sptTitle";
            String SPT_SUB_TITILE = "sptSubtitle";
            String SPT_EDIT_TEXT = "sptEditText";
            String SPT_ACTION_BUTTON = "sptActionButton";
            String SPT_HORIZONTAL_SCROLL_VIEW = "sptHorizontalScrollView";

            String BUTTON = "btn";
            String YES_BUTTON = "yes_btn";
            String NO_BUTTON = "no_btn";

            String IMAGE_VIEW_BIG = "imageviewbig";
        }

        interface TYPES {
            String LABEL = "label";
            String IMAGE = "image";
            String BUTTON = "button";
            String EDIT_TEXT = "editText";
            String HORIZONTAL_SCROLL_VIEW = "horizontalScrollView";
            String HIKE_BUTTON = "hikeButton";
        }
    }

    interface LOADER_ID {
        int HEADER = 900;
        int CAMERA = 901;
    }

    interface SP {
        String SP_KAIROS_SHOW_COUNTER = "kairos_header_show_counter";
        String SP_KAIROS_SERVICE_RUNTIME = "kairos_service_runtime";
        String SP_KAIROS_SHOW_COUNTER_REFRESH_TIMESTAMP = "kairos_show_counter_refresh_timestamp";
        String SP_KAIROS_UI_REFRESH_TIMESTAMP = "kairos_ui_refresh_timestamp";
        String SP_KAIROS_LONGEST_SHOWN_NOTIF = "kair_longest_shown_notif";
        String SP_KAIROS_SHOWN_NOTIF_COUNT = "kairos_shown_notif_count";
        String SP_KAIROS_PUSH_REFRESH_TIME = "kairos_push_refresh_time";
        String SP_KAIROS_PUSH_UPGRADE_REFRESH = "kairos_push_upgrade_refresh";

        String SP_KAIROS_SWIPE_LAYOUT_TIP_SHOWN_COUNT = "kairos_swipe_layout_tip_shown_count";
        String SP_KAIROS_CONFIG_SWIPE_FTUE_COUNT = "kairos_config_swipe_ftue_count";
    }

    interface ANALYTICS {
        String KAIROS_UNIQUE_KEY = "kairos_notification";
        String KAIROS_KINGDOM = "act_notif";
        String KAIROS_PHYLUM = "kairos_h";
        String KAIROS_RECEIVED = "received";
        String KAIROS_SHOWN = "shown";
        String KAIROS_INVALIDATED = "invalidated";
        String KAIROS_DISCARDED = "discarded";
        String KAIROS_DEEPLINK_ALREADY_HANDLED = "Deeplink already handled";
        String KAIROS_INVALID_PACKET = "invalid packet";
        String KAIROS_INVALID_PUSH = "invalid push";
        String KAIROS_INVALID_PACKET_NO_TEMPLATES = "invalid packet_no_templates";
        String KAIROS_NO_COLLAPSED_PUSH_TEMPLATE = "collapsed_push_missing";
        String KAIROS_DUPLICATE_NOTIF = "duplicate notification";
        String KAIROS_NOTIF_ALREADY_CONSUMED = "notification already consumed";
        String KAIROS_DEEPLINK_NOT_SUPPORTED = "Deeplink not supported";
        String KAIROS_TTL_REACHED = "TTL_reached";
        String KAIROS_MAX_VIEWS_REACHED = "max_views_reached";
        String KAIROS_EXPIRED = "expired";
        String KAIROS_GROUPED = "grouped";
        String KAIROS_CLEARED = "cleared";
        String KAIROS_VIEW_SWITCH = "view_switch";
        String KAIROS_NOTIF_CLICK = "notif_click";
        String KAIROS_EXIT = "app_exit";
        String KAIROS_DISMISS ="dismiss";
        String KAIROS_DISMISS_LINK ="hike://kairos/" + KAIROS_DISMISS;
        String KAIROS = "kairos";
        String KAIROS_GREETINGS = "kairos_greeting";
        // TODO : later this can be modified to accommodate multiple sources, currently only one screen supports
        String KAIROS_SOURCE = "conv_screen";

        String UI_EVENT = "uiEvent";
        String KAIROS_SCROLL_ITEM_SELECTED = "hike://kairos/scrollitem_selected";
        String KAIROS_HEADER_SCROLL_ITEM_SELECTED = "header: scrollviewitem_selected";
        String ACTION_COMPLETED = "action_completed";
        String CLICK_ON_PUSH = "clickonpushnotif";
        String KAIROS_DISMISSED = "dismissed";
        String OPEN_KAIROS_ON_PUSH_CLICK = "hike://push/show/kairos/home";
    }

    interface DEEPLINKS {
        String KAIROS_DISMISS = "hike://kairos/dismiss";
        String KAIROS_GREETINGS = "hike://kairos/greetings";
        String KAIROS_EXPAND = "hike://kairos/expand";
        String KAIROS_POPUP = "hike://kairos/popup";
        String KAIROS_TOGGLE = "hike://kairos/toggle";
    }
}
