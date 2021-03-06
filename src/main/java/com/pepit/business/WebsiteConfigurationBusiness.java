package com.pepit.business;

import com.pepit.exception.ReferentielRequestException;
import com.pepit.model.ModelProperty;
import com.pepit.model.WebsiteConfiguration;
import com.pepit.service.ModelPropertyService;
import com.pepit.service.ModelService;
import com.pepit.service.WebsiteConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebsiteConfigurationBusiness {

    private WebsiteConfigurationService websiteConfigurationService;
    private ModelService modelService;
    private ModelPropertyService modelPropertyService;

    @Autowired
    public WebsiteConfigurationBusiness(WebsiteConfigurationService websiteConfigurationService, ModelService modelService, ModelPropertyService modelPropertyService) {
        this.websiteConfigurationService = websiteConfigurationService;
        this.modelService = modelService;
        this.modelPropertyService = modelPropertyService;
    }

    public WebsiteConfiguration saveWebsiteConfiguration(WebsiteConfiguration websiteConfiguration) throws ReferentielRequestException {
        try {
            websiteConfiguration.getModels().forEach(model -> {
                model.getModelProperties().forEach(ModelProperty::update);
                model.update();
                modelPropertyService.saveAll(model.getModelProperties());
            });
            modelService.saveAll(websiteConfiguration.getModels());
            websiteConfiguration.update();
            return websiteConfigurationService.save(websiteConfiguration);
        } catch (Exception e) {
            throw new ReferentielRequestException(e);
        }
    }
}
