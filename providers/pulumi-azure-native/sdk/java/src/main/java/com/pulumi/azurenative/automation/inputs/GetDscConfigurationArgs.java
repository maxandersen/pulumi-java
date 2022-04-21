// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDscConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDscConfigurationArgs Empty = new GetDscConfigurationArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private String automationAccountName;

    public String automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The configuration name.
     * 
     */
    @Import(name="configurationName", required=true)
    private String configurationName;

    public String configurationName() {
        return this.configurationName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDscConfigurationArgs() {}

    private GetDscConfigurationArgs(GetDscConfigurationArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.configurationName = $.configurationName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDscConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDscConfigurationArgs $;

        public Builder() {
            $ = new GetDscConfigurationArgs();
        }

        public Builder(GetDscConfigurationArgs defaults) {
            $ = new GetDscConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder automationAccountName(String automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        public Builder configurationName(String configurationName) {
            $.configurationName = configurationName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDscConfigurationArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.configurationName = Objects.requireNonNull($.configurationName, "expected parameter 'configurationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
