// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata of Service Principal secret for autoprovisioning
 * 
 */
public final class DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs Empty = new DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs();

    /**
     * expiration date of service principal secret
     * 
     */
    @Import(name="expiryDate")
    private @Nullable Output<String> expiryDate;

    /**
     * @return expiration date of service principal secret
     * 
     */
    public Optional<Output<String>> expiryDate() {
        return Optional.ofNullable(this.expiryDate);
    }

    /**
     * name of secret resource in parameter store
     * 
     */
    @Import(name="parameterNameInStore")
    private @Nullable Output<String> parameterNameInStore;

    /**
     * @return name of secret resource in parameter store
     * 
     */
    public Optional<Output<String>> parameterNameInStore() {
        return Optional.ofNullable(this.parameterNameInStore);
    }

    /**
     * region of parameter store where secret is kept
     * 
     */
    @Import(name="parameterStoreRegion")
    private @Nullable Output<String> parameterStoreRegion;

    /**
     * @return region of parameter store where secret is kept
     * 
     */
    public Optional<Output<String>> parameterStoreRegion() {
        return Optional.ofNullable(this.parameterStoreRegion);
    }

    private DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs() {}

    private DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs(DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs $) {
        this.expiryDate = $.expiryDate;
        this.parameterNameInStore = $.parameterNameInStore;
        this.parameterStoreRegion = $.parameterStoreRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs $;

        public Builder() {
            $ = new DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs();
        }

        public Builder(DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs defaults) {
            $ = new DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expiryDate expiration date of service principal secret
         * 
         * @return builder
         * 
         */
        public Builder expiryDate(@Nullable Output<String> expiryDate) {
            $.expiryDate = expiryDate;
            return this;
        }

        /**
         * @param expiryDate expiration date of service principal secret
         * 
         * @return builder
         * 
         */
        public Builder expiryDate(String expiryDate) {
            return expiryDate(Output.of(expiryDate));
        }

        /**
         * @param parameterNameInStore name of secret resource in parameter store
         * 
         * @return builder
         * 
         */
        public Builder parameterNameInStore(@Nullable Output<String> parameterNameInStore) {
            $.parameterNameInStore = parameterNameInStore;
            return this;
        }

        /**
         * @param parameterNameInStore name of secret resource in parameter store
         * 
         * @return builder
         * 
         */
        public Builder parameterNameInStore(String parameterNameInStore) {
            return parameterNameInStore(Output.of(parameterNameInStore));
        }

        /**
         * @param parameterStoreRegion region of parameter store where secret is kept
         * 
         * @return builder
         * 
         */
        public Builder parameterStoreRegion(@Nullable Output<String> parameterStoreRegion) {
            $.parameterStoreRegion = parameterStoreRegion;
            return this;
        }

        /**
         * @param parameterStoreRegion region of parameter store where secret is kept
         * 
         * @return builder
         * 
         */
        public Builder parameterStoreRegion(String parameterStoreRegion) {
            return parameterStoreRegion(Output.of(parameterStoreRegion));
        }

        public DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs build() {
            return $;
        }
    }

}
