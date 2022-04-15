// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListSubscriptionSecretsResult {
    /**
     * Subscription primary key.
     * 
     */
    private final @Nullable String primaryKey;
    /**
     * Subscription secondary key.
     * 
     */
    private final @Nullable String secondaryKey;

    @CustomType.Constructor
    private ListSubscriptionSecretsResult(
        @CustomType.Parameter("primaryKey") @Nullable String primaryKey,
        @CustomType.Parameter("secondaryKey") @Nullable String secondaryKey) {
        this.primaryKey = primaryKey;
        this.secondaryKey = secondaryKey;
    }

    /**
     * Subscription primary key.
     * 
    */
    public Optional<String> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }
    /**
     * Subscription secondary key.
     * 
    */
    public Optional<String> secondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSubscriptionSecretsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String primaryKey;
        private @Nullable String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSubscriptionSecretsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Builder secondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }        public ListSubscriptionSecretsResult build() {
            return new ListSubscriptionSecretsResult(primaryKey, secondaryKey);
        }
    }
}
