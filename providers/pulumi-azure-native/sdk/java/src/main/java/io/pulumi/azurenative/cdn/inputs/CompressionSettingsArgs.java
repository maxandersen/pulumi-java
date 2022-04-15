// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * settings for compression.
 * 
 */
public final class CompressionSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CompressionSettingsArgs Empty = new CompressionSettingsArgs();

    /**
     * List of content types on which compression applies. The value should be a valid MIME type.
     * 
     */
    @Import(name="contentTypesToCompress")
      private final @Nullable Output<List<String>> contentTypesToCompress;

    public Output<List<String>> contentTypesToCompress() {
        return this.contentTypesToCompress == null ? Codegen.empty() : this.contentTypesToCompress;
    }

    /**
     * Indicates whether content compression is enabled on AzureFrontDoor. Default value is false. If compression is enabled, content will be served as compressed if user requests for a compressed version. Content won't be compressed on AzureFrontDoor when requested content is smaller than 1 byte or larger than 1 MB.
     * 
     */
    @Import(name="isCompressionEnabled")
      private final @Nullable Output<Boolean> isCompressionEnabled;

    public Output<Boolean> isCompressionEnabled() {
        return this.isCompressionEnabled == null ? Codegen.empty() : this.isCompressionEnabled;
    }

    public CompressionSettingsArgs(
        @Nullable Output<List<String>> contentTypesToCompress,
        @Nullable Output<Boolean> isCompressionEnabled) {
        this.contentTypesToCompress = contentTypesToCompress;
        this.isCompressionEnabled = isCompressionEnabled;
    }

    private CompressionSettingsArgs() {
        this.contentTypesToCompress = Codegen.empty();
        this.isCompressionEnabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompressionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> contentTypesToCompress;
        private @Nullable Output<Boolean> isCompressionEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(CompressionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentTypesToCompress = defaults.contentTypesToCompress;
    	      this.isCompressionEnabled = defaults.isCompressionEnabled;
        }

        public Builder contentTypesToCompress(@Nullable Output<List<String>> contentTypesToCompress) {
            this.contentTypesToCompress = contentTypesToCompress;
            return this;
        }
        public Builder contentTypesToCompress(@Nullable List<String> contentTypesToCompress) {
            this.contentTypesToCompress = Codegen.ofNullable(contentTypesToCompress);
            return this;
        }
        public Builder contentTypesToCompress(String... contentTypesToCompress) {
            return contentTypesToCompress(List.of(contentTypesToCompress));
        }
        public Builder isCompressionEnabled(@Nullable Output<Boolean> isCompressionEnabled) {
            this.isCompressionEnabled = isCompressionEnabled;
            return this;
        }
        public Builder isCompressionEnabled(@Nullable Boolean isCompressionEnabled) {
            this.isCompressionEnabled = Codegen.ofNullable(isCompressionEnabled);
            return this;
        }        public CompressionSettingsArgs build() {
            return new CompressionSettingsArgs(contentTypesToCompress, isCompressionEnabled);
        }
    }
}
