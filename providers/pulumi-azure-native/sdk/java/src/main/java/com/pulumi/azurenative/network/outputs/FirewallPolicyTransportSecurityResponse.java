// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.FirewallPolicyCertificateAuthorityResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallPolicyTransportSecurityResponse {
    /**
     * The CA used for intermediate CA generation.
     * 
     */
    private final @Nullable FirewallPolicyCertificateAuthorityResponse certificateAuthority;

    @CustomType.Constructor
    private FirewallPolicyTransportSecurityResponse(@CustomType.Parameter("certificateAuthority") @Nullable FirewallPolicyCertificateAuthorityResponse certificateAuthority) {
        this.certificateAuthority = certificateAuthority;
    }

    /**
     * The CA used for intermediate CA generation.
     * 
    */
    public Optional<FirewallPolicyCertificateAuthorityResponse> certificateAuthority() {
        return Optional.ofNullable(this.certificateAuthority);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyTransportSecurityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirewallPolicyCertificateAuthorityResponse certificateAuthority;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyTransportSecurityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
        }

        public Builder certificateAuthority(@Nullable FirewallPolicyCertificateAuthorityResponse certificateAuthority) {
            this.certificateAuthority = certificateAuthority;
            return this;
        }        public FirewallPolicyTransportSecurityResponse build() {
            return new FirewallPolicyTransportSecurityResponse(certificateAuthority);
        }
    }
}
