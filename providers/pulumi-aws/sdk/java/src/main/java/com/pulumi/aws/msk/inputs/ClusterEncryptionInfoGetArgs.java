// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.inputs;

import com.pulumi.aws.msk.inputs.ClusterEncryptionInfoEncryptionInTransitGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterEncryptionInfoGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEncryptionInfoGetArgs Empty = new ClusterEncryptionInfoGetArgs();

    /**
     * You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS (&#39;aws/msk&#39; managed service) key will be used for encrypting the data at rest.
     * 
     */
    @Import(name="encryptionAtRestKmsKeyArn")
      private final @Nullable Output<String> encryptionAtRestKmsKeyArn;

    public Output<String> encryptionAtRestKmsKeyArn() {
        return this.encryptionAtRestKmsKeyArn == null ? Codegen.empty() : this.encryptionAtRestKmsKeyArn;
    }

    /**
     * Configuration block to specify encryption in transit. See below.
     * 
     */
    @Import(name="encryptionInTransit")
      private final @Nullable Output<ClusterEncryptionInfoEncryptionInTransitGetArgs> encryptionInTransit;

    public Output<ClusterEncryptionInfoEncryptionInTransitGetArgs> encryptionInTransit() {
        return this.encryptionInTransit == null ? Codegen.empty() : this.encryptionInTransit;
    }

    public ClusterEncryptionInfoGetArgs(
        @Nullable Output<String> encryptionAtRestKmsKeyArn,
        @Nullable Output<ClusterEncryptionInfoEncryptionInTransitGetArgs> encryptionInTransit) {
        this.encryptionAtRestKmsKeyArn = encryptionAtRestKmsKeyArn;
        this.encryptionInTransit = encryptionInTransit;
    }

    private ClusterEncryptionInfoGetArgs() {
        this.encryptionAtRestKmsKeyArn = Codegen.empty();
        this.encryptionInTransit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEncryptionInfoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> encryptionAtRestKmsKeyArn;
        private @Nullable Output<ClusterEncryptionInfoEncryptionInTransitGetArgs> encryptionInTransit;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEncryptionInfoGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAtRestKmsKeyArn = defaults.encryptionAtRestKmsKeyArn;
    	      this.encryptionInTransit = defaults.encryptionInTransit;
        }

        public Builder encryptionAtRestKmsKeyArn(@Nullable Output<String> encryptionAtRestKmsKeyArn) {
            this.encryptionAtRestKmsKeyArn = encryptionAtRestKmsKeyArn;
            return this;
        }
        public Builder encryptionAtRestKmsKeyArn(@Nullable String encryptionAtRestKmsKeyArn) {
            this.encryptionAtRestKmsKeyArn = Codegen.ofNullable(encryptionAtRestKmsKeyArn);
            return this;
        }
        public Builder encryptionInTransit(@Nullable Output<ClusterEncryptionInfoEncryptionInTransitGetArgs> encryptionInTransit) {
            this.encryptionInTransit = encryptionInTransit;
            return this;
        }
        public Builder encryptionInTransit(@Nullable ClusterEncryptionInfoEncryptionInTransitGetArgs encryptionInTransit) {
            this.encryptionInTransit = Codegen.ofNullable(encryptionInTransit);
            return this;
        }        public ClusterEncryptionInfoGetArgs build() {
            return new ClusterEncryptionInfoGetArgs(encryptionAtRestKmsKeyArn, encryptionInTransit);
        }
    }
}
