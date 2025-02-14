// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.autoscaling.inputs;

import com.pulumi.awsnative.autoscaling.inputs.LaunchConfigurationBlockDeviceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * BlockDeviceMapping is a property of AWS::AutoScaling::LaunchConfiguration that describes a block device mapping for an Auto Scaling group.
 * 
 */
public final class LaunchConfigurationBlockDeviceMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final LaunchConfigurationBlockDeviceMappingArgs Empty = new LaunchConfigurationBlockDeviceMappingArgs();

    /**
     * The device name exposed to the EC2 instance (for example, /dev/sdh or xvdh).
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    /**
     * @return The device name exposed to the EC2 instance (for example, /dev/sdh or xvdh).
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * Parameters used to automatically set up EBS volumes when an instance is launched.
     * 
     */
    @Import(name="ebs")
    private @Nullable Output<LaunchConfigurationBlockDeviceArgs> ebs;

    /**
     * @return Parameters used to automatically set up EBS volumes when an instance is launched.
     * 
     */
    public Optional<Output<LaunchConfigurationBlockDeviceArgs>> ebs() {
        return Optional.ofNullable(this.ebs);
    }

    /**
     * Setting this value to true suppresses the specified device included in the block device mapping of the AMI.
     * 
     */
    @Import(name="noDevice")
    private @Nullable Output<Boolean> noDevice;

    /**
     * @return Setting this value to true suppresses the specified device included in the block device mapping of the AMI.
     * 
     */
    public Optional<Output<Boolean>> noDevice() {
        return Optional.ofNullable(this.noDevice);
    }

    /**
     * The name of the virtual device.
     * 
     */
    @Import(name="virtualName")
    private @Nullable Output<String> virtualName;

    /**
     * @return The name of the virtual device.
     * 
     */
    public Optional<Output<String>> virtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    private LaunchConfigurationBlockDeviceMappingArgs() {}

    private LaunchConfigurationBlockDeviceMappingArgs(LaunchConfigurationBlockDeviceMappingArgs $) {
        this.deviceName = $.deviceName;
        this.ebs = $.ebs;
        this.noDevice = $.noDevice;
        this.virtualName = $.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LaunchConfigurationBlockDeviceMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LaunchConfigurationBlockDeviceMappingArgs $;

        public Builder() {
            $ = new LaunchConfigurationBlockDeviceMappingArgs();
        }

        public Builder(LaunchConfigurationBlockDeviceMappingArgs defaults) {
            $ = new LaunchConfigurationBlockDeviceMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceName The device name exposed to the EC2 instance (for example, /dev/sdh or xvdh).
         * 
         * @return builder
         * 
         */
        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName The device name exposed to the EC2 instance (for example, /dev/sdh or xvdh).
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param ebs Parameters used to automatically set up EBS volumes when an instance is launched.
         * 
         * @return builder
         * 
         */
        public Builder ebs(@Nullable Output<LaunchConfigurationBlockDeviceArgs> ebs) {
            $.ebs = ebs;
            return this;
        }

        /**
         * @param ebs Parameters used to automatically set up EBS volumes when an instance is launched.
         * 
         * @return builder
         * 
         */
        public Builder ebs(LaunchConfigurationBlockDeviceArgs ebs) {
            return ebs(Output.of(ebs));
        }

        /**
         * @param noDevice Setting this value to true suppresses the specified device included in the block device mapping of the AMI.
         * 
         * @return builder
         * 
         */
        public Builder noDevice(@Nullable Output<Boolean> noDevice) {
            $.noDevice = noDevice;
            return this;
        }

        /**
         * @param noDevice Setting this value to true suppresses the specified device included in the block device mapping of the AMI.
         * 
         * @return builder
         * 
         */
        public Builder noDevice(Boolean noDevice) {
            return noDevice(Output.of(noDevice));
        }

        /**
         * @param virtualName The name of the virtual device.
         * 
         * @return builder
         * 
         */
        public Builder virtualName(@Nullable Output<String> virtualName) {
            $.virtualName = virtualName;
            return this;
        }

        /**
         * @param virtualName The name of the virtual device.
         * 
         * @return builder
         * 
         */
        public Builder virtualName(String virtualName) {
            return virtualName(Output.of(virtualName));
        }

        public LaunchConfigurationBlockDeviceMappingArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            return $;
        }
    }

}
