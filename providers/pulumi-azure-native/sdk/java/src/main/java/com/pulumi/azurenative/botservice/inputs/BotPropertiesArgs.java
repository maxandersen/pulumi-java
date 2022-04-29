// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.azurenative.botservice.enums.MsaAppType;
import com.pulumi.azurenative.botservice.enums.PublicNetworkAccess;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Bot.
 * 
 */
public final class BotPropertiesArgs extends ResourceArgs {

    public static final BotPropertiesArgs Empty = new BotPropertiesArgs();

    /**
     * Contains resource all settings defined as key/value pairs.
     * 
     */
    @Import(name="allSettings")
    private @Nullable Output<Map<String,String>> allSettings;

    /**
     * @return Contains resource all settings defined as key/value pairs.
     * 
     */
    public Optional<Output<Map<String,String>>> allSettings() {
        return Optional.ofNullable(this.allSettings);
    }

    /**
     * The hint (e.g. keyVault secret resourceId) on how to fetch the app secret
     * 
     */
    @Import(name="appPasswordHint")
    private @Nullable Output<String> appPasswordHint;

    /**
     * @return The hint (e.g. keyVault secret resourceId) on how to fetch the app secret
     * 
     */
    public Optional<Output<String>> appPasswordHint() {
        return Optional.ofNullable(this.appPasswordHint);
    }

    /**
     * The CMK Url
     * 
     */
    @Import(name="cmekKeyVaultUrl")
    private @Nullable Output<String> cmekKeyVaultUrl;

    /**
     * @return The CMK Url
     * 
     */
    public Optional<Output<String>> cmekKeyVaultUrl() {
        return Optional.ofNullable(this.cmekKeyVaultUrl);
    }

    /**
     * The description of the bot
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the bot
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Application Insights key
     * 
     */
    @Import(name="developerAppInsightKey")
    private @Nullable Output<String> developerAppInsightKey;

    /**
     * @return The Application Insights key
     * 
     */
    public Optional<Output<String>> developerAppInsightKey() {
        return Optional.ofNullable(this.developerAppInsightKey);
    }

    /**
     * The Application Insights Api Key
     * 
     */
    @Import(name="developerAppInsightsApiKey")
    private @Nullable Output<String> developerAppInsightsApiKey;

    /**
     * @return The Application Insights Api Key
     * 
     */
    public Optional<Output<String>> developerAppInsightsApiKey() {
        return Optional.ofNullable(this.developerAppInsightsApiKey);
    }

    /**
     * The Application Insights App Id
     * 
     */
    @Import(name="developerAppInsightsApplicationId")
    private @Nullable Output<String> developerAppInsightsApplicationId;

    /**
     * @return The Application Insights App Id
     * 
     */
    public Optional<Output<String>> developerAppInsightsApplicationId() {
        return Optional.ofNullable(this.developerAppInsightsApplicationId);
    }

    /**
     * Opt-out of local authentication and ensure only MSI and AAD can be used exclusively for authentication.
     * 
     */
    @Import(name="disableLocalAuth")
    private @Nullable Output<Boolean> disableLocalAuth;

    /**
     * @return Opt-out of local authentication and ensure only MSI and AAD can be used exclusively for authentication.
     * 
     */
    public Optional<Output<Boolean>> disableLocalAuth() {
        return Optional.ofNullable(this.disableLocalAuth);
    }

    /**
     * The Name of the bot
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The Name of the bot
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The bot&#39;s endpoint
     * 
     */
    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    /**
     * @return The bot&#39;s endpoint
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }

    /**
     * The Icon Url of the bot
     * 
     */
    @Import(name="iconUrl")
    private @Nullable Output<String> iconUrl;

    /**
     * @return The Icon Url of the bot
     * 
     */
    public Optional<Output<String>> iconUrl() {
        return Optional.ofNullable(this.iconUrl);
    }

    /**
     * Whether Cmek is enabled
     * 
     */
    @Import(name="isCmekEnabled")
    private @Nullable Output<Boolean> isCmekEnabled;

