// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GrpcRouteFaultInjectionPolicyDelayResponse {
    /**
     * @return Specify a fixed delay before forwarding the request.
     * 
     */
    private final String fixedDelay;
    /**
     * @return The percentage of traffic on which delay will be injected. The value must be between [0, 100]
     * 
     */
    private final Integer percentage;

    @CustomType.Constructor
    private GrpcRouteFaultInjectionPolicyDelayResponse(
        @CustomType.Parameter("fixedDelay") String fixedDelay,
        @CustomType.Parameter("percentage") Integer percentage) {
        this.fixedDelay = fixedDelay;
        this.percentage = percentage;
    }

    /**
     * @return Specify a fixed delay before forwarding the request.
     * 
     */
    public String fixedDelay() {
        return this.fixedDelay;
    }
    /**
     * @return The percentage of traffic on which delay will be injected. The value must be between [0, 100]
     * 
     */
    public Integer percentage() {
        return this.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrpcRouteFaultInjectionPolicyDelayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fixedDelay;
        private Integer percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(GrpcRouteFaultInjectionPolicyDelayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder fixedDelay(String fixedDelay) {
            this.fixedDelay = Objects.requireNonNull(fixedDelay);
            return this;
        }
        public Builder percentage(Integer percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }        public GrpcRouteFaultInjectionPolicyDelayResponse build() {
            return new GrpcRouteFaultInjectionPolicyDelayResponse(fixedDelay, percentage);
        }
    }
}
