package com.test.com.test.App;

import com.test.MYImport.MYImportSeletor;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(MYImportSeletor.class)
public class Ctest {
}
