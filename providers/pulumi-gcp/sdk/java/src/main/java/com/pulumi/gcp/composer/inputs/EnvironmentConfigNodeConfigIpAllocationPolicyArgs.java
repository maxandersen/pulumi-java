// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentConfigNodeConfigIpAllocationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigNodeConfigIpAllocationPolicyArgs Empty = new EnvironmentConfigNodeConfigIpAllocationPolicyArgs();

    @Import(name="clusterIpv4CidrBlock")
    private @Nullable Output<String> clusterIpv4CidrBlock;

    public Optional<Output<String>> clusterIpv4CidrBlock() {
        return Optional.ofNullable(this.clusterIpv4CidrBlock);
    }

    @Import(name="clusterSecondaryRangeName")
    private @Nullable Output<String> clusterSecondaryRangeName;

    public Optional<Output<String>> clusterSecondaryRangeName() {
        return Optional.ofNullable(this.clusterSecondaryRangeName);
    }

    @Import(name="servicesIpv4CidrBlock")
    private @Nullable Output<String> servicesIpv4CidrBlock;

    public Optional<Output<String>> servicesIpv4CidrBlock() {
        return Optional.ofNullable(this.servicesIpv4CidrBlock);
    }

    @Import(name="servicesSecondaryRangeName")
    private @Nullable Output<String> servicesSecondaryRangeName;

    public Optional<Output<String>> servicesSecondaryRangeName() {
        return Optional.ofNullable(this.servicesSecondaryRangeName);
    }

    @Import(name="useIpAliases")
    private @Nullable Output<Boolean> useIpAliases;

    public Optional<Output<Boolean>> useIpAliases() {
        return Optional.ofNullable(this.useIpAliases);
    }

    private EnvironmentConfigNodeConfigIpAllocationPolicyArgs() {}

    private EnvironmentConfigNodeConfigIpAllocationPolicyArgs(EnvironmentConfigNodeConfigIpAllocationPolicyArgs $) {
        this.clusterIpv4CidrBlock = $.clusterIpv4CidrBlock;
        this.clusterSecondaryRangeName = $.clusterSecondaryRangeName;
        this.servicesIpv4CidrBlock = $.servicesIpv4CidrBlock;
        this.servicesSecondaryRangeName = $.servicesSecondaryRangeName;
        this.useIpAliases = $.useIpAliases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentConfigNodeConfigIpAllocationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentConfigNodeConfigIpAllocationPolicyArgs $;

        public Builder() {
            $ = new EnvironmentConfigNodeConfigIpAllocationPolicyArgs();
        }

        public Builder(EnvironmentConfigNodeConfigIpAllocationPolicyArgs defaults) {
            $ = new EnvironmentConfigNodeConfigIpAllocationPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterIpv4CidrBlock(@Nullable Output<String> clusterIpv4CidrBlock) {
            $.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
            return this;
        }

        public Builder clusterIpv4CidrBlock(String clusterIpv4CidrBlock) {
            return clusterIpv4CidrBlock(Output.of(clusterIpv4CidrBlock));
        }

        public Builder clusterSecondaryRangeName(@Nullable Output<String> clusterSecondaryRangeName) {
            $.clusterSecondaryRangeName = clusterSecondaryRangeName;
            return this;
        }

        public Builder clusterSecondaryRangeName(String clusterSecondaryRangeName) {
            return clusterSecondaryRangeName(Output.of(clusterSecondaryRangeName));
        }

        public Builder servicesIpv4CidrBlock(@Nullable Output<String> servicesIpv4CidrBlock) {
            $.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
            return this;
        }

        public Builder servicesIpv4CidrBlock(String servicesIpv4CidrBlock) {
            return servicesIpv4CidrBlock(Output.of(servicesIpv4CidrBlock));
        }

        public Builder servicesSecondaryRangeName(@Nullable Output<String> servicesSecondaryRangeName) {
            $.servicesSecondaryRangeName = servicesSecondaryRangeName;
            return this;
        }

        public Builder servicesSecondaryRangeName(String servicesSecondaryRangeName) {
            return servicesSecondaryRangeName(Output.of(servicesSecondaryRangeName));
        }

        public Builder useIpAliases(@Nullable Output<Boolean> useIpAliases) {
            $.useIpAliases = useIpAliases;
            return this;
        }

        public Builder useIpAliases(Boolean useIpAliases) {
            return useIpAliases(Output.of(useIpAliases));
        }

        public EnvironmentConfigNodeConfigIpAllocationPolicyArgs build() {
            return $;
        }
    }

}
