// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageImageResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
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

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse(
        @CustomType.Parameter("contentUrl") String contentUrl,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("icon") GoogleCloudDialogflowV2IntentMessageImageResponse icon,
        @CustomType.Parameter("largeImage") GoogleCloudDialogflowV2IntentMessageImageResponse largeImage,
        @CustomType.Parameter("name") String name) {
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
    public String contentUrl() {
        return this.contentUrl;
    }
    /**
     * Optional. Description of media card.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Optional. Icon to display above media content.
     * 
    */
    public GoogleCloudDialogflowV2IntentMessageImageResponse icon() {
        return this.icon;
    }
    /**
     * Optional. Image to display above media content.
     * 
    */
    public GoogleCloudDialogflowV2IntentMessageImageResponse largeImage() {
        return this.largeImage;
    }
    /**
     * Name of media card.
     * 
    */
    public String name() {
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

        public Builder contentUrl(String contentUrl) {
            this.contentUrl = Objects.requireNonNull(contentUrl);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder icon(GoogleCloudDialogflowV2IntentMessageImageResponse icon) {
            this.icon = Objects.requireNonNull(icon);
            return this;
        }
        public Builder largeImage(GoogleCloudDialogflowV2IntentMessageImageResponse largeImage) {
            this.largeImage = Objects.requireNonNull(largeImage);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse(contentUrl, description, icon, largeImage, name);
        }
    }
}
