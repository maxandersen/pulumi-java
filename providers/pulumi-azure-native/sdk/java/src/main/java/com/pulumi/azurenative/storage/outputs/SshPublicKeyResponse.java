// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SshPublicKeyResponse {
    /**
     * @return Optional. It is used to store the function/usage of the key
     * 
     */
    private final @Nullable String description;
    /**
     * @return Ssh public key base64 encoded. The format should be: &#39;&lt;keyType&gt; &lt;keyData&gt;&#39;, e.g. ssh-rsa AAAABBBB
     * 
     */
    private final @Nullable String key;

    @CustomType.Constructor
    private SshPublicKeyResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("key") @Nullable String key) {
        this.description = description;
        this.key = key;
    }

    /**
     * @return Optional. It is used to store the function/usage of the key
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Ssh public key base64 encoded. The format should be: &#39;&lt;keyType&gt; &lt;keyData&gt;&#39;, e.g. ssh-rsa AAAABBBB
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshPublicKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(SshPublicKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.key = defaults.key;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }        public SshPublicKeyResponse build() {
            return new SshPublicKeyResponse(description, key);
        }
    }
}
