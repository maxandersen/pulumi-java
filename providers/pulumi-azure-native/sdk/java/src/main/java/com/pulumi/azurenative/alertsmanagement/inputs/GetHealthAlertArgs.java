// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetHealthAlertArgs extends InvokeArgs {

    public static final GetHealthAlertArgs Empty = new GetHealthAlertArgs();

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the rule.
     * 
     */
    @Import(name="ruleName", required=true)
    private String ruleName;

    /**
     * @return The name of the rule.
     * 
     */
    public String ruleName() {
        return this.ruleName;
    }

    private GetHealthAlertArgs() {}

    private GetHealthAlertArgs(GetHealthAlertArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.ruleName = $.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHealthAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHealthAlertArgs $;

        public Builder() {
            $ = new GetHealthAlertArgs();
        }

        public Builder(GetHealthAlertArgs defaults) {
            $ = new GetHealthAlertArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param ruleName The name of the rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        public GetHealthAlertArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.ruleName = Objects.requireNonNull($.ruleName, "expected parameter 'ruleName' to be non-null");
            return $;
        }
    }

}
