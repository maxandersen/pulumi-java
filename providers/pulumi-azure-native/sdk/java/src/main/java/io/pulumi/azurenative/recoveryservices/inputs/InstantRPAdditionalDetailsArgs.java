// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstantRPAdditionalDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstantRPAdditionalDetailsArgs Empty = new InstantRPAdditionalDetailsArgs();

    @Import(name="azureBackupRGNamePrefix")
      private final @Nullable Output<String> azureBackupRGNamePrefix;

    public Output<String> azureBackupRGNamePrefix() {
        return this.azureBackupRGNamePrefix == null ? Codegen.empty() : this.azureBackupRGNamePrefix;
    }

    @Import(name="azureBackupRGNameSuffix")
      private final @Nullable Output<String> azureBackupRGNameSuffix;

    public Output<String> azureBackupRGNameSuffix() {
        return this.azureBackupRGNameSuffix == null ? Codegen.empty() : this.azureBackupRGNameSuffix;
    }

    public InstantRPAdditionalDetailsArgs(
        @Nullable Output<String> azureBackupRGNamePrefix,
        @Nullable Output<String> azureBackupRGNameSuffix) {
        this.azureBackupRGNamePrefix = azureBackupRGNamePrefix;
        this.azureBackupRGNameSuffix = azureBackupRGNameSuffix;
    }

    private InstantRPAdditionalDetailsArgs() {
        this.azureBackupRGNamePrefix = Codegen.empty();
        this.azureBackupRGNameSuffix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstantRPAdditionalDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> azureBackupRGNamePrefix;
        private @Nullable Output<String> azureBackupRGNameSuffix;

        public Builder() {
    	      // Empty
        }

        public Builder(InstantRPAdditionalDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBackupRGNamePrefix = defaults.azureBackupRGNamePrefix;
    	      this.azureBackupRGNameSuffix = defaults.azureBackupRGNameSuffix;
        }

        public Builder azureBackupRGNamePrefix(@Nullable Output<String> azureBackupRGNamePrefix) {
            this.azureBackupRGNamePrefix = azureBackupRGNamePrefix;
            return this;
        }
        public Builder azureBackupRGNamePrefix(@Nullable String azureBackupRGNamePrefix) {
            this.azureBackupRGNamePrefix = Codegen.ofNullable(azureBackupRGNamePrefix);
            return this;
        }
        public Builder azureBackupRGNameSuffix(@Nullable Output<String> azureBackupRGNameSuffix) {
            this.azureBackupRGNameSuffix = azureBackupRGNameSuffix;
            return this;
        }
        public Builder azureBackupRGNameSuffix(@Nullable String azureBackupRGNameSuffix) {
            this.azureBackupRGNameSuffix = Codegen.ofNullable(azureBackupRGNameSuffix);
            return this;
        }        public InstantRPAdditionalDetailsArgs build() {
            return new InstantRPAdditionalDetailsArgs(azureBackupRGNamePrefix, azureBackupRGNameSuffix);
        }
    }
}
