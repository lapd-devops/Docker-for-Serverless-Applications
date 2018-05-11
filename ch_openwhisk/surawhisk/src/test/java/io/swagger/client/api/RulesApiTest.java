/*
 * OpenWhisk REST API
 * API for OpenWhisk
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.EntityBrief;
import io.swagger.client.model.ErrorMessage;
import io.swagger.client.model.ItemId;
import io.swagger.client.model.Rule;
import io.swagger.client.model.RulePut;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RulesApi
 */
@Ignore
public class RulesApiTest {

    private final RulesApi api = new RulesApi();

    
    /**
     * Delete a rule
     *
     * Delete a rule
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRuleTest() throws ApiException {
        String namespace = null;
        String ruleName = null;
        api.deleteRule(namespace, ruleName);

        // TODO: test validations
    }
    
    /**
     * Get all rules
     *
     * Get all rules
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllRulesTest() throws ApiException {
        String namespace = null;
        Integer limit = null;
        Integer skip = null;
        List<EntityBrief> response = api.getAllRules(namespace, limit, skip);

        // TODO: test validations
    }
    
    /**
     * Get rule information
     *
     * Get rule information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRuleByNameTest() throws ApiException {
        String namespace = null;
        String ruleName = null;
        Rule response = api.getRuleByName(namespace, ruleName);

        // TODO: test validations
    }
    
    /**
     * Enable or disable a rule
     *
     * Enable or disable a rule
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setStateTest() throws ApiException {
        String namespace = null;
        String ruleName = null;
        String state = null;
        ItemId response = api.setState(namespace, ruleName, state);

        // TODO: test validations
    }
    
    /**
     * Update a rule
     *
     * Update a rule
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRuleTest() throws ApiException {
        String namespace = null;
        String ruleName = null;
        RulePut rule = null;
        String overwrite = null;
        ItemId response = api.updateRule(namespace, ruleName, rule, overwrite);

        // TODO: test validations
    }
    
}