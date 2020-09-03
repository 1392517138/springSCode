package com.luban.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 13:22 2020/8/29 0029
 */
@Configuration
public class DBConfig implements ImportAware {
	String name;

	@Override
	public void setImportMetadata(AnnotationMetadata annotationMetadata) {
		Set<String> appConfig = annotationMetadata.getMetaAnnotationTypes("appConfig");
	}
}
