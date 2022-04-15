// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.inputs.SshPublicKeyResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The list of SSH public keys.
 * 
 */
public final class SshProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final SshProfileResponse Empty = new SshProfileResponse();

    /**
     * The list of SSH public keys.
     * 
     */
    @Import(name="publicKeys")
      private final @Nullable List<SshPublicKeyResponse> publicKeys;

    public List<SshPublicKeyResponse> publicKeys() {
        return this.publicKeys == null ? List.of() : this.publicKeys;
    }

    public SshProfileResponse(@Nullable List<SshPublicKeyResponse> publicKeys) {
        this.publicKeys = publicKeys;
    }

    private SshProfileResponse() {
        this.publicKeys = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SshPublicKeyResponse> publicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(SshProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeys = defaults.publicKeys;
        }

        public Builder publicKeys(@Nullable List<SshPublicKeyResponse> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }
        public Builder publicKeys(SshPublicKeyResponse... publicKeys) {
            return publicKeys(List.of(publicKeys));
        }        public SshProfileResponse build() {
            return new SshProfileResponse(publicKeys);
        }
    }
}
