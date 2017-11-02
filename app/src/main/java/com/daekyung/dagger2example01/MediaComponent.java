package com.daekyung.dagger2example01;

import dagger.Component;

/**
 * Created by computer on 2017. 11. 2..
 */

@Component(modules = MediaModule.class)
public interface MediaComponent {

    MediaController mediaController();
}
