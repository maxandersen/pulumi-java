// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Asset sink.
 * 
 */
public final class MediaGraphAssetSinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final MediaGraphAssetSinkArgs Empty = new MediaGraphAssetSinkArgs();

    /**
     * Asset name.
     * 
     */
    @Import(name="assetName", required=true)
      private final Output<String> assetName;

    public Output<String> assetName() {
        return this.assetName;
    }

    /**
     * Sink inputs.
     * 
     */
    @Import(name="inputs", required=true)
      private final Output<List<String>> inputs;

    public Output<List<String>> inputs() {
        return this.inputs;
    }

    /**
     * Sink name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.MediaGraphAssetSink&#39;.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    public MediaGraphAssetSinkArgs(
        Output<String> assetName,
        Output<List<String>> inputs,
        Output<String> name,
        Output<String> odataType) {
        this.assetName = Objects.requireNonNull(assetName, "expected parameter 'assetName' to be non-null");
        this.inputs = Objects.requireNonNull(inputs, "expected parameter 'inputs' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.odataType = Codegen.stringProp("odataType").output().arg(odataType).require();
    }

    private MediaGraphAssetSinkArgs() {
        this.assetName = Codegen.empty();
        this.inputs = Codegen.empty();
        this.name = Codegen.empty();
        this.odataType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphAssetSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> assetName;
        private Output<List<String>> inputs;
        private Output<String> name;
        private Output<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphAssetSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetName = defaults.assetName;
    	      this.inputs = defaults.inputs;
    	      this.name = defaults.name;
    	      this.odataType = defaults.odataType;
        }

        public Builder assetName(Output<String> assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }
        public Builder assetName(String assetName) {
            this.assetName = Output.of(Objects.requireNonNull(assetName));
            return this;
        }
        public Builder inputs(Output<List<String>> inputs) {
            this.inputs = Objects.requireNonNull(inputs);
            return this;
        }
        public Builder inputs(List<String> inputs) {
            this.inputs = Output.of(Objects.requireNonNull(inputs));
            return this;
        }
        public Builder inputs(String... inputs) {
            return inputs(List.of(inputs));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }        public MediaGraphAssetSinkArgs build() {
            return new MediaGraphAssetSinkArgs(assetName, inputs, name, odataType);
        }
    }
}
