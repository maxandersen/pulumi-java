// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Distribute as a Managed Disk Image.
 * 
 */
public final class ImageTemplateManagedImageDistributorResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImageTemplateManagedImageDistributorResponse Empty = new ImageTemplateManagedImageDistributorResponse();

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
     * Resource Id of the Managed Disk Image
     * 
     */
    @Import(name="imageId", required=true)
    private String imageId;

    public String imageId() {
        return this.imageId;
    }

    /**
     * Azure location for the image, should match if image already exists
     * 
     */
    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
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
     * Type of distribution.
     * Expected value is &#39;ManagedImage&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private ImageTemplateManagedImageDistributorResponse() {}

    private ImageTemplateManagedImageDistributorResponse(ImageTemplateManagedImageDistributorResponse $) {
        this.artifactTags = $.artifactTags;
        this.imageId = $.imageId;
        this.location = $.location;
        this.runOutputName = $.runOutputName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageTemplateManagedImageDistributorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageTemplateManagedImageDistributorResponse $;

        public Builder() {
            $ = new ImageTemplateManagedImageDistributorResponse();
        }

        public Builder(ImageTemplateManagedImageDistributorResponse defaults) {
            $ = new ImageTemplateManagedImageDistributorResponse(Objects.requireNonNull(defaults));
        }

        public Builder artifactTags(@Nullable Map<String,String> artifactTags) {
            $.artifactTags = artifactTags;
            return this;
        }

        public Builder imageId(String imageId) {
            $.imageId = imageId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder runOutputName(String runOutputName) {
            $.runOutputName = runOutputName;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ImageTemplateManagedImageDistributorResponse build() {
            $.imageId = Objects.requireNonNull($.imageId, "expected parameter 'imageId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.runOutputName = Objects.requireNonNull($.runOutputName, "expected parameter 'runOutputName' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
