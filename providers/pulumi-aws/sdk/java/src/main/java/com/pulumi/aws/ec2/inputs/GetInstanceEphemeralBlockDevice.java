// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceEphemeralBlockDevice extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceEphemeralBlockDevice Empty = new GetInstanceEphemeralBlockDevice();

    /**
     * The physical name of the device.
     * 
     */
    @Import(name="deviceName", required=true)
      private final String deviceName;

    public String deviceName() {
        return this.deviceName;
    }

    /**
     * Whether the specified device included in the device mapping was suppressed or not (Boolean).
     * 
     */
    @Import(name="noDevice")
      private final @Nullable Boolean noDevice;

    public Optional<Boolean> noDevice() {
        return this.noDevice == null ? Optional.empty() : Optional.ofNullable(this.noDevice);
    }

    /**
     * The virtual device name.
     * 
     */
    @Import(name="virtualName")
      private final @Nullable String virtualName;

    public Optional<String> virtualName() {
        return this.virtualName == null ? Optional.empty() : Optional.ofNullable(this.virtualName);
    }

    public GetInstanceEphemeralBlockDevice(
        String deviceName,
        @Nullable Boolean noDevice,
        @Nullable String virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    private GetInstanceEphemeralBlockDevice() {
        this.deviceName = null;
        this.noDevice = null;
        this.virtualName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceEphemeralBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private @Nullable Boolean noDevice;
        private @Nullable String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceEphemeralBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder noDevice(@Nullable Boolean noDevice) {
            this.noDevice = noDevice;
            return this;
        }
        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = virtualName;
            return this;
        }        public GetInstanceEphemeralBlockDevice build() {
            return new GetInstanceEphemeralBlockDevice(deviceName, noDevice, virtualName);
        }
    }
}
