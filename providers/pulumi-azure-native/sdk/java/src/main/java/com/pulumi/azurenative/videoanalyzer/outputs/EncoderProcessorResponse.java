// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.azurenative.videoanalyzer.outputs.EncoderCustomPresetResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.EncoderSystemPresetResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.NodeInputResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class EncoderProcessorResponse {
    /**
     * An array of upstream node references within the topology to be used as inputs for this node.
     * 
     */
    private final List<NodeInputResponse> inputs;
    /**
     * Node name. Must be unique within the topology.
     * 
     */
    private final String name;
    /**
     * The encoder preset, which defines the recipe or instructions on how the input content should be processed.
     * 
     */
    private final Either<EncoderCustomPresetResponse,EncoderSystemPresetResponse> preset;
    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.EncoderProcessor&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private EncoderProcessorResponse(
        @CustomType.Parameter("inputs") List<NodeInputResponse> inputs,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("preset") Either<EncoderCustomPresetResponse,EncoderSystemPresetResponse> preset,
        @CustomType.Parameter("type") String type) {
        this.inputs = inputs;
        this.name = name;
        this.preset = preset;
        this.type = type;
    }

    /**
     * An array of upstream node references within the topology to be used as inputs for this node.
     * 
    */
    public List<NodeInputResponse> inputs() {
        return this.inputs;
    }
    /**
     * Node name. Must be unique within the topology.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The encoder preset, which defines the recipe or instructions on how the input content should be processed.
     * 
    */
    public Either<EncoderCustomPresetResponse,EncoderSystemPresetResponse> preset() {
        return this.preset;
    }
    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.EncoderProcessor&#39;.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncoderProcessorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<NodeInputResponse> inputs;
        private String name;
        private Either<EncoderCustomPresetResponse,EncoderSystemPresetResponse> preset;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EncoderProcessorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputs = defaults.inputs;
    	      this.name = defaults.name;
    	      this.preset = defaults.preset;
    	      this.type = defaults.type;
        }

        public Builder inputs(List<NodeInputResponse> inputs) {
            this.inputs = Objects.requireNonNull(inputs);
            return this;
        }
        public Builder inputs(NodeInputResponse... inputs) {
            return inputs(List.of(inputs));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder preset(Either<EncoderCustomPresetResponse,EncoderSystemPresetResponse> preset) {
            this.preset = Objects.requireNonNull(preset);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public EncoderProcessorResponse build() {
            return new EncoderProcessorResponse(inputs, name, preset, type);
        }
    }
}
