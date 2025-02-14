// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecureIotDeviceRemoteTunnelResponse {
    /**
     * @return The IoT device id to use when establishing the remote tunnel. This string is case-sensitive.
     * 
     */
    private final String deviceId;
    /**
     * @return Name of the IoT Hub.
     * 
     */
    private final String iotHubName;
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.SecureIotDeviceRemoteTunnel&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SecureIotDeviceRemoteTunnelResponse(
        @CustomType.Parameter("deviceId") String deviceId,
        @CustomType.Parameter("iotHubName") String iotHubName,
        @CustomType.Parameter("type") String type) {
        this.deviceId = deviceId;
        this.iotHubName = iotHubName;
        this.type = type;
    }

    /**
     * @return The IoT device id to use when establishing the remote tunnel. This string is case-sensitive.
     * 
     */
    public String deviceId() {
        return this.deviceId;
    }
    /**
     * @return Name of the IoT Hub.
     * 
     */
    public String iotHubName() {
        return this.iotHubName;
    }
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.SecureIotDeviceRemoteTunnel&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecureIotDeviceRemoteTunnelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceId;
        private String iotHubName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecureIotDeviceRemoteTunnelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceId = defaults.deviceId;
    	      this.iotHubName = defaults.iotHubName;
    	      this.type = defaults.type;
        }

        public Builder deviceId(String deviceId) {
            this.deviceId = Objects.requireNonNull(deviceId);
            return this;
        }
        public Builder iotHubName(String iotHubName) {
            this.iotHubName = Objects.requireNonNull(iotHubName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SecureIotDeviceRemoteTunnelResponse build() {
            return new SecureIotDeviceRemoteTunnelResponse(deviceId, iotHubName, type);
        }
    }
}
