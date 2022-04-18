// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.azurenative.machinelearningservices.outputs.ACIServiceResponseResponseDataCollection;
import com.pulumi.azurenative.machinelearningservices.outputs.ACIServiceResponseResponseEncryptionProperties;
import com.pulumi.azurenative.machinelearningservices.outputs.ACIServiceResponseResponseEnvironmentImageRequest;
import com.pulumi.azurenative.machinelearningservices.outputs.ACIServiceResponseResponseVnetConfiguration;
import com.pulumi.azurenative.machinelearningservices.outputs.ContainerResourceRequirementsResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.ModelResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.ServiceResponseBaseResponseError;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ACIServiceResponseResponse {
    /**
     * Whether or not Application Insights is enabled.
     * 
     */
    private final @Nullable Boolean appInsightsEnabled;
    /**
     * Whether or not authentication is enabled on the service.
     * 
     */
    private final @Nullable Boolean authEnabled;
    /**
     * The CName for the service.
     * 
     */
    private final @Nullable String cname;
    /**
     * The compute environment type for the service.
     * Expected value is 'ACI'.
     * 
     */
    private final String computeType;
    /**
     * The container resource requirements.
     * 
     */
    private final @Nullable ContainerResourceRequirementsResponse containerResourceRequirements;
    /**
     * Details of the data collection options specified.
     * 
     */
    private final @Nullable ACIServiceResponseResponseDataCollection dataCollection;
    /**
     * The deployment type for the service.
     * 
     */
    private final @Nullable String deploymentType;
    /**
     * The service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encryption properties.
     * 
     */
    private final @Nullable ACIServiceResponseResponseEncryptionProperties encryptionProperties;
    /**
     * The Environment, models and assets used for inferencing.
     * 
     */
    private final @Nullable ACIServiceResponseResponseEnvironmentImageRequest environmentImageRequest;
    /**
     * The error details.
     * 
     */
    private final ServiceResponseBaseResponseError error;
    /**
     * The service tag dictionary. Tags are mutable.
     * 
     */
    private final @Nullable Map<String,String> kvTags;
    /**
     * The name of the Azure location/region.
     * 
     */
    private final @Nullable String location;
    /**
     * Details on the models and configurations.
     * 
     */
    private final Map<String,Object> modelConfigMap;
    /**
     * The list of models.
     * 
     */
    private final @Nullable List<ModelResponse> models;
    /**
     * The service property dictionary. Properties are immutable.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * The public Fqdn for the service.
     * 
     */
    private final @Nullable String publicFqdn;
    /**
     * The public IP address for the service.
     * 
     */
    private final @Nullable String publicIp;
    /**
     * The Uri for sending scoring requests.
     * 
     */
    private final String scoringUri;
    /**
     * The public SSL certificate in PEM format to use if SSL is enabled.
     * 
     */
    private final @Nullable String sslCertificate;
    /**
     * Whether or not SSL is enabled.
     * 
     */
    private final @Nullable Boolean sslEnabled;
    /**
     * The public SSL key in PEM format for the certificate.
     * 
     */
    private final @Nullable String sslKey;
    /**
     * The current state of the service.
     * 
     */
    private final String state;
    /**
     * The Uri for sending swagger requests.
     * 
     */
    private final String swaggerUri;
    /**
     * The virtual network configuration.
     * 
     */
    private final @Nullable ACIServiceResponseResponseVnetConfiguration vnetConfiguration;

    @CustomType.Constructor
    private ACIServiceResponseResponse(
        @CustomType.Parameter("appInsightsEnabled") @Nullable Boolean appInsightsEnabled,
        @CustomType.Parameter("authEnabled") @Nullable Boolean authEnabled,
        @CustomType.Parameter("cname") @Nullable String cname,
        @CustomType.Parameter("computeType") String computeType,
        @CustomType.Parameter("containerResourceRequirements") @Nullable ContainerResourceRequirementsResponse containerResourceRequirements,
        @CustomType.Parameter("dataCollection") @Nullable ACIServiceResponseResponseDataCollection dataCollection,
        @CustomType.Parameter("deploymentType") @Nullable String deploymentType,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptionProperties") @Nullable ACIServiceResponseResponseEncryptionProperties encryptionProperties,
        @CustomType.Parameter("environmentImageRequest") @Nullable ACIServiceResponseResponseEnvironmentImageRequest environmentImageRequest,
        @CustomType.Parameter("error") ServiceResponseBaseResponseError error,
        @CustomType.Parameter("kvTags") @Nullable Map<String,String> kvTags,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("modelConfigMap") Map<String,Object> modelConfigMap,
        @CustomType.Parameter("models") @Nullable List<ModelResponse> models,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("publicFqdn") @Nullable String publicFqdn,
        @CustomType.Parameter("publicIp") @Nullable String publicIp,
        @CustomType.Parameter("scoringUri") String scoringUri,
        @CustomType.Parameter("sslCertificate") @Nullable String sslCertificate,
        @CustomType.Parameter("sslEnabled") @Nullable Boolean sslEnabled,
        @CustomType.Parameter("sslKey") @Nullable String sslKey,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("swaggerUri") String swaggerUri,
        @CustomType.Parameter("vnetConfiguration") @Nullable ACIServiceResponseResponseVnetConfiguration vnetConfiguration) {
        this.appInsightsEnabled = appInsightsEnabled;
        this.authEnabled = authEnabled;
        this.cname = cname;
        this.computeType = computeType;
        this.containerResourceRequirements = containerResourceRequirements;
        this.dataCollection = dataCollection;
        this.deploymentType = deploymentType;
        this.description = description;
        this.encryptionProperties = encryptionProperties;
        this.environmentImageRequest = environmentImageRequest;
        this.error = error;
        this.kvTags = kvTags;
        this.location = location;
        this.modelConfigMap = modelConfigMap;
        this.models = models;
        this.properties = properties;
        this.publicFqdn = publicFqdn;
        this.publicIp = publicIp;
        this.scoringUri = scoringUri;
        this.sslCertificate = sslCertificate;
        this.sslEnabled = sslEnabled;
        this.sslKey = sslKey;
        this.state = state;
        this.swaggerUri = swaggerUri;
        this.vnetConfiguration = vnetConfiguration;
    }

    /**
     * Whether or not Application Insights is enabled.
     * 
    */
    public Optional<Boolean> appInsightsEnabled() {
        return Optional.ofNullable(this.appInsightsEnabled);
    }
    /**
     * Whether or not authentication is enabled on the service.
     * 
    */
    public Optional<Boolean> authEnabled() {
        return Optional.ofNullable(this.authEnabled);
    }
    /**
     * The CName for the service.
     * 
    */
    public Optional<String> cname() {
        return Optional.ofNullable(this.cname);
    }
    /**
     * The compute environment type for the service.
     * Expected value is 'ACI'.
     * 
    */
    public String computeType() {
        return this.computeType;
    }
    /**
     * The container resource requirements.
     * 
    */
    public Optional<ContainerResourceRequirementsResponse> containerResourceRequirements() {
        return Optional.ofNullable(this.containerResourceRequirements);
    }
    /**
     * Details of the data collection options specified.
     * 
    */
    public Optional<ACIServiceResponseResponseDataCollection> dataCollection() {
        return Optional.ofNullable(this.dataCollection);
    }
    /**
     * The deployment type for the service.
     * 
    */
    public Optional<String> deploymentType() {
        return Optional.ofNullable(this.deploymentType);
    }
    /**
     * The service description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encryption properties.
     * 
    */
    public Optional<ACIServiceResponseResponseEncryptionProperties> encryptionProperties() {
        return Optional.ofNullable(this.encryptionProperties);
    }
    /**
     * The Environment, models and assets used for inferencing.
     * 
    */
    public Optional<ACIServiceResponseResponseEnvironmentImageRequest> environmentImageRequest() {
        return Optional.ofNullable(this.environmentImageRequest);
    }
    /**
     * The error details.
     * 
    */
    public ServiceResponseBaseResponseError error() {
        return this.error;
    }
    /**
     * The service tag dictionary. Tags are mutable.
     * 
    */
    public Map<String,String> kvTags() {
        return this.kvTags == null ? Map.of() : this.kvTags;
    }
    /**
     * The name of the Azure location/region.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Details on the models and configurations.
     * 
    */
    public Map<String,Object> modelConfigMap() {
        return this.modelConfigMap;
    }
    /**
     * The list of models.
     * 
    */
    public List<ModelResponse> models() {
        return this.models == null ? List.of() : this.models;
    }
    /**
     * The service property dictionary. Properties are immutable.
     * 
    */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * The public Fqdn for the service.
     * 
    */
    public Optional<String> publicFqdn() {
        return Optional.ofNullable(this.publicFqdn);
    }
    /**
     * The public IP address for the service.
     * 
    */
    public Optional<String> publicIp() {
        return Optional.ofNullable(this.publicIp);
    }
    /**
     * The Uri for sending scoring requests.
     * 
    */
    public String scoringUri() {
        return this.scoringUri;
    }
    /**
     * The public SSL certificate in PEM format to use if SSL is enabled.
     * 
    */
    public Optional<String> sslCertificate() {
        return Optional.ofNullable(this.sslCertificate);
    }
    /**
     * Whether or not SSL is enabled.
     * 
    */
    public Optional<Boolean> sslEnabled() {
        return Optional.ofNullable(this.sslEnabled);
    }
    /**
     * The public SSL key in PEM format for the certificate.
     * 
    */
    public Optional<String> sslKey() {
        return Optional.ofNullable(this.sslKey);
    }
    /**
     * The current state of the service.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * The Uri for sending swagger requests.
     * 
    */
    public String swaggerUri() {
        return this.swaggerUri;
    }
    /**
     * The virtual network configuration.
     * 
    */
    public Optional<ACIServiceResponseResponseVnetConfiguration> vnetConfiguration() {
        return Optional.ofNullable(this.vnetConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ACIServiceResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean appInsightsEnabled;
        private @Nullable Boolean authEnabled;
        private @Nullable String cname;
        private String computeType;
        private @Nullable ContainerResourceRequirementsResponse containerResourceRequirements;
        private @Nullable ACIServiceResponseResponseDataCollection dataCollection;
        private @Nullable String deploymentType;
        private @Nullable String description;
        private @Nullable ACIServiceResponseResponseEncryptionProperties encryptionProperties;
        private @Nullable ACIServiceResponseResponseEnvironmentImageRequest environmentImageRequest;
        private ServiceResponseBaseResponseError error;
        private @Nullable Map<String,String> kvTags;
        private @Nullable String location;
        private Map<String,Object> modelConfigMap;
        private @Nullable List<ModelResponse> models;
        private @Nullable Map<String,String> properties;
        private @Nullable String publicFqdn;
        private @Nullable String publicIp;
        private String scoringUri;
        private @Nullable String sslCertificate;
        private @Nullable Boolean sslEnabled;
        private @Nullable String sslKey;
        private String state;
        private String swaggerUri;
        private @Nullable ACIServiceResponseResponseVnetConfiguration vnetConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ACIServiceResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appInsightsEnabled = defaults.appInsightsEnabled;
    	      this.authEnabled = defaults.authEnabled;
    	      this.cname = defaults.cname;
    	      this.computeType = defaults.computeType;
    	      this.containerResourceRequirements = defaults.containerResourceRequirements;
    	      this.dataCollection = defaults.dataCollection;
    	      this.deploymentType = defaults.deploymentType;
    	      this.description = defaults.description;
    	      this.encryptionProperties = defaults.encryptionProperties;
    	      this.environmentImageRequest = defaults.environmentImageRequest;
    	      this.error = defaults.error;
    	      this.kvTags = defaults.kvTags;
    	      this.location = defaults.location;
    	      this.modelConfigMap = defaults.modelConfigMap;
    	      this.models = defaults.models;
    	      this.properties = defaults.properties;
    	      this.publicFqdn = defaults.publicFqdn;
    	      this.publicIp = defaults.publicIp;
    	      this.scoringUri = defaults.scoringUri;
    	      this.sslCertificate = defaults.sslCertificate;
    	      this.sslEnabled = defaults.sslEnabled;
    	      this.sslKey = defaults.sslKey;
    	      this.state = defaults.state;
    	      this.swaggerUri = defaults.swaggerUri;
    	      this.vnetConfiguration = defaults.vnetConfiguration;
        }

        public Builder appInsightsEnabled(@Nullable Boolean appInsightsEnabled) {
            this.appInsightsEnabled = appInsightsEnabled;
            return this;
        }
        public Builder authEnabled(@Nullable Boolean authEnabled) {
            this.authEnabled = authEnabled;
            return this;
        }
        public Builder cname(@Nullable String cname) {
            this.cname = cname;
            return this;
        }
        public Builder computeType(String computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }
        public Builder containerResourceRequirements(@Nullable ContainerResourceRequirementsResponse containerResourceRequirements) {
            this.containerResourceRequirements = containerResourceRequirements;
            return this;
        }
        public Builder dataCollection(@Nullable ACIServiceResponseResponseDataCollection dataCollection) {
            this.dataCollection = dataCollection;
            return this;
        }
        public Builder deploymentType(@Nullable String deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encryptionProperties(@Nullable ACIServiceResponseResponseEncryptionProperties encryptionProperties) {
            this.encryptionProperties = encryptionProperties;
            return this;
        }
        public Builder environmentImageRequest(@Nullable ACIServiceResponseResponseEnvironmentImageRequest environmentImageRequest) {
            this.environmentImageRequest = environmentImageRequest;
            return this;
        }
        public Builder error(ServiceResponseBaseResponseError error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder kvTags(@Nullable Map<String,String> kvTags) {
            this.kvTags = kvTags;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder modelConfigMap(Map<String,Object> modelConfigMap) {
            this.modelConfigMap = Objects.requireNonNull(modelConfigMap);
            return this;
        }
        public Builder models(@Nullable List<ModelResponse> models) {
            this.models = models;
            return this;
        }
        public Builder models(ModelResponse... models) {
            return models(List.of(models));
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder publicFqdn(@Nullable String publicFqdn) {
            this.publicFqdn = publicFqdn;
            return this;
        }
        public Builder publicIp(@Nullable String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public Builder scoringUri(String scoringUri) {
            this.scoringUri = Objects.requireNonNull(scoringUri);
            return this;
        }
        public Builder sslCertificate(@Nullable String sslCertificate) {
            this.sslCertificate = sslCertificate;
            return this;
        }
        public Builder sslEnabled(@Nullable Boolean sslEnabled) {
            this.sslEnabled = sslEnabled;
            return this;
        }
        public Builder sslKey(@Nullable String sslKey) {
            this.sslKey = sslKey;
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder swaggerUri(String swaggerUri) {
            this.swaggerUri = Objects.requireNonNull(swaggerUri);
            return this;
        }
        public Builder vnetConfiguration(@Nullable ACIServiceResponseResponseVnetConfiguration vnetConfiguration) {
            this.vnetConfiguration = vnetConfiguration;
            return this;
        }        public ACIServiceResponseResponse build() {
            return new ACIServiceResponseResponse(appInsightsEnabled, authEnabled, cname, computeType, containerResourceRequirements, dataCollection, deploymentType, description, encryptionProperties, environmentImageRequest, error, kvTags, location, modelConfigMap, models, properties, publicFqdn, publicIp, scoringUri, sslCertificate, sslEnabled, sslKey, state, swaggerUri, vnetConfiguration);
        }
    }
}
