// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hanaonazure.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetProviderInstanceArgs extends InvokeArgs {

    public static final GetProviderInstanceArgs Empty = new GetProviderInstanceArgs();

    /**
     * Name of the provider instance.
     * 
     */
    @Import(name="providerInstanceName", required=true)
    private String providerInstanceName;

    /**
     * @return Name of the provider instance.
     * 
     */
    public String providerInstanceName() {
        return this.providerInstanceName;
    }

    /**
     * Name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the SAP monitor resource.
     * 
     */
    @Import(name="sapMonitorName", required=true)
    private String sapMonitorName;

    /**
     * @return Name of the SAP monitor resource.
     * 
     */
    public String sapMonitorName() {
        return this.sapMonitorName;
    }

    private GetProviderInstanceArgs() {}

    private GetProviderInstanceArgs(GetProviderInstanceArgs $) {
        this.providerInstanceName = $.providerInstanceName;
        this.resourceGroupName = $.resourceGroupName;
        this.sapMonitorName = $.sapMonitorName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProviderInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProviderInstanceArgs $;

        public Builder() {
            $ = new GetProviderInstanceArgs();
        }

        public Builder(GetProviderInstanceArgs defaults) {
            $ = new GetProviderInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param providerInstanceName Name of the provider instance.
         * 
         * @return builder
         * 
         */
        public Builder providerInstanceName(String providerInstanceName) {
            $.providerInstanceName = providerInstanceName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param sapMonitorName Name of the SAP monitor resource.
         * 
         * @return builder
         * 
         */
        public Builder sapMonitorName(String sapMonitorName) {
            $.sapMonitorName = sapMonitorName;
            return this;
        }

        public GetProviderInstanceArgs build() {
            $.providerInstanceName = Objects.requireNonNull($.providerInstanceName, "expected parameter 'providerInstanceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sapMonitorName = Objects.requireNonNull($.sapMonitorName, "expected parameter 'sapMonitorName' to be non-null");
            return $;
        }
    }

}
