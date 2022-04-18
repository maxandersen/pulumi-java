// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Message containing connection draining configuration.
 * 
 */
public final class ConnectionDrainingResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectionDrainingResponse Empty = new ConnectionDrainingResponse();

    /**
     * Configures a duration timeout for existing requests on a removed backend instance. For supported load balancers and protocols, as described in Enabling connection draining.
     * 
     */
    @Import(name="drainingTimeoutSec", required=true)
      private final Integer drainingTimeoutSec;

    public Integer drainingTimeoutSec() {
        return this.drainingTimeoutSec;
    }

    public ConnectionDrainingResponse(Integer drainingTimeoutSec) {
        this.drainingTimeoutSec = Objects.requireNonNull(drainingTimeoutSec, "expected parameter 'drainingTimeoutSec' to be non-null");
    }

    private ConnectionDrainingResponse() {
        this.drainingTimeoutSec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionDrainingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer drainingTimeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionDrainingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainingTimeoutSec = defaults.drainingTimeoutSec;
        }

        public Builder drainingTimeoutSec(Integer drainingTimeoutSec) {
            this.drainingTimeoutSec = Objects.requireNonNull(drainingTimeoutSec);
            return this;
        }        public ConnectionDrainingResponse build() {
            return new ConnectionDrainingResponse(drainingTimeoutSec);
        }
    }
}
