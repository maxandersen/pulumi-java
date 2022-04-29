// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.inputs;

import com.pulumi.azurenative.cognitiveservices.enums.PublicNetworkAccess;
import com.pulumi.azurenative.cognitiveservices.inputs.CognitiveServicesAccountApiPropertiesArgs;
import com.pulumi.azurenative.cognitiveservices.inputs.EncryptionArgs;
import com.pulumi.azurenative.cognitiveservices.inputs.NetworkRuleSetArgs;
import com.pulumi.azurenative.cognitiveservices.inputs.PrivateEndpointConnectionArgs;
import com.pulumi.azurenative.cognitiveservices.inputs.UserOwnedStorageArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Cognitive Services account.
 * 
 */
public final class CognitiveServicesAccountPropertiesArgs extends ResourceArgs {

    public static final CognitiveServicesAccountPropertiesArgs Empty = new CognitiveServicesAccountPropertiesArgs();

    /**
     * The api properties for special APIs.
     * 
     */
    @Import(name="apiProperties")
    private @Nullable Output<CognitiveServicesAccountApiPropertiesArgs> apiProperties;

    /**
     * @return The api properties for special APIs.
     * 
     */
    public Optional<Output<CognitiveServicesAccountApiPropertiesArgs>> apiProperties() {
        return Optional.ofNullable(this.apiProperties);
    }

    /**
     * Optional subdomain name used for token-based authentication.
     * 
     */
    @Import(name="customSubDomainName")
    private @Nullable Output<String> customSubDomainName;

    /**
     * @return Optional subdomain name used for token-based authentication.
     * 
     */
    public Optional<Output<String>> customSubDomainName() {
        return Optional.ofNullable(this.customSubDomainName);
    }

    /**
     * The encryption properties for this resource.
     * 
     */
    @Import(name="encryption")
    private @Nullable Output<EncryptionArgs> encryption;

    /**
     * @return The encryption properties for this resource.
     * 
     */
    public Optional<Output<EncryptionArgs>> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    /**
     * A collection of rules governing the accessibility from specific network locations.
     * 
     */
    @Import(name="networkAcls")
    private @Nullable Output<NetworkRuleSetArgs> networkAcls;

    /**
     * @return A collection of rules governing the accessibility from specific network locations.
     * 
     */
    public Optional<Output<NetworkRuleSetArgs>> networkAcls() {
        return Optional.ofNullable(this.networkAcls);
    }

    /**
     * The private endpoint connection associated with the Cognitive Services account.
     * 
     */
    @Import(name="privateEndpointConnections")
    private @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;

    /**
     * @return The private endpoint connection associated with the Cognitive Services account.
     * 
     */
    public Optional<Output<List<PrivateEndpointConnectionArgs>>> privateEndpointConnections() {
        return Optional.ofNullable(this.privateEndpointConnections);
    }

    /**
     * Whether or not public endpoint access is allowed for this account. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    @Import(name="publicNetworkAccess")
    private @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    /**
     * @return Whether or not public endpoint access is allowed for this account. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    public Optional<Output<Either<String,PublicNetworkAccess>>> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    /**
     * The storage accounts for this resource.
     * 
     */
    @Import(name="userOwnedStorage")
    private @Nullable Output<List<UserOwnedStorageArgs>> userOwnedStorage;

    /**
     * @return The storage accounts for this resource.
     * 
     */
    public Optional<Output<List<UserOwnedStorageArgs>>> userOwnedStorage() {
        return Optional.ofNullable(this.userOwnedStorage);
    }

    private CognitiveServicesAccountPropertiesArgs() {}

