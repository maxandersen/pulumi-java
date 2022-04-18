// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.StorageAccountType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The storage account details.
 * 
 */
public final class StorageAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageAccountArgs Empty = new StorageAccountArgs();

    /**
     * The ID of the storage account resource. Media Services relies on tables and queues as well as blobs, so the primary storage account must be a Standard Storage account (either Microsoft.ClassicStorage or Microsoft.Storage). Blob only storage accounts can be added as secondary storage accounts.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The type of the storage account.
     * 
     */
    @Import(name="type", required=true)
      private final Output<Either<String,StorageAccountType>> type;

    public Output<Either<String,StorageAccountType>> type() {
        return this.type;
    }

    public StorageAccountArgs(
        @Nullable Output<String> id,
        Output<Either<String,StorageAccountType>> type) {
        this.id = id;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private StorageAccountArgs() {
        this.id = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private Output<Either<String,StorageAccountType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder type(Output<Either<String,StorageAccountType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(Either<String,StorageAccountType> type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public StorageAccountArgs build() {
            return new StorageAccountArgs(id, type);
        }
    }
}
