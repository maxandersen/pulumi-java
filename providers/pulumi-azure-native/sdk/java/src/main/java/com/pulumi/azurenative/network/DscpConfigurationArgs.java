// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.enums.ProtocolType;
import com.pulumi.azurenative.network.inputs.QosIpRangeArgs;
import com.pulumi.azurenative.network.inputs.QosPortRangeArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DscpConfigurationArgs extends ResourceArgs {

    public static final DscpConfigurationArgs Empty = new DscpConfigurationArgs();

    /**
     * Destination IP ranges.
     * 
     */
    @Import(name="destinationIpRanges")
    private @Nullable Output<List<QosIpRangeArgs>> destinationIpRanges;

    /**
     * @return Destination IP ranges.
     * 
     */
    public Optional<Output<List<QosIpRangeArgs>>> destinationIpRanges() {
        return Optional.ofNullable(this.destinationIpRanges);
    }

    /**
     * Destination port ranges.
     * 
     */
    @Import(name="destinationPortRanges")
    private @Nullable Output<List<QosPortRangeArgs>> destinationPortRanges;

    /**
     * @return Destination port ranges.
     * 
     */
    public Optional<Output<List<QosPortRangeArgs>>> destinationPortRanges() {
        return Optional.ofNullable(this.destinationPortRanges);
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="dscpConfigurationName")
    private @Nullable Output<String> dscpConfigurationName;

    /**
     * @return The name of the resource.
     * 
     */
    public Optional<Output<String>> dscpConfigurationName() {
        return Optional.ofNullable(this.dscpConfigurationName);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
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
     * List of markings to be used in the configuration.
     * 
     */
    @Import(name="markings")
    private @Nullable Output<List<Integer>> markings;

    /**
     * @return List of markings to be used in the configuration.
     * 
     */
    public Optional<Output<List<Integer>>> markings() {
        return Optional.ofNullable(this.markings);
    }

    /**
     * RNM supported protocol types.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<Either<String,ProtocolType>> protocol;

    /**
     * @return RNM supported protocol types.
     * 
     */
    public Optional<Output<Either<String,ProtocolType>>> protocol() {
        return Optional.ofNullable(this.protocol);
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
     * Source IP ranges.
     * 
     */
    @Import(name="sourceIpRanges")
    private @Nullable Output<List<QosIpRangeArgs>> sourceIpRanges;

    /**
     * @return Source IP ranges.
     * 
     */
    public Optional<Output<List<QosIpRangeArgs>>> sourceIpRanges() {
        return Optional.ofNullable(this.sourceIpRanges);
    }

    /**
     * Sources port ranges.
     * 
     */
    @Import(name="sourcePortRanges")
    private @Nullable Output<List<QosPortRangeArgs>> sourcePortRanges;

    /**
     * @return Sources port ranges.
     * 
     */
    public Optional<Output<List<QosPortRangeArgs>>> sourcePortRanges() {
        return Optional.ofNullable(this.sourcePortRanges);
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

    private DscpConfigurationArgs() {}

    private DscpConfigurationArgs(DscpConfigurationArgs $) {
        this.destinationIpRanges = $.destinationIpRanges;
        this.destinationPortRanges = $.destinationPortRanges;
        this.dscpConfigurationName = $.dscpConfigurationName;
        this.id = $.id;
        this.location = $.location;
        this.markings = $.markings;
        this.protocol = $.protocol;
        this.resourceGroupName = $.resourceGroupName;
        this.sourceIpRanges = $.sourceIpRanges;
        this.sourcePortRanges = $.sourcePortRanges;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DscpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DscpConfigurationArgs $;

        public Builder() {
            $ = new DscpConfigurationArgs();
        }

        public Builder(DscpConfigurationArgs defaults) {
            $ = new DscpConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationIpRanges Destination IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder destinationIpRanges(@Nullable Output<List<QosIpRangeArgs>> destinationIpRanges) {
            $.destinationIpRanges = destinationIpRanges;
            return this;
        }

        /**
         * @param destinationIpRanges Destination IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder destinationIpRanges(List<QosIpRangeArgs> destinationIpRanges) {
            return destinationIpRanges(Output.of(destinationIpRanges));
        }

        /**
         * @param destinationIpRanges Destination IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder destinationIpRanges(QosIpRangeArgs... destinationIpRanges) {
            return destinationIpRanges(List.of(destinationIpRanges));
        }

        /**
         * @param destinationPortRanges Destination port ranges.
         * 
         * @return builder
         * 
         */
        public Builder destinationPortRanges(@Nullable Output<List<QosPortRangeArgs>> destinationPortRanges) {
            $.destinationPortRanges = destinationPortRanges;
            return this;
        }

        /**
         * @param destinationPortRanges Destination port ranges.
         * 
         * @return builder
         * 
         */
        public Builder destinationPortRanges(List<QosPortRangeArgs> destinationPortRanges) {
            return destinationPortRanges(Output.of(destinationPortRanges));
        }

        /**
         * @param destinationPortRanges Destination port ranges.
         * 
         * @return builder
         * 
         */
        public Builder destinationPortRanges(QosPortRangeArgs... destinationPortRanges) {
            return destinationPortRanges(List.of(destinationPortRanges));
        }

        /**
         * @param dscpConfigurationName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder dscpConfigurationName(@Nullable Output<String> dscpConfigurationName) {
            $.dscpConfigurationName = dscpConfigurationName;
            return this;
        }

        /**
         * @param dscpConfigurationName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder dscpConfigurationName(String dscpConfigurationName) {
            return dscpConfigurationName(Output.of(dscpConfigurationName));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
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
         * @param markings List of markings to be used in the configuration.
         * 
         * @return builder
         * 
         */
        public Builder markings(@Nullable Output<List<Integer>> markings) {
            $.markings = markings;
            return this;
        }

        /**
         * @param markings List of markings to be used in the configuration.
         * 
         * @return builder
         * 
         */
        public Builder markings(List<Integer> markings) {
            return markings(Output.of(markings));
        }

        /**
         * @param markings List of markings to be used in the configuration.
         * 
         * @return builder
         * 
         */
        public Builder markings(Integer... markings) {
            return markings(List.of(markings));
        }

        /**
         * @param protocol RNM supported protocol types.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<Either<String,ProtocolType>> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol RNM supported protocol types.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Either<String,ProtocolType> protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param protocol RNM supported protocol types.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Either.ofLeft(protocol));
        }

        /**
         * @param protocol RNM supported protocol types.
         * 
         * @return builder
         * 
         */
        public Builder protocol(ProtocolType protocol) {
            return protocol(Either.ofRight(protocol));
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
         * @param sourceIpRanges Source IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpRanges(@Nullable Output<List<QosIpRangeArgs>> sourceIpRanges) {
            $.sourceIpRanges = sourceIpRanges;
            return this;
        }

        /**
         * @param sourceIpRanges Source IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpRanges(List<QosIpRangeArgs> sourceIpRanges) {
            return sourceIpRanges(Output.of(sourceIpRanges));
        }

        /**
         * @param sourceIpRanges Source IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpRanges(QosIpRangeArgs... sourceIpRanges) {
            return sourceIpRanges(List.of(sourceIpRanges));
        }

        /**
         * @param sourcePortRanges Sources port ranges.
         * 
         * @return builder
         * 
         */
        public Builder sourcePortRanges(@Nullable Output<List<QosPortRangeArgs>> sourcePortRanges) {
            $.sourcePortRanges = sourcePortRanges;
            return this;
        }

        /**
         * @param sourcePortRanges Sources port ranges.
         * 
         * @return builder
         * 
         */
        public Builder sourcePortRanges(List<QosPortRangeArgs> sourcePortRanges) {
            return sourcePortRanges(Output.of(sourcePortRanges));
        }

        /**
         * @param sourcePortRanges Sources port ranges.
         * 
         * @return builder
         * 
         */
        public Builder sourcePortRanges(QosPortRangeArgs... sourcePortRanges) {
            return sourcePortRanges(List.of(sourcePortRanges));
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

        public DscpConfigurationArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
