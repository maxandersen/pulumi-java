// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetZoneArgs extends InvokeArgs {

    public static final GetZoneArgs Empty = new GetZoneArgs();

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
     * The name of the DNS zone (without a terminating dot).
     * 
     */
    @Import(name="zoneName", required=true)
    private String zoneName;

    /**
     * @return The name of the DNS zone (without a terminating dot).
     * 
     */
    public String zoneName() {
        return this.zoneName;
    }

    private GetZoneArgs() {}

    private GetZoneArgs(GetZoneArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.zoneName = $.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZoneArgs $;

        public Builder() {
            $ = new GetZoneArgs();
        }

        public Builder(GetZoneArgs defaults) {
            $ = new GetZoneArgs(Objects.requireNonNull(defaults));
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
         * @param zoneName The name of the DNS zone (without a terminating dot).
         * 
         * @return builder
         * 
         */
        public Builder zoneName(String zoneName) {
            $.zoneName = zoneName;
            return this;
        }

        public GetZoneArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.zoneName = Objects.requireNonNull($.zoneName, "expected parameter 'zoneName' to be non-null");
            return $;
        }
    }

}
