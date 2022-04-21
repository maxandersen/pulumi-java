// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecMountTmpfsOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecMountTmpfsOptionsArgs Empty = new ServiceTaskSpecContainerSpecMountTmpfsOptionsArgs();

    @Import(name="mode")
    private @Nullable Output<Integer> mode;

    public Optional<Output<Integer>> mode() {
        return Optional.ofNullable(this.mode);
    }

    @Import(name="sizeBytes")
    private @Nullable Output<Integer> sizeBytes;

    public Optional<Output<Integer>> sizeBytes() {
        return Optional.ofNullable(this.sizeBytes);
    }

    private ServiceTaskSpecContainerSpecMountTmpfsOptionsArgs() {}

    private ServiceTaskSpecContainerSpecMountTmpfsOptionsArgs(ServiceTaskSpecContainerSpecMountTmpfsOptionsArgs $) {
        this.mode = $.mode;
        this.sizeBytes = $.sizeBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTaskSpecContainerSpecMountTmpfsOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTaskSpecContainerSpecMountTmpfsOptionsArgs $;

        public Builder() {
            $ = new ServiceTaskSpecContainerSpecMountTmpfsOptionsArgs();
        }

        public Builder(ServiceTaskSpecContainerSpecMountTmpfsOptionsArgs defaults) {
            $ = new ServiceTaskSpecContainerSpecMountTmpfsOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder mode(@Nullable Output<Integer> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(Integer mode) {
            return mode(Output.of(mode));
        }

        public Builder sizeBytes(@Nullable Output<Integer> sizeBytes) {
            $.sizeBytes = sizeBytes;
            return this;
        }

        public Builder sizeBytes(Integer sizeBytes) {
            return sizeBytes(Output.of(sizeBytes));
        }

        public ServiceTaskSpecContainerSpecMountTmpfsOptionsArgs build() {
            return $;
        }
    }

}
