// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.outputs;

import com.pulumi.awsnative.mediapackage.outputs.AssetEgressEndpoint;
import com.pulumi.awsnative.mediapackage.outputs.AssetTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAssetResult {
    /**
     * @return The ARN of the Asset.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return The time the Asset was initially submitted for Ingest.
     * 
     */
    private final @Nullable String createdAt;
    /**
     * @return The list of egress endpoints available for the Asset.
     * 
     */
    private final @Nullable List<AssetEgressEndpoint> egressEndpoints;
    /**
     * @return The unique identifier for the Asset.
     * 
     */
    private final @Nullable String id;
    /**
     * @return The ID of the PackagingGroup for the Asset.
     * 
     */
    private final @Nullable String packagingGroupId;
    /**
     * @return The resource ID to include in SPEKE key requests.
     * 
     */
    private final @Nullable String resourceId;
    /**
     * @return ARN of the source object in S3.
     * 
     */
    private final @Nullable String sourceArn;
    /**
     * @return The IAM role_arn used to access the source S3 bucket.
     * 
     */
    private final @Nullable String sourceRoleArn;
    /**
     * @return A collection of tags associated with a resource
     * 
     */
    private final @Nullable List<AssetTag> tags;

    @CustomType.Constructor
    private GetAssetResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("createdAt") @Nullable String createdAt,
        @CustomType.Parameter("egressEndpoints") @Nullable List<AssetEgressEndpoint> egressEndpoints,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("packagingGroupId") @Nullable String packagingGroupId,
        @CustomType.Parameter("resourceId") @Nullable String resourceId,
        @CustomType.Parameter("sourceArn") @Nullable String sourceArn,
        @CustomType.Parameter("sourceRoleArn") @Nullable String sourceRoleArn,
        @CustomType.Parameter("tags") @Nullable List<AssetTag> tags) {
        this.arn = arn;
        this.createdAt = createdAt;
        this.egressEndpoints = egressEndpoints;
        this.id = id;
        this.packagingGroupId = packagingGroupId;
        this.resourceId = resourceId;
        this.sourceArn = sourceArn;
        this.sourceRoleArn = sourceRoleArn;
        this.tags = tags;
    }

    /**
     * @return The ARN of the Asset.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The time the Asset was initially submitted for Ingest.
     * 
     */
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * @return The list of egress endpoints available for the Asset.
     * 
     */
    public List<AssetEgressEndpoint> egressEndpoints() {
        return this.egressEndpoints == null ? List.of() : this.egressEndpoints;
    }
    /**
     * @return The unique identifier for the Asset.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The ID of the PackagingGroup for the Asset.
     * 
     */
    public Optional<String> packagingGroupId() {
        return Optional.ofNullable(this.packagingGroupId);
    }
    /**
     * @return The resource ID to include in SPEKE key requests.
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * @return ARN of the source object in S3.
     * 
     */
    public Optional<String> sourceArn() {
        return Optional.ofNullable(this.sourceArn);
    }
    /**
     * @return The IAM role_arn used to access the source S3 bucket.
     * 
     */
    public Optional<String> sourceRoleArn() {
        return Optional.ofNullable(this.sourceRoleArn);
    }
    /**
     * @return A collection of tags associated with a resource
     * 
     */
    public List<AssetTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdAt;
        private @Nullable List<AssetEgressEndpoint> egressEndpoints;
        private @Nullable String id;
        private @Nullable String packagingGroupId;
        private @Nullable String resourceId;
        private @Nullable String sourceArn;
        private @Nullable String sourceRoleArn;
        private @Nullable List<AssetTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdAt = defaults.createdAt;
    	      this.egressEndpoints = defaults.egressEndpoints;
    	      this.id = defaults.id;
    	      this.packagingGroupId = defaults.packagingGroupId;
    	      this.resourceId = defaults.resourceId;
    	      this.sourceArn = defaults.sourceArn;
    	      this.sourceRoleArn = defaults.sourceRoleArn;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder egressEndpoints(@Nullable List<AssetEgressEndpoint> egressEndpoints) {
            this.egressEndpoints = egressEndpoints;
            return this;
        }
        public Builder egressEndpoints(AssetEgressEndpoint... egressEndpoints) {
            return egressEndpoints(List.of(egressEndpoints));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder packagingGroupId(@Nullable String packagingGroupId) {
            this.packagingGroupId = packagingGroupId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder sourceArn(@Nullable String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }
        public Builder sourceRoleArn(@Nullable String sourceRoleArn) {
            this.sourceRoleArn = sourceRoleArn;
            return this;
        }
        public Builder tags(@Nullable List<AssetTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(AssetTag... tags) {
            return tags(List.of(tags));
        }        public GetAssetResult build() {
            return new GetAssetResult(arn, createdAt, egressEndpoints, id, packagingGroupId, resourceId, sourceArn, sourceRoleArn, tags);
        }
    }
}
