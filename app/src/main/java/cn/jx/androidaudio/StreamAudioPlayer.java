package cn.jx.androidaudio;

import android.media.AudioTrack;

/**
 * @author jasonxiao{github.com/JasonXiao001}
 */

public class StreamAudioPlayer {

    private final static String TAG = StreamAudioPlayer.class.getSimpleName();
    public static final int DEFAULT_SAMPLE_RATE = 44100;

    private AudioTrack mAudioTrack;

    private StreamAudioPlayer() {
        // singleton
    }

    private static final class StreamAudioPlayerHolder {
        private static final StreamAudioPlayer INSTANCE = new StreamAudioPlayer();
    }

    public static StreamAudioPlayer getInstance() {

    }


}
