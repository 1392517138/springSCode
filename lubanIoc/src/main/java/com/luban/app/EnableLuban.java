package com.luban.app;

import com.luban.imports.MyImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 18:07 2020/8/21 0021
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportSelector.class)
public @interface EnableLuban {
	boolean value();
}
