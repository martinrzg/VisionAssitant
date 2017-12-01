package org.tensorflow.demo.utils;

import android.content.Context;

import java.util.Locale;

/**
 * Created by MartinRuiz on 11/30/2017.
 */

public class SpeechHelper {
    private static android.speech.tts.TextToSpeech textToSpeech ;

    public static void textToSpeech(Context context, String text){
        textToSpeech = new android.speech.tts.TextToSpeech(context, new android.speech.tts.TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                textToSpeech.setLanguage(Locale.US);
            }
        });
        textToSpeech.speak(text, android.speech.tts.TextToSpeech.QUEUE_ADD, null, null);
        System.out.println("CAN U HEAR MEEEEEEEEEEEEEEEEEEEEE " +text + "isSpeaking? "+ textToSpeech.isSpeaking());
    }
}
