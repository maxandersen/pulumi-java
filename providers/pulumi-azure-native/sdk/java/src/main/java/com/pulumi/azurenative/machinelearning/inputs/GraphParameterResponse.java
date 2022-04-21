// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.inputs.GraphParameterLinkResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a global parameter in the graph.
 * 
 */
public final class GraphParameterResponse extends com.pulumi.resources.InvokeArgs {

    public static final GraphParameterResponse Empty = new GraphParameterResponse();

    /**
     * Description of this graph parameter.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Association links for this parameter to nodes in the graph.
     * 
     */
    @Import(name="links", required=true)
    private List<GraphParameterLinkResponse> links;

    public List<GraphParameterLinkResponse> links() {
        return this.links;
    }

    /**
     * Graph parameter&#39;s type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private GraphParameterResponse() {}

    private GraphParameterResponse(GraphParameterResponse $) {
        this.description = $.description;
        this.links = $.links;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphParameterResponse $;

        public Builder() {
            $ = new GraphParameterResponse();
        }

        public Builder(GraphParameterResponse defaults) {
            $ = new GraphParameterResponse(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder links(List<GraphParameterLinkResponse> links) {
            $.links = links;
            return this;
        }

        public Builder links(GraphParameterLinkResponse... links) {
            return links(List.of(links));
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GraphParameterResponse build() {
            $.links = Objects.requireNonNull($.links, "expected parameter 'links' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
