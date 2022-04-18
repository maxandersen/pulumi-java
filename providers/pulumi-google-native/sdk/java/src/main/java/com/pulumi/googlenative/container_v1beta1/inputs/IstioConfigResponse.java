// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration options for Istio addon.
 * 
 */
public final class IstioConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final IstioConfigResponse Empty = new IstioConfigResponse();

    /**
     * The specified Istio auth mode, either none, or mutual TLS.
     * 
     */
    @Import(name="auth", required=true)
      private final String auth;

    public String auth() {
        return this.auth;
    }

    /**
     * Whether Istio is enabled for this cluster.
     * 
     */
    @Import(name="disabled", required=true)
      private final Boolean disabled;

    public Boolean disabled() {
        return this.disabled;
    }

    public IstioConfigResponse(
        String auth,
        Boolean disabled) {
        this.auth = Objects.requireNonNull(auth, "expected parameter 'auth' to be non-null");
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
    }

    private IstioConfigResponse() {
        this.auth = null;
        this.disabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IstioConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String auth;
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(IstioConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.disabled = defaults.disabled;
        }

        public Builder auth(String auth) {
            this.auth = Objects.requireNonNull(auth);
            return this;
        }
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }        public IstioConfigResponse build() {
            return new IstioConfigResponse(auth, disabled);
        }
    }
}
