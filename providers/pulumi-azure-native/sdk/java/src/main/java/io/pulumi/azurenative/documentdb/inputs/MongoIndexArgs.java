// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.MongoIndexKeysArgs;
import io.pulumi.azurenative.documentdb.inputs.MongoIndexOptionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB MongoDB collection index key
 * 
 */
public final class MongoIndexArgs extends io.pulumi.resources.ResourceArgs {

    public static final MongoIndexArgs Empty = new MongoIndexArgs();

    /**
     * Cosmos DB MongoDB collection index keys
     * 
     */
    @Import(name="key")
      private final @Nullable Output<MongoIndexKeysArgs> key;

    public Output<MongoIndexKeysArgs> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * Cosmos DB MongoDB collection index key options
     * 
     */
    @Import(name="options")
      private final @Nullable Output<MongoIndexOptionsArgs> options;

    public Output<MongoIndexOptionsArgs> options() {
        return this.options == null ? Codegen.empty() : this.options;
    }

    public MongoIndexArgs(
        @Nullable Output<MongoIndexKeysArgs> key,
        @Nullable Output<MongoIndexOptionsArgs> options) {
        this.key = key;
        this.options = options;
    }

    private MongoIndexArgs() {
        this.key = Codegen.empty();
        this.options = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoIndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MongoIndexKeysArgs> key;
        private @Nullable Output<MongoIndexOptionsArgs> options;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoIndexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.options = defaults.options;
        }

        public Builder key(@Nullable Output<MongoIndexKeysArgs> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable MongoIndexKeysArgs key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder options(@Nullable Output<MongoIndexOptionsArgs> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable MongoIndexOptionsArgs options) {
            this.options = Codegen.ofNullable(options);
            return this;
        }        public MongoIndexArgs build() {
            return new MongoIndexArgs(key, options);
        }
    }
}
