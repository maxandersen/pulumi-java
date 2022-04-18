// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLaunchConfigurationEbsBlockDevice {
    /**
     * Whether the EBS Volume will be deleted on instance termination.
     * 
     */
    private final Boolean deleteOnTermination;
    /**
     * The Name of the device.
     * 
     */
    private final String deviceName;
    /**
     * Whether the volume is Encrypted.
     * 
     */
    private final Boolean encrypted;
    /**
     * The provisioned IOPs of the volume.
     * 
     */
    private final Integer iops;
    /**
     * Whether the device in the block device mapping of the AMI is suppressed.
     * 
     */
    private final Boolean noDevice;
    /**
     * The Snapshot ID of the mount.
     * 
     */
    private final String snapshotId;
    /**
     * The Throughput of the volume.
     * 
     */
    private final Boolean throughput;
    /**
     * The Size of the volume.
     * 
     */
    private final Integer volumeSize;
    /**
     * The Type of the volume.
     * 
     */
    private final String volumeType;

    @CustomType.Constructor
    private GetLaunchConfigurationEbsBlockDevice(
        @CustomType.Parameter("deleteOnTermination") Boolean deleteOnTermination,
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("encrypted") Boolean encrypted,
        @CustomType.Parameter("iops") Integer iops,
        @CustomType.Parameter("noDevice") Boolean noDevice,
        @CustomType.Parameter("snapshotId") String snapshotId,
        @CustomType.Parameter("throughput") Boolean throughput,
        @CustomType.Parameter("volumeSize") Integer volumeSize,
        @CustomType.Parameter("volumeType") String volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceName = deviceName;
        this.encrypted = encrypted;
        this.iops = iops;
        this.noDevice = noDevice;
        this.snapshotId = snapshotId;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    /**
     * Whether the EBS Volume will be deleted on instance termination.
     * 
    */
    public Boolean deleteOnTermination() {
        return this.deleteOnTermination;
    }
    /**
     * The Name of the device.
     * 
    */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * Whether the volume is Encrypted.
     * 
    */
    public Boolean encrypted() {
        return this.encrypted;
    }
    /**
     * The provisioned IOPs of the volume.
     * 
    */
    public Integer iops() {
        return this.iops;
    }
    /**
     * Whether the device in the block device mapping of the AMI is suppressed.
     * 
    */
    public Boolean noDevice() {
        return this.noDevice;
    }
    /**
     * The Snapshot ID of the mount.
     * 
    */
    public String snapshotId() {
        return this.snapshotId;
    }
    /**
     * The Throughput of the volume.
     * 
    */
    public Boolean throughput() {
        return this.throughput;
    }
    /**
     * The Size of the volume.
     * 
    */
    public Integer volumeSize() {
        return this.volumeSize;
    }
    /**
     * The Type of the volume.
     * 
    */
    public String volumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchConfigurationEbsBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean deleteOnTermination;
        private String deviceName;
        private Boolean encrypted;
        private Integer iops;
        private Boolean noDevice;
        private String snapshotId;
        private Boolean throughput;
        private Integer volumeSize;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchConfigurationEbsBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.noDevice = defaults.noDevice;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(Boolean deleteOnTermination) {
            this.deleteOnTermination = Objects.requireNonNull(deleteOnTermination);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }
        public Builder iops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }
        public Builder noDevice(Boolean noDevice) {
            this.noDevice = Objects.requireNonNull(noDevice);
            return this;
        }
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }
        public Builder throughput(Boolean throughput) {
            this.throughput = Objects.requireNonNull(throughput);
            return this;
        }
        public Builder volumeSize(Integer volumeSize) {
            this.volumeSize = Objects.requireNonNull(volumeSize);
            return this;
        }
        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }        public GetLaunchConfigurationEbsBlockDevice build() {
            return new GetLaunchConfigurationEbsBlockDevice(deleteOnTermination, deviceName, encrypted, iops, noDevice, snapshotId, throughput, volumeSize, volumeType);
        }
    }
}
