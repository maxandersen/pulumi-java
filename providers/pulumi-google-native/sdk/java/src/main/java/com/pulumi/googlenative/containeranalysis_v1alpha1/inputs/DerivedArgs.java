// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.FingerprintArgs;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.LayerArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Derived describes the derived image portion (Occurrence) of the DockerImage relationship. This image would be produced from a Dockerfile with FROM .
 * 
 */
public final class DerivedArgs extends com.pulumi.resources.ResourceArgs {

    public static final DerivedArgs Empty = new DerivedArgs();

    /**
     * The fingerprint of the derived image.
     * 
     */
    @Import(name="fingerprint")
      private final @Nullable Output<FingerprintArgs> fingerprint;

    public Output<FingerprintArgs> fingerprint() {
        return this.fingerprint == null ? Codegen.empty() : this.fingerprint;
    }

    /**
     * This contains layer-specific metadata, if populated it has length &#34;distance&#34; and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.
     * 
     */
    @Import(name="layerInfo")
      private final @Nullable Output<List<LayerArgs>> layerInfo;

    public Output<List<LayerArgs>> layerInfo() {
        return this.layerInfo == null ? Codegen.empty() : this.layerInfo;
    }

    public DerivedArgs(
        @Nullable Output<FingerprintArgs> fingerprint,
        @Nullable Output<List<LayerArgs>> layerInfo) {
        this.fingerprint = fingerprint;
        this.layerInfo = layerInfo;
    }

    private DerivedArgs() {
        this.fingerprint = Codegen.empty();
        this.layerInfo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DerivedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FingerprintArgs> fingerprint;
        private @Nullable Output<List<LayerArgs>> layerInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(DerivedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fingerprint = defaults.fingerprint;
    	      this.layerInfo = defaults.layerInfo;
        }

        public Builder fingerprint(@Nullable Output<FingerprintArgs> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public Builder fingerprint(@Nullable FingerprintArgs fingerprint) {
            this.fingerprint = Codegen.ofNullable(fingerprint);
            return this;
        }
        public Builder layerInfo(@Nullable Output<List<LayerArgs>> layerInfo) {
            this.layerInfo = layerInfo;
            return this;
        }
        public Builder layerInfo(@Nullable List<LayerArgs> layerInfo) {
            this.layerInfo = Codegen.ofNullable(layerInfo);
            return this;
        }
        public Builder layerInfo(LayerArgs... layerInfo) {
            return layerInfo(List.of(layerInfo));
        }        public DerivedArgs build() {
            return new DerivedArgs(fingerprint, layerInfo);
        }
    }
}
