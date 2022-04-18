// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vision_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.vision_v1.inputs.NormalizedVertexResponse;
import com.pulumi.googlenative.vision_v1.inputs.VertexResponse;
import java.util.List;
import java.util.Objects;


/**
 * A bounding polygon for the detected image annotation.
 * 
 */
public final class BoundingPolyResponse extends com.pulumi.resources.InvokeArgs {

    public static final BoundingPolyResponse Empty = new BoundingPolyResponse();

    /**
     * The bounding polygon normalized vertices.
     * 
     */
    @Import(name="normalizedVertices", required=true)
      private final List<NormalizedVertexResponse> normalizedVertices;

    public List<NormalizedVertexResponse> normalizedVertices() {
        return this.normalizedVertices;
    }

    /**
     * The bounding polygon vertices.
     * 
     */
    @Import(name="vertices", required=true)
      private final List<VertexResponse> vertices;

    public List<VertexResponse> vertices() {
        return this.vertices;
    }

    public BoundingPolyResponse(
        List<NormalizedVertexResponse> normalizedVertices,
        List<VertexResponse> vertices) {
        this.normalizedVertices = Objects.requireNonNull(normalizedVertices, "expected parameter 'normalizedVertices' to be non-null");
        this.vertices = Objects.requireNonNull(vertices, "expected parameter 'vertices' to be non-null");
    }

    private BoundingPolyResponse() {
        this.normalizedVertices = List.of();
        this.vertices = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BoundingPolyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<NormalizedVertexResponse> normalizedVertices;
        private List<VertexResponse> vertices;

        public Builder() {
    	      // Empty
        }

        public Builder(BoundingPolyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.normalizedVertices = defaults.normalizedVertices;
    	      this.vertices = defaults.vertices;
        }

        public Builder normalizedVertices(List<NormalizedVertexResponse> normalizedVertices) {
            this.normalizedVertices = Objects.requireNonNull(normalizedVertices);
            return this;
        }
        public Builder normalizedVertices(NormalizedVertexResponse... normalizedVertices) {
            return normalizedVertices(List.of(normalizedVertices));
        }
        public Builder vertices(List<VertexResponse> vertices) {
            this.vertices = Objects.requireNonNull(vertices);
            return this;
        }
        public Builder vertices(VertexResponse... vertices) {
            return vertices(List.of(vertices));
        }        public BoundingPolyResponse build() {
            return new BoundingPolyResponse(normalizedVertices, vertices);
        }
    }
}
