package com.daekyung.dagger2example01;

import javax.inject.Inject;

/**
 * Created by computer on 2017. 11. 2..
 */

public class MediaController {

    Video video;

/*    MediaController() {

        video = new MediaStore.Video();
    }

    MediaController(MediaStore.Video video) {
        this.video = video;
    }*/

    @Inject
    MediaController(Video video) {
        this.video = video;
    }

    public String getCurrentPlayTime() {
        int currentPosition = video.getCurrentPosition();
        return Integer.toString(currentPosition);
    }


}
