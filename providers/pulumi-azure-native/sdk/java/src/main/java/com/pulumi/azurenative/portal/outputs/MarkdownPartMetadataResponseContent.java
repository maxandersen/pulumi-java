// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.outputs;

import com.pulumi.azurenative.portal.outputs.MarkdownPartMetadataResponseSettingsSettings;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MarkdownPartMetadataResponseContent {
    /**
     * The setting of the content of markdown part.
     * 
     */
    private final @Nullable MarkdownPartMetadataResponseSettingsSettings settings;

    @CustomType.Constructor
    private MarkdownPartMetadataResponseContent(@CustomType.Parameter("settings") @Nullable MarkdownPartMetadataResponseSettingsSettings settings) {
        this.settings = settings;
    }

    /**
     * The setting of the content of markdown part.
     * 
    */
    public Optional<MarkdownPartMetadataResponseSettingsSettings> settings() {
        return Optional.ofNullable(this.settings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MarkdownPartMetadataResponseContent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MarkdownPartMetadataResponseSettingsSettings settings;

        public Builder() {
    	      // Empty
        }

        public Builder(MarkdownPartMetadataResponseContent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.settings = defaults.settings;
        }

        public Builder settings(@Nullable MarkdownPartMetadataResponseSettingsSettings settings) {
            this.settings = settings;
            return this;
        }        public MarkdownPartMetadataResponseContent build() {
            return new MarkdownPartMetadataResponseContent(settings);
        }
    }
}
