// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BasicScalingResponse {
    /**
     * Duration of time after the last request that an instance must wait before the instance is shut down.
     * 
     */
    private final String idleTimeout;
    /**
     * Maximum number of instances to create for this version.
     * 
     */
    private final Integer maxInstances;

    @CustomType.Constructor
    private BasicScalingResponse(
        @CustomType.Parameter("idleTimeout") String idleTimeout,
        @CustomType.Parameter("maxInstances") Integer maxInstances) {
        this.idleTimeout = idleTimeout;
        this.maxInstances = maxInstances;
    }

    /**
     * Duration of time after the last request that an instance must wait before the instance is shut down.
     * 
    */
    public String idleTimeout() {
        return this.idleTimeout;
    }
    /**
     * Maximum number of instances to create for this version.
     * 
    */
    public Integer maxInstances() {
        return this.maxInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicScalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String idleTimeout;
        private Integer maxInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicScalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.maxInstances = defaults.maxInstances;
        }

        public Builder idleTimeout(String idleTimeout) {
            this.idleTimeout = Objects.requireNonNull(idleTimeout);
            return this;
        }
        public Builder maxInstances(Integer maxInstances) {
            this.maxInstances = Objects.requireNonNull(maxInstances);
            return this;
        }        public BasicScalingResponse build() {
            return new BasicScalingResponse(idleTimeout, maxInstances);
        }
    }
}
