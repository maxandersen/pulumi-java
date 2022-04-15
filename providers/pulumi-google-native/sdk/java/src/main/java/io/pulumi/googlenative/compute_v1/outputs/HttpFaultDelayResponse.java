// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_v1.outputs.DurationResponse;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class HttpFaultDelayResponse {
    /**
     * Specifies the value of the fixed delay interval.
     * 
     */
    private final DurationResponse fixedDelay;
    /**
     * The percentage of traffic for connections, operations, or requests for which a delay is introduced as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * 
     */
    private final Double percentage;

    @CustomType.Constructor
    private HttpFaultDelayResponse(
        @CustomType.Parameter("fixedDelay") DurationResponse fixedDelay,
        @CustomType.Parameter("percentage") Double percentage) {
        this.fixedDelay = fixedDelay;
        this.percentage = percentage;
    }

    /**
     * Specifies the value of the fixed delay interval.
     * 
    */
    public DurationResponse fixedDelay() {
        return this.fixedDelay;
    }
    /**
     * The percentage of traffic for connections, operations, or requests for which a delay is introduced as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * 
    */
    public Double percentage() {
        return this.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFaultDelayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DurationResponse fixedDelay;
        private Double percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFaultDelayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder fixedDelay(DurationResponse fixedDelay) {
            this.fixedDelay = Objects.requireNonNull(fixedDelay);
            return this;
        }
        public Builder percentage(Double percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }        public HttpFaultDelayResponse build() {
            return new HttpFaultDelayResponse(fixedDelay, percentage);
        }
    }
}
