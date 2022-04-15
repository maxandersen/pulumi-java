// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cosmos DB MongoDB collection index options
 * 
 */
public final class MongoIndexOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final MongoIndexOptionsResponse Empty = new MongoIndexOptionsResponse();

    /**
     * Expire after seconds
     * 
     */
    @Import(name="expireAfterSeconds")
      private final @Nullable Integer expireAfterSeconds;

    public Optional<Integer> expireAfterSeconds() {
        return this.expireAfterSeconds == null ? Optional.empty() : Optional.ofNullable(this.expireAfterSeconds);
    }

    /**
     * Is unique or not
     * 
     */
    @Import(name="unique")
      private final @Nullable Boolean unique;

    public Optional<Boolean> unique() {
        return this.unique == null ? Optional.empty() : Optional.ofNullable(this.unique);
    }

    public MongoIndexOptionsResponse(
        @Nullable Integer expireAfterSeconds,
        @Nullable Boolean unique) {
        this.expireAfterSeconds = expireAfterSeconds;
        this.unique = unique;
    }

    private MongoIndexOptionsResponse() {
        this.expireAfterSeconds = null;
        this.unique = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoIndexOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer expireAfterSeconds;
        private @Nullable Boolean unique;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoIndexOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireAfterSeconds = defaults.expireAfterSeconds;
    	      this.unique = defaults.unique;
        }

        public Builder expireAfterSeconds(@Nullable Integer expireAfterSeconds) {
            this.expireAfterSeconds = expireAfterSeconds;
            return this;
        }
        public Builder unique(@Nullable Boolean unique) {
            this.unique = unique;
            return this;
        }        public MongoIndexOptionsResponse build() {
            return new MongoIndexOptionsResponse(expireAfterSeconds, unique);
        }
    }
}
