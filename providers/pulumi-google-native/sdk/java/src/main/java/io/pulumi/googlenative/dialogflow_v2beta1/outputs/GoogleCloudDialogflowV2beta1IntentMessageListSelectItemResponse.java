// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageImageResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse {
    /**
     * Optional. The main text describing the item.
     * 
     */
    private final String description;
    /**
     * Optional. The image to display.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
    /**
     * Additional information about this option.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info;
    /**
     * The title of the list item.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse(
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("image") GoogleCloudDialogflowV2beta1IntentMessageImageResponse image,
        @OutputCustomType.Parameter("info") GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info,
        @OutputCustomType.Parameter("title") String title) {
        this.description = description;
        this.image = image;
        this.info = info;
        this.title = title;
    }

    /**
     * Optional. The main text describing the item.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Optional. The image to display.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageImageResponse getImage() {
        return this.image;
    }
    /**
     * Additional information about this option.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse getInfo() {
        return this.info;
    }
    /**
     * The title of the list item.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
        private GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.image = defaults.image;
    	      this.info = defaults.info;
    	      this.title = defaults.title;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setImage(GoogleCloudDialogflowV2beta1IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setInfo(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info) {
            this.info = Objects.requireNonNull(info);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse(description, image, info, title);
        }
    }
}
