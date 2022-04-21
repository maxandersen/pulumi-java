// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AmiEbsBlockDeviceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AmiEbsBlockDeviceGetArgs Empty = new AmiEbsBlockDeviceGetArgs();

    /**
     * Boolean controlling whether the EBS volumes created to
     * support each created instance will be deleted once that instance is terminated.
     * 
     */
    @Import(name="deleteOnTermination")
    private @Nullable Output<Boolean> deleteOnTermination;

    public Optional<Output<Boolean>> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }

    /**
     * The path at which the device is exposed to created instances.
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * Boolean controlling whether the created EBS volumes will be encrypted. Can&#39;t be used with `snapshot_id`.
     * 
     */
    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * Number of I/O operations per second the
     * created volumes will support.
     * 
     */
    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
    }

    /**
     * The id of an EBS snapshot that will be used to initialize the created
     * EBS volumes. If set, the `volume_size` attribute must be at least as large as the referenced
     * snapshot.
     * 
     */
    @Import(name="snapshotId")
    private @Nullable Output<String> snapshotId;

    public Optional<Output<String>> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    /**
     * The throughput that the EBS volume supports, in MiB/s. Only valid for `volume_type` of `gp3`.
     * 
     */
    @Import(name="throughput")
    private @Nullable Output<Integer> throughput;

    public Optional<Output<Integer>> throughput() {
        return Optional.ofNullable(this.throughput);
    }

    /**
     * The size of created volumes in GiB.
     * If `snapshot_id` is set and `volume_size` is omitted then the volume will have the same size
     * as the selected snapshot.
     * 
     */
    @Import(name="volumeSize")
    private @Nullable Output<Integer> volumeSize;

    public Optional<Output<Integer>> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }

    /**
     * The type of EBS volume to create. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `standard`).
     * 
     */
    @Import(name="volumeType")
    private @Nullable Output<String> volumeType;

    public Optional<Output<String>> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    private AmiEbsBlockDeviceGetArgs() {}

    private AmiEbsBlockDeviceGetArgs(AmiEbsBlockDeviceGetArgs $) {
        this.deleteOnTermination = $.deleteOnTermination;
        this.deviceName = $.deviceName;
        this.encrypted = $.encrypted;
        this.iops = $.iops;
        this.snapshotId = $.snapshotId;
        this.throughput = $.throughput;
        this.volumeSize = $.volumeSize;
        this.volumeType = $.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmiEbsBlockDeviceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmiEbsBlockDeviceGetArgs $;

        public Builder() {
            $ = new AmiEbsBlockDeviceGetArgs();
        }

        public Builder(AmiEbsBlockDeviceGetArgs defaults) {
            $ = new AmiEbsBlockDeviceGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder deleteOnTermination(@Nullable Output<Boolean> deleteOnTermination) {
            $.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder deleteOnTermination(Boolean deleteOnTermination) {
            return deleteOnTermination(Output.of(deleteOnTermination));
        }

        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        public Builder iops(@Nullable Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
        }

        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        public Builder throughput(@Nullable Output<Integer> throughput) {
            $.throughput = throughput;
            return this;
        }

        public Builder throughput(Integer throughput) {
            return throughput(Output.of(throughput));
        }

        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            $.volumeSize = volumeSize;
            return this;
        }

        public Builder volumeSize(Integer volumeSize) {
            return volumeSize(Output.of(volumeSize));
        }

        public Builder volumeType(@Nullable Output<String> volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        public Builder volumeType(String volumeType) {
            return volumeType(Output.of(volumeType));
        }

        public AmiEbsBlockDeviceGetArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            return $;
        }
    }

}
