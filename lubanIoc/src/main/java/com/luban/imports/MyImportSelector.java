package com.luban.imports;

import com.luban.dao.IndexDao4;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

import java.util.Map;
import java.util.Set;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 10:38 2020/8/11 0011
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{IndexDao4.class.getName()};
	}
}
