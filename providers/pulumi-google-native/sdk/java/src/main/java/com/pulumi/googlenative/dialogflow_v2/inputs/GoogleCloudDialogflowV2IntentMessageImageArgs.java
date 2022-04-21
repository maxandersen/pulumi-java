// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The image response message.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageImageArgs Empty = new GoogleCloudDialogflowV2IntentMessageImageArgs();

    /**
     * Optional. A text description of the image to be used for accessibility, e.g., screen readers.
     * 
     */
    @Import(name="accessibilityText")
    private @Nullable Output<String> accessibilityText;

    public Optional<Output<String>> accessibilityText() {
        return Optional.ofNullable(this.accessibilityText);
    }

    /**
     * Optional. The public URI to an image file.
     * 
     */
    @Import(name="imageUri")
    private @Nullable Output<String> imageUri;

    public Optional<Output<String>> imageUri() {
        return Optional.ofNullable(this.imageUri);
    }

    private GoogleCloudDialogflowV2IntentMessageImageArgs() {}

    private GoogleCloudDialogflowV2IntentMessageImageArgs(GoogleCloudDialogflowV2IntentMessageImageArgs $) {
        this.accessibilityText = $.accessibilityText;
        this.imageUri = $.imageUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageImageArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageImageArgs();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageImageArgs defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessibilityText(@Nullable Output<String> accessibilityText) {
            $.accessibilityText = accessibilityText;
            return this;
        }

        public Builder accessibilityText(String accessibilityText) {
            return accessibilityText(Output.of(accessibilityText));
        }

        public Builder imageUri(@Nullable Output<String> imageUri) {
            $.imageUri = imageUri;
            return this;
        }

        public Builder imageUri(String imageUri) {
            return imageUri(Output.of(imageUri));
        }

        public GoogleCloudDialogflowV2IntentMessageImageArgs build() {
            return $;
        }
    }

}
