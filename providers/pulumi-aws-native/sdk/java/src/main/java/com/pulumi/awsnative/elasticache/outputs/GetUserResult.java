// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticache.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUserResult {
    /**
     * The Amazon Resource Name (ARN) of the user account.
     * 
     */
    private final @Nullable String arn;
    /**
     * Indicates the user status. Can be &#34;active&#34;, &#34;modifying&#34; or &#34;deleting&#34;.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private GetUserResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("status") @Nullable String status) {
        this.arn = arn;
        this.status = status;
    }

    /**
     * The Amazon Resource Name (ARN) of the user account.
     * 
    */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Indicates the user status. Can be &#34;active&#34;, &#34;modifying&#34; or &#34;deleting&#34;.
     * 
    */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.status = defaults.status;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetUserResult build() {
            return new GetUserResult(arn, status);
        }
    }
}
