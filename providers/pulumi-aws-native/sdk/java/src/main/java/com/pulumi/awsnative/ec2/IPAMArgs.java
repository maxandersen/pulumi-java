// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.ec2.inputs.IPAMIpamOperatingRegionArgs;
import com.pulumi.awsnative.ec2.inputs.IPAMTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IPAMArgs extends com.pulumi.resources.ResourceArgs {

    public static final IPAMArgs Empty = new IPAMArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The regions IPAM is enabled for. Allows pools to be created in these regions, as well as enabling monitoring
     * 
     */
    @Import(name="operatingRegions")
    private @Nullable Output<List<IPAMIpamOperatingRegionArgs>> operatingRegions;

    /**
     * @return The regions IPAM is enabled for. Allows pools to be created in these regions, as well as enabling monitoring
     * 
     */
    public Optional<Output<List<IPAMIpamOperatingRegionArgs>>> operatingRegions() {
        return Optional.ofNullable(this.operatingRegions);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<IPAMTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<IPAMTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private IPAMArgs() {}

    private IPAMArgs(IPAMArgs $) {
        this.description = $.description;
        this.operatingRegions = $.operatingRegions;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPAMArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPAMArgs $;

        public Builder() {
            $ = new IPAMArgs();
        }

        public Builder(IPAMArgs defaults) {
            $ = new IPAMArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param operatingRegions The regions IPAM is enabled for. Allows pools to be created in these regions, as well as enabling monitoring
         * 
         * @return builder
         * 
         */
        public Builder operatingRegions(@Nullable Output<List<IPAMIpamOperatingRegionArgs>> operatingRegions) {
            $.operatingRegions = operatingRegions;
            return this;
        }

        /**
         * @param operatingRegions The regions IPAM is enabled for. Allows pools to be created in these regions, as well as enabling monitoring
         * 
         * @return builder
         * 
         */
        public Builder operatingRegions(List<IPAMIpamOperatingRegionArgs> operatingRegions) {
            return operatingRegions(Output.of(operatingRegions));
        }

        /**
         * @param operatingRegions The regions IPAM is enabled for. Allows pools to be created in these regions, as well as enabling monitoring
         * 
         * @return builder
         * 
         */
        public Builder operatingRegions(IPAMIpamOperatingRegionArgs... operatingRegions) {
            return operatingRegions(List.of(operatingRegions));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<IPAMTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<IPAMTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(IPAMTagArgs... tags) {
            return tags(List.of(tags));
        }

        public IPAMArgs build() {
            return $;
        }
    }

}
