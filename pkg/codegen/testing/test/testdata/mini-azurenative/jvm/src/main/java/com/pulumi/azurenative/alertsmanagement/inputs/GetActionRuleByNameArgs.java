// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetActionRuleByNameArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetActionRuleByNameArgs Empty = new GetActionRuleByNameArgs();

    /**
     * The name of action rule that needs to be fetched
     * 
     */
    @Import(name="actionRuleName", required=true)
      private final String actionRuleName;

    public String actionRuleName() {
        return this.actionRuleName;
    }

    /**
     * Resource group name where the resource is created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetActionRuleByNameArgs(
        String actionRuleName,
        String resourceGroupName) {
        this.actionRuleName = Objects.requireNonNull(actionRuleName, "expected parameter 'actionRuleName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetActionRuleByNameArgs() {
        this.actionRuleName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActionRuleByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionRuleName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActionRuleByNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionRuleName = defaults.actionRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder actionRuleName(String actionRuleName) {
            this.actionRuleName = Objects.requireNonNull(actionRuleName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetActionRuleByNameArgs build() {
            return new GetActionRuleByNameArgs(actionRuleName, resourceGroupName);
        }
    }
}
