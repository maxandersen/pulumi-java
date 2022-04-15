// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a built-in preset for encoding the input content using the encoder processor.
 * 
 */
public final class EncoderSystemPresetResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncoderSystemPresetResponse Empty = new EncoderSystemPresetResponse();

    /**
     * Name of the built-in encoding preset.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.EncoderSystemPreset'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public EncoderSystemPresetResponse(
        String name,
        String type) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EncoderSystemPresetResponse() {
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncoderSystemPresetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EncoderSystemPresetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public EncoderSystemPresetResponse build() {
            return new EncoderSystemPresetResponse(name, type);
        }
    }
}
