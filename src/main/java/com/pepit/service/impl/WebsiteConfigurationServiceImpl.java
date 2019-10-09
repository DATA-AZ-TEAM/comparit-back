package com.pepit.service.impl;

import com.pepit.repository.WebsiteConfigurationRepository;
import com.pepit.service.WebsiteConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebsiteConfigurationServiceImpl implements WebsiteConfigurationService {

    private WebsiteConfigurationRepository websiteConfigurationRepository;

    @Autowired
    public WebsiteConfigurationServiceImpl(WebsiteConfigurationRepository websiteConfigurationRepository) {
        this.websiteConfigurationRepository = websiteConfigurationRepository;
    }
}