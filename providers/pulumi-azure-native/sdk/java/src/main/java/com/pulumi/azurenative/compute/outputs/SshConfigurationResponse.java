// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.SshPublicKeyResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SshConfigurationResponse {
    /**
     * The list of SSH public keys used to authenticate with linux based VMs.
     * 
     */
    private final @Nullable List<SshPublicKeyResponse> publicKeys;

    @CustomType.Constructor
    private SshConfigurationResponse(@CustomType.Parameter("publicKeys") @Nullable List<SshPublicKeyResponse> publicKeys) {
        this.publicKeys = publicKeys;
    }

    /**
     * The list of SSH public keys used to authenticate with linux based VMs.
     * 
    */
    public List<SshPublicKeyResponse> publicKeys() {
        return this.publicKeys == null ? List.of() : this.publicKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SshPublicKeyResponse> publicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(SshConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeys = defaults.publicKeys;
        }

        public Builder publicKeys(@Nullable List<SshPublicKeyResponse> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }
        public Builder publicKeys(SshPublicKeyResponse... publicKeys) {
            return publicKeys(List.of(publicKeys));
        }        public SshConfigurationResponse build() {
            return new SshConfigurationResponse(publicKeys);
        }
    }
}
