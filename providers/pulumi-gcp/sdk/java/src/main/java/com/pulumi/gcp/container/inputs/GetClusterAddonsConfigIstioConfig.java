// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetClusterAddonsConfigIstioConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterAddonsConfigIstioConfig Empty = new GetClusterAddonsConfigIstioConfig();

    @Import(name="auth", required=true)
      private final String auth;

    public String auth() {
        return this.auth;
    }

    @Import(name="disabled", required=true)
      private final Boolean disabled;

    public Boolean disabled() {
        return this.disabled;
    }

    public GetClusterAddonsConfigIstioConfig(
        String auth,
        Boolean disabled) {
        this.auth = Objects.requireNonNull(auth, "expected parameter 'auth' to be non-null");
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
    }

    private GetClusterAddonsConfigIstioConfig() {
        this.auth = null;
        this.disabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAddonsConfigIstioConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String auth;
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterAddonsConfigIstioConfig defaults) {
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
        }        public GetClusterAddonsConfigIstioConfig build() {
            return new GetClusterAddonsConfigIstioConfig(auth, disabled);
        }
    }
}
