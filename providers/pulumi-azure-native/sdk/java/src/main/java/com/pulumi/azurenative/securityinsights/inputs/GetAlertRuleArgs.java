// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAlertRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertRuleArgs Empty = new GetAlertRuleArgs();

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Alert rule ID
     * 
     */
    @Import(name="ruleId", required=true)
      private final String ruleId;

    public String ruleId() {
        return this.ruleId;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    public GetAlertRuleArgs(
        String resourceGroupName,
        String ruleId,
        String workspaceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleId = Objects.requireNonNull(ruleId, "expected parameter 'ruleId' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetAlertRuleArgs() {
        this.resourceGroupName = null;
        this.ruleId = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String ruleId;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlertRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleId = defaults.ruleId;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder ruleId(String ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }        public GetAlertRuleArgs build() {
            return new GetAlertRuleArgs(resourceGroupName, ruleId, workspaceName);
        }
    }
}
