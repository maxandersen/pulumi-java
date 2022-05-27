// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryGeoreplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryGeoreplicationArgs Empty = new RegistryGeoreplicationArgs();

    /**
     * A location where the container registry should be geo-replicated.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return A location where the container registry should be geo-replicated.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * Whether regional endpoint is enabled for this Container Registry? Defaults to `false`.
     * 
     */
    @Import(name="regionalEndpointEnabled")
    private @Nullable Output<Boolean> regionalEndpointEnabled;

    /**
     * @return Whether regional endpoint is enabled for this Container Registry? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> regionalEndpointEnabled() {
        return Optional.ofNullable(this.regionalEndpointEnabled);
    }

    /**
     * A mapping of tags to assign to this replication location.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to this replication location.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Whether zone redundancy is enabled for this replication location? Defaults to `false`.
     * 
     */
    @Import(name="zoneRedundancyEnabled")
    private @Nullable Output<Boolean> zoneRedundancyEnabled;

    /**
     * @return Whether zone redundancy is enabled for this replication location? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> zoneRedundancyEnabled() {
        return Optional.ofNullable(this.zoneRedundancyEnabled);
    }

    private RegistryGeoreplicationArgs() {}

    private RegistryGeoreplicationArgs(RegistryGeoreplicationArgs $) {
        this.location = $.location;
        this.regionalEndpointEnabled = $.regionalEndpointEnabled;
        this.tags = $.tags;
        this.zoneRedundancyEnabled = $.zoneRedundancyEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryGeoreplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryGeoreplicationArgs $;

        public Builder() {
            $ = new RegistryGeoreplicationArgs();
        }

        public Builder(RegistryGeoreplicationArgs defaults) {
            $ = new RegistryGeoreplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location A location where the container registry should be geo-replicated.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location A location where the container registry should be geo-replicated.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param regionalEndpointEnabled Whether regional endpoint is enabled for this Container Registry? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder regionalEndpointEnabled(@Nullable Output<Boolean> regionalEndpointEnabled) {
            $.regionalEndpointEnabled = regionalEndpointEnabled;
            return this;
        }

        /**
         * @param regionalEndpointEnabled Whether regional endpoint is enabled for this Container Registry? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder regionalEndpointEnabled(Boolean regionalEndpointEnabled) {
            return regionalEndpointEnabled(Output.of(regionalEndpointEnabled));
        }

        /**
         * @param tags A mapping of tags to assign to this replication location.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to this replication location.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param zoneRedundancyEnabled Whether zone redundancy is enabled for this replication location? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder zoneRedundancyEnabled(@Nullable Output<Boolean> zoneRedundancyEnabled) {
            $.zoneRedundancyEnabled = zoneRedundancyEnabled;
            return this;
        }

        /**
         * @param zoneRedundancyEnabled Whether zone redundancy is enabled for this replication location? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder zoneRedundancyEnabled(Boolean zoneRedundancyEnabled) {
            return zoneRedundancyEnabled(Output.of(zoneRedundancyEnabled));
        }

        public RegistryGeoreplicationArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
