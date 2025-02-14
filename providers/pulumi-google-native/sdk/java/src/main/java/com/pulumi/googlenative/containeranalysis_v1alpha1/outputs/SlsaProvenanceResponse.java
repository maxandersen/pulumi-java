// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.MaterialResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.SlsaBuilderResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.SlsaMetadataResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.SlsaRecipeResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SlsaProvenanceResponse {
    /**
     * @return builder is the builder of this provenance
     * 
     */
    private final SlsaBuilderResponse builder;
    /**
     * @return The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
     * 
     */
    private final List<MaterialResponse> materials;
    /**
     * @return metadata is the metadata of the provenance
     * 
     */
    private final SlsaMetadataResponse metadata;
    /**
     * @return Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible).
     * 
     */
    private final SlsaRecipeResponse recipe;

    @CustomType.Constructor
    private SlsaProvenanceResponse(
        @CustomType.Parameter("builder") SlsaBuilderResponse builder,
        @CustomType.Parameter("materials") List<MaterialResponse> materials,
        @CustomType.Parameter("metadata") SlsaMetadataResponse metadata,
        @CustomType.Parameter("recipe") SlsaRecipeResponse recipe) {
        this.builder = builder;
        this.materials = materials;
        this.metadata = metadata;
        this.recipe = recipe;
    }

    /**
     * @return builder is the builder of this provenance
     * 
     */
    public SlsaBuilderResponse builder_() {
        return this.builder;
    }
    /**
     * @return The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
     * 
     */
    public List<MaterialResponse> materials() {
        return this.materials;
    }
    /**
     * @return metadata is the metadata of the provenance
     * 
     */
    public SlsaMetadataResponse metadata() {
        return this.metadata;
    }
    /**
     * @return Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible).
     * 
     */
    public SlsaRecipeResponse recipe() {
        return this.recipe;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlsaProvenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlsaBuilderResponse builder;
        private List<MaterialResponse> materials;
        private SlsaMetadataResponse metadata;
        private SlsaRecipeResponse recipe;

        public Builder() {
    	      // Empty
        }

        public Builder(SlsaProvenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builder = defaults.builder;
    	      this.materials = defaults.materials;
    	      this.metadata = defaults.metadata;
    	      this.recipe = defaults.recipe;
        }

        public Builder builder_(SlsaBuilderResponse builder) {
            this.builder = Objects.requireNonNull(builder);
            return this;
        }
        public Builder materials(List<MaterialResponse> materials) {
            this.materials = Objects.requireNonNull(materials);
            return this;
        }
        public Builder materials(MaterialResponse... materials) {
            return materials(List.of(materials));
        }
        public Builder metadata(SlsaMetadataResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder recipe(SlsaRecipeResponse recipe) {
            this.recipe = Objects.requireNonNull(recipe);
            return this;
        }        public SlsaProvenanceResponse build() {
            return new SlsaProvenanceResponse(builder, materials, metadata, recipe);
        }
    }
}
