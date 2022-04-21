// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.azurenative.portal.inputs.MarkdownPartMetadataResponseSettings;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Markdown part metadata.
 * 
 */
public final class MarkdownPartMetadataResponse extends com.pulumi.resources.InvokeArgs {

    public static final MarkdownPartMetadataResponse Empty = new MarkdownPartMetadataResponse();

    /**
     * Input to dashboard part.
     * 
     */
    @Import(name="inputs")
    private @Nullable List<Object> inputs;

    public Optional<List<Object>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    /**
     * Markdown part settings.
     * 
     */
    @Import(name="settings")
    private @Nullable MarkdownPartMetadataResponseSettings settings;

    public Optional<MarkdownPartMetadataResponseSettings> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * The type of dashboard part.
     * Expected value is &#39;Extension/HubsExtension/PartType/MarkdownPart&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private MarkdownPartMetadataResponse() {}

    private MarkdownPartMetadataResponse(MarkdownPartMetadataResponse $) {
        this.inputs = $.inputs;
        this.settings = $.settings;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MarkdownPartMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MarkdownPartMetadataResponse $;

        public Builder() {
            $ = new MarkdownPartMetadataResponse();
        }

        public Builder(MarkdownPartMetadataResponse defaults) {
            $ = new MarkdownPartMetadataResponse(Objects.requireNonNull(defaults));
        }

        public Builder inputs(@Nullable List<Object> inputs) {
            $.inputs = inputs;
            return this;
        }

        public Builder inputs(Object... inputs) {
            return inputs(List.of(inputs));
        }

        public Builder settings(@Nullable MarkdownPartMetadataResponseSettings settings) {
            $.settings = settings;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public MarkdownPartMetadataResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
