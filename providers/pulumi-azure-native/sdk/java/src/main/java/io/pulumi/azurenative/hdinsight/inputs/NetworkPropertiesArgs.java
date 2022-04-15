// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.enums.PrivateLink;
import io.pulumi.azurenative.hdinsight.enums.ResourceProviderConnection;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The network properties.
 * 
 */
public final class NetworkPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPropertiesArgs Empty = new NetworkPropertiesArgs();

    /**
     * Indicates whether or not private link is enabled.
     * 
     */
    @Import(name="privateLink")
      private final @Nullable Output<Either<String,PrivateLink>> privateLink;

    public Output<Either<String,PrivateLink>> privateLink() {
        return this.privateLink == null ? Codegen.empty() : this.privateLink;
    }

    /**
     * The direction for the resource provider connection.
     * 
     */
    @Import(name="resourceProviderConnection")
      private final @Nullable Output<Either<String,ResourceProviderConnection>> resourceProviderConnection;

    public Output<Either<String,ResourceProviderConnection>> resourceProviderConnection() {
        return this.resourceProviderConnection == null ? Codegen.empty() : this.resourceProviderConnection;
    }

    public NetworkPropertiesArgs(
        @Nullable Output<Either<String,PrivateLink>> privateLink,
        @Nullable Output<Either<String,ResourceProviderConnection>> resourceProviderConnection) {
        this.privateLink = privateLink;
        this.resourceProviderConnection = resourceProviderConnection;
    }

    private NetworkPropertiesArgs() {
        this.privateLink = Codegen.empty();
        this.resourceProviderConnection = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,PrivateLink>> privateLink;
        private @Nullable Output<Either<String,ResourceProviderConnection>> resourceProviderConnection;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateLink = defaults.privateLink;
    	      this.resourceProviderConnection = defaults.resourceProviderConnection;
        }

        public Builder privateLink(@Nullable Output<Either<String,PrivateLink>> privateLink) {
            this.privateLink = privateLink;
            return this;
        }
        public Builder privateLink(@Nullable Either<String,PrivateLink> privateLink) {
            this.privateLink = Codegen.ofNullable(privateLink);
            return this;
        }
        public Builder resourceProviderConnection(@Nullable Output<Either<String,ResourceProviderConnection>> resourceProviderConnection) {
            this.resourceProviderConnection = resourceProviderConnection;
            return this;
        }
        public Builder resourceProviderConnection(@Nullable Either<String,ResourceProviderConnection> resourceProviderConnection) {
            this.resourceProviderConnection = Codegen.ofNullable(resourceProviderConnection);
            return this;
        }        public NetworkPropertiesArgs build() {
            return new NetworkPropertiesArgs(privateLink, resourceProviderConnection);
        }
    }
}
