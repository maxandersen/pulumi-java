// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.outputs;

import com.pulumi.awsnative.lambda.outputs.CodeSigningConfigAllowedPublishers;
import com.pulumi.awsnative.lambda.outputs.CodeSigningConfigCodeSigningPolicies;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCodeSigningConfigResult {
    /**
     * When the CodeSigningConfig is later on attached to a function, the function code will be expected to be signed by profiles from this list
     * 
     */
    private final @Nullable CodeSigningConfigAllowedPublishers allowedPublishers;
    /**
     * A unique Arn for CodeSigningConfig resource
     * 
     */
    private final @Nullable String codeSigningConfigArn;
    /**
     * A unique identifier for CodeSigningConfig resource
     * 
     */
    private final @Nullable String codeSigningConfigId;
    /**
     * Policies to control how to act if a signature is invalid
     * 
     */
    private final @Nullable CodeSigningConfigCodeSigningPolicies codeSigningPolicies;
    /**
     * A description of the CodeSigningConfig
     * 
     */
    private final @Nullable String description;

    @CustomType.Constructor
    private GetCodeSigningConfigResult(
        @CustomType.Parameter("allowedPublishers") @Nullable CodeSigningConfigAllowedPublishers allowedPublishers,
        @CustomType.Parameter("codeSigningConfigArn") @Nullable String codeSigningConfigArn,
        @CustomType.Parameter("codeSigningConfigId") @Nullable String codeSigningConfigId,
        @CustomType.Parameter("codeSigningPolicies") @Nullable CodeSigningConfigCodeSigningPolicies codeSigningPolicies,
        @CustomType.Parameter("description") @Nullable String description) {
        this.allowedPublishers = allowedPublishers;
        this.codeSigningConfigArn = codeSigningConfigArn;
        this.codeSigningConfigId = codeSigningConfigId;
        this.codeSigningPolicies = codeSigningPolicies;
        this.description = description;
    }

    /**
     * When the CodeSigningConfig is later on attached to a function, the function code will be expected to be signed by profiles from this list
     * 
    */
    public Optional<CodeSigningConfigAllowedPublishers> allowedPublishers() {
        return Optional.ofNullable(this.allowedPublishers);
    }
    /**
     * A unique Arn for CodeSigningConfig resource
     * 
    */
    public Optional<String> codeSigningConfigArn() {
        return Optional.ofNullable(this.codeSigningConfigArn);
    }
    /**
     * A unique identifier for CodeSigningConfig resource
     * 
    */
    public Optional<String> codeSigningConfigId() {
        return Optional.ofNullable(this.codeSigningConfigId);
    }
    /**
     * Policies to control how to act if a signature is invalid
     * 
    */
    public Optional<CodeSigningConfigCodeSigningPolicies> codeSigningPolicies() {
        return Optional.ofNullable(this.codeSigningPolicies);
    }
    /**
     * A description of the CodeSigningConfig
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCodeSigningConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CodeSigningConfigAllowedPublishers allowedPublishers;
        private @Nullable String codeSigningConfigArn;
        private @Nullable String codeSigningConfigId;
        private @Nullable CodeSigningConfigCodeSigningPolicies codeSigningPolicies;
        private @Nullable String description;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCodeSigningConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedPublishers = defaults.allowedPublishers;
    	      this.codeSigningConfigArn = defaults.codeSigningConfigArn;
    	      this.codeSigningConfigId = defaults.codeSigningConfigId;
    	      this.codeSigningPolicies = defaults.codeSigningPolicies;
    	      this.description = defaults.description;
        }

        public Builder allowedPublishers(@Nullable CodeSigningConfigAllowedPublishers allowedPublishers) {
            this.allowedPublishers = allowedPublishers;
            return this;
        }
        public Builder codeSigningConfigArn(@Nullable String codeSigningConfigArn) {
            this.codeSigningConfigArn = codeSigningConfigArn;
            return this;
        }
        public Builder codeSigningConfigId(@Nullable String codeSigningConfigId) {
            this.codeSigningConfigId = codeSigningConfigId;
            return this;
        }
        public Builder codeSigningPolicies(@Nullable CodeSigningConfigCodeSigningPolicies codeSigningPolicies) {
            this.codeSigningPolicies = codeSigningPolicies;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }        public GetCodeSigningConfigResult build() {
            return new GetCodeSigningConfigResult(allowedPublishers, codeSigningConfigArn, codeSigningConfigId, codeSigningPolicies, description);
        }
    }
}
