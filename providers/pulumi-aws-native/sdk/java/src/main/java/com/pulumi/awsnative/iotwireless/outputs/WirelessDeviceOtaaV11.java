// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WirelessDeviceOtaaV11 {
    private final String appKey;
    private final String joinEui;
    private final String nwkKey;

    @CustomType.Constructor
    private WirelessDeviceOtaaV11(
        @CustomType.Parameter("appKey") String appKey,
        @CustomType.Parameter("joinEui") String joinEui,
        @CustomType.Parameter("nwkKey") String nwkKey) {
        this.appKey = appKey;
        this.joinEui = joinEui;
        this.nwkKey = nwkKey;
    }

    public String appKey() {
        return this.appKey;
    }
    public String joinEui() {
        return this.joinEui;
    }
    public String nwkKey() {
        return this.nwkKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceOtaaV11 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appKey;
        private String joinEui;
        private String nwkKey;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceOtaaV11 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appKey = defaults.appKey;
    	      this.joinEui = defaults.joinEui;
    	      this.nwkKey = defaults.nwkKey;
        }

        public Builder appKey(String appKey) {
            this.appKey = Objects.requireNonNull(appKey);
            return this;
        }
        public Builder joinEui(String joinEui) {
            this.joinEui = Objects.requireNonNull(joinEui);
            return this;
        }
        public Builder nwkKey(String nwkKey) {
            this.nwkKey = Objects.requireNonNull(nwkKey);
            return this;
        }        public WirelessDeviceOtaaV11 build() {
            return new WirelessDeviceOtaaV11(appKey, joinEui, nwkKey);
        }
    }
}
