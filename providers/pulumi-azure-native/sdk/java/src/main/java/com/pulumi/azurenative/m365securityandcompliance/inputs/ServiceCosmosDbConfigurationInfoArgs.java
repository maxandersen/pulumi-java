// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.m365securityandcompliance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings for the Cosmos DB database backing the service.
 * 
 */
public final class ServiceCosmosDbConfigurationInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceCosmosDbConfigurationInfoArgs Empty = new ServiceCosmosDbConfigurationInfoArgs();

    /**
     * The URI of the customer-managed key for the backing database.
     * 
     */
    @Import(name="keyVaultKeyUri")
      private final @Nullable Output<String> keyVaultKeyUri;

    public Output<String> keyVaultKeyUri() {
        return this.keyVaultKeyUri == null ? Codegen.empty() : this.keyVaultKeyUri;
    }

    /**
     * The provisioned throughput for the backing database.
     * 
     */
    @Import(name="offerThroughput")
      private final @Nullable Output<Double> offerThroughput;

    public Output<Double> offerThroughput() {
        return this.offerThroughput == null ? Codegen.empty() : this.offerThroughput;
    }

    public ServiceCosmosDbConfigurationInfoArgs(
        @Nullable Output<String> keyVaultKeyUri,
        @Nullable Output<Double> offerThroughput) {
        this.keyVaultKeyUri = keyVaultKeyUri;
        this.offerThroughput = offerThroughput;
    }

    private ServiceCosmosDbConfigurationInfoArgs() {
        this.keyVaultKeyUri = Codegen.empty();
        this.offerThroughput = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCosmosDbConfigurationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyVaultKeyUri;
        private @Nullable Output<Double> offerThroughput;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCosmosDbConfigurationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultKeyUri = defaults.keyVaultKeyUri;
    	      this.offerThroughput = defaults.offerThroughput;
        }

        public Builder keyVaultKeyUri(@Nullable Output<String> keyVaultKeyUri) {
            this.keyVaultKeyUri = keyVaultKeyUri;
            return this;
        }
        public Builder keyVaultKeyUri(@Nullable String keyVaultKeyUri) {
            this.keyVaultKeyUri = Codegen.ofNullable(keyVaultKeyUri);
            return this;
        }
        public Builder offerThroughput(@Nullable Output<Double> offerThroughput) {
            this.offerThroughput = offerThroughput;
            return this;
        }
        public Builder offerThroughput(@Nullable Double offerThroughput) {
            this.offerThroughput = Codegen.ofNullable(offerThroughput);
            return this;
        }        public ServiceCosmosDbConfigurationInfoArgs build() {
            return new ServiceCosmosDbConfigurationInfoArgs(keyVaultKeyUri, offerThroughput);
        }
    }
}
