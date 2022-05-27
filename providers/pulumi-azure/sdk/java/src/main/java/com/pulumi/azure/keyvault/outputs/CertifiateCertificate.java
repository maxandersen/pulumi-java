// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertifiateCertificate {
    /**
     * @return The base64-encoded certificate contents. Changing this forces a new resource to be created.
     * 
     */
    private final String contents;
    /**
     * @return The password associated with the certificate. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String password;

    @CustomType.Constructor
    private CertifiateCertificate(
        @CustomType.Parameter("contents") String contents,
        @CustomType.Parameter("password") @Nullable String password) {
        this.contents = contents;
        this.password = password;
    }

    /**
     * @return The base64-encoded certificate contents. Changing this forces a new resource to be created.
     * 
     */
    public String contents() {
        return this.contents;
    }
    /**
     * @return The password associated with the certificate. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertifiateCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contents;
        private @Nullable String password;

        public Builder() {
    	      // Empty
        }

        public Builder(CertifiateCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contents = defaults.contents;
    	      this.password = defaults.password;
        }

        public Builder contents(String contents) {
            this.contents = Objects.requireNonNull(contents);
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }        public CertifiateCertificate build() {
            return new CertifiateCertificate(contents, password);
        }
    }
}
