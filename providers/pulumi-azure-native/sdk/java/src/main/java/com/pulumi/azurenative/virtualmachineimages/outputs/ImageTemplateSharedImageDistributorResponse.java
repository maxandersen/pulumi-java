// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageTemplateSharedImageDistributorResponse {
    /**
     * Tags that will be applied to the artifact once it has been created/updated by the distributor.
     * 
     */
    private final @Nullable Map<String,String> artifactTags;
    /**
     * Flag that indicates whether created image version should be excluded from latest. Omit to use the default (false).
     * 
     */
    private final @Nullable Boolean excludeFromLatest;
    /**
     * Resource Id of the Shared Image Gallery image
     * 
     */
    private final String galleryImageId;
    /**
     * A list of regions that the image will be replicated to
     * 
     */
    private final List<String> replicationRegions;
    /**
     * The name to be used for the associated RunOutput.
     * 
     */
    private final String runOutputName;
    /**
     * Storage account type to be used to store the shared image. Omit to use the default (Standard_LRS).
     * 
     */
    private final @Nullable String storageAccountType;
    /**
     * Type of distribution.
     * Expected value is 'SharedImage'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ImageTemplateSharedImageDistributorResponse(
        @CustomType.Parameter("artifactTags") @Nullable Map<String,String> artifactTags,
        @CustomType.Parameter("excludeFromLatest") @Nullable Boolean excludeFromLatest,
        @CustomType.Parameter("galleryImageId") String galleryImageId,
        @CustomType.Parameter("replicationRegions") List<String> replicationRegions,
        @CustomType.Parameter("runOutputName") String runOutputName,
        @CustomType.Parameter("storageAccountType") @Nullable String storageAccountType,
        @CustomType.Parameter("type") String type) {
        this.artifactTags = artifactTags;
        this.excludeFromLatest = excludeFromLatest;
        this.galleryImageId = galleryImageId;
        this.replicationRegions = replicationRegions;
        this.runOutputName = runOutputName;
        this.storageAccountType = storageAccountType;
        this.type = type;
    }

    /**
     * Tags that will be applied to the artifact once it has been created/updated by the distributor.
     * 
    */
    public Map<String,String> artifactTags() {
        return this.artifactTags == null ? Map.of() : this.artifactTags;
    }
    /**
     * Flag that indicates whether created image version should be excluded from latest. Omit to use the default (false).
     * 
    */
    public Optional<Boolean> excludeFromLatest() {
        return Optional.ofNullable(this.excludeFromLatest);
    }
    /**
     * Resource Id of the Shared Image Gallery image
     * 
    */
    public String galleryImageId() {
        return this.galleryImageId;
    }
    /**
     * A list of regions that the image will be replicated to
     * 
    */
    public List<String> replicationRegions() {
        return this.replicationRegions;
    }
    /**
     * The name to be used for the associated RunOutput.
     * 
    */
    public String runOutputName() {
        return this.runOutputName;
    }
    /**
     * Storage account type to be used to store the shared image. Omit to use the default (Standard_LRS).
     * 
    */
    public Optional<String> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }
    /**
     * Type of distribution.
     * Expected value is 'SharedImage'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateSharedImageDistributorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> artifactTags;
        private @Nullable Boolean excludeFromLatest;
        private String galleryImageId;
        private List<String> replicationRegions;
        private String runOutputName;
        private @Nullable String storageAccountType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateSharedImageDistributorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactTags = defaults.artifactTags;
    	      this.excludeFromLatest = defaults.excludeFromLatest;
    	      this.galleryImageId = defaults.galleryImageId;
    	      this.replicationRegions = defaults.replicationRegions;
    	      this.runOutputName = defaults.runOutputName;
    	      this.storageAccountType = defaults.storageAccountType;
    	      this.type = defaults.type;
        }

        public Builder artifactTags(@Nullable Map<String,String> artifactTags) {
            this.artifactTags = artifactTags;
            return this;
        }
        public Builder excludeFromLatest(@Nullable Boolean excludeFromLatest) {
            this.excludeFromLatest = excludeFromLatest;
            return this;
        }
        public Builder galleryImageId(String galleryImageId) {
            this.galleryImageId = Objects.requireNonNull(galleryImageId);
            return this;
        }
        public Builder replicationRegions(List<String> replicationRegions) {
            this.replicationRegions = Objects.requireNonNull(replicationRegions);
            return this;
        }
        public Builder replicationRegions(String... replicationRegions) {
            return replicationRegions(List.of(replicationRegions));
        }
        public Builder runOutputName(String runOutputName) {
            this.runOutputName = Objects.requireNonNull(runOutputName);
            return this;
        }
        public Builder storageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ImageTemplateSharedImageDistributorResponse build() {
            return new ImageTemplateSharedImageDistributorResponse(artifactTags, excludeFromLatest, galleryImageId, replicationRegions, runOutputName, storageAccountType, type);
        }
    }
}
