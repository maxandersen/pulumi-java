// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details of the data lake storage account associated with the workspace
 * 
 */
public final class DataLakeStorageAccountDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataLakeStorageAccountDetailsArgs Empty = new DataLakeStorageAccountDetailsArgs();

    /**
     * Account URL
     * 
     */
    @Import(name="accountUrl")
      private final @Nullable Output<String> accountUrl;

    public Output<String> accountUrl() {
        return this.accountUrl == null ? Codegen.empty() : this.accountUrl;
    }

    /**
     * Filesystem name
     * 
     */
    @Import(name="filesystem")
      private final @Nullable Output<String> filesystem;

    public Output<String> filesystem() {
        return this.filesystem == null ? Codegen.empty() : this.filesystem;
    }

    public DataLakeStorageAccountDetailsArgs(
        @Nullable Output<String> accountUrl,
        @Nullable Output<String> filesystem) {
        this.accountUrl = accountUrl;
        this.filesystem = filesystem;
    }

    private DataLakeStorageAccountDetailsArgs() {
        this.accountUrl = Codegen.empty();
        this.filesystem = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeStorageAccountDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountUrl;
        private @Nullable Output<String> filesystem;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeStorageAccountDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountUrl = defaults.accountUrl;
    	      this.filesystem = defaults.filesystem;
        }

        public Builder accountUrl(@Nullable Output<String> accountUrl) {
            this.accountUrl = accountUrl;
            return this;
        }
        public Builder accountUrl(@Nullable String accountUrl) {
            this.accountUrl = Codegen.ofNullable(accountUrl);
            return this;
        }
        public Builder filesystem(@Nullable Output<String> filesystem) {
            this.filesystem = filesystem;
            return this;
        }
        public Builder filesystem(@Nullable String filesystem) {
            this.filesystem = Codegen.ofNullable(filesystem);
            return this;
        }        public DataLakeStorageAccountDetailsArgs build() {
            return new DataLakeStorageAccountDetailsArgs(accountUrl, filesystem);
        }
    }
}
