package main;

import com.opencsv.bean.CsvToBeanBuilder;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class OpenCsvError {
    @Test
    public void error() throws FileNotFoundException {

        String file = "src/main/resources/test.csv";

        List<CsvBean> beans = new CsvToBeanBuilder(new FileReader(file))
                .withType(CsvBean.class)
                .build()
                .parse();

        assertEquals(2, beans.size());
        assertNotNull(beans.get(0).name);
        assertNotNull(beans.get(1).name);
    }
}
