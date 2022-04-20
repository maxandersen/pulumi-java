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
public final class StaticWebLayerEbsVolume {
    private final @Nullable Boolean encrypted;
    /**
     * For PIOPS volumes, the IOPS per disk.
     * 
     */
    private final @Nullable Integer iops;
    /**
     * The path to mount the EBS volume on the layer&#39;s instances.
     * 
     */
    private final String mountPoint;
    /**
     * The number of disks to use for the EBS volume.
     * 
     */
    private final Integer numberOfDisks;
    /**
     * The RAID level to use for the volume.
     * 
     */
    private final @Nullable String raidLevel;
    /**
     * The size of the volume in gigabytes.
     * 
     */
    private final Integer size;
    /**
     * The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private StaticWebLayerEbsVolume(
        @CustomType.Parameter("encrypted") @Nullable Boolean encrypted,
        @CustomType.Parameter("iops") @Nullable Integer iops,
        @CustomType.Parameter("mountPoint") String mountPoint,
        @CustomType.Parameter("numberOfDisks") Integer numberOfDisks,
        @CustomType.Parameter("raidLevel") @Nullable String raidLevel,
        @CustomType.Parameter("size") Integer size,
        @CustomType.Parameter("type") @Nullable String type) {
        this.encrypted = encrypted;
        this.iops = iops;
        this.mountPoint = mountPoint;
        this.numberOfDisks = numberOfDisks;
        this.raidLevel = raidLevel;
        this.size = size;
        this.type = type;
    }

    public Optional<Boolean> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * For PIOPS volumes, the IOPS per disk.
     * 
    */
    public Optional<Integer> iops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * The path to mount the EBS volume on the layer&#39;s instances.
     * 
    */
    public String mountPoint() {
        return this.mountPoint;
    }
    /**
     * The number of disks to use for the EBS volume.
     * 
    */
    public Integer numberOfDisks() {
        return this.numberOfDisks;
    }
    /**
     * The RAID level to use for the volume.
     * 
    */
    public Optional<String> raidLevel() {
        return Optional.ofNullable(this.raidLevel);
    }
    /**
     * The size of the volume in gigabytes.
     * 
    */
    public Integer size() {
        return this.size;
    }
    /**
     * The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticWebLayerEbsVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean encrypted;
        private @Nullable Integer iops;
        private String mountPoint;
        private Integer numberOfDisks;
        private @Nullable String raidLevel;
        private Integer size;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticWebLayerEbsVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.mountPoint = defaults.mountPoint;
    	      this.numberOfDisks = defaults.numberOfDisks;
    	      this.raidLevel = defaults.raidLevel;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }
        public Builder mountPoint(String mountPoint) {
            this.mountPoint = Objects.requireNonNull(mountPoint);
            return this;
        }
        public Builder numberOfDisks(Integer numberOfDisks) {
            this.numberOfDisks = Objects.requireNonNull(numberOfDisks);
            return this;
        }
        public Builder raidLevel(@Nullable String raidLevel) {
            this.raidLevel = raidLevel;
            return this;
        }
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public StaticWebLayerEbsVolume build() {
            return new StaticWebLayerEbsVolume(encrypted, iops, mountPoint, numberOfDisks, raidLevel, size, type);
        }
    }
}
