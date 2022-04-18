// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Execution configuration for a workload.
 * 
 */
public final class ExecutionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExecutionConfigArgs Empty = new ExecutionConfigArgs();

    /**
     * Optional. The Cloud KMS key to use for encryption.
     * 
     */
    @Import(name="kmsKey")
      private final @Nullable Output<String> kmsKey;

    public Output<String> kmsKey() {
        return this.kmsKey == null ? Codegen.empty() : this.kmsKey;
    }

    /**
     * Optional. Tags used for network traffic control.
     * 
     */
    @Import(name="networkTags")
      private final @Nullable Output<List<String>> networkTags;

    public Output<List<String>> networkTags() {
        return this.networkTags == null ? Codegen.empty() : this.networkTags;
    }

    /**
     * Optional. Network URI to connect workload to.
     * 
     */
    @Import(name="networkUri")
      private final @Nullable Output<String> networkUri;

    public Output<String> networkUri() {
        return this.networkUri == null ? Codegen.empty() : this.networkUri;
    }

    /**
     * Optional. Service account that used to execute workload.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> serviceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    /**
     * Optional. Subnetwork URI to connect workload to.
     * 
     */
    @Import(name="subnetworkUri")
      private final @Nullable Output<String> subnetworkUri;

    public Output<String> subnetworkUri() {
        return this.subnetworkUri == null ? Codegen.empty() : this.subnetworkUri;
    }

    public ExecutionConfigArgs(
        @Nullable Output<String> kmsKey,
        @Nullable Output<List<String>> networkTags,
        @Nullable Output<String> networkUri,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<String> subnetworkUri) {
        this.kmsKey = kmsKey;
        this.networkTags = networkTags;
        this.networkUri = networkUri;
        this.serviceAccount = serviceAccount;
        this.subnetworkUri = subnetworkUri;
    }

    private ExecutionConfigArgs() {
        this.kmsKey = Codegen.empty();
        this.networkTags = Codegen.empty();
        this.networkUri = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.subnetworkUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKey;
        private @Nullable Output<List<String>> networkTags;
        private @Nullable Output<String> networkUri;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<String> subnetworkUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
    	      this.networkTags = defaults.networkTags;
    	      this.networkUri = defaults.networkUri;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.subnetworkUri = defaults.subnetworkUri;
        }

        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = Codegen.ofNullable(kmsKey);
            return this;
        }
        public Builder networkTags(@Nullable Output<List<String>> networkTags) {
            this.networkTags = networkTags;
            return this;
        }
        public Builder networkTags(@Nullable List<String> networkTags) {
            this.networkTags = Codegen.ofNullable(networkTags);
            return this;
        }
        public Builder networkTags(String... networkTags) {
            return networkTags(List.of(networkTags));
        }
        public Builder networkUri(@Nullable Output<String> networkUri) {
            this.networkUri = networkUri;
            return this;
        }
        public Builder networkUri(@Nullable String networkUri) {
            this.networkUri = Codegen.ofNullable(networkUri);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder subnetworkUri(@Nullable Output<String> subnetworkUri) {
            this.subnetworkUri = subnetworkUri;
            return this;
        }
        public Builder subnetworkUri(@Nullable String subnetworkUri) {
            this.subnetworkUri = Codegen.ofNullable(subnetworkUri);
            return this;
        }        public ExecutionConfigArgs build() {
            return new ExecutionConfigArgs(kmsKey, networkTags, networkUri, serviceAccount, subnetworkUri);
        }
    }
}
