// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Distribute via Shared Image Gallery.
 * 
 */
public final class ImageTemplateSharedImageDistributorResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImageTemplateSharedImageDistributorResponse Empty = new ImageTemplateSharedImageDistributorResponse();

    /**
     * Tags that will be applied to the artifact once it has been created/updated by the distributor.
     * 
     */
    @Import(name="artifactTags")
    private @Nullable Map<String,String> artifactTags;

    public Optional<Map<String,String>> artifactTags() {
        return Optional.ofNullable(this.artifactTags);
    }

    /**
     * Flag that indicates whether created image version should be excluded from latest. Omit to use the default (false).
     * 
     */
    @Import(name="excludeFromLatest")
    private @Nullable Boolean excludeFromLatest;

    public Optional<Boolean> excludeFromLatest() {
        return Optional.ofNullable(this.excludeFromLatest);
    }

    /**
     * Resource Id of the Shared Image Gallery image
     * 
     */
    @Import(name="galleryImageId", required=true)
    private String galleryImageId;

    public String galleryImageId() {
        return this.galleryImageId;
    }

    /**
     * A list of regions that the image will be replicated to
     * 
     */
    @Import(name="replicationRegions", required=true)
    private List<String> replicationRegions;

    public List<String> replicationRegions() {
        return this.replicationRegions;
    }

    /**
     * The name to be used for the associated RunOutput.
     * 
     */
    @Import(name="runOutputName", required=true)
    private String runOutputName;

    public String runOutputName() {
        return this.runOutputName;
    }

    /**
     * Storage account type to be used to store the shared image. Omit to use the default (Standard_LRS).
     * 
     */
    @Import(name="storageAccountType")
    private @Nullable String storageAccountType;

    public Optional<String> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    /**
     * Type of distribution.
     * Expected value is &#39;SharedImage&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private ImageTemplateSharedImageDistributorResponse() {}

    private ImageTemplateSharedImageDistributorResponse(ImageTemplateSharedImageDistributorResponse $) {
        this.artifactTags = $.artifactTags;
        this.excludeFromLatest = $.excludeFromLatest;
        this.galleryImageId = $.galleryImageId;
        this.replicationRegions = $.replicationRegions;
        this.runOutputName = $.runOutputName;
        this.storageAccountType = $.storageAccountType;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageTemplateSharedImageDistributorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageTemplateSharedImageDistributorResponse $;

        public Builder() {
            $ = new ImageTemplateSharedImageDistributorResponse();
        }

        public Builder(ImageTemplateSharedImageDistributorResponse defaults) {
            $ = new ImageTemplateSharedImageDistributorResponse(Objects.requireNonNull(defaults));
        }

        public Builder artifactTags(@Nullable Map<String,String> artifactTags) {
            $.artifactTags = artifactTags;
            return this;
        }

        public Builder excludeFromLatest(@Nullable Boolean excludeFromLatest) {
            $.excludeFromLatest = excludeFromLatest;
            return this;
        }

        public Builder galleryImageId(String galleryImageId) {
            $.galleryImageId = galleryImageId;
            return this;
        }

        public Builder replicationRegions(List<String> replicationRegions) {
            $.replicationRegions = replicationRegions;
            return this;
        }

        public Builder replicationRegions(String... replicationRegions) {
            return replicationRegions(List.of(replicationRegions));
        }

        public Builder runOutputName(String runOutputName) {
            $.runOutputName = runOutputName;
            return this;
        }

        public Builder storageAccountType(@Nullable String storageAccountType) {
            $.storageAccountType = storageAccountType;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ImageTemplateSharedImageDistributorResponse build() {
            $.excludeFromLatest = Codegen.booleanProp("excludeFromLatest").arg($.excludeFromLatest).def(false).getNullable();
            $.galleryImageId = Objects.requireNonNull($.galleryImageId, "expected parameter 'galleryImageId' to be non-null");
            $.replicationRegions = Objects.requireNonNull($.replicationRegions, "expected parameter 'replicationRegions' to be non-null");
            $.runOutputName = Objects.requireNonNull($.runOutputName, "expected parameter 'runOutputName' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
