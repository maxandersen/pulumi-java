// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A codec flag, which tells the encoder to copy the input audio bitstream.
 * 
 */
public final class CopyAudioArgs extends com.pulumi.resources.ResourceArgs {

    public static final CopyAudioArgs Empty = new CopyAudioArgs();

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @Import(name="label")
      private final @Nullable Output<String> label;

    public Output<String> label() {
        return this.label == null ? Codegen.empty() : this.label;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.CopyAudio&#39;.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    public CopyAudioArgs(
        @Nullable Output<String> label,
        Output<String> odataType) {
        this.label = label;
        this.odataType = Codegen.stringProp("odataType").output().arg(odataType).require();
    }

    private CopyAudioArgs() {
        this.label = Codegen.empty();
        this.odataType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CopyAudioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> label;
        private Output<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(CopyAudioArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
        }

        public Builder label(@Nullable Output<String> label) {
            this.label = label;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = Codegen.ofNullable(label);
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }        public CopyAudioArgs build() {
            return new CopyAudioArgs(label, odataType);
        }
    }
}
