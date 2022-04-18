// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.DeviceDeviceGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceState extends com.pulumi.resources.ResourceArgs {

    public static final DeviceState Empty = new DeviceState();

    @Import(name="agentVersion")
      private final @Nullable Output<String> agentVersion;

    public Output<String> agentVersion() {
        return this.agentVersion == null ? Codegen.empty() : this.agentVersion;
    }

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Device.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The device to register with SageMaker Edge Manager. See Device details below.
     * 
     */
    @Import(name="device")
      private final @Nullable Output<DeviceDeviceGetArgs> device;

    public Output<DeviceDeviceGetArgs> device() {
        return this.device == null ? Codegen.empty() : this.device;
    }

    /**
     * The name of the Device Fleet.
     * 
     */
    @Import(name="deviceFleetName")
      private final @Nullable Output<String> deviceFleetName;

    public Output<String> deviceFleetName() {
        return this.deviceFleetName == null ? Codegen.empty() : this.deviceFleetName;
    }

    public DeviceState(
        @Nullable Output<String> agentVersion,
        @Nullable Output<String> arn,
        @Nullable Output<DeviceDeviceGetArgs> device,
        @Nullable Output<String> deviceFleetName) {
        this.agentVersion = agentVersion;
        this.arn = arn;
        this.device = device;
        this.deviceFleetName = deviceFleetName;
    }

    private DeviceState() {
        this.agentVersion = Codegen.empty();
        this.arn = Codegen.empty();
        this.device = Codegen.empty();
        this.deviceFleetName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> agentVersion;
        private @Nullable Output<String> arn;
        private @Nullable Output<DeviceDeviceGetArgs> device;
        private @Nullable Output<String> deviceFleetName;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.arn = defaults.arn;
    	      this.device = defaults.device;
    	      this.deviceFleetName = defaults.deviceFleetName;
        }

        public Builder agentVersion(@Nullable Output<String> agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = Codegen.ofNullable(agentVersion);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder device(@Nullable Output<DeviceDeviceGetArgs> device) {
            this.device = device;
            return this;
        }
        public Builder device(@Nullable DeviceDeviceGetArgs device) {
            this.device = Codegen.ofNullable(device);
            return this;
        }
        public Builder deviceFleetName(@Nullable Output<String> deviceFleetName) {
            this.deviceFleetName = deviceFleetName;
            return this;
        }
        public Builder deviceFleetName(@Nullable String deviceFleetName) {
            this.deviceFleetName = Codegen.ofNullable(deviceFleetName);
            return this;
        }        public DeviceState build() {
            return new DeviceState(agentVersion, arn, device, deviceFleetName);
        }
    }
}
