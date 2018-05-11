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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EntityBrief;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-24T21:18:05.110+07:00")
public class InlineResponse200 {
  @SerializedName("actions")
  private List<EntityBrief> actions = new ArrayList<EntityBrief>();

  @SerializedName("triggers")
  private List<EntityBrief> triggers = new ArrayList<EntityBrief>();

  @SerializedName("rules")
  private List<EntityBrief> rules = new ArrayList<EntityBrief>();

  @SerializedName("packages")
  private List<EntityBrief> packages = new ArrayList<EntityBrief>();

  public InlineResponse200 actions(List<EntityBrief> actions) {
    this.actions = actions;
    return this;
  }

  public InlineResponse200 addActionsItem(EntityBrief actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<EntityBrief> getActions() {
    return actions;
  }

  public void setActions(List<EntityBrief> actions) {
    this.actions = actions;
  }

  public InlineResponse200 triggers(List<EntityBrief> triggers) {
    this.triggers = triggers;
    return this;
  }

  public InlineResponse200 addTriggersItem(EntityBrief triggersItem) {
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * Get triggers
   * @return triggers
  **/
  @ApiModelProperty(required = true, value = "")
  public List<EntityBrief> getTriggers() {
    return triggers;
  }

  public void setTriggers(List<EntityBrief> triggers) {
    this.triggers = triggers;
  }

  public InlineResponse200 rules(List<EntityBrief> rules) {
    this.rules = rules;
    return this;
  }

  public InlineResponse200 addRulesItem(EntityBrief rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(required = true, value = "")
  public List<EntityBrief> getRules() {
    return rules;
  }

  public void setRules(List<EntityBrief> rules) {
    this.rules = rules;
  }

  public InlineResponse200 packages(List<EntityBrief> packages) {
    this.packages = packages;
    return this;
  }

  public InlineResponse200 addPackagesItem(EntityBrief packagesItem) {
    this.packages.add(packagesItem);
    return this;
  }

   /**
   * Get packages
   * @return packages
  **/
  @ApiModelProperty(required = true, value = "")
  public List<EntityBrief> getPackages() {
    return packages;
  }

  public void setPackages(List<EntityBrief> packages) {
    this.packages = packages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.actions, inlineResponse200.actions) &&
        Objects.equals(this.triggers, inlineResponse200.triggers) &&
        Objects.equals(this.rules, inlineResponse200.rules) &&
        Objects.equals(this.packages, inlineResponse200.packages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, triggers, rules, packages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

