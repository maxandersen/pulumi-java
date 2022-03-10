// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IstioConfigResponse {
    /**
     * The specified Istio auth mode, either none, or mutual TLS.
     * 
     */
    private final String auth;
    /**
     * Whether Istio is enabled for this cluster.
     * 
     */
    private final Boolean disabled;

    @OutputCustomType.Constructor
    private IstioConfigResponse(
        @OutputCustomType.Parameter("auth") String auth,
        @OutputCustomType.Parameter("disabled") Boolean disabled) {
        this.auth = auth;
        this.disabled = disabled;
    }

    /**
     * The specified Istio auth mode, either none, or mutual TLS.
     * 
    */
    public String getAuth() {
        return this.auth;
    }
    /**
     * Whether Istio is enabled for this cluster.
     * 
    */
    public Boolean getDisabled() {
        return this.disabled;
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

        public Builder setAuth(String auth) {
            this.auth = Objects.requireNonNull(auth);
            return this;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public IstioConfigResponse build() {
            return new IstioConfigResponse(auth, disabled);
        }
    }
}
