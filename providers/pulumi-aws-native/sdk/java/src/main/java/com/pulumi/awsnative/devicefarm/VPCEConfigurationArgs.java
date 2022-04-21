// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devicefarm;

import com.pulumi.awsnative.devicefarm.inputs.VPCEConfigurationTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VPCEConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VPCEConfigurationArgs Empty = new VPCEConfigurationArgs();

    @Import(name="serviceDnsName", required=true)
    private Output<String> serviceDnsName;

    public Output<String> serviceDnsName() {
        return this.serviceDnsName;
    }

    @Import(name="tags")
    private @Nullable Output<List<VPCEConfigurationTagArgs>> tags;

    public Optional<Output<List<VPCEConfigurationTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="vpceConfigurationDescription")
    private @Nullable Output<String> vpceConfigurationDescription;

    public Optional<Output<String>> vpceConfigurationDescription() {
        return Optional.ofNullable(this.vpceConfigurationDescription);
    }

    @Import(name="vpceConfigurationName", required=true)
    private Output<String> vpceConfigurationName;

    public Output<String> vpceConfigurationName() {
        return this.vpceConfigurationName;
    }

    @Import(name="vpceServiceName", required=true)
    private Output<String> vpceServiceName;

    public Output<String> vpceServiceName() {
        return this.vpceServiceName;
    }

    private VPCEConfigurationArgs() {}

    private VPCEConfigurationArgs(VPCEConfigurationArgs $) {
        this.serviceDnsName = $.serviceDnsName;
        this.tags = $.tags;
        this.vpceConfigurationDescription = $.vpceConfigurationDescription;
        this.vpceConfigurationName = $.vpceConfigurationName;
        this.vpceServiceName = $.vpceServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VPCEConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VPCEConfigurationArgs $;

        public Builder() {
            $ = new VPCEConfigurationArgs();
        }

        public Builder(VPCEConfigurationArgs defaults) {
            $ = new VPCEConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder serviceDnsName(Output<String> serviceDnsName) {
            $.serviceDnsName = serviceDnsName;
            return this;
        }

        public Builder serviceDnsName(String serviceDnsName) {
            return serviceDnsName(Output.of(serviceDnsName));
        }

        public Builder tags(@Nullable Output<List<VPCEConfigurationTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<VPCEConfigurationTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(VPCEConfigurationTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder vpceConfigurationDescription(@Nullable Output<String> vpceConfigurationDescription) {
            $.vpceConfigurationDescription = vpceConfigurationDescription;
            return this;
        }

        public Builder vpceConfigurationDescription(String vpceConfigurationDescription) {
            return vpceConfigurationDescription(Output.of(vpceConfigurationDescription));
        }

        public Builder vpceConfigurationName(Output<String> vpceConfigurationName) {
            $.vpceConfigurationName = vpceConfigurationName;
            return this;
        }

        public Builder vpceConfigurationName(String vpceConfigurationName) {
            return vpceConfigurationName(Output.of(vpceConfigurationName));
        }

        public Builder vpceServiceName(Output<String> vpceServiceName) {
            $.vpceServiceName = vpceServiceName;
            return this;
        }

        public Builder vpceServiceName(String vpceServiceName) {
            return vpceServiceName(Output.of(vpceServiceName));
        }

        public VPCEConfigurationArgs build() {
            $.serviceDnsName = Objects.requireNonNull($.serviceDnsName, "expected parameter 'serviceDnsName' to be non-null");
            $.vpceConfigurationName = Objects.requireNonNull($.vpceConfigurationName, "expected parameter 'vpceConfigurationName' to be non-null");
            $.vpceServiceName = Objects.requireNonNull($.vpceServiceName, "expected parameter 'vpceServiceName' to be non-null");
            return $;
        }
    }

}
