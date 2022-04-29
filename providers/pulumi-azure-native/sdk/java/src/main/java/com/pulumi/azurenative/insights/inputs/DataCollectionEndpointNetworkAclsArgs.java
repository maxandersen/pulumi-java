// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.enums.KnownPublicNetworkAccessOptions;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network access control rules for the endpoints.
 * 
 */
public final class DataCollectionEndpointNetworkAclsArgs extends ResourceArgs {

    public static final DataCollectionEndpointNetworkAclsArgs Empty = new DataCollectionEndpointNetworkAclsArgs();

    /**
     * The configuration to set whether network access from public internet to the endpoints are allowed.
     * 
     */
    @Import(name="publicNetworkAccess")
    private @Nullable Output<Either<String,KnownPublicNetworkAccessOptions>> publicNetworkAccess;

    /**
     * @return The configuration to set whether network access from public internet to the endpoints are allowed.
     * 
     */
    public Optional<Output<Either<String,KnownPublicNetworkAccessOptions>>> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    private DataCollectionEndpointNetworkAclsArgs() {}

    private DataCollectionEndpointNetworkAclsArgs(DataCollectionEndpointNetworkAclsArgs $) {
        this.publicNetworkAccess = $.publicNetworkAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCollectionEndpointNetworkAclsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCollectionEndpointNetworkAclsArgs $;

        public Builder() {
            $ = new DataCollectionEndpointNetworkAclsArgs();
        }

        public Builder(DataCollectionEndpointNetworkAclsArgs defaults) {
            $ = new DataCollectionEndpointNetworkAclsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param publicNetworkAccess The configuration to set whether network access from public internet to the endpoints are allowed.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(@Nullable Output<Either<String,KnownPublicNetworkAccessOptions>> publicNetworkAccess) {
            $.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        /**
         * @param publicNetworkAccess The configuration to set whether network access from public internet to the endpoints are allowed.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(Either<String,KnownPublicNetworkAccessOptions> publicNetworkAccess) {
            return publicNetworkAccess(Output.of(publicNetworkAccess));
        }

        /**
         * @param publicNetworkAccess The configuration to set whether network access from public internet to the endpoints are allowed.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(String publicNetworkAccess) {
            return publicNetworkAccess(Either.ofLeft(publicNetworkAccess));
        }

        /**
         * @param publicNetworkAccess The configuration to set whether network access from public internet to the endpoints are allowed.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(KnownPublicNetworkAccessOptions publicNetworkAccess) {
            return publicNetworkAccess(Either.ofRight(publicNetworkAccess));
        }

        public DataCollectionEndpointNetworkAclsArgs build() {
            return $;
        }
    }

}
