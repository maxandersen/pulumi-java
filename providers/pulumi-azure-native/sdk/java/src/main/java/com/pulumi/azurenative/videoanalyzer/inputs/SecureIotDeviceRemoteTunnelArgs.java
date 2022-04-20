// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * A remote tunnel securely established using IoT Hub device information.
 * 
 */
public final class SecureIotDeviceRemoteTunnelArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecureIotDeviceRemoteTunnelArgs Empty = new SecureIotDeviceRemoteTunnelArgs();

    /**
     * The IoT device id to use when establishing the remote tunnel. This string is case-sensitive.
     * 
     */
    @Import(name="deviceId", required=true)
      private final Output<String> deviceId;

    public Output<String> deviceId() {
        return this.deviceId;
    }

    /**
     * Name of the IoT Hub.
     * 
     */
    @Import(name="iotHubName", required=true)
      private final Output<String> iotHubName;

    public Output<String> iotHubName() {
        return this.iotHubName;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.SecureIotDeviceRemoteTunnel&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public SecureIotDeviceRemoteTunnelArgs(
        Output<String> deviceId,
        Output<String> iotHubName,
        Output<String> type) {
        this.deviceId = Objects.requireNonNull(deviceId, "expected parameter 'deviceId' to be non-null");
        this.iotHubName = Objects.requireNonNull(iotHubName, "expected parameter 'iotHubName' to be non-null");
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private SecureIotDeviceRemoteTunnelArgs() {
        this.deviceId = Codegen.empty();
        this.iotHubName = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecureIotDeviceRemoteTunnelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> deviceId;
        private Output<String> iotHubName;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecureIotDeviceRemoteTunnelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceId = defaults.deviceId;
    	      this.iotHubName = defaults.iotHubName;
    	      this.type = defaults.type;
        }

        public Builder deviceId(Output<String> deviceId) {
            this.deviceId = Objects.requireNonNull(deviceId);
            return this;
        }
        public Builder deviceId(String deviceId) {
            this.deviceId = Output.of(Objects.requireNonNull(deviceId));
            return this;
        }
        public Builder iotHubName(Output<String> iotHubName) {
            this.iotHubName = Objects.requireNonNull(iotHubName);
            return this;
        }
        public Builder iotHubName(String iotHubName) {
            this.iotHubName = Output.of(Objects.requireNonNull(iotHubName));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public SecureIotDeviceRemoteTunnelArgs build() {
            return new SecureIotDeviceRemoteTunnelArgs(deviceId, iotHubName, type);
        }
    }
}
