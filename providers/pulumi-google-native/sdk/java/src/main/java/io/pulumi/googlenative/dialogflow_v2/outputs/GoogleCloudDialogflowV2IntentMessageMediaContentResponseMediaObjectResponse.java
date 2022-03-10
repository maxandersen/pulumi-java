// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageImageResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse {
    /**
     * Url where the media is stored.
     * 
     */
    private final String contentUrl;
    /**
     * Optional. Description of media card.
     * 
     */
    private final String description;
    /**
     * Optional. Icon to display above media content.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageImageResponse icon;
    /**
     * Optional. Image to display above media content.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageImageResponse largeImage;
    /**
     * Name of media card.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse(
        @OutputCustomType.Parameter("contentUrl") String contentUrl,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("icon") GoogleCloudDialogflowV2IntentMessageImageResponse icon,
        @OutputCustomType.Parameter("largeImage") GoogleCloudDialogflowV2IntentMessageImageResponse largeImage,
        @OutputCustomType.Parameter("name") String name) {
        this.contentUrl = contentUrl;
        this.description = description;
        this.icon = icon;
        this.largeImage = largeImage;
        this.name = name;
    }

    /**
     * Url where the media is stored.
     * 
    */
    public String getContentUrl() {
        return this.contentUrl;
    }
    /**
     * Optional. Description of media card.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Optional. Icon to display above media content.
     * 
    */
    public GoogleCloudDialogflowV2IntentMessageImageResponse getIcon() {
        return this.icon;
    }
    /**
     * Optional. Image to display above media content.
     * 
    */
    public GoogleCloudDialogflowV2IntentMessageImageResponse getLargeImage() {
        return this.largeImage;
    }
    /**
     * Name of media card.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentUrl;
        private String description;
        private GoogleCloudDialogflowV2IntentMessageImageResponse icon;
        private GoogleCloudDialogflowV2IntentMessageImageResponse largeImage;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentUrl = defaults.contentUrl;
    	      this.description = defaults.description;
    	      this.icon = defaults.icon;
    	      this.largeImage = defaults.largeImage;
    	      this.name = defaults.name;
        }

        public Builder setContentUrl(String contentUrl) {
            this.contentUrl = Objects.requireNonNull(contentUrl);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setIcon(GoogleCloudDialogflowV2IntentMessageImageResponse icon) {
            this.icon = Objects.requireNonNull(icon);
            return this;
        }

        public Builder setLargeImage(GoogleCloudDialogflowV2IntentMessageImageResponse largeImage) {
            this.largeImage = Objects.requireNonNull(largeImage);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse(contentUrl, description, icon, largeImage, name);
        }
    }
}
