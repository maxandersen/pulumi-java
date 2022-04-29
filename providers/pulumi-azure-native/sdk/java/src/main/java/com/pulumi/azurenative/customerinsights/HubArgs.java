// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights;

import com.pulumi.azurenative.customerinsights.inputs.HubBillingInfoFormatArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HubArgs extends ResourceArgs {

    public static final HubArgs Empty = new HubArgs();

    /**
     * Billing settings of the hub.
     * 
     */
    @Import(name="hubBillingInfo")
    private @Nullable Output<HubBillingInfoFormatArgs> hubBillingInfo;

    /**
     * @return Billing settings of the hub.
     * 
     */
    public Optional<Output<HubBillingInfoFormatArgs>> hubBillingInfo() {
        return Optional.ofNullable(this.hubBillingInfo);
    }

    /**
     * The name of the Hub.
     * 
     */
    @Import(name="hubName")
    private @Nullable Output<String> hubName;

    /**
     * @return The name of the Hub.
     * 
     */
    public Optional<Output<String>> hubName() {
        return Optional.ofNullable(this.hubName);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The bit flags for enabled hub features. Bit 0 is set to 1 indicates graph is enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or enabled if set to 0.
     * 
     */
    @Import(name="tenantFeatures")
    private @Nullable Output<Integer> tenantFeatures;

    /**
     * @return The bit flags for enabled hub features. Bit 0 is set to 1 indicates graph is enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or enabled if set to 0.
     * 
     */
    public Optional<Output<Integer>> tenantFeatures() {
        return Optional.ofNullable(this.tenantFeatures);
    }

    private HubArgs() {}

    private HubArgs(HubArgs $) {
        this.hubBillingInfo = $.hubBillingInfo;
        this.hubName = $.hubName;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.tenantFeatures = $.tenantFeatures;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HubArgs $;

        public Builder() {
            $ = new HubArgs();
        }

        public Builder(HubArgs defaults) {
            $ = new HubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hubBillingInfo Billing settings of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubBillingInfo(@Nullable Output<HubBillingInfoFormatArgs> hubBillingInfo) {
            $.hubBillingInfo = hubBillingInfo;
            return this;
        }

        /**
         * @param hubBillingInfo Billing settings of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubBillingInfo(HubBillingInfoFormatArgs hubBillingInfo) {
            return hubBillingInfo(Output.of(hubBillingInfo));
        }

        /**
         * @param hubName The name of the Hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(@Nullable Output<String> hubName) {
            $.hubName = hubName;
            return this;
        }

        /**
         * @param hubName The name of the Hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(String hubName) {
            return hubName(Output.of(hubName));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tenantFeatures The bit flags for enabled hub features. Bit 0 is set to 1 indicates graph is enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or enabled if set to 0.
         * 
         * @return builder
         * 
         */
        public Builder tenantFeatures(@Nullable Output<Integer> tenantFeatures) {
            $.tenantFeatures = tenantFeatures;
            return this;
        }

        /**
         * @param tenantFeatures The bit flags for enabled hub features. Bit 0 is set to 1 indicates graph is enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or enabled if set to 0.
         * 
         * @return builder
         * 
         */
        public Builder tenantFeatures(Integer tenantFeatures) {
            return tenantFeatures(Output.of(tenantFeatures));
        }

        public HubArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
