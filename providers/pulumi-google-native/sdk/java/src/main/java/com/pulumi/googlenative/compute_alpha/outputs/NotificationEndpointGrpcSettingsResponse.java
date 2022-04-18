// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.DurationResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NotificationEndpointGrpcSettingsResponse {
    /**
     * Optional. If specified, this field is used to set the authority header by the sender of notifications. See https://tools.ietf.org/html/rfc7540#section-8.1.2.3
     * 
     */
    private final String authority;
    /**
     * Endpoint to which gRPC notifications are sent. This must be a valid gRPCLB DNS name.
     * 
     */
    private final String endpoint;
    /**
     * Optional. If specified, this field is used to populate the "name" field in gRPC requests.
     * 
     */
    private final String payloadName;
    /**
     * Optional. This field is used to configure how often to send a full update of all non-healthy backends. If unspecified, full updates are not sent. If specified, must be in the range between 600 seconds to 3600 seconds. Nanos are disallowed.
     * 
     */
    private final DurationResponse resendInterval;
    /**
     * How much time (in seconds) is spent attempting notification retries until a successful response is received. Default is 30s. Limit is 20m (1200s). Must be a positive number.
     * 
     */
    private final Integer retryDurationSec;

    @CustomType.Constructor
    private NotificationEndpointGrpcSettingsResponse(
        @CustomType.Parameter("authority") String authority,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("payloadName") String payloadName,
        @CustomType.Parameter("resendInterval") DurationResponse resendInterval,
        @CustomType.Parameter("retryDurationSec") Integer retryDurationSec) {
        this.authority = authority;
        this.endpoint = endpoint;
        this.payloadName = payloadName;
        this.resendInterval = resendInterval;
        this.retryDurationSec = retryDurationSec;
    }

    /**
     * Optional. If specified, this field is used to set the authority header by the sender of notifications. See https://tools.ietf.org/html/rfc7540#section-8.1.2.3
     * 
    */
    public String authority() {
        return this.authority;
    }
    /**
     * Endpoint to which gRPC notifications are sent. This must be a valid gRPCLB DNS name.
     * 
    */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * Optional. If specified, this field is used to populate the "name" field in gRPC requests.
     * 
    */
    public String payloadName() {
        return this.payloadName;
    }
    /**
     * Optional. This field is used to configure how often to send a full update of all non-healthy backends. If unspecified, full updates are not sent. If specified, must be in the range between 600 seconds to 3600 seconds. Nanos are disallowed.
     * 
    */
    public DurationResponse resendInterval() {
        return this.resendInterval;
    }
    /**
     * How much time (in seconds) is spent attempting notification retries until a successful response is received. Default is 30s. Limit is 20m (1200s). Must be a positive number.
     * 
    */
    public Integer retryDurationSec() {
        return this.retryDurationSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationEndpointGrpcSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authority;
        private String endpoint;
        private String payloadName;
        private DurationResponse resendInterval;
        private Integer retryDurationSec;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationEndpointGrpcSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.endpoint = defaults.endpoint;
    	      this.payloadName = defaults.payloadName;
    	      this.resendInterval = defaults.resendInterval;
    	      this.retryDurationSec = defaults.retryDurationSec;
        }

        public Builder authority(String authority) {
            this.authority = Objects.requireNonNull(authority);
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder payloadName(String payloadName) {
            this.payloadName = Objects.requireNonNull(payloadName);
            return this;
        }
        public Builder resendInterval(DurationResponse resendInterval) {
            this.resendInterval = Objects.requireNonNull(resendInterval);
            return this;
        }
        public Builder retryDurationSec(Integer retryDurationSec) {
            this.retryDurationSec = Objects.requireNonNull(retryDurationSec);
            return this;
        }        public NotificationEndpointGrpcSettingsResponse build() {
            return new NotificationEndpointGrpcSettingsResponse(authority, endpoint, payloadName, resendInterval, retryDurationSec);
        }
    }
}
