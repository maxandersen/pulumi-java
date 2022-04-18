// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IpMappingResponse {
    /**
     * The IP address assigned.
     * 
     */
    private final String ipAddress;
    /**
     * The due time for this IP to be retired in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`. This field is only available when the IP is scheduled to be retired.
     * 
     */
    private final String timeToRetire;
    /**
     * The type of this IP address. A `PRIMARY` address is a public address that can accept incoming connections. A `PRIVATE` address is a private address that can accept incoming connections. An `OUTGOING` address is the source address of connections originating from the instance, if supported.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private IpMappingResponse(
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("timeToRetire") String timeToRetire,
        @CustomType.Parameter("type") String type) {
        this.ipAddress = ipAddress;
        this.timeToRetire = timeToRetire;
        this.type = type;
    }

    /**
     * The IP address assigned.
     * 
    */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * The due time for this IP to be retired in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`. This field is only available when the IP is scheduled to be retired.
     * 
    */
    public String timeToRetire() {
        return this.timeToRetire;
    }
    /**
     * The type of this IP address. A `PRIMARY` address is a public address that can accept incoming connections. A `PRIVATE` address is a private address that can accept incoming connections. An `OUTGOING` address is the source address of connections originating from the instance, if supported.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private String timeToRetire;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IpMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.timeToRetire = defaults.timeToRetire;
    	      this.type = defaults.type;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder timeToRetire(String timeToRetire) {
            this.timeToRetire = Objects.requireNonNull(timeToRetire);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public IpMappingResponse build() {
            return new IpMappingResponse(ipAddress, timeToRetire, type);
        }
    }
}
