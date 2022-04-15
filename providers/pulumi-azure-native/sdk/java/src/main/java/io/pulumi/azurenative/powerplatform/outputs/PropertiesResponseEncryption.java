// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.outputs;

import io.pulumi.azurenative.powerplatform.outputs.KeyVaultPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PropertiesResponseEncryption {
    /**
     * Key vault properties.
     * 
     */
    private final @Nullable KeyVaultPropertiesResponse keyVault;
    /**
     * The state of onboarding, which only appears in the response.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private PropertiesResponseEncryption(
        @CustomType.Parameter("keyVault") @Nullable KeyVaultPropertiesResponse keyVault,
        @CustomType.Parameter("state") @Nullable String state) {
        this.keyVault = keyVault;
        this.state = state;
    }

    /**
     * Key vault properties.
     * 
    */
    public Optional<KeyVaultPropertiesResponse> keyVault() {
        return Optional.ofNullable(this.keyVault);
    }
    /**
     * The state of onboarding, which only appears in the response.
     * 
    */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropertiesResponseEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyVaultPropertiesResponse keyVault;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(PropertiesResponseEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVault = defaults.keyVault;
    	      this.state = defaults.state;
        }

        public Builder keyVault(@Nullable KeyVaultPropertiesResponse keyVault) {
            this.keyVault = keyVault;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public PropertiesResponseEncryption build() {
            return new PropertiesResponseEncryption(keyVault, state);
        }
    }
}
