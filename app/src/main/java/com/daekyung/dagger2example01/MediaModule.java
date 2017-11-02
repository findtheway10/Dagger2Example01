package com.daekyung.dagger2example01;

import dagger.Module;
import dagger.Provides;

/**
 * Created by computer on 2017. 11. 2..
 */

@Module
public class MediaModule {

    @Provides
    public Video provideVideo() {
        return new Video();
    }

}
