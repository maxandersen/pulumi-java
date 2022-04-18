// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vision_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.vision_v1.inputs.NormalizedVertexArgs;
import com.pulumi.googlenative.vision_v1.inputs.VertexArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A bounding polygon for the detected image annotation.
 * 
 */
public final class BoundingPolyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BoundingPolyArgs Empty = new BoundingPolyArgs();

    /**
     * The bounding polygon normalized vertices.
     * 
     */
    @Import(name="normalizedVertices")
      private final @Nullable Output<List<NormalizedVertexArgs>> normalizedVertices;

    public Output<List<NormalizedVertexArgs>> normalizedVertices() {
        return this.normalizedVertices == null ? Codegen.empty() : this.normalizedVertices;
    }

    /**
     * The bounding polygon vertices.
     * 
     */
    @Import(name="vertices")
      private final @Nullable Output<List<VertexArgs>> vertices;

    public Output<List<VertexArgs>> vertices() {
        return this.vertices == null ? Codegen.empty() : this.vertices;
    }

    public BoundingPolyArgs(
        @Nullable Output<List<NormalizedVertexArgs>> normalizedVertices,
        @Nullable Output<List<VertexArgs>> vertices) {
        this.normalizedVertices = normalizedVertices;
        this.vertices = vertices;
    }

    private BoundingPolyArgs() {
        this.normalizedVertices = Codegen.empty();
        this.vertices = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BoundingPolyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<NormalizedVertexArgs>> normalizedVertices;
        private @Nullable Output<List<VertexArgs>> vertices;

        public Builder() {
    	      // Empty
        }

        public Builder(BoundingPolyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.normalizedVertices = defaults.normalizedVertices;
    	      this.vertices = defaults.vertices;
        }

        public Builder normalizedVertices(@Nullable Output<List<NormalizedVertexArgs>> normalizedVertices) {
            this.normalizedVertices = normalizedVertices;
            return this;
        }
        public Builder normalizedVertices(@Nullable List<NormalizedVertexArgs> normalizedVertices) {
            this.normalizedVertices = Codegen.ofNullable(normalizedVertices);
            return this;
        }
        public Builder normalizedVertices(NormalizedVertexArgs... normalizedVertices) {
            return normalizedVertices(List.of(normalizedVertices));
        }
        public Builder vertices(@Nullable Output<List<VertexArgs>> vertices) {
            this.vertices = vertices;
            return this;
        }
        public Builder vertices(@Nullable List<VertexArgs> vertices) {
            this.vertices = Codegen.ofNullable(vertices);
            return this;
        }
        public Builder vertices(VertexArgs... vertices) {
            return vertices(List.of(vertices));
        }        public BoundingPolyArgs build() {
            return new BoundingPolyArgs(normalizedVertices, vertices);
        }
    }
}
