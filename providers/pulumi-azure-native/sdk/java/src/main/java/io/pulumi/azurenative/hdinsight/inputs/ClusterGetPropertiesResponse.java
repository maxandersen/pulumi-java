// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.inputs.ClusterDefinitionResponse;
import io.pulumi.azurenative.hdinsight.inputs.ComputeIsolationPropertiesResponse;
import io.pulumi.azurenative.hdinsight.inputs.ComputeProfileResponse;
import io.pulumi.azurenative.hdinsight.inputs.ConnectivityEndpointResponse;
import io.pulumi.azurenative.hdinsight.inputs.DiskEncryptionPropertiesResponse;
import io.pulumi.azurenative.hdinsight.inputs.EncryptionInTransitPropertiesResponse;
import io.pulumi.azurenative.hdinsight.inputs.ErrorsResponse;
import io.pulumi.azurenative.hdinsight.inputs.ExcludedServicesConfigResponse;
import io.pulumi.azurenative.hdinsight.inputs.KafkaRestPropertiesResponse;
import io.pulumi.azurenative.hdinsight.inputs.NetworkPropertiesResponse;
import io.pulumi.azurenative.hdinsight.inputs.QuotaInfoResponse;
import io.pulumi.azurenative.hdinsight.inputs.SecurityProfileResponse;
import io.pulumi.azurenative.hdinsight.inputs.StorageProfileResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of cluster.
 * 
 */
