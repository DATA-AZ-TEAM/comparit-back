package com.pepit.service;

import com.pepit.CompareITBackApplicationTests;
import com.pepit.repository.CompanyRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

public class CompanyServiceTest extends CompareITBackApplicationTests {

    @Autowired
    private CompanyService companyService;

    @MockBean
    private CompanyRepository companyRepository;

    @Before
    public void initTests() {
        initDatas();
        initMocks();
    }

    private void initDatas() {

    }

    private void initMocks() {

    }

    @Test
    public void testSample() {
        assertTrue(true);
    }

    /**
     *     String fromUrlToDb(String url, String supplierId, String type);
     *
     *     String fromCsvToDb(MultipartFile file, String supplierId, String type) throws IOException;
     */
}
