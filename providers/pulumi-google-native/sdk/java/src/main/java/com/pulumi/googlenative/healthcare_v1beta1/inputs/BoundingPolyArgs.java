// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare_v1beta1.inputs.VertexArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A bounding polygon for the detected image annotation.
 * 
 */
public final class BoundingPolyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BoundingPolyArgs Empty = new BoundingPolyArgs();

    /**
     * A description of this polygon.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return A description of this polygon.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * List of the vertices of this polygon.
     * 
     */
    @Import(name="vertices")
    private @Nullable Output<List<VertexArgs>> vertices;

    /**
     * @return List of the vertices of this polygon.
     * 
     */
    public Optional<Output<List<VertexArgs>>> vertices() {
        return Optional.ofNullable(this.vertices);
    }

    private BoundingPolyArgs() {}

    private BoundingPolyArgs(BoundingPolyArgs $) {
        this.label = $.label;
        this.vertices = $.vertices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BoundingPolyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BoundingPolyArgs $;

        public Builder() {
            $ = new BoundingPolyArgs();
        }

        public Builder(BoundingPolyArgs defaults) {
            $ = new BoundingPolyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param label A description of this polygon.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label A description of this polygon.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param vertices List of the vertices of this polygon.
         * 
         * @return builder
         * 
         */
        public Builder vertices(@Nullable Output<List<VertexArgs>> vertices) {
            $.vertices = vertices;
            return this;
        }

        /**
         * @param vertices List of the vertices of this polygon.
         * 
         * @return builder
         * 
         */
        public Builder vertices(List<VertexArgs> vertices) {
            return vertices(Output.of(vertices));
        }

        /**
         * @param vertices List of the vertices of this polygon.
         * 
         * @return builder
         * 
         */
        public Builder vertices(VertexArgs... vertices) {
            return vertices(List.of(vertices));
        }

        public BoundingPolyArgs build() {
            return $;
        }
    }

}
