// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretReplicaGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretReplicaGetArgs Empty = new SecretReplicaGetArgs();

    /**
     * ARN, Key ID, or Alias of the AWS KMS key within the region secret is replicated to. If one is not specified, then Secrets Manager defaults to using the AWS account&#39;s default KMS key (`aws/secretsmanager`) in the region or creates one for use if non-existent.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> kmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    /**
     * Date that you last accessed the secret in the Region.
     * 
     */
    @Import(name="lastAccessedDate")
      private final @Nullable Output<String> lastAccessedDate;

    public Output<String> lastAccessedDate() {
        return this.lastAccessedDate == null ? Codegen.empty() : this.lastAccessedDate;
    }

    /**
     * Region for replicating the secret.
     * 
     */
    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    /**
     * Status can be `InProgress`, `Failed`, or `InSync`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * Message such as `Replication succeeded` or `Secret with this name already exists in this region`.
     * 
     */
    @Import(name="statusMessage")
      private final @Nullable Output<String> statusMessage;

    public Output<String> statusMessage() {
        return this.statusMessage == null ? Codegen.empty() : this.statusMessage;
    }

    public SecretReplicaGetArgs(
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> lastAccessedDate,
        Output<String> region,
        @Nullable Output<String> status,
        @Nullable Output<String> statusMessage) {
        this.kmsKeyId = kmsKeyId;
        this.lastAccessedDate = lastAccessedDate;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.status = status;
        this.statusMessage = statusMessage;
    }

    private SecretReplicaGetArgs() {
        this.kmsKeyId = Codegen.empty();
        this.lastAccessedDate = Codegen.empty();
        this.region = Codegen.empty();
        this.status = Codegen.empty();
        this.statusMessage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretReplicaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> lastAccessedDate;
        private Output<String> region;
        private @Nullable Output<String> status;
        private @Nullable Output<String> statusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretReplicaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.lastAccessedDate = defaults.lastAccessedDate;
    	      this.region = defaults.region;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }
        public Builder lastAccessedDate(@Nullable Output<String> lastAccessedDate) {
            this.lastAccessedDate = lastAccessedDate;
            return this;
        }
        public Builder lastAccessedDate(@Nullable String lastAccessedDate) {
            this.lastAccessedDate = Codegen.ofNullable(lastAccessedDate);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder statusMessage(@Nullable Output<String> statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public Builder statusMessage(@Nullable String statusMessage) {
            this.statusMessage = Codegen.ofNullable(statusMessage);
            return this;
        }        public SecretReplicaGetArgs build() {
            return new SecretReplicaGetArgs(kmsKeyId, lastAccessedDate, region, status, statusMessage);
        }
    }
}