    /**
     * @return Whether Cmek is enabled
     * 
     */
    public Optional<Output<Boolean>> isCmekEnabled() {
        return Optional.ofNullable(this.isCmekEnabled);
    }

    /**
     * Whether the bot is streaming supported
     * 
     */
    @Import(name="isStreamingSupported")
    private @Nullable Output<Boolean> isStreamingSupported;

    /**
     * @return Whether the bot is streaming supported
     * 
     */
    public Optional<Output<Boolean>> isStreamingSupported() {
        return Optional.ofNullable(this.isStreamingSupported);
    }

    /**
     * Collection of LUIS App Ids
     * 
     */
    @Import(name="luisAppIds")
    private @Nullable Output<List<String>> luisAppIds;

    /**
     * @return Collection of LUIS App Ids
     * 
     */
    public Optional<Output<List<String>>> luisAppIds() {
        return Optional.ofNullable(this.luisAppIds);
    }

    /**
     * The LUIS Key
     * 
     */
    @Import(name="luisKey")
    private @Nullable Output<String> luisKey;

    /**
     * @return The LUIS Key
     * 
     */
    public Optional<Output<String>> luisKey() {
        return Optional.ofNullable(this.luisKey);
    }

    /**
     * The bot&#39;s manifest url
     * 
     */
    @Import(name="manifestUrl")
    private @Nullable Output<String> manifestUrl;

    /**
     * @return The bot&#39;s manifest url
     * 
     */
    public Optional<Output<String>> manifestUrl() {
        return Optional.ofNullable(this.manifestUrl);
    }

    /**
     * Microsoft App Id for the bot
     * 
     */
    @Import(name="msaAppId", required=true)
    private Output<String> msaAppId;

    /**
     * @return Microsoft App Id for the bot
     * 
     */
    public Output<String> msaAppId() {
        return this.msaAppId;
    }

    /**
     * Microsoft App Managed Identity Resource Id for the bot
     * 
     */
    @Import(name="msaAppMSIResourceId")
    private @Nullable Output<String> msaAppMSIResourceId;

    /**
     * @return Microsoft App Managed Identity Resource Id for the bot
     * 
     */
    public Optional<Output<String>> msaAppMSIResourceId() {
        return Optional.ofNullable(this.msaAppMSIResourceId);
    }

    /**
     * Microsoft App Tenant Id for the bot
     * 
     */
    @Import(name="msaAppTenantId")
    private @Nullable Output<String> msaAppTenantId;

    /**
     * @return Microsoft App Tenant Id for the bot
     * 
     */
    public Optional<Output<String>> msaAppTenantId() {
        return Optional.ofNullable(this.msaAppTenantId);
    }

    /**
     * Microsoft App Type for the bot
     * 
     */
    @Import(name="msaAppType")
    private @Nullable Output<Either<String,MsaAppType>> msaAppType;

    /**
     * @return Microsoft App Type for the bot
     * 
     */
    public Optional<Output<Either<String,MsaAppType>>> msaAppType() {
        return Optional.ofNullable(this.msaAppType);
    }

    /**
     * The hint to browser (e.g. protocol handler) on how to open the bot for authoring
     * 
     */
    @Import(name="openWithHint")
    private @Nullable Output<String> openWithHint;

    /**
     * @return The hint to browser (e.g. protocol handler) on how to open the bot for authoring
     * 
     */
    public Optional<Output<String>> openWithHint() {
        return Optional.ofNullable(this.openWithHint);
    }

    /**
     * Contains resource parameters defined as key/value pairs.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return Contains resource parameters defined as key/value pairs.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Whether the bot is in an isolated network
     * 
     */
    @Import(name="publicNetworkAccess")
    private @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    /**
     * @return Whether the bot is in an isolated network
     * 
     */
    public Optional<Output<Either<String,PublicNetworkAccess>>> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    /**
     * Publishing credentials of the resource
     * 
     */
    @Import(name="publishingCredentials")
    private @Nullable Output<String> publishingCredentials;

    /**
     * @return Publishing credentials of the resource
     * 
     */
    public Optional<Output<String>> publishingCredentials() {
        return Optional.ofNullable(this.publishingCredentials);
    }

