// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1.inputs.IdentityConfigResponse;
import com.pulumi.googlenative.dataproc_v1.inputs.KerberosConfigResponse;
import java.util.Objects;


/**
 * Security related configuration, including encryption, Kerberos, etc.
 * 
 */
public final class SecurityConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final SecurityConfigResponse Empty = new SecurityConfigResponse();

    /**
     * Optional. Identity related configuration, including service account based secure multi-tenancy user mappings.
     * 
     */
    @Import(name="identityConfig", required=true)
      private final IdentityConfigResponse identityConfig;

    public IdentityConfigResponse identityConfig() {
        return this.identityConfig;
    }

    /**
     * Optional. Kerberos related configuration.
     * 
     */
    @Import(name="kerberosConfig", required=true)
      private final KerberosConfigResponse kerberosConfig;

    public KerberosConfigResponse kerberosConfig() {
        return this.kerberosConfig;
    }

    public SecurityConfigResponse(
        IdentityConfigResponse identityConfig,
        KerberosConfigResponse kerberosConfig) {
        this.identityConfig = Objects.requireNonNull(identityConfig, "expected parameter 'identityConfig' to be non-null");
        this.kerberosConfig = Objects.requireNonNull(kerberosConfig, "expected parameter 'kerberosConfig' to be non-null");
    }

    private SecurityConfigResponse() {
        this.identityConfig = null;
        this.kerberosConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityConfigResponse identityConfig;
        private KerberosConfigResponse kerberosConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityConfig = defaults.identityConfig;
    	      this.kerberosConfig = defaults.kerberosConfig;
        }

        public Builder identityConfig(IdentityConfigResponse identityConfig) {
            this.identityConfig = Objects.requireNonNull(identityConfig);
            return this;
        }
        public Builder kerberosConfig(KerberosConfigResponse kerberosConfig) {
            this.kerberosConfig = Objects.requireNonNull(kerberosConfig);
            return this;
        }        public SecurityConfigResponse build() {
            return new SecurityConfigResponse(identityConfig, kerberosConfig);
        }
    }
}