public final class ClusterGetPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterGetPropertiesResponse Empty = new ClusterGetPropertiesResponse();

    /**
     * The cluster definition.
     * 
     */
    @Import(name="clusterDefinition", required=true)
      private final ClusterDefinitionResponse clusterDefinition;

    public ClusterDefinitionResponse clusterDefinition() {
        return this.clusterDefinition;
    }

    /**
     * The hdp version of the cluster.
     * 
     */
    @Import(name="clusterHdpVersion")
      private final @Nullable String clusterHdpVersion;

    public Optional<String> clusterHdpVersion() {
        return this.clusterHdpVersion == null ? Optional.empty() : Optional.ofNullable(this.clusterHdpVersion);
    }

    /**
     * The cluster id.
     * 
     */
    @Import(name="clusterId")
      private final @Nullable String clusterId;

    public Optional<String> clusterId() {
        return this.clusterId == null ? Optional.empty() : Optional.ofNullable(this.clusterId);
    }

    /**
     * The state of the cluster.
     * 
     */
    @Import(name="clusterState")
      private final @Nullable String clusterState;

    public Optional<String> clusterState() {
        return this.clusterState == null ? Optional.empty() : Optional.ofNullable(this.clusterState);
    }

    /**
     * The version of the cluster.
     * 
     */
    @Import(name="clusterVersion")
      private final @Nullable String clusterVersion;

    public Optional<String> clusterVersion() {
        return this.clusterVersion == null ? Optional.empty() : Optional.ofNullable(this.clusterVersion);
    }

    /**
     * The compute isolation properties.
     * 
     */
    @Import(name="computeIsolationProperties")
      private final @Nullable ComputeIsolationPropertiesResponse computeIsolationProperties;

    public Optional<ComputeIsolationPropertiesResponse> computeIsolationProperties() {
        return this.computeIsolationProperties == null ? Optional.empty() : Optional.ofNullable(this.computeIsolationProperties);
    }

    /**
     * The compute profile.
     * 
     */
    @Import(name="computeProfile")
      private final @Nullable ComputeProfileResponse computeProfile;

    public Optional<ComputeProfileResponse> computeProfile() {
        return this.computeProfile == null ? Optional.empty() : Optional.ofNullable(this.computeProfile);
    }

    /**
     * The list of connectivity endpoints.
     * 
     */
    @Import(name="connectivityEndpoints")
      private final @Nullable List<ConnectivityEndpointResponse> connectivityEndpoints;

    public List<ConnectivityEndpointResponse> connectivityEndpoints() {
        return this.connectivityEndpoints == null ? List.of() : this.connectivityEndpoints;
    }

    /**
     * The date on which the cluster was created.
     * 
     */
    @Import(name="createdDate")
      private final @Nullable String createdDate;

    public Optional<String> createdDate() {
        return this.createdDate == null ? Optional.empty() : Optional.ofNullable(this.createdDate);
    }

    /**
     * The disk encryption properties.
     * 
     */
    @Import(name="diskEncryptionProperties")
      private final @Nullable DiskEncryptionPropertiesResponse diskEncryptionProperties;

    public Optional<DiskEncryptionPropertiesResponse> diskEncryptionProperties() {
        return this.diskEncryptionProperties == null ? Optional.empty() : Optional.ofNullable(this.diskEncryptionProperties);
    }

    /**
     * The encryption-in-transit properties.
     * 
     */
    @Import(name="encryptionInTransitProperties")
      private final @Nullable EncryptionInTransitPropertiesResponse encryptionInTransitProperties;

    public Optional<EncryptionInTransitPropertiesResponse> encryptionInTransitProperties() {
        return this.encryptionInTransitProperties == null ? Optional.empty() : Optional.ofNullable(this.encryptionInTransitProperties);
    }

    /**
     * The list of errors.
     * 
     */
    @Import(name="errors")
      private final @Nullable List<ErrorsResponse> errors;

    public List<ErrorsResponse> errors() {
        return this.errors == null ? List.of() : this.errors;
    }

    /**
     * The excluded services config.
     * 
     */
    @Import(name="excludedServicesConfig")
      private final @Nullable ExcludedServicesConfigResponse excludedServicesConfig;

    public Optional<ExcludedServicesConfigResponse> excludedServicesConfig() {
        return this.excludedServicesConfig == null ? Optional.empty() : Optional.ofNullable(this.excludedServicesConfig);
    }

    /**
     * The cluster kafka rest proxy configuration.
     * 
     */
    @Import(name="kafkaRestProperties")
      private final @Nullable KafkaRestPropertiesResponse kafkaRestProperties;

    public Optional<KafkaRestPropertiesResponse> kafkaRestProperties() {
        return this.kafkaRestProperties == null ? Optional.empty() : Optional.ofNullable(this.kafkaRestProperties);
    }

    /**
     * The minimal supported tls version.
     * 
     */
    @Import(name="minSupportedTlsVersion")
      private final @Nullable String minSupportedTlsVersion;

    public Optional<String> minSupportedTlsVersion() {
        return this.minSupportedTlsVersion == null ? Optional.empty() : Optional.ofNullable(this.minSupportedTlsVersion);
    }

    /**
     * The network properties.
     * 
     */
    @Import(name="networkProperties")
      private final @Nullable NetworkPropertiesResponse networkProperties;

    public Optional<NetworkPropertiesResponse> networkProperties() {
        return this.networkProperties == null ? Optional.empty() : Optional.ofNullable(this.networkProperties);
    }

    /**
     * The type of operating system.
     * 
     */
    @Import(name="osType")
      private final @Nullable String osType;

    public Optional<String> osType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable String provisioningState;

    public Optional<String> provisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    /**
     * The quota information.
     * 
     */
    @Import(name="quotaInfo")
      private final @Nullable QuotaInfoResponse quotaInfo;

    public Optional<QuotaInfoResponse> quotaInfo() {
        return this.quotaInfo == null ? Optional.empty() : Optional.ofNullable(this.quotaInfo);
    }

    /**
     * The security profile.
     * 
     */
    @Import(name="securityProfile")
      private final @Nullable SecurityProfileResponse securityProfile;

    public Optional<SecurityProfileResponse> securityProfile() {
        return this.securityProfile == null ? Optional.empty() : Optional.ofNullable(this.securityProfile);
    }

    /**
     * The storage profile.
     * 
     */
    @Import(name="storageProfile")
      private final @Nullable StorageProfileResponse storageProfile;

    public Optional<StorageProfileResponse> storageProfile() {
        return this.storageProfile == null ? Optional.empty() : Optional.ofNullable(this.storageProfile);
    }

    /**
     * The cluster tier.
     * 
     */
    @Import(name="tier")
      private final @Nullable String tier;

    public Optional<String> tier() {
        return this.tier == null ? Optional.empty() : Optional.ofNullable(this.tier);
    }

    public ClusterGetPropertiesResponse(
        ClusterDefinitionResponse clusterDefinition,
        @Nullable String clusterHdpVersion,
        @Nullable String clusterId,
        @Nullable String clusterState,
        @Nullable String clusterVersion,
        @Nullable ComputeIsolationPropertiesResponse computeIsolationProperties,
        @Nullable ComputeProfileResponse computeProfile,
        @Nullable List<ConnectivityEndpointResponse> connectivityEndpoints,
        @Nullable String createdDate,
        @Nullable DiskEncryptionPropertiesResponse diskEncryptionProperties,
        @Nullable EncryptionInTransitPropertiesResponse encryptionInTransitProperties,
        @Nullable List<ErrorsResponse> errors,
        @Nullable ExcludedServicesConfigResponse excludedServicesConfig,
        @Nullable KafkaRestPropertiesResponse kafkaRestProperties,
        @Nullable String minSupportedTlsVersion,
        @Nullable NetworkPropertiesResponse networkProperties,
        @Nullable String osType,
        @Nullable String provisioningState,
        @Nullable QuotaInfoResponse quotaInfo,
        @Nullable SecurityProfileResponse securityProfile,
        @Nullable StorageProfileResponse storageProfile,
        @Nullable String tier) {
        this.clusterDefinition = Objects.requireNonNull(clusterDefinition, "expected parameter 'clusterDefinition' to be non-null");
        this.clusterHdpVersion = clusterHdpVersion;
        this.clusterId = clusterId;
        this.clusterState = clusterState;
        this.clusterVersion = clusterVersion;
        this.computeIsolationProperties = computeIsolationProperties;
        this.computeProfile = computeProfile;
        this.connectivityEndpoints = connectivityEndpoints;
        this.createdDate = createdDate;
        this.diskEncryptionProperties = diskEncryptionProperties;
        this.encryptionInTransitProperties = encryptionInTransitProperties;
        this.errors = errors;
        this.excludedServicesConfig = excludedServicesConfig;
        this.kafkaRestProperties = kafkaRestProperties;
        this.minSupportedTlsVersion = minSupportedTlsVersion;
        this.networkProperties = networkProperties;
        this.osType = osType;
        this.provisioningState = provisioningState;
        this.quotaInfo = quotaInfo;
        this.securityProfile = securityProfile;
        this.storageProfile = storageProfile;
        this.tier = tier;
    }

    private ClusterGetPropertiesResponse() {
        this.clusterDefinition = null;
        this.clusterHdpVersion = null;
        this.clusterId = null;
        this.clusterState = null;
        this.clusterVersion = null;
        this.computeIsolationProperties = null;
        this.computeProfile = null;
        this.connectivityEndpoints = List.of();
        this.createdDate = null;
        this.diskEncryptionProperties = null;
        this.encryptionInTransitProperties = null;
        this.errors = List.of();
        this.excludedServicesConfig = null;
        this.kafkaRestProperties = null;
        this.minSupportedTlsVersion = null;
        this.networkProperties = null;
        this.osType = null;
        this.provisioningState = null;
        this.quotaInfo = null;
        this.securityProfile = null;
        this.storageProfile = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterGetPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterDefinitionResponse clusterDefinition;
        private @Nullable String clusterHdpVersion;
        private @Nullable String clusterId;
        private @Nullable String clusterState;
        private @Nullable String clusterVersion;
        private @Nullable ComputeIsolationPropertiesResponse computeIsolationProperties;
        private @Nullable ComputeProfileResponse computeProfile;
        private @Nullable List<ConnectivityEndpointResponse> connectivityEndpoints;
        private @Nullable String createdDate;
        private @Nullable DiskEncryptionPropertiesResponse diskEncryptionProperties;
        private @Nullable EncryptionInTransitPropertiesResponse encryptionInTransitProperties;
        private @Nullable List<ErrorsResponse> errors;
        private @Nullable ExcludedServicesConfigResponse excludedServicesConfig;
        private @Nullable KafkaRestPropertiesResponse kafkaRestProperties;
        private @Nullable String minSupportedTlsVersion;
        private @Nullable NetworkPropertiesResponse networkProperties;
        private @Nullable String osType;
        private @Nullable String provisioningState;
        private @Nullable QuotaInfoResponse quotaInfo;
        private @Nullable SecurityProfileResponse securityProfile;
        private @Nullable StorageProfileResponse storageProfile;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterGetPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterDefinition = defaults.clusterDefinition;
    	      this.clusterHdpVersion = defaults.clusterHdpVersion;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterState = defaults.clusterState;
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.computeIsolationProperties = defaults.computeIsolationProperties;
    	      this.computeProfile = defaults.computeProfile;
    	      this.connectivityEndpoints = defaults.connectivityEndpoints;
    	      this.createdDate = defaults.createdDate;
    	      this.diskEncryptionProperties = defaults.diskEncryptionProperties;
    	      this.encryptionInTransitProperties = defaults.encryptionInTransitProperties;
    	      this.errors = defaults.errors;
    	      this.excludedServicesConfig = defaults.excludedServicesConfig;
    	      this.kafkaRestProperties = defaults.kafkaRestProperties;
    	      this.minSupportedTlsVersion = defaults.minSupportedTlsVersion;
    	      this.networkProperties = defaults.networkProperties;
    	      this.osType = defaults.osType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.quotaInfo = defaults.quotaInfo;
    	      this.securityProfile = defaults.securityProfile;
    	      this.storageProfile = defaults.storageProfile;
    	      this.tier = defaults.tier;
        }

        public Builder clusterDefinition(ClusterDefinitionResponse clusterDefinition) {
            this.clusterDefinition = Objects.requireNonNull(clusterDefinition);
            return this;
        }
        public Builder clusterHdpVersion(@Nullable String clusterHdpVersion) {
            this.clusterHdpVersion = clusterHdpVersion;
            return this;
        }
        public Builder clusterId(@Nullable String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public Builder clusterState(@Nullable String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public Builder clusterVersion(@Nullable String clusterVersion) {
            this.clusterVersion = clusterVersion;
            return this;
        }
        public Builder computeIsolationProperties(@Nullable ComputeIsolationPropertiesResponse computeIsolationProperties) {
            this.computeIsolationProperties = computeIsolationProperties;
            return this;
        }
        public Builder computeProfile(@Nullable ComputeProfileResponse computeProfile) {
            this.computeProfile = computeProfile;
            return this;
        }
        public Builder connectivityEndpoints(@Nullable List<ConnectivityEndpointResponse> connectivityEndpoints) {
            this.connectivityEndpoints = connectivityEndpoints;
            return this;
        }
        public Builder connectivityEndpoints(ConnectivityEndpointResponse... connectivityEndpoints) {
            return connectivityEndpoints(List.of(connectivityEndpoints));
        }
        public Builder createdDate(@Nullable String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public Builder diskEncryptionProperties(@Nullable DiskEncryptionPropertiesResponse diskEncryptionProperties) {
            this.diskEncryptionProperties = diskEncryptionProperties;
            return this;
        }
        public Builder encryptionInTransitProperties(@Nullable EncryptionInTransitPropertiesResponse encryptionInTransitProperties) {
            this.encryptionInTransitProperties = encryptionInTransitProperties;
            return this;
        }
        public Builder errors(@Nullable List<ErrorsResponse> errors) {
            this.errors = errors;
            return this;
        }
        public Builder errors(ErrorsResponse... errors) {
            return errors(List.of(errors));
        }
        public Builder excludedServicesConfig(@Nullable ExcludedServicesConfigResponse excludedServicesConfig) {
            this.excludedServicesConfig = excludedServicesConfig;
            return this;
        }
        public Builder kafkaRestProperties(@Nullable KafkaRestPropertiesResponse kafkaRestProperties) {
            this.kafkaRestProperties = kafkaRestProperties;
            return this;
        }
        public Builder minSupportedTlsVersion(@Nullable String minSupportedTlsVersion) {
            this.minSupportedTlsVersion = minSupportedTlsVersion;
            return this;
        }
        public Builder networkProperties(@Nullable NetworkPropertiesResponse networkProperties) {
            this.networkProperties = networkProperties;
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder quotaInfo(@Nullable QuotaInfoResponse quotaInfo) {
            this.quotaInfo = quotaInfo;
            return this;
        }
        public Builder securityProfile(@Nullable SecurityProfileResponse securityProfile) {
            this.securityProfile = securityProfile;
            return this;
        }
        public Builder storageProfile(@Nullable StorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public ClusterGetPropertiesResponse build() {
            return new ClusterGetPropertiesResponse(clusterDefinition, clusterHdpVersion, clusterId, clusterState, clusterVersion, computeIsolationProperties, computeProfile, connectivityEndpoints, createdDate, diskEncryptionProperties, encryptionInTransitProperties, errors, excludedServicesConfig, kafkaRestProperties, minSupportedTlsVersion, networkProperties, osType, provisioningState, quotaInfo, securityProfile, storageProfile, tier);
        }
    }
}
