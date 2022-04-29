// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.elastic.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetMonitorArgs extends InvokeArgs {

    public static final GetMonitorArgs Empty = new GetMonitorArgs();

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
    private String monitorName;

    /**
     * @return Monitor resource name
     * 
     */
    public String monitorName() {
        return this.monitorName;
    }

    /**
     * The name of the resource group to which the Elastic resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group to which the Elastic resource belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetMonitorArgs() {}

    private GetMonitorArgs(GetMonitorArgs $) {
        this.monitorName = $.monitorName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMonitorArgs $;

        public Builder() {
            $ = new GetMonitorArgs();
        }

        public Builder(GetMonitorArgs defaults) {
            $ = new GetMonitorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param monitorName Monitor resource name
         * 
         * @return builder
         * 
         */
        public Builder monitorName(String monitorName) {
            $.monitorName = monitorName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetMonitorArgs build() {
            $.monitorName = Objects.requireNonNull($.monitorName, "expected parameter 'monitorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
