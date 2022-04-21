// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.OpenAuthenticationProviderType;
import com.pulumi.azurenative.logic.inputs.OpenAuthenticationPolicyClaimArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Open authentication access policy defined by user.
 * 
 */
public final class OpenAuthenticationAccessPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenAuthenticationAccessPolicyArgs Empty = new OpenAuthenticationAccessPolicyArgs();

    /**
     * The access policy claims.
     * 
     */
    @Import(name="claims")
    private @Nullable Output<List<OpenAuthenticationPolicyClaimArgs>> claims;

    public Optional<Output<List<OpenAuthenticationPolicyClaimArgs>>> claims() {
        return Optional.ofNullable(this.claims);
    }

    /**
     * Type of provider for OAuth.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,OpenAuthenticationProviderType>> type;

    public Optional<Output<Either<String,OpenAuthenticationProviderType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private OpenAuthenticationAccessPolicyArgs() {}

    private OpenAuthenticationAccessPolicyArgs(OpenAuthenticationAccessPolicyArgs $) {
        this.claims = $.claims;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenAuthenticationAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenAuthenticationAccessPolicyArgs $;

        public Builder() {
            $ = new OpenAuthenticationAccessPolicyArgs();
        }

        public Builder(OpenAuthenticationAccessPolicyArgs defaults) {
            $ = new OpenAuthenticationAccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder claims(@Nullable Output<List<OpenAuthenticationPolicyClaimArgs>> claims) {
            $.claims = claims;
            return this;
        }

        public Builder claims(List<OpenAuthenticationPolicyClaimArgs> claims) {
            return claims(Output.of(claims));
        }

        public Builder claims(OpenAuthenticationPolicyClaimArgs... claims) {
            return claims(List.of(claims));
        }

        public Builder type(@Nullable Output<Either<String,OpenAuthenticationProviderType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,OpenAuthenticationProviderType> type) {
            return type(Output.of(type));
        }

        public OpenAuthenticationAccessPolicyArgs build() {
            return $;
        }
    }

}
