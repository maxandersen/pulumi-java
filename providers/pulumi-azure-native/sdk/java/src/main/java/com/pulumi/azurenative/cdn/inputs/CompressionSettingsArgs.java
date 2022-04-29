// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * settings for compression.
 * 
 */
public final class CompressionSettingsArgs extends ResourceArgs {

    public static final CompressionSettingsArgs Empty = new CompressionSettingsArgs();

    /**
     * List of content types on which compression applies. The value should be a valid MIME type.
     * 
     */
    @Import(name="contentTypesToCompress")
    private @Nullable Output<List<String>> contentTypesToCompress;

    /**
     * @return List of content types on which compression applies. The value should be a valid MIME type.
     * 
     */
    public Optional<Output<List<String>>> contentTypesToCompress() {
        return Optional.ofNullable(this.contentTypesToCompress);
    }

    /**
     * Indicates whether content compression is enabled on AzureFrontDoor. Default value is false. If compression is enabled, content will be served as compressed if user requests for a compressed version. Content won&#39;t be compressed on AzureFrontDoor when requested content is smaller than 1 byte or larger than 1 MB.
     * 
     */
    @Import(name="isCompressionEnabled")
    private @Nullable Output<Boolean> isCompressionEnabled;

    /**
     * @return Indicates whether content compression is enabled on AzureFrontDoor. Default value is false. If compression is enabled, content will be served as compressed if user requests for a compressed version. Content won&#39;t be compressed on AzureFrontDoor when requested content is smaller than 1 byte or larger than 1 MB.
     * 
     */
    public Optional<Output<Boolean>> isCompressionEnabled() {
        return Optional.ofNullable(this.isCompressionEnabled);
    }

    private CompressionSettingsArgs() {}

    private CompressionSettingsArgs(CompressionSettingsArgs $) {
        this.contentTypesToCompress = $.contentTypesToCompress;
        this.isCompressionEnabled = $.isCompressionEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CompressionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CompressionSettingsArgs $;

        public Builder() {
            $ = new CompressionSettingsArgs();
        }

        public Builder(CompressionSettingsArgs defaults) {
            $ = new CompressionSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentTypesToCompress List of content types on which compression applies. The value should be a valid MIME type.
         * 
         * @return builder
         * 
         */
        public Builder contentTypesToCompress(@Nullable Output<List<String>> contentTypesToCompress) {
            $.contentTypesToCompress = contentTypesToCompress;
            return this;
        }

        /**
         * @param contentTypesToCompress List of content types on which compression applies. The value should be a valid MIME type.
         * 
         * @return builder
         * 
         */
        public Builder contentTypesToCompress(List<String> contentTypesToCompress) {
            return contentTypesToCompress(Output.of(contentTypesToCompress));
        }

        /**
         * @param contentTypesToCompress List of content types on which compression applies. The value should be a valid MIME type.
         * 
         * @return builder
         * 
         */
        public Builder contentTypesToCompress(String... contentTypesToCompress) {
            return contentTypesToCompress(List.of(contentTypesToCompress));
        }

        /**
         * @param isCompressionEnabled Indicates whether content compression is enabled on AzureFrontDoor. Default value is false. If compression is enabled, content will be served as compressed if user requests for a compressed version. Content won&#39;t be compressed on AzureFrontDoor when requested content is smaller than 1 byte or larger than 1 MB.
         * 
         * @return builder
         * 
         */
        public Builder isCompressionEnabled(@Nullable Output<Boolean> isCompressionEnabled) {
            $.isCompressionEnabled = isCompressionEnabled;
            return this;
        }

        /**
         * @param isCompressionEnabled Indicates whether content compression is enabled on AzureFrontDoor. Default value is false. If compression is enabled, content will be served as compressed if user requests for a compressed version. Content won&#39;t be compressed on AzureFrontDoor when requested content is smaller than 1 byte or larger than 1 MB.
         * 
         * @return builder
         * 
         */
        public Builder isCompressionEnabled(Boolean isCompressionEnabled) {
            return isCompressionEnabled(Output.of(isCompressionEnabled));
        }

        public CompressionSettingsArgs build() {
            return $;
        }
    }

}