    private CognitiveServicesAccountPropertiesArgs(CognitiveServicesAccountPropertiesArgs $) {
        this.apiProperties = $.apiProperties;
        this.customSubDomainName = $.customSubDomainName;
        this.encryption = $.encryption;
        this.networkAcls = $.networkAcls;
        this.privateEndpointConnections = $.privateEndpointConnections;
        this.publicNetworkAccess = $.publicNetworkAccess;
        this.userOwnedStorage = $.userOwnedStorage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CognitiveServicesAccountPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CognitiveServicesAccountPropertiesArgs $;

        public Builder() {
            $ = new CognitiveServicesAccountPropertiesArgs();
        }

        public Builder(CognitiveServicesAccountPropertiesArgs defaults) {
            $ = new CognitiveServicesAccountPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiProperties The api properties for special APIs.
         * 
         * @return builder
         * 
         */
        public Builder apiProperties(@Nullable Output<CognitiveServicesAccountApiPropertiesArgs> apiProperties) {
            $.apiProperties = apiProperties;
            return this;
        }

        /**
         * @param apiProperties The api properties for special APIs.
         * 
         * @return builder
         * 
         */
        public Builder apiProperties(CognitiveServicesAccountApiPropertiesArgs apiProperties) {
            return apiProperties(Output.of(apiProperties));
        }

        /**
         * @param customSubDomainName Optional subdomain name used for token-based authentication.
         * 
         * @return builder
         * 
         */
        public Builder customSubDomainName(@Nullable Output<String> customSubDomainName) {
            $.customSubDomainName = customSubDomainName;
            return this;
        }

        /**
         * @param customSubDomainName Optional subdomain name used for token-based authentication.
         * 
         * @return builder
         * 
         */
        public Builder customSubDomainName(String customSubDomainName) {
            return customSubDomainName(Output.of(customSubDomainName));
        }

        /**
         * @param encryption The encryption properties for this resource.
         * 
         * @return builder
         * 
         */
        public Builder encryption(@Nullable Output<EncryptionArgs> encryption) {
            $.encryption = encryption;
            return this;
        }

        /**
         * @param encryption The encryption properties for this resource.
         * 
         * @return builder
         * 
         */
        public Builder encryption(EncryptionArgs encryption) {
            return encryption(Output.of(encryption));
        }

        /**
         * @param networkAcls A collection of rules governing the accessibility from specific network locations.
         * 
         * @return builder
         * 
         */
        public Builder networkAcls(@Nullable Output<NetworkRuleSetArgs> networkAcls) {
            $.networkAcls = networkAcls;
            return this;
        }

        /**
         * @param networkAcls A collection of rules governing the accessibility from specific network locations.
         * 
         * @return builder
         * 
         */
        public Builder networkAcls(NetworkRuleSetArgs networkAcls) {
            return networkAcls(Output.of(networkAcls));
        }

        /**
         * @param privateEndpointConnections The private endpoint connection associated with the Cognitive Services account.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnections(@Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections) {
            $.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        /**
         * @param privateEndpointConnections The private endpoint connection associated with the Cognitive Services account.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnections(List<PrivateEndpointConnectionArgs> privateEndpointConnections) {
            return privateEndpointConnections(Output.of(privateEndpointConnections));
        }

        /**
         * @param privateEndpointConnections The private endpoint connection associated with the Cognitive Services account.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnections(PrivateEndpointConnectionArgs... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }

        /**
         * @param publicNetworkAccess Whether or not public endpoint access is allowed for this account. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            $.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        /**
         * @param publicNetworkAccess Whether or not public endpoint access is allowed for this account. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(Either<String,PublicNetworkAccess> publicNetworkAccess) {
            return publicNetworkAccess(Output.of(publicNetworkAccess));
        }

        /**
         * @param publicNetworkAccess Whether or not public endpoint access is allowed for this account. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(String publicNetworkAccess) {
            return publicNetworkAccess(Either.ofLeft(publicNetworkAccess));
        }

        /**
         * @param publicNetworkAccess Whether or not public endpoint access is allowed for this account. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
            return publicNetworkAccess(Either.ofRight(publicNetworkAccess));
        }

        /**
         * @param userOwnedStorage The storage accounts for this resource.
         * 
         * @return builder
         * 
         */
        public Builder userOwnedStorage(@Nullable Output<List<UserOwnedStorageArgs>> userOwnedStorage) {
            $.userOwnedStorage = userOwnedStorage;
            return this;
        }

        /**
         * @param userOwnedStorage The storage accounts for this resource.
         * 
         * @return builder
         * 
         */
        public Builder userOwnedStorage(List<UserOwnedStorageArgs> userOwnedStorage) {
            return userOwnedStorage(Output.of(userOwnedStorage));
        }

        /**
         * @param userOwnedStorage The storage accounts for this resource.
         * 
         * @return builder
         * 
         */
        public Builder userOwnedStorage(UserOwnedStorageArgs... userOwnedStorage) {
            return userOwnedStorage(List.of(userOwnedStorage));
        }

        public CognitiveServicesAccountPropertiesArgs build() {
            return $;
        }
    }

}
