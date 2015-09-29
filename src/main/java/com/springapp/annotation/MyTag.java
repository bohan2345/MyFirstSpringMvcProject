package com.springapp.annotation;

import java.lang.annotation.Documented;

/**
 * <br>
 * Created by Bohan Zheng on 9/29/2015.
 *
 * @author Bohan Zheng
 */
@Documented
public @interface MyTag {
    String author();

    String date();
}
