// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.azurenative.portal.inputs.MarkdownPartMetadataContentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Markdown part settings.
 * 
 */
public final class MarkdownPartMetadataSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MarkdownPartMetadataSettingsArgs Empty = new MarkdownPartMetadataSettingsArgs();

    /**
     * The content of markdown part.
     * 
     */
    @Import(name="content")
    private @Nullable Output<MarkdownPartMetadataContentArgs> content;

    /**
     * @return The content of markdown part.
     * 
     */
    public Optional<Output<MarkdownPartMetadataContentArgs>> content() {
        return Optional.ofNullable(this.content);
    }

    private MarkdownPartMetadataSettingsArgs() {}

    private MarkdownPartMetadataSettingsArgs(MarkdownPartMetadataSettingsArgs $) {
        this.content = $.content;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MarkdownPartMetadataSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MarkdownPartMetadataSettingsArgs $;

        public Builder() {
            $ = new MarkdownPartMetadataSettingsArgs();
        }

        public Builder(MarkdownPartMetadataSettingsArgs defaults) {
            $ = new MarkdownPartMetadataSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The content of markdown part.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<MarkdownPartMetadataContentArgs> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The content of markdown part.
         * 
         * @return builder
         * 
         */
        public Builder content(MarkdownPartMetadataContentArgs content) {
            return content(Output.of(content));
        }

        public MarkdownPartMetadataSettingsArgs build() {
            return $;
        }
    }

}
