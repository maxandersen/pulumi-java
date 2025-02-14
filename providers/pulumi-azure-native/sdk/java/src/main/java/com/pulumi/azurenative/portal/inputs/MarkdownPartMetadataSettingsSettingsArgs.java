// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The setting of the content of markdown part.
 * 
 */
public final class MarkdownPartMetadataSettingsSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MarkdownPartMetadataSettingsSettingsArgs Empty = new MarkdownPartMetadataSettingsSettingsArgs();

    /**
     * The content of the markdown part.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The content of the markdown part.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The source of the content of the markdown part.
     * 
     */
    @Import(name="markdownSource")
    private @Nullable Output<Integer> markdownSource;

    /**
     * @return The source of the content of the markdown part.
     * 
     */
    public Optional<Output<Integer>> markdownSource() {
        return Optional.ofNullable(this.markdownSource);
    }

    /**
     * The uri of markdown content.
     * 
     */
    @Import(name="markdownUri")
    private @Nullable Output<String> markdownUri;

    /**
     * @return The uri of markdown content.
     * 
     */
    public Optional<Output<String>> markdownUri() {
        return Optional.ofNullable(this.markdownUri);
    }

    /**
     * The subtitle of the markdown part.
     * 
     */
    @Import(name="subtitle")
    private @Nullable Output<String> subtitle;

    /**
     * @return The subtitle of the markdown part.
     * 
     */
    public Optional<Output<String>> subtitle() {
        return Optional.ofNullable(this.subtitle);
    }

    /**
     * The title of the markdown part.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return The title of the markdown part.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private MarkdownPartMetadataSettingsSettingsArgs() {}

    private MarkdownPartMetadataSettingsSettingsArgs(MarkdownPartMetadataSettingsSettingsArgs $) {
        this.content = $.content;
        this.markdownSource = $.markdownSource;
        this.markdownUri = $.markdownUri;
        this.subtitle = $.subtitle;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MarkdownPartMetadataSettingsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MarkdownPartMetadataSettingsSettingsArgs $;

        public Builder() {
            $ = new MarkdownPartMetadataSettingsSettingsArgs();
        }

        public Builder(MarkdownPartMetadataSettingsSettingsArgs defaults) {
            $ = new MarkdownPartMetadataSettingsSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The content of the markdown part.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The content of the markdown part.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param markdownSource The source of the content of the markdown part.
         * 
         * @return builder
         * 
         */
        public Builder markdownSource(@Nullable Output<Integer> markdownSource) {
            $.markdownSource = markdownSource;
            return this;
        }

        /**
         * @param markdownSource The source of the content of the markdown part.
         * 
         * @return builder
         * 
         */
        public Builder markdownSource(Integer markdownSource) {
            return markdownSource(Output.of(markdownSource));
        }

        /**
         * @param markdownUri The uri of markdown content.
         * 
         * @return builder
         * 
         */
        public Builder markdownUri(@Nullable Output<String> markdownUri) {
            $.markdownUri = markdownUri;
            return this;
        }

        /**
         * @param markdownUri The uri of markdown content.
         * 
         * @return builder
         * 
         */
        public Builder markdownUri(String markdownUri) {
            return markdownUri(Output.of(markdownUri));
        }

        /**
         * @param subtitle The subtitle of the markdown part.
         * 
         * @return builder
         * 
         */
        public Builder subtitle(@Nullable Output<String> subtitle) {
            $.subtitle = subtitle;
            return this;
        }

        /**
         * @param subtitle The subtitle of the markdown part.
         * 
         * @return builder
         * 
         */
        public Builder subtitle(String subtitle) {
            return subtitle(Output.of(subtitle));
        }

        /**
         * @param title The title of the markdown part.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The title of the markdown part.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public MarkdownPartMetadataSettingsSettingsArgs build() {
            return $;
        }
    }

}
