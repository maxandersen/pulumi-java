// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicKeyArgs Empty = new GetPublicKeyArgs();

    /**
     * List of grant tokens
     * 
     */
    @Import(name="grantTokens")
      private final @Nullable List<String> grantTokens;

    public List<String> grantTokens() {
        return this.grantTokens == null ? List.of() : this.grantTokens;
    }

    /**
     * Key identifier which can be one of the following format:
     * * Key ID. E.g - `1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key ARN. E.g. - `arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Alias name. E.g. - `alias/my-key`
     * * Alias ARN - E.g. - `arn:aws:kms:us-east-1:111122223333:alias/my-key`
     * 
     */
    @Import(name="keyId", required=true)
      private final String keyId;

    public String keyId() {
        return this.keyId;
    }

    public GetPublicKeyArgs(
        @Nullable List<String> grantTokens,
        String keyId) {
        this.grantTokens = grantTokens;
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
    }

    private GetPublicKeyArgs() {
        this.grantTokens = List.of();
        this.keyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> grantTokens;
        private String keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grantTokens = defaults.grantTokens;
    	      this.keyId = defaults.keyId;
        }

        public Builder grantTokens(@Nullable List<String> grantTokens) {
            this.grantTokens = grantTokens;
            return this;
        }
        public Builder grantTokens(String... grantTokens) {
            return grantTokens(List.of(grantTokens));
        }
        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }        public GetPublicKeyArgs build() {
            return new GetPublicKeyArgs(grantTokens, keyId);
        }
    }
}
