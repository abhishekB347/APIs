package APIs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class objectSetsGetter {
    public static void main(String[] args) {
        try {
          
            String requestJson = "{\"dhfdc\":\"in\",\"dhsc\":\"in\",\"dhdc\":\"in\",\"requestId\":\"1234567\",\"platform\":\"ANDROID\",\"apiId\":\"FOR_YOU_MULTI_MODAL\",\"entityFeedEntityId\":\"ENTITY_FEED\",\"appLanguage\":\"en\",\"clientTZ\":\"GMT+05:30\",\"clientTS\":1713940842909,\"count\":10,\"recentArticlesV2\":{\"news\":[],\"buzz\":null},\"versionedHistory\":{},\"depth\":0,\"location\":{\"cityId\":\"c34_860\",\"stateId\":\"s34\",\"country\":\"INDIA\",\"source\":\"IP\"},\"featureMask\":129023,\"dislikesV2\":[],\"refreshMode\":\"PULL_DOWN\",\"edition\":\"india\",\"activationDate\":1702319400000,\"deviceHeight\":2173,\"marketingEngineEnabled\":true,\"userFeedType\":\"LR\",\"contentTypeMask\":15,\"apiContentTypeMask\":4294967295,\"connectionInfo\":{\"tp\":\"WIFI\",\"ql\":\"VERYFAST\"},\"follows\":[],\"tickerPosition\":0,\"autoplayEnabledFromBE\":false,\"autoplayPlayerTypes\":[{\"fileType\":\"M3U8\",\"allSourcesSupported\":true},{\"fileType\":\"MP4\",\"allSourcesSupported\":true},{\"fileType\":\"YOUTUBE\",\"allSourcesSupported\":true}],\"currentNewsListSize\":0,\"currentVideoSessionInfo\":{\"numServed\":0,\"numReady\":0,\"numPlayed\":0,\"recentPlayed\":[]},\"deviceModel\":\"Xiaomi\",\"contentVersion\":0,\"inboxName\":\"INBOX-HASHTAG-91581308b67fdfbcd24028a0c513bc37-news\",\"currentTab\":{\"entityType\":\"HASHTAG\",\"entityId\":\"91581308b67fdfbcd24028a0c513bc37\",\"sectionId\":\"HOME\",\"feedConfigKey\":\"FOR_YOU\",\"nerId\":\"\",\"deducedLocations\":[\"s34\"]},\"supportedSubFormats\":[\"WS_AMP_BASIC\",\"WS_AMP_AND_VIDEO\",\"HTML\",\"S_W_PHOTOGALLERY\",\"TVVIDEO\",\"VHTEXT\",\"TOPIC_BANNER\",\"SOURCE\",\"XPR_VIDEO\",\"LOCATION\",\"HASHTAG\",\"S_W_ATTACHED_IMAGES\",\"S_W_IMAGES\",\"S_W_VIDEO\",\"USER\",\"WS_AMP_W_POLL\",\"RICH_PHOTOGALLERY\",\"VHMEMETEXT\",\"PENDING_APPROVAL\",\"VHGIF\",\"VHMEME\",\"GROUP\",\"IMAGE\",\"VIDEO\",\"ASTRO\",\"SINGLE_SELECT\",\"TVGIF\",\"STORY\",\"AUTOPLAY\",\"WS_AMP_W_VIDEO\"],\"requestSessionContext\":{\"pullInfo\":[],\"pullId\":1713940843401,\"currentPageId\":0},\"requestOriginContext\":{\"itemId\":null},\"contentFilterRule\":{\"rules\":{\"INCLUDE\":[{\"fileType\":\"YOUTUBE\",\"allSourcesSupported\":true},{\"fileType\":\"M3U8\",\"allSourcesSupported\":true},{\"fileType\":\"MP4\",\"allSourcesSupported\":true}]},\"httpsEnabled\":false,\"includeApiVersions\":[\"v1\",\"v2\",\"v3\"],\"suppressLiveItem\":false},\"recentTabs\":{},\"supportedFeatures\":[\"RICH_REFERRALS\",\"PLAYER_MANAGER\",\"RECENT_PAYLOAD\",\"VIDEO\",\"ICC_CAROUSEL\",\"COMMUNITY_GROUP\",\"UGC_POST_IN_CAROUSEL\",\"MORE_COVERAGE\",\"FOLLOW_FEEDBACK_CARD\",\"TOP_STORIES\",\"ASTRO_CARD\",\"ICC_POST_IN_CAROUSEL\",\"COLLECTION_LIST\",\"COLLECTION_CARD\",\"BANNER_APPROVAL_CARD\",\"ICC_POST\",\"FOR_YOU\",\"POLL\",\"ENTITY_CAROUSEL\",\"THREAD_DETAILS\",\"CLIENT_DEDUP\",\"LOCAL_ZONE_VIDEOS\",\"CHRONO_LAYOUT\",\"ADJUNCT_LANGUAGE\",\"GROUP_CAROUSEL\",\"TOPIC_CARD\",\"MORE_ITEMS_VIDEO\",\"HERO_CARD\",\"DISCOVERY_CAROUSEL\",\"ME_CARD_SUPPORT\",\"VIRAL\",\"UGC_CAROUSEL\",\"CAROUSEL_V1\",\"LOCATION_CARD\",\"VIDEOS_IN_RELATED_NEWS\",\"UGC_REPOST\",\"POST_COLLECTION_CAROUSEL\",\"LIVE_TV\",\"UGC_POST\",\"ALL_HERO_CARDS\"],\"appClusterType\":\"NATIVE\",\"disableSimilarityCheck\":false,\"disableSimilarityTitleCheck\":false,\"lastLocationChangeTime\":0,\"selectedLocation\":\"\",\"appVersion\":\"25.3.12.2\",\"latestInstallVersion\":\"25.3.12.2\",\"regDone\":true,\"ccid\":\"dh.NER4WWVLU0RZSnd0R3RTRG9AZQTRCQT09A\",\"esEnabled\":false,\"fallbackLanguageSelected\":false,\"langInfo\":{\"userSelectedLang\":\"en\",\"sysSelectedLang\":\"\",\"blackListedLang\":\"\",\"xprLang\":null},\"lastUpgradeDate\":0,\"lastInstalledDate\":1713940836968,\"cardsDiscarded\":[],\"cardsViewed\":[],\"log\":false,\"enableRejectionLog\":false,\"mabDebug\":false,\"userAgent\":\"Dalvik/2.1.0 (Linux; U; Android 12; M2102J20SI Build/SKQ1.211006.001)\",\"osVersion\":\"12\",\"responseTimeCollector\":{\"userPreferenceService\":0,\"groupMetadataService\":0,\"candidateGenerationService\":0,\"userPreferenceServiceRTT\":0,\"groupMetadataServiceRTT\":0,\"candidateGenerationServiceRTT\":0},\"cid\":\"4720000\",\"uId\":\"dh2bc006c387014be8bb4aa73c562529eb\",\"appId\":\"DH_APP\",\"country\":\"INDIA\",\"userHasFollowedNPs\":false,\"userHasBlockedNPs\":false,\"userHasAnyFollows\":true,\"langs\":\"en\",\"isAstroSubscribed\":false}";
            String apiUrl = "http://192.168.3.63:8080/user/inbox/feed";

            // Send POST request
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            OutputStream os = conn.getOutputStream();
            os.write(requestJson.getBytes());
            os.flush();
            os.close();

            int responseCode = conn.getResponseCode();
            System.out.println("POST Response Code: " + responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK) { // success
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Extract collectionName and sourceName from response
                List<String> collectionNames = new ArrayList<>();
                List<String> sourceNames = new ArrayList<>();
                // Assuming response is in JSON format
                // You need to parse the response
                // You need to parse the response JSON here
                // For now, let's assume you have parsed the JSON and extracted the required fields
                String responseJson = response.toString();
                
              
                String collectionName = "SampleCollectionName";
                String sourceName = "SampleSourceName";

                // Adding to the lists (might need to loop through the response to get multiple values)
                collectionNames.add(collectionName);
                sourceNames.add(sourceName);

                // Print the extracted values
                System.out.println("Collection Names: " + collectionNames);
                System.out.println("Source Names: " + sourceNames);
            } else {
                System.out.println("POST request failed with response code: " + responseCode);
            }
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



