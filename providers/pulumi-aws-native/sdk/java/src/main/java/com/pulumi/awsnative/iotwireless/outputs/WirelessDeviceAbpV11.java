// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless.outputs;

import com.pulumi.awsnative.iotwireless.outputs.WirelessDeviceSessionKeysAbpV11;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WirelessDeviceAbpV11 {
    private final String devAddr;
    private final WirelessDeviceSessionKeysAbpV11 sessionKeys;

    @CustomType.Constructor
    private WirelessDeviceAbpV11(
        @CustomType.Parameter("devAddr") String devAddr,
        @CustomType.Parameter("sessionKeys") WirelessDeviceSessionKeysAbpV11 sessionKeys) {
        this.devAddr = devAddr;
        this.sessionKeys = sessionKeys;
    }

    public String devAddr() {
        return this.devAddr;
    }
    public WirelessDeviceSessionKeysAbpV11 sessionKeys() {
        return this.sessionKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceAbpV11 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String devAddr;
        private WirelessDeviceSessionKeysAbpV11 sessionKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceAbpV11 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devAddr = defaults.devAddr;
    	      this.sessionKeys = defaults.sessionKeys;
        }

        public Builder devAddr(String devAddr) {
            this.devAddr = Objects.requireNonNull(devAddr);
            return this;
        }
        public Builder sessionKeys(WirelessDeviceSessionKeysAbpV11 sessionKeys) {
            this.sessionKeys = Objects.requireNonNull(sessionKeys);
            return this;
        }        public WirelessDeviceAbpV11 build() {
            return new WirelessDeviceAbpV11(devAddr, sessionKeys);
        }
    }
}
