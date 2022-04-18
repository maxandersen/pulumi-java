// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.opensearchservice.outputs;

import com.pulumi.awsnative.opensearchservice.outputs.DomainClusterConfig;
import com.pulumi.awsnative.opensearchservice.outputs.DomainCognitoOptions;
import com.pulumi.awsnative.opensearchservice.outputs.DomainEBSOptions;
import com.pulumi.awsnative.opensearchservice.outputs.DomainEncryptionAtRestOptions;
import com.pulumi.awsnative.opensearchservice.outputs.DomainEndpointOptions;
import com.pulumi.awsnative.opensearchservice.outputs.DomainNodeToNodeEncryptionOptions;
import com.pulumi.awsnative.opensearchservice.outputs.DomainServiceSoftwareOptions;
import com.pulumi.awsnative.opensearchservice.outputs.DomainSnapshotOptions;
import com.pulumi.awsnative.opensearchservice.outputs.DomainTag;
import com.pulumi.awsnative.opensearchservice.outputs.DomainVPCOptions;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainResult {
    private final @Nullable Object accessPolicies;
    private final @Nullable Object advancedOptions;
    private final @Nullable String arn;
    private final @Nullable DomainClusterConfig clusterConfig;
    private final @Nullable DomainCognitoOptions cognitoOptions;
    private final @Nullable String domainArn;
    private final @Nullable String domainEndpoint;
    private final @Nullable DomainEndpointOptions domainEndpointOptions;
    private final @Nullable Object domainEndpoints;
    private final @Nullable DomainEBSOptions eBSOptions;
    private final @Nullable DomainEncryptionAtRestOptions encryptionAtRestOptions;
    private final @Nullable String engineVersion;
    private final @Nullable String id;
    private final @Nullable Object logPublishingOptions;
    private final @Nullable DomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;
    private final @Nullable DomainServiceSoftwareOptions serviceSoftwareOptions;
    private final @Nullable DomainSnapshotOptions snapshotOptions;
    /**
     * An arbitrary set of tags (key-value pairs) for this Domain.
     * 
     */
    private final @Nullable List<DomainTag> tags;
    private final @Nullable DomainVPCOptions vPCOptions;

    @CustomType.Constructor
    private GetDomainResult(
        @CustomType.Parameter("accessPolicies") @Nullable Object accessPolicies,
        @CustomType.Parameter("advancedOptions") @Nullable Object advancedOptions,
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("clusterConfig") @Nullable DomainClusterConfig clusterConfig,
        @CustomType.Parameter("cognitoOptions") @Nullable DomainCognitoOptions cognitoOptions,
        @CustomType.Parameter("domainArn") @Nullable String domainArn,
        @CustomType.Parameter("domainEndpoint") @Nullable String domainEndpoint,
        @CustomType.Parameter("domainEndpointOptions") @Nullable DomainEndpointOptions domainEndpointOptions,
        @CustomType.Parameter("domainEndpoints") @Nullable Object domainEndpoints,
        @CustomType.Parameter("eBSOptions") @Nullable DomainEBSOptions eBSOptions,
        @CustomType.Parameter("encryptionAtRestOptions") @Nullable DomainEncryptionAtRestOptions encryptionAtRestOptions,
        @CustomType.Parameter("engineVersion") @Nullable String engineVersion,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("logPublishingOptions") @Nullable Object logPublishingOptions,
        @CustomType.Parameter("nodeToNodeEncryptionOptions") @Nullable DomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions,
        @CustomType.Parameter("serviceSoftwareOptions") @Nullable DomainServiceSoftwareOptions serviceSoftwareOptions,
        @CustomType.Parameter("snapshotOptions") @Nullable DomainSnapshotOptions snapshotOptions,
        @CustomType.Parameter("tags") @Nullable List<DomainTag> tags,
        @CustomType.Parameter("vPCOptions") @Nullable DomainVPCOptions vPCOptions) {
        this.accessPolicies = accessPolicies;
        this.advancedOptions = advancedOptions;
        this.arn = arn;
        this.clusterConfig = clusterConfig;
        this.cognitoOptions = cognitoOptions;
        this.domainArn = domainArn;
        this.domainEndpoint = domainEndpoint;
        this.domainEndpointOptions = domainEndpointOptions;
        this.domainEndpoints = domainEndpoints;
        this.eBSOptions = eBSOptions;
        this.encryptionAtRestOptions = encryptionAtRestOptions;
        this.engineVersion = engineVersion;
        this.id = id;
        this.logPublishingOptions = logPublishingOptions;
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
        this.serviceSoftwareOptions = serviceSoftwareOptions;
        this.snapshotOptions = snapshotOptions;
        this.tags = tags;
        this.vPCOptions = vPCOptions;
    }

    public Optional<Object> accessPolicies() {
        return Optional.ofNullable(this.accessPolicies);
    }
    public Optional<Object> advancedOptions() {
        return Optional.ofNullable(this.advancedOptions);
    }
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<DomainClusterConfig> clusterConfig() {
        return Optional.ofNullable(this.clusterConfig);
    }
    public Optional<DomainCognitoOptions> cognitoOptions() {
        return Optional.ofNullable(this.cognitoOptions);
    }
    public Optional<String> domainArn() {
        return Optional.ofNullable(this.domainArn);
    }
    public Optional<String> domainEndpoint() {
        return Optional.ofNullable(this.domainEndpoint);
    }
    public Optional<DomainEndpointOptions> domainEndpointOptions() {
        return Optional.ofNullable(this.domainEndpointOptions);
    }
    public Optional<Object> domainEndpoints() {
        return Optional.ofNullable(this.domainEndpoints);
    }
    public Optional<DomainEBSOptions> eBSOptions() {
        return Optional.ofNullable(this.eBSOptions);
    }
    public Optional<DomainEncryptionAtRestOptions> encryptionAtRestOptions() {
        return Optional.ofNullable(this.encryptionAtRestOptions);
    }
    public Optional<String> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<Object> logPublishingOptions() {
        return Optional.ofNullable(this.logPublishingOptions);
    }
    public Optional<DomainNodeToNodeEncryptionOptions> nodeToNodeEncryptionOptions() {
        return Optional.ofNullable(this.nodeToNodeEncryptionOptions);
    }
    public Optional<DomainServiceSoftwareOptions> serviceSoftwareOptions() {
        return Optional.ofNullable(this.serviceSoftwareOptions);
    }
    public Optional<DomainSnapshotOptions> snapshotOptions() {
        return Optional.ofNullable(this.snapshotOptions);
    }
    /**
     * An arbitrary set of tags (key-value pairs) for this Domain.
     * 
    */
    public List<DomainTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<DomainVPCOptions> vPCOptions() {
        return Optional.ofNullable(this.vPCOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object accessPolicies;
        private @Nullable Object advancedOptions;
        private @Nullable String arn;
        private @Nullable DomainClusterConfig clusterConfig;
        private @Nullable DomainCognitoOptions cognitoOptions;
        private @Nullable String domainArn;
        private @Nullable String domainEndpoint;
        private @Nullable DomainEndpointOptions domainEndpointOptions;
        private @Nullable Object domainEndpoints;
        private @Nullable DomainEBSOptions eBSOptions;
        private @Nullable DomainEncryptionAtRestOptions encryptionAtRestOptions;
        private @Nullable String engineVersion;
        private @Nullable String id;
        private @Nullable Object logPublishingOptions;
        private @Nullable DomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;
        private @Nullable DomainServiceSoftwareOptions serviceSoftwareOptions;
        private @Nullable DomainSnapshotOptions snapshotOptions;
        private @Nullable List<DomainTag> tags;
        private @Nullable DomainVPCOptions vPCOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.advancedOptions = defaults.advancedOptions;
    	      this.arn = defaults.arn;
    	      this.clusterConfig = defaults.clusterConfig;
    	      this.cognitoOptions = defaults.cognitoOptions;
    	      this.domainArn = defaults.domainArn;
    	      this.domainEndpoint = defaults.domainEndpoint;
    	      this.domainEndpointOptions = defaults.domainEndpointOptions;
    	      this.domainEndpoints = defaults.domainEndpoints;
    	      this.eBSOptions = defaults.eBSOptions;
    	      this.encryptionAtRestOptions = defaults.encryptionAtRestOptions;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.logPublishingOptions = defaults.logPublishingOptions;
    	      this.nodeToNodeEncryptionOptions = defaults.nodeToNodeEncryptionOptions;
    	      this.serviceSoftwareOptions = defaults.serviceSoftwareOptions;
    	      this.snapshotOptions = defaults.snapshotOptions;
    	      this.tags = defaults.tags;
    	      this.vPCOptions = defaults.vPCOptions;
        }

        public Builder accessPolicies(@Nullable Object accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }
        public Builder advancedOptions(@Nullable Object advancedOptions) {
            this.advancedOptions = advancedOptions;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder clusterConfig(@Nullable DomainClusterConfig clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
        }
        public Builder cognitoOptions(@Nullable DomainCognitoOptions cognitoOptions) {
            this.cognitoOptions = cognitoOptions;
            return this;
        }
        public Builder domainArn(@Nullable String domainArn) {
            this.domainArn = domainArn;
            return this;
        }
        public Builder domainEndpoint(@Nullable String domainEndpoint) {
            this.domainEndpoint = domainEndpoint;
            return this;
        }
        public Builder domainEndpointOptions(@Nullable DomainEndpointOptions domainEndpointOptions) {
            this.domainEndpointOptions = domainEndpointOptions;
            return this;
        }
        public Builder domainEndpoints(@Nullable Object domainEndpoints) {
            this.domainEndpoints = domainEndpoints;
            return this;
        }
        public Builder eBSOptions(@Nullable DomainEBSOptions eBSOptions) {
            this.eBSOptions = eBSOptions;
            return this;
        }
        public Builder encryptionAtRestOptions(@Nullable DomainEncryptionAtRestOptions encryptionAtRestOptions) {
            this.encryptionAtRestOptions = encryptionAtRestOptions;
            return this;
        }
        public Builder engineVersion(@Nullable String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder logPublishingOptions(@Nullable Object logPublishingOptions) {
            this.logPublishingOptions = logPublishingOptions;
            return this;
        }
        public Builder nodeToNodeEncryptionOptions(@Nullable DomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
            this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
            return this;
        }
        public Builder serviceSoftwareOptions(@Nullable DomainServiceSoftwareOptions serviceSoftwareOptions) {
            this.serviceSoftwareOptions = serviceSoftwareOptions;
            return this;
        }
        public Builder snapshotOptions(@Nullable DomainSnapshotOptions snapshotOptions) {
            this.snapshotOptions = snapshotOptions;
            return this;
        }
        public Builder tags(@Nullable List<DomainTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DomainTag... tags) {
            return tags(List.of(tags));
        }
        public Builder vPCOptions(@Nullable DomainVPCOptions vPCOptions) {
            this.vPCOptions = vPCOptions;
            return this;
        }        public GetDomainResult build() {
            return new GetDomainResult(accessPolicies, advancedOptions, arn, clusterConfig, cognitoOptions, domainArn, domainEndpoint, domainEndpointOptions, domainEndpoints, eBSOptions, encryptionAtRestOptions, engineVersion, id, logPublishingOptions, nodeToNodeEncryptionOptions, serviceSoftwareOptions, snapshotOptions, tags, vPCOptions);
        }
    }
}
