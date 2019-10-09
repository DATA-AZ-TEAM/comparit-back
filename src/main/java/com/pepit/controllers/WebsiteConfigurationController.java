package com.pepit.controllers;

import com.pepit.business.WebsiteConfigurationBusiness;
import com.pepit.service.WebsiteConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "websiteconfig", produces = MediaType.APPLICATION_JSON_VALUE)
public class WebsiteConfigurationController {

    private WebsiteConfigurationService websiteConfigurationService;
    private WebsiteConfigurationBusiness websiteConfigurationBusiness;

    @Autowired
    public WebsiteConfigurationController(WebsiteConfigurationService websiteConfigurationService, WebsiteConfigurationBusiness websiteConfigurationBusiness) {
        this.websiteConfigurationService = websiteConfigurationService;
        this.websiteConfigurationBusiness = websiteConfigurationBusiness;
    }
}