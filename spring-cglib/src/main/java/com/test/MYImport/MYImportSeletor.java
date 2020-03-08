package com.test.MYImport;

import com.test.dao.IndexDao3;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MYImportSeletor implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{IndexDao3.class.getName()};
	}
}
