// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPython2PackageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPython2PackageArgs Empty = new GetPython2PackageArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private String automationAccountName;

    /**
     * @return The name of the automation account.
     * 
     */
    public String automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The python package name.
     * 
     */
    @Import(name="packageName", required=true)
    private String packageName;

    /**
     * @return The python package name.
     * 
     */
    public String packageName() {
        return this.packageName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPython2PackageArgs() {}

    private GetPython2PackageArgs(GetPython2PackageArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.packageName = $.packageName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPython2PackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPython2PackageArgs $;

        public Builder() {
            $ = new GetPython2PackageArgs();
        }

        public Builder(GetPython2PackageArgs defaults) {
            $ = new GetPython2PackageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param packageName The python package name.
         * 
         * @return builder
         * 
         */
        public Builder packageName(String packageName) {
            $.packageName = packageName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPython2PackageArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.packageName = Objects.requireNonNull($.packageName, "expected parameter 'packageName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
