// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.EncryptionConfigurationResponse;
import com.pulumi.azurenative.datafactory.outputs.FactoryGitHubConfigurationResponse;
import com.pulumi.azurenative.datafactory.outputs.FactoryIdentityResponse;
import com.pulumi.azurenative.datafactory.outputs.FactoryVSTSConfigurationResponse;
import com.pulumi.azurenative.datafactory.outputs.GlobalParameterSpecificationResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFactoryResult {
    /**
     * @return Time the factory was created in ISO8601 format.
     * 
     */
    private final String createTime;
    /**
     * @return Etag identifies change in the resource.
     * 
     */
    private final String eTag;
    /**
     * @return Properties to enable Customer Managed Key for the factory.
     * 
     */
    private final @Nullable EncryptionConfigurationResponse encryption;
    /**
     * @return List of parameters for factory.
     * 
     */
    private final @Nullable Map<String,GlobalParameterSpecificationResponse> globalParameters;
    /**
     * @return The resource identifier.
     * 
     */
    private final String id;
    /**
     * @return Managed service identity of the factory.
     * 
     */
    private final @Nullable FactoryIdentityResponse identity;
    /**
     * @return The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return The resource name.
     * 
     */
    private final String name;
    /**
     * @return Factory provisioning state, example Succeeded.
     * 
     */
    private final String provisioningState;
    /**
     * @return Whether or not public network access is allowed for the data factory.
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * @return Git repo information of the factory.
     * 
     */
    private final @Nullable Either<FactoryGitHubConfigurationResponse,FactoryVSTSConfigurationResponse> repoConfiguration;
    /**
     * @return The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The resource type.
     * 
     */
    private final String type;
    /**
     * @return Version of the factory.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetFactoryResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("eTag") String eTag,
        @CustomType.Parameter("encryption") @Nullable EncryptionConfigurationResponse encryption,
        @CustomType.Parameter("globalParameters") @Nullable Map<String,GlobalParameterSpecificationResponse> globalParameters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable FactoryIdentityResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess,
        @CustomType.Parameter("repoConfiguration") @Nullable Either<FactoryGitHubConfigurationResponse,FactoryVSTSConfigurationResponse> repoConfiguration,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") String version) {
        this.createTime = createTime;
        this.eTag = eTag;
        this.encryption = encryption;
        this.globalParameters = globalParameters;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
        this.repoConfiguration = repoConfiguration;
        this.tags = tags;
        this.type = type;
        this.version = version;
    }

    /**
     * @return Time the factory was created in ISO8601 format.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Etag identifies change in the resource.
     * 
     */
    public String eTag() {
        return this.eTag;
    }
    /**
     * @return Properties to enable Customer Managed Key for the factory.
     * 
     */
    public Optional<EncryptionConfigurationResponse> encryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * @return List of parameters for factory.
     * 
     */
    public Map<String,GlobalParameterSpecificationResponse> globalParameters() {
        return this.globalParameters == null ? Map.of() : this.globalParameters;
    }
    /**
     * @return The resource identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Managed service identity of the factory.
     * 
     */
    public Optional<FactoryIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return The resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Factory provisioning state, example Succeeded.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Whether or not public network access is allowed for the data factory.
     * 
     */
    public Optional<String> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * @return Git repo information of the factory.
     * 
     */
    public Optional<Either<FactoryGitHubConfigurationResponse,FactoryVSTSConfigurationResponse>> repoConfiguration() {
        return Optional.ofNullable(this.repoConfiguration);
    }
    /**
     * @return The resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Version of the factory.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFactoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String eTag;
        private @Nullable EncryptionConfigurationResponse encryption;
        private @Nullable Map<String,GlobalParameterSpecificationResponse> globalParameters;
        private String id;
        private @Nullable FactoryIdentityResponse identity;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private @Nullable Either<FactoryGitHubConfigurationResponse,FactoryVSTSConfigurationResponse> repoConfiguration;
        private @Nullable Map<String,String> tags;
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFactoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.eTag = defaults.eTag;
    	      this.encryption = defaults.encryption;
    	      this.globalParameters = defaults.globalParameters;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.repoConfiguration = defaults.repoConfiguration;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder eTag(String eTag) {
            this.eTag = Objects.requireNonNull(eTag);
            return this;
        }
        public Builder encryption(@Nullable EncryptionConfigurationResponse encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder globalParameters(@Nullable Map<String,GlobalParameterSpecificationResponse> globalParameters) {
            this.globalParameters = globalParameters;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable FactoryIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder repoConfiguration(@Nullable Either<FactoryGitHubConfigurationResponse,FactoryVSTSConfigurationResponse> repoConfiguration) {
            this.repoConfiguration = repoConfiguration;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetFactoryResult build() {
            return new GetFactoryResult(createTime, eTag, encryption, globalParameters, id, identity, location, name, provisioningState, publicNetworkAccess, repoConfiguration, tags, type, version);
        }
    }
}
