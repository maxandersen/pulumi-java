// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTagRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagRuleArgs Empty = new GetTagRuleArgs();

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
    private String monitorName;

    public String monitorName() {
        return this.monitorName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="ruleSetName", required=true)
    private String ruleSetName;

    public String ruleSetName() {
        return this.ruleSetName;
    }

    private GetTagRuleArgs() {}

    private GetTagRuleArgs(GetTagRuleArgs $) {
        this.monitorName = $.monitorName;
        this.resourceGroupName = $.resourceGroupName;
        this.ruleSetName = $.ruleSetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagRuleArgs $;

        public Builder() {
            $ = new GetTagRuleArgs();
        }

        public Builder(GetTagRuleArgs defaults) {
            $ = new GetTagRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder monitorName(String monitorName) {
            $.monitorName = monitorName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder ruleSetName(String ruleSetName) {
            $.ruleSetName = ruleSetName;
            return this;
        }

        public GetTagRuleArgs build() {
            $.monitorName = Objects.requireNonNull($.monitorName, "expected parameter 'monitorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.ruleSetName = Objects.requireNonNull($.ruleSetName, "expected parameter 'ruleSetName' to be non-null");
            return $;
        }
    }

}