    /**
     * The channel schema transformation version for the bot
     * 
     */
    @Import(name="schemaTransformationVersion")
    private @Nullable Output<String> schemaTransformationVersion;

    /**
     * @return The channel schema transformation version for the bot
     * 
     */
    public Optional<Output<String>> schemaTransformationVersion() {
        return Optional.ofNullable(this.schemaTransformationVersion);
    }

    /**
     * The storage resourceId for the bot
     * 
     */
    @Import(name="storageResourceId")
    private @Nullable Output<String> storageResourceId;

    /**
     * @return The storage resourceId for the bot
     * 
     */
    public Optional<Output<String>> storageResourceId() {
        return Optional.ofNullable(this.storageResourceId);
    }

    private BotPropertiesArgs() {}

    private BotPropertiesArgs(BotPropertiesArgs $) {
        this.allSettings = $.allSettings;
        this.appPasswordHint = $.appPasswordHint;
        this.cmekKeyVaultUrl = $.cmekKeyVaultUrl;
        this.description = $.description;
        this.developerAppInsightKey = $.developerAppInsightKey;
        this.developerAppInsightsApiKey = $.developerAppInsightsApiKey;
        this.developerAppInsightsApplicationId = $.developerAppInsightsApplicationId;
        this.disableLocalAuth = $.disableLocalAuth;
        this.displayName = $.displayName;
        this.endpoint = $.endpoint;
        this.iconUrl = $.iconUrl;
        this.isCmekEnabled = $.isCmekEnabled;
        this.isStreamingSupported = $.isStreamingSupported;
        this.luisAppIds = $.luisAppIds;
        this.luisKey = $.luisKey;
        this.manifestUrl = $.manifestUrl;
        this.msaAppId = $.msaAppId;
        this.msaAppMSIResourceId = $.msaAppMSIResourceId;
        this.msaAppTenantId = $.msaAppTenantId;
        this.msaAppType = $.msaAppType;
        this.openWithHint = $.openWithHint;
        this.parameters = $.parameters;
        this.publicNetworkAccess = $.publicNetworkAccess;
        this.publishingCredentials = $.publishingCredentials;
        this.schemaTransformationVersion = $.schemaTransformationVersion;
        this.storageResourceId = $.storageResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotPropertiesArgs $;

        public Builder() {
            $ = new BotPropertiesArgs();
        }

        public Builder(BotPropertiesArgs defaults) {
            $ = new BotPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allSettings Contains resource all settings defined as key/value pairs.
         * 
         * @return builder
         * 
         */
        public Builder allSettings(@Nullable Output<Map<String,String>> allSettings) {
            $.allSettings = allSettings;
            return this;
        }

        /**
         * @param allSettings Contains resource all settings defined as key/value pairs.
         * 
         * @return builder
         * 
         */
        public Builder allSettings(Map<String,String> allSettings) {
            return allSettings(Output.of(allSettings));
        }

        /**
         * @param appPasswordHint The hint (e.g. keyVault secret resourceId) on how to fetch the app secret
         * 
         * @return builder
         * 
         */
        public Builder appPasswordHint(@Nullable Output<String> appPasswordHint) {
            $.appPasswordHint = appPasswordHint;
            return this;
        }

        /**
         * @param appPasswordHint The hint (e.g. keyVault secret resourceId) on how to fetch the app secret
         * 
         * @return builder
         * 
         */
        public Builder appPasswordHint(String appPasswordHint) {
            return appPasswordHint(Output.of(appPasswordHint));
        }

        /**
         * @param cmekKeyVaultUrl The CMK Url
         * 
         * @return builder
         * 
         */
        public Builder cmekKeyVaultUrl(@Nullable Output<String> cmekKeyVaultUrl) {
            $.cmekKeyVaultUrl = cmekKeyVaultUrl;
            return this;
        }

        /**
         * @param cmekKeyVaultUrl The CMK Url
         * 
         * @return builder
         * 
         */
        public Builder cmekKeyVaultUrl(String cmekKeyVaultUrl) {
            return cmekKeyVaultUrl(Output.of(cmekKeyVaultUrl));
        }

        /**
         * @param description The description of the bot
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the bot
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param developerAppInsightKey The Application Insights key
         * 
         * @return builder
         * 
         */
        public Builder developerAppInsightKey(@Nullable Output<String> developerAppInsightKey) {
            $.developerAppInsightKey = developerAppInsightKey;
            return this;
        }

        /**
         * @param developerAppInsightKey The Application Insights key
         * 
         * @return builder
         * 
         */
        public Builder developerAppInsightKey(String developerAppInsightKey) {
            return developerAppInsightKey(Output.of(developerAppInsightKey));
        }

        /**
         * @param developerAppInsightsApiKey The Application Insights Api Key
         * 
         * @return builder
         * 
         */
        public Builder developerAppInsightsApiKey(@Nullable Output<String> developerAppInsightsApiKey) {
            $.developerAppInsightsApiKey = developerAppInsightsApiKey;
            return this;
        }

        /**
         * @param developerAppInsightsApiKey The Application Insights Api Key
         * 
         * @return builder
         * 
         */
        public Builder developerAppInsightsApiKey(String developerAppInsightsApiKey) {
            return developerAppInsightsApiKey(Output.of(developerAppInsightsApiKey));
        }

        /**
         * @param developerAppInsightsApplicationId The Application Insights App Id
         * 
         * @return builder
         * 
         */
        public Builder developerAppInsightsApplicationId(@Nullable Output<String> developerAppInsightsApplicationId) {
            $.developerAppInsightsApplicationId = developerAppInsightsApplicationId;
            return this;
        }

        /**
         * @param developerAppInsightsApplicationId The Application Insights App Id
         * 
         * @return builder
         * 
         */
        public Builder developerAppInsightsApplicationId(String developerAppInsightsApplicationId) {
            return developerAppInsightsApplicationId(Output.of(developerAppInsightsApplicationId));
        }

        /**
         * @param disableLocalAuth Opt-out of local authentication and ensure only MSI and AAD can be used exclusively for authentication.
         * 
         * @return builder
         * 
         */
        public Builder disableLocalAuth(@Nullable Output<Boolean> disableLocalAuth) {
            $.disableLocalAuth = disableLocalAuth;
            return this;
        }

        /**
         * @param disableLocalAuth Opt-out of local authentication and ensure only MSI and AAD can be used exclusively for authentication.
         * 
         * @return builder
         * 
         */
        public Builder disableLocalAuth(Boolean disableLocalAuth) {
            return disableLocalAuth(Output.of(disableLocalAuth));
        }

        /**
         * @param displayName The Name of the bot
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The Name of the bot
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param endpoint The bot&#39;s endpoint
         * 
         * @return builder
         * 
         */
        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The bot&#39;s endpoint
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param iconUrl The Icon Url of the bot
         * 
         * @return builder
         * 
         */
        public Builder iconUrl(@Nullable Output<String> iconUrl) {
            $.iconUrl = iconUrl;
            return this;
        }

        /**
         * @param iconUrl The Icon Url of the bot
         * 
         * @return builder
         * 
         */
        public Builder iconUrl(String iconUrl) {
            return iconUrl(Output.of(iconUrl));
        }

        /**
         * @param isCmekEnabled Whether Cmek is enabled
         * 
         * @return builder
         * 
         */
        public Builder isCmekEnabled(@Nullable Output<Boolean> isCmekEnabled) {
            $.isCmekEnabled = isCmekEnabled;
            return this;
        }

        /**
         * @param isCmekEnabled Whether Cmek is enabled
         * 
         * @return builder
         * 
         */
        public Builder isCmekEnabled(Boolean isCmekEnabled) {
            return isCmekEnabled(Output.of(isCmekEnabled));
        }

        /**
         * @param isStreamingSupported Whether the bot is streaming supported
         * 
         * @return builder
         * 
         */
        public Builder isStreamingSupported(@Nullable Output<Boolean> isStreamingSupported) {
            $.isStreamingSupported = isStreamingSupported;
            return this;
        }

        /**
         * @param isStreamingSupported Whether the bot is streaming supported
         * 
         * @return builder
         * 
         */
        public Builder isStreamingSupported(Boolean isStreamingSupported) {
            return isStreamingSupported(Output.of(isStreamingSupported));
        }

        /**
         * @param luisAppIds Collection of LUIS App Ids
         * 
         * @return builder
         * 
         */
        public Builder luisAppIds(@Nullable Output<List<String>> luisAppIds) {
            $.luisAppIds = luisAppIds;
            return this;
        }

        /**
         * @param luisAppIds Collection of LUIS App Ids
         * 
         * @return builder
         * 
         */
        public Builder luisAppIds(List<String> luisAppIds) {
            return luisAppIds(Output.of(luisAppIds));
        }

        /**
         * @param luisAppIds Collection of LUIS App Ids
         * 
         * @return builder
         * 
         */
        public Builder luisAppIds(String... luisAppIds) {
            return luisAppIds(List.of(luisAppIds));
        }

        /**
         * @param luisKey The LUIS Key
         * 
         * @return builder
         * 
         */
        public Builder luisKey(@Nullable Output<String> luisKey) {
            $.luisKey = luisKey;
            return this;
        }

        /**
         * @param luisKey The LUIS Key
         * 
         * @return builder
         * 
         */
        public Builder luisKey(String luisKey) {
            return luisKey(Output.of(luisKey));
        }

        /**
         * @param manifestUrl The bot&#39;s manifest url
         * 
         * @return builder
         * 
         */
        public Builder manifestUrl(@Nullable Output<String> manifestUrl) {
            $.manifestUrl = manifestUrl;
            return this;
        }

        /**
         * @param manifestUrl The bot&#39;s manifest url
         * 
         * @return builder
         * 
         */
        public Builder manifestUrl(String manifestUrl) {
            return manifestUrl(Output.of(manifestUrl));
        }

        /**
         * @param msaAppId Microsoft App Id for the bot
         * 
         * @return builder
         * 
         */
        public Builder msaAppId(Output<String> msaAppId) {
            $.msaAppId = msaAppId;
            return this;
        }

        /**
         * @param msaAppId Microsoft App Id for the bot
         * 
         * @return builder
         * 
         */
        public Builder msaAppId(String msaAppId) {
            return msaAppId(Output.of(msaAppId));
        }

        /**
         * @param msaAppMSIResourceId Microsoft App Managed Identity Resource Id for the bot
         * 
         * @return builder
         * 
         */
        public Builder msaAppMSIResourceId(@Nullable Output<String> msaAppMSIResourceId) {
            $.msaAppMSIResourceId = msaAppMSIResourceId;
            return this;
        }

        /**
         * @param msaAppMSIResourceId Microsoft App Managed Identity Resource Id for the bot
         * 
         * @return builder
         * 
         */
        public Builder msaAppMSIResourceId(String msaAppMSIResourceId) {
            return msaAppMSIResourceId(Output.of(msaAppMSIResourceId));
        }

        /**
         * @param msaAppTenantId Microsoft App Tenant Id for the bot
         * 
         * @return builder
         * 
         */
        public Builder msaAppTenantId(@Nullable Output<String> msaAppTenantId) {
            $.msaAppTenantId = msaAppTenantId;
            return this;
        }

        /**
         * @param msaAppTenantId Microsoft App Tenant Id for the bot
         * 
         * @return builder
         * 
         */
        public Builder msaAppTenantId(String msaAppTenantId) {
            return msaAppTenantId(Output.of(msaAppTenantId));
        }

        /**
         * @param msaAppType Microsoft App Type for the bot
         * 
         * @return builder
         * 
         */
        public Builder msaAppType(@Nullable Output<Either<String,MsaAppType>> msaAppType) {
            $.msaAppType = msaAppType;
            return this;
        }

        /**
         * @param msaAppType Microsoft App Type for the bot
         * 
         * @return builder
         * 
         */
        public Builder msaAppType(Either<String,MsaAppType> msaAppType) {
            return msaAppType(Output.of(msaAppType));
        }

        /**
         * @param msaAppType Microsoft App Type for the bot
         * 
         * @return builder
         * 
         */
        public Builder msaAppType(String msaAppType) {
            return msaAppType(Either.ofLeft(msaAppType));
        }

        /**
         * @param msaAppType Microsoft App Type for the bot
         * 
         * @return builder
         * 
         */
        public Builder msaAppType(MsaAppType msaAppType) {
            return msaAppType(Either.ofRight(msaAppType));
        }

        /**
         * @param openWithHint The hint to browser (e.g. protocol handler) on how to open the bot for authoring
         * 
         * @return builder
         * 
         */
        public Builder openWithHint(@Nullable Output<String> openWithHint) {
            $.openWithHint = openWithHint;
            return this;
        }

        /**
         * @param openWithHint The hint to browser (e.g. protocol handler) on how to open the bot for authoring
         * 
         * @return builder
         * 
         */
        public Builder openWithHint(String openWithHint) {
            return openWithHint(Output.of(openWithHint));
        }

        /**
         * @param parameters Contains resource parameters defined as key/value pairs.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Contains resource parameters defined as key/value pairs.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param publicNetworkAccess Whether the bot is in an isolated network
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            $.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        /**
         * @param publicNetworkAccess Whether the bot is in an isolated network
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(Either<String,PublicNetworkAccess> publicNetworkAccess) {
            return publicNetworkAccess(Output.of(publicNetworkAccess));
        }

        /**
         * @param publicNetworkAccess Whether the bot is in an isolated network
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(String publicNetworkAccess) {
            return publicNetworkAccess(Either.ofLeft(publicNetworkAccess));
        }

        /**
         * @param publicNetworkAccess Whether the bot is in an isolated network
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
            return publicNetworkAccess(Either.ofRight(publicNetworkAccess));
        }

        /**
         * @param publishingCredentials Publishing credentials of the resource
         * 
         * @return builder
         * 
         */
        public Builder publishingCredentials(@Nullable Output<String> publishingCredentials) {
            $.publishingCredentials = publishingCredentials;
            return this;
        }

        /**
         * @param publishingCredentials Publishing credentials of the resource
         * 
         * @return builder
         * 
         */
        public Builder publishingCredentials(String publishingCredentials) {
            return publishingCredentials(Output.of(publishingCredentials));
        }

        /**
         * @param schemaTransformationVersion The channel schema transformation version for the bot
         * 
         * @return builder
         * 
         */
        public Builder schemaTransformationVersion(@Nullable Output<String> schemaTransformationVersion) {
            $.schemaTransformationVersion = schemaTransformationVersion;
            return this;
        }

        /**
         * @param schemaTransformationVersion The channel schema transformation version for the bot
         * 
         * @return builder
         * 
         */
        public Builder schemaTransformationVersion(String schemaTransformationVersion) {
            return schemaTransformationVersion(Output.of(schemaTransformationVersion));
        }

        /**
         * @param storageResourceId The storage resourceId for the bot
         * 
         * @return builder
         * 
         */
        public Builder storageResourceId(@Nullable Output<String> storageResourceId) {
            $.storageResourceId = storageResourceId;
            return this;
        }

        /**
         * @param storageResourceId The storage resourceId for the bot
         * 
         * @return builder
         * 
         */
        public Builder storageResourceId(String storageResourceId) {
            return storageResourceId(Output.of(storageResourceId));
        }

        public BotPropertiesArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.endpoint = Objects.requireNonNull($.endpoint, "expected parameter 'endpoint' to be non-null");
            $.isStreamingSupported = Codegen.booleanProp("isStreamingSupported").output().arg($.isStreamingSupported).def(false).getNullable();
            $.msaAppId = Objects.requireNonNull($.msaAppId, "expected parameter 'msaAppId' to be non-null");
            $.publicNetworkAccess = Codegen.stringProp("publicNetworkAccess").left(PublicNetworkAccess.class).output().arg($.publicNetworkAccess).def("Enabled").getNullable();
            return $;
        }
    }

}
