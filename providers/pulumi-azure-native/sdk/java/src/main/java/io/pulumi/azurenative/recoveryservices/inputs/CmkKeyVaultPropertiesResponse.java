// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the Key Vault which hosts CMK
 * 
 */
public final class CmkKeyVaultPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final CmkKeyVaultPropertiesResponse Empty = new CmkKeyVaultPropertiesResponse();

    /**
     * The key uri of the Customer Managed Key
     * 
     */
    @Import(name="keyUri")
      private final @Nullable String keyUri;

    public Optional<String> keyUri() {
        return this.keyUri == null ? Optional.empty() : Optional.ofNullable(this.keyUri);
    }

    public CmkKeyVaultPropertiesResponse(@Nullable String keyUri) {
        this.keyUri = keyUri;
    }

    private CmkKeyVaultPropertiesResponse() {
        this.keyUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CmkKeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyUri;

        public Builder() {
    	      // Empty
        }

        public Builder(CmkKeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUri = defaults.keyUri;
        }

        public Builder keyUri(@Nullable String keyUri) {
            this.keyUri = keyUri;
            return this;
        }        public CmkKeyVaultPropertiesResponse build() {
            return new CmkKeyVaultPropertiesResponse(keyUri);
        }
    }
}
