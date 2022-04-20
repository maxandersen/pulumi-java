// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a lab&#39;s support banner
 * 
 */
public final class LabSupportPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final LabSupportPropertiesResponse Empty = new LabSupportPropertiesResponse();

    /**
     * Is the lab support banner active/enabled at this time?
     * 
     */
    @Import(name="enabled")
      private final @Nullable String enabled;

    public Optional<String> enabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * The markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     * 
     */
    @Import(name="markdown")
      private final @Nullable String markdown;

    public Optional<String> markdown() {
        return this.markdown == null ? Optional.empty() : Optional.ofNullable(this.markdown);
    }

    public LabSupportPropertiesResponse(
        @Nullable String enabled,
        @Nullable String markdown) {
        this.enabled = enabled;
        this.markdown = markdown;
    }

    private LabSupportPropertiesResponse() {
        this.enabled = null;
        this.markdown = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabSupportPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String enabled;
        private @Nullable String markdown;

        public Builder() {
    	      // Empty
        }

        public Builder(LabSupportPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.markdown = defaults.markdown;
        }

        public Builder enabled(@Nullable String enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder markdown(@Nullable String markdown) {
            this.markdown = markdown;
            return this;
        }        public LabSupportPropertiesResponse build() {
            return new LabSupportPropertiesResponse(enabled, markdown);
        }
    }
}
