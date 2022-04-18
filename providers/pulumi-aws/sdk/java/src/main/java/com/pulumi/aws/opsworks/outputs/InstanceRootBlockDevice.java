// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceRootBlockDevice {
    private final @Nullable Boolean deleteOnTermination;
    private final @Nullable Integer iops;
    private final @Nullable Integer volumeSize;
    private final @Nullable String volumeType;

    @CustomType.Constructor
    private InstanceRootBlockDevice(
        @CustomType.Parameter("deleteOnTermination") @Nullable Boolean deleteOnTermination,
        @CustomType.Parameter("iops") @Nullable Integer iops,
        @CustomType.Parameter("volumeSize") @Nullable Integer volumeSize,
        @CustomType.Parameter("volumeType") @Nullable String volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.iops = iops;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    public Optional<Boolean> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    public Optional<Integer> iops() {
        return Optional.ofNullable(this.iops);
    }
    public Optional<Integer> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    public Optional<String> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceRootBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteOnTermination;
        private @Nullable Integer iops;
        private @Nullable Integer volumeSize;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceRootBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.iops = defaults.iops;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }        public InstanceRootBlockDevice build() {
            return new InstanceRootBlockDevice(deleteOnTermination, iops, volumeSize, volumeType);
        }
    }
}
