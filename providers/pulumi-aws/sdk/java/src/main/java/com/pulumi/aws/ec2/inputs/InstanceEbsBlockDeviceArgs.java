// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceEbsBlockDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceEbsBlockDeviceArgs Empty = new InstanceEbsBlockDeviceArgs();

    /**
     * Whether the volume should be destroyed on instance termination. Defaults to `true`.
     * 
     */
    @Import(name="deleteOnTermination")
      private final @Nullable Output<Boolean> deleteOnTermination;

    public Output<Boolean> deleteOnTermination() {
        return this.deleteOnTermination == null ? Codegen.empty() : this.deleteOnTermination;
    }

    /**
     * Name of the device to mount.
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume. Defaults to `false`. Cannot be used with `snapshot_id`. Must be configured to perform drift detection.
     * 
     */
    @Import(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> encrypted() {
        return this.encrypted == null ? Codegen.empty() : this.encrypted;
    }

    /**
     * Amount of provisioned [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html). Only valid for volume_type of `io1`, `io2` or `gp3`.
     * 
     */
    @Import(name="iops")
      private final @Nullable Output<Integer> iops;

    public Output<Integer> iops() {
        return this.iops == null ? Codegen.empty() : this.iops;
    }

    /**
     * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> kmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    /**
     * Snapshot ID to mount.
     * 
     */
    @Import(name="snapshotId")
      private final @Nullable Output<String> snapshotId;

    public Output<String> snapshotId() {
        return this.snapshotId == null ? Codegen.empty() : this.snapshotId;
    }

    /**
     * A map of tags to assign to the device.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Throughput to provision for a volume in mebibytes per second (MiB/s). This is only valid for `volume_type` of `gp3`.
     * 
     */
    @Import(name="throughput")
      private final @Nullable Output<Integer> throughput;

    public Output<Integer> throughput() {
        return this.throughput == null ? Codegen.empty() : this.throughput;
    }

    /**
     * ID of the volume. For example, the ID can be accessed like this, `aws_instance.web.root_block_device.0.volume_id`.
     * 
     */
    @Import(name="volumeId")
      private final @Nullable Output<String> volumeId;

    public Output<String> volumeId() {
        return this.volumeId == null ? Codegen.empty() : this.volumeId;
    }

    /**
     * Size of the volume in gibibytes (GiB).
     * 
     */
    @Import(name="volumeSize")
      private final @Nullable Output<Integer> volumeSize;

    public Output<Integer> volumeSize() {
        return this.volumeSize == null ? Codegen.empty() : this.volumeSize;
    }

    /**
     * Type of volume. Valid values include `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1`, or `st1`. Defaults to `gp2`.
     * 
     */
    @Import(name="volumeType")
      private final @Nullable Output<String> volumeType;

    public Output<String> volumeType() {
        return this.volumeType == null ? Codegen.empty() : this.volumeType;
    }

    public InstanceEbsBlockDeviceArgs(
        @Nullable Output<Boolean> deleteOnTermination,
        Output<String> deviceName,
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<Integer> iops,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> snapshotId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Integer> throughput,
        @Nullable Output<String> volumeId,
        @Nullable Output<Integer> volumeSize,
        @Nullable Output<String> volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.encrypted = encrypted;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.snapshotId = snapshotId;
        this.tags = tags;
        this.throughput = throughput;
        this.volumeId = volumeId;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private InstanceEbsBlockDeviceArgs() {
        this.deleteOnTermination = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.encrypted = Codegen.empty();
        this.iops = Codegen.empty();
        this.kmsKeyId = Codegen.empty();
        this.snapshotId = Codegen.empty();
        this.tags = Codegen.empty();
        this.throughput = Codegen.empty();
        this.volumeId = Codegen.empty();
        this.volumeSize = Codegen.empty();
        this.volumeType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceEbsBlockDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> deleteOnTermination;
        private Output<String> deviceName;
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<Integer> iops;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> snapshotId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Integer> throughput;
        private @Nullable Output<String> volumeId;
        private @Nullable Output<Integer> volumeSize;
        private @Nullable Output<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceEbsBlockDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.snapshotId = defaults.snapshotId;
    	      this.tags = defaults.tags;
    	      this.throughput = defaults.throughput;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(@Nullable Output<Boolean> deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = Codegen.ofNullable(deleteOnTermination);
            return this;
        }
        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = Codegen.ofNullable(encrypted);
            return this;
        }
        public Builder iops(@Nullable Output<Integer> iops) {
            this.iops = iops;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = Codegen.ofNullable(iops);
            return this;
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = Codegen.ofNullable(snapshotId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder throughput(@Nullable Output<Integer> throughput) {
            this.throughput = throughput;
            return this;
        }
        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = Codegen.ofNullable(throughput);
            return this;
        }
        public Builder volumeId(@Nullable Output<String> volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = Codegen.ofNullable(volumeId);
            return this;
        }
        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = Codegen.ofNullable(volumeSize);
            return this;
        }
        public Builder volumeType(@Nullable Output<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = Codegen.ofNullable(volumeType);
            return this;
        }        public InstanceEbsBlockDeviceArgs build() {
            return new InstanceEbsBlockDeviceArgs(deleteOnTermination, deviceName, encrypted, iops, kmsKeyId, snapshotId, tags, throughput, volumeId, volumeSize, volumeType);
        }
    }
}
