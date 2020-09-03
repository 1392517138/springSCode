package com.luban.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 9:50 2020/9/3 0003
 */
@Configuration
public class DBConfig implements ImportAware {
	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		importMetadata.getMetaAnnotationTypes("appconfig");
	}
}
