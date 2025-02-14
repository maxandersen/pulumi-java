// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Cosmos DB Graph resource object
 * 
 */
public final class GraphResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GraphResourceArgs Empty = new GraphResourceArgs();

    /**
     * Name of the Cosmos DB Graph
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Name of the Cosmos DB Graph
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GraphResourceArgs() {}

    private GraphResourceArgs(GraphResourceArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphResourceArgs $;

        public Builder() {
            $ = new GraphResourceArgs();
        }

        public Builder(GraphResourceArgs defaults) {
            $ = new GraphResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Name of the Cosmos DB Graph
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Name of the Cosmos DB Graph
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GraphResourceArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
